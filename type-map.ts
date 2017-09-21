import * as ts from "typescript"
import * as BuiltIn from './builtin-types'

import { PreJavaType, TypeReplacer, ProcessContext } from './prejavatypes/PreJavaType'
import { PreJavaTypeReference } from './prejavatypes/PreJavaTypeReference'
import { PreJavaTypeUnion } from './prejavatypes/PreJavaTypeUnion'
import { PreJavaTypeClassOrInterface } from './prejavatypes/PreJavaTypeClassOrInterface'
import { PreJavaTypeTuple } from './prejavatypes/PreJavaTypeTuple'
import { PreJavaTypeEnum } from './prejavatypes/PreJavaTypeEnum'
import { PreJavaTypeParameter } from './prejavatypes/PreJavaTypeParameter'
import { PreJavaTypeCallSignature, PreJavaTypeFormalParameter } from './prejavatypes/PreJavaTypeCallSignature'

export class TsToPreJavaTypemap {
    private currentIdAnonymousTypes = 1

    typeMap = new Map<any, PreJavaType>()

    constructor(private program: ts.Program,
        private javaPackageGuesser: { (sourceFile: ts.SourceFile): string },
        private jsPackageGuesser: { (sourceFile: ts.SourceFile): string }) { }

    processContext: ProcessContext = {
        createAnonymousTypeName: () => `AnonymousType${this.currentIdAnonymousTypes++}`,
        getJavaPackage: this.javaPackageGuesser,
        getJsPackage: this.jsPackageGuesser,
        getProgram: () => this.program,
        getTypeMap: () => this
    }

    typeSet() {
        let result = new Set<PreJavaType>()
        for (let type of this.typeMap.values())
            result.add(type)
        return result
    }

    substituteType(replacer: TypeReplacer) {
        let nbPassLeft = 10
        while (nbPassLeft-- >= 0) {
            let cache = new Map<PreJavaType, PreJavaType>()
            let somethingChanged = false
            for (let [typeKey, type] of this.typeMap.entries()) {
                let substitute = type.substituteType(replacer, cache, new Set())

                if (!substitute)
                    this.typeMap.delete(typeKey)
                else if (substitute != type)
                    this.typeMap.set(typeKey, substitute)

                somethingChanged = somethingChanged || (substitute != type)
            }
            if (!somethingChanged)
                break
        }

        if (!nbPassLeft)
            console.log(`WARNING : substituteType did not manage to finish in 10 passes !`)
    }

    hasSubType(type: PreJavaType) {
        for (let type of this.typeMap.values()) {
            if (type instanceof PreJavaTypeClassOrInterface && type.baseTypes && type.baseTypes.has(type))
                return true
        }

        return false
    }

    convertSignature(name: string, tsSignature: ts.Signature, typeParametersToApplyToAnonymousTypes: PreJavaTypeParameter[]): PreJavaTypeCallSignature {
        //if (('thisParameter' in tsSignature) && tsSignature['thisParameter'])
        //    return null

        let hasKeyOfInTypeParameters = tsSignature.getTypeParameters() && tsSignature.getTypeParameters().some(typeParameter => {
            let symbol = typeParameter.getSymbol()
            let declarations = symbol && symbol.declarations

            return declarations && declarations.some(declaration => {
                if (declaration.kind == ts.SyntaxKind.TypeParameter) {
                    let constraint = declaration && (declaration as ts.TypeParameterDeclaration).constraint
                    return constraint && constraint.kind == ts.SyntaxKind.TypeOperator && (constraint as ts.TypeOperatorNode).operator == ts.SyntaxKind.KeyOfKeyword
                }
            })
        })

        if (hasKeyOfInTypeParameters)
            return null

        let signatureTypeParameters = tsSignature.getTypeParameters() ? tsSignature.getTypeParameters().map(t => {
            let res = this.getOrCreatePreJavaTypeForTsType(t, false, typeParametersToApplyToAnonymousTypes) as PreJavaTypeParameter
            if (!(res instanceof PreJavaTypeParameter))
                console.error(`BLABLABLA`)
            return res
        }) : null

        typeParametersToApplyToAnonymousTypes = (typeParametersToApplyToAnonymousTypes && typeParametersToApplyToAnonymousTypes.slice()) || []
        signatureTypeParameters = signatureTypeParameters && signatureTypeParameters
            .filter(tp => !typeParametersToApplyToAnonymousTypes.some(tpIn => tpIn.name == tp.name))
        signatureTypeParameters && signatureTypeParameters
            .forEach(tp => typeParametersToApplyToAnonymousTypes.push(tp))

        let signatureReturnType = tsSignature.getReturnType()
        let returnType = this.getOrCreatePreJavaTypeForTsType(signatureReturnType, true, typeParametersToApplyToAnonymousTypes)

        return new PreJavaTypeCallSignature(
            signatureTypeParameters,
            returnType,
            name,
            tsSignature.getParameters()
                ? tsSignature.getParameters()
                    .filter(p => p.name != 'thisArg')
                    .map(p => {
                        let parameteryType = this.program.getTypeChecker().getTypeAtLocation(p.valueDeclaration)
                        if (parameteryType
                            && parameteryType.symbol
                            && parameteryType.symbol.declarations
                            && parameteryType.symbol.declarations.length
                            && parameteryType.symbol.declarations.some((d: any) => {
                                return d && d.locals && d.locals.length && d.locals.get && d.locals.get('this')
                            }))
                            return null

                        let objectType = (parameteryType.flags & ts.TypeFlags.Object) && parameteryType as ts.ObjectType
                        let referenceType = objectType && (objectType.objectFlags & ts.ObjectFlags.Reference) && parameteryType as ts.TypeReference
                        let dotdotdot = false

                        let de = p.valueDeclaration as ts.ParameterDeclaration
                        if (de.dotDotDotToken) {
                            if (referenceType && referenceType.typeArguments && referenceType.typeArguments.length == 1) {
                                parameteryType = referenceType.typeArguments[0]
                                dotdotdot = true
                            }
                            else {
                                console.error(`... token in parameters but expected type is not good`)
                            }
                        }

                        let result: PreJavaTypeFormalParameter = null

                        // This is to handle the case of "p: typeof SomeClass" where p is not of type SomeClass but of the type of the type of the class...
                        // TODO for now we use Object, but should be able to do better!
                        let freeP: any = p
                        if (freeP.valueDeclaration && freeP.valueDeclaration.type && freeP.valueDeclaration.type.kind == ts.SyntaxKind.TypeQuery) {
                            result = {
                                name: p.name,
                                type: BuiltIn.BUILTIN_TYPE_OBJECT,
                                optional: (de.questionToken) != null || (de.initializer != null),
                                dotdotdot
                            }
                        }
                        else {
                            let preJavaParameterType = this.getOrCreatePreJavaTypeForTsType(parameteryType, false, typeParametersToApplyToAnonymousTypes)

                            result = {
                                name: p.name,
                                type: preJavaParameterType,
                                optional: (de.questionToken) != null || (de.initializer != null),
                                dotdotdot
                            }
                        }

                        return result
                    })
                    .filter(p => p != null)
                : null
        )
    }

    getOrCreatePreJavaTypeForTsType(tsType: ts.Type, preferNothingVoid: boolean = false, typeParametersToApplyToAnonymousTypes: PreJavaTypeParameter[] = null): PreJavaType {
        if (!tsType)
            return null

        let typeKey = this.findTypeKey(tsType, preferNothingVoid, typeParametersToApplyToAnonymousTypes)

        if (this.typeMap.has(typeKey))
            return this.typeMap.get(typeKey)

        let preJavaType = this.instantiatePreJavaType(tsType, preferNothingVoid, typeParametersToApplyToAnonymousTypes)

        this.typeMap.set(typeKey, preJavaType)

        preJavaType.processSourceType(tsType, typeParametersToApplyToAnonymousTypes, this.processContext)

        return preJavaType
    }

    private findTypeKey(type: ts.Type, preferNothingVoid: boolean, typeParametersToApplyToAnonymousTypes: PreJavaTypeParameter[]) {
        let objectType = (type.flags & ts.TypeFlags.Object) && type as ts.ObjectType
        let interfaceType = (objectType.objectFlags & ts.ObjectFlags.ClassOrInterface) && type as ts.InterfaceType
        let referenceType = (objectType.objectFlags & ts.ObjectFlags.Reference) && type as ts.TypeReference

        let typeKey: any = type
        if (type.flags & ts.TypeFlags.Void) {
            typeKey = 'void-' + preferNothingVoid
        } else if (type.flags & ts.TypeFlags.Enum && type.getSymbol()) {
            typeKey = 'enum-' + type['id']
        } else if (objectType && objectType.objectFlags & ts.ObjectFlags.Tuple) {
            typeKey = 'tuple-' + referenceType.typeArguments.length
        } else if (objectType && objectType.objectFlags & ts.ObjectFlags.Anonymous) {
            typeKey = type['id'] + ((typeParametersToApplyToAnonymousTypes && typeParametersToApplyToAnonymousTypes.length) ? (typeParametersToApplyToAnonymousTypes.map(tp => '-' + tp.name)) : (''))
        } else if (type.flags & ts.TypeFlags.Union) {
            typeKey = `union-${type['id']}`
        }

        return typeKey
    }

    private instantiatePreJavaType(type: ts.Type, preferNothingVoid: boolean, typeParametersToApplyToAnonymousTypes: PreJavaTypeParameter[]): PreJavaType {
        if (!type)
            return null

        if (type.flags & ts.TypeFlags.Any)
            return BuiltIn.BUILTIN_TYPE_OBJECT
        if (type.flags & ts.TypeFlags.NonPrimitive)
            return BuiltIn.BUILTIN_TYPE_OBJECT

        if (type.flags & ts.TypeFlags.StringLiteral)
            return BuiltIn.BUILTIN_TYPE_STRING

        if (type.flags & ts.TypeFlags.Number)
            return BuiltIn.BUILTIN_TYPE_NUMBER
        if (type.flags & ts.TypeFlags.NumberLiteral)
            return BuiltIn.BUILTIN_TYPE_NUMBER

        if (type.flags & ts.TypeFlags.Boolean)
            return BuiltIn.BUILTIN_TYPE_BOOLEAN
        if (type.flags & ts.TypeFlags.BooleanLiteral)
            return BuiltIn.BUILTIN_TYPE_BOOLEAN
        if (type.getSymbol() && type.getSymbol().getName() == 'Boolean')
            return BuiltIn.BUILTIN_TYPE_BOOLEAN

        if (type.flags & ts.TypeFlags.Void)
            return preferNothingVoid ? BuiltIn.BUILTIN_TYPE_UNIT : BuiltIn.BUILTIN_TYPE_VOID
        if (type.flags & ts.TypeFlags.Undefined)
            return preferNothingVoid ? BuiltIn.BUILTIN_TYPE_UNIT : BuiltIn.BUILTIN_TYPE_VOID
        if (type.flags & ts.TypeFlags.Null)
            return BuiltIn.BUILTIN_TYPE_VOID
        if (type.flags & ts.TypeFlags.Never)
            return BuiltIn.BUILTIN_TYPE_VOID

        if (type.getSymbol() && type.getSymbol().getName() == 'String')
            return BuiltIn.BUILTIN_TYPE_STRING

        if (type.getSymbol() && type.getSymbol().getName() == 'Object')
            return BuiltIn.BUILTIN_TYPE_OBJECT

        if (type.getSymbol() && type.getSymbol().getName() == 'Number')
            return BuiltIn.BUILTIN_TYPE_NUMBER

        if (type.flags & ts.TypeFlags.ESSymbol)
            return BuiltIn.FAKE_TYPE_ESSYMBOL

        if (type.flags & ts.TypeFlags.IndexedAccess)
            return BuiltIn.FAKE_TYPE_INDEXEDACCESS

        if (type.flags & ts.TypeFlags.Intersection)
            return BuiltIn.FAKE_TYPE_INTERSECTION

        if (type.flags & ts.TypeFlags.TypeParameter) {
            if (type['isThisType'])
                return this.getOrCreatePreJavaTypeForTsType((type as ts.TypeParameter).constraint, false, typeParametersToApplyToAnonymousTypes)

            return new PreJavaTypeParameter()
        }

        let objectType = (type.flags & ts.TypeFlags.Object) && type as ts.ObjectType

        if (objectType && objectType.objectFlags & ts.ObjectFlags.Reference) {
            let reference = type as ts.TypeReference
            if (reference.target != type)
                return new PreJavaTypeReference()
        }

        if (type.flags & ts.TypeFlags.Enum && type.getSymbol())
            return new PreJavaTypeEnum()

        if (type.flags & ts.TypeFlags.Union)
            return new PreJavaTypeUnion()

        if (objectType) {
            if (objectType.objectFlags & ts.ObjectFlags.Tuple)
                return new PreJavaTypeTuple(objectType as ts.TypeReference)
            else
                return new PreJavaTypeClassOrInterface()
        }

        if (type.flags & ts.TypeFlags.StringLike)
            return BuiltIn.BUILTIN_TYPE_STRING
        if (type.flags & ts.TypeFlags.NumberLike)
            return BuiltIn.BUILTIN_TYPE_NUMBER
        if (type.flags & ts.TypeFlags.BooleanLike)
            return BuiltIn.BUILTIN_TYPE_BOOLEAN

        console.warn(`no mapping for ts type ${type} `)
        return BuiltIn.BUILTIN_TYPE_OBJECT
    }
}