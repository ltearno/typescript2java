import * as ts from "typescript"
import * as path from "path";
import { PreJavaType, TypeReplacer, ProcessContext } from './prejavatypes/PreJavaType'
import { guessName } from './tools'

import { PreJavaTypeFakeType } from './prejavatypes/PreJavaTypeFakeType'
import { PreJavaTypeBuiltinJavaType } from './prejavatypes/PreJavaTypeBuiltinJavaType'
import { PreJavaTypeReference } from './prejavatypes/PreJavaTypeReference'
import { PreJavaTypeUnion } from './prejavatypes/PreJavaTypeUnion'
import { PreJavaTypeClassOrInterface, PreJavaTypeProperty } from './prejavatypes/PreJavaTypeClassOrInterface'
import { PreJavaTypeTuple } from './prejavatypes/PreJavaTypeTuple'
import { PreJavaTypeEnum } from './prejavatypes/PreJavaTypeEnum'
import { PreJavaTypeParameter } from './prejavatypes/PreJavaTypeParameter'
import { PreJavaTypeCallSignature, PreJavaTypeFormalParameter } from './prejavatypes/PreJavaTypeCallSignature'

const BUILTIN_TYPE_OBJECT = new PreJavaTypeBuiltinJavaType('java.lang', 'Object')
const BUILTIN_TYPE_STRING = new PreJavaTypeBuiltinJavaType('java.lang', 'String')
const BUILTIN_TYPE_NUMBER = new PreJavaTypeBuiltinJavaType('java.lang', 'Number')
const BUILTIN_TYPE_BOOLEAN = new PreJavaTypeBuiltinJavaType('java.lang', 'Boolean')
const BUILTIN_TYPE_UNIT = new PreJavaTypeBuiltinJavaType(null, 'void')
const BUILTIN_TYPE_VOID = new PreJavaTypeBuiltinJavaType('java.lang', 'Void')

const FAKE_TYPE_INTERSECTION = new PreJavaTypeFakeType('gwt.ext', 'FakeIntersection')
const FAKE_TYPE_ESSYMBOL = new PreJavaTypeFakeType('gwt.ext', 'FakeEsSymbol')
const FAKE_TYPE_INDEXEDACCESS = new PreJavaTypeFakeType('gwt.ext', 'FakeIndexedAccess')

export class TsToPreJavaTypemap {
    private currentIdAnonymousTypes = 1

    typeMap = new Map<any, PreJavaType>()

    constructor(private program: ts.Program, private javaPackageGuesser: { (sourceFile: ts.SourceFile): string }) { }

    processContext: ProcessContext = {
        createAnonymousTypeName: () => `AnonymousType${this.currentIdAnonymousTypes++}`,
        getJavaPackage: this.javaPackageGuesser,
        getProgram: () => this.program,
        getTypeMap: () => this
    }

    ensureAllTypesHaveName(defaultPackageName: string) {
        for (let type of this.typeMap.values()) {
            if (type instanceof PreJavaTypeClassOrInterface) {
                if (type.getParametrizedSimpleName() == null)
                    type.setSimpleName(`AnonymousType_${this.currentIdAnonymousTypes++}`)
            }
            if (defaultPackageName && !type.getPackageName())
                type.setPackageName(defaultPackageName)
        }
    }

    private doesTypeUsesType(type: PreJavaType, usedType: PreJavaType) {
        if (type === usedType)
            return true

        if (type instanceof PreJavaTypeReference) {
            if (this.doesTypeUsesType(type.type, usedType))
                return true
            if (type.typeParameters && type.typeParameters.some(t => this.doesTypeUsesType(t, usedType)))
                return true
            return false
        }

        if (type instanceof PreJavaTypeUnion) {
            return type.types && type.types.some(t => this.doesTypeUsesType(t, usedType))
        }

        if (type instanceof PreJavaTypeClassOrInterface) {
            if (type.baseTypes && type.baseTypes.has(usedType))
                return true
        }

        return false
    }

    private substituteType(replacer: TypeReplacer) {
        let cache = new Map<PreJavaType, PreJavaType>()

        for (let [tsType, type] of this.typeMap.entries()) {
            let substitute = type.substituteType(replacer, cache, new Set())
            if (!substitute)
                this.typeMap.delete(tsType)
            else if (substitute != type)
                this.typeMap.set(tsType, substitute)
        }
    }

    hasSubType(type: PreJavaType) {
        for (let type of this.typeMap.values()) {
            if (type instanceof PreJavaTypeClassOrInterface && type.baseTypes && type.baseTypes.has(type))
                return true
        }

        return false
    }

    simplifyUnions() {
        let typesToSimplifyToObject: PreJavaType[] = []
        let typesToSimplifyToOnlyType: PreJavaType[] = []

        for (let type of this.typeMap.values()) {
            if (type instanceof PreJavaTypeUnion) {
                if (!type.types || !type.types.length)
                    typesToSimplifyToObject.push(type)
                else if (type.types.length == 1)
                    typesToSimplifyToOnlyType.push(type)
            }
        }

        typesToSimplifyToObject.forEach(type => this.substituteType(t => t != type ? t : BUILTIN_TYPE_OBJECT))
        typesToSimplifyToOnlyType.forEach(type => this.substituteType(t => {
            if (t != type)
                return t
            else
                return (type as PreJavaTypeUnion).types[0]
        }))
    }

    removeNotSupportedTypes() {
        this.substituteType((type) => type instanceof PreJavaTypeFakeType ? null : type)
        this.substituteType((type) => type.getSimpleName() == '?' ? BUILTIN_TYPE_OBJECT : type)
        this.substituteType((type) => type.getSimpleName() == '' ? null : type)
    }

    changeDtoInterfacesIntoClasses() {
        let nb = 0
        for (let type of this.typeMap.values()) {
            if (type instanceof PreJavaTypeClassOrInterface && type.hasOnlyProperties() && !this.hasSubType(type)) {
                type.shouldOutputClass = true
                nb++
            }
        }
        console.log(`${nb} DTO types converted to classes`)
    }

    arrangeMultipleImplementationInheritance(): boolean {
        let somethingDone = false
        for (let type of this.typeMap.values()) {
            if (type instanceof PreJavaTypeClassOrInterface && type.baseTypes && type.baseTypes.size > 1) {
                let implementationSuperTypes: PreJavaTypeClassOrInterface[] = []
                for (let superType of type.baseTypes.values()) {
                    if (superType instanceof PreJavaTypeClassOrInterface && superType.isClassLike()) {
                        implementationSuperTypes.push(superType)
                    }
                }
                if ((type.isClassLike() && implementationSuperTypes.length <= 1) || (!type.isClassLike() && implementationSuperTypes.length == 0))
                    continue

                somethingDone = true

                console.log(`arrange from ${type.getSimpleName()} with ${implementationSuperTypes.length} super implementations`)

                let nbConstructors = type.constructorSignatures && type.constructorSignatures.length

                for (let superType of implementationSuperTypes) {
                    // super_type doit maintenant être une interface => on le transforme comme ca tout le monde pointe vers l'interface
                    let newType = new PreJavaTypeClassOrInterface()
                    newType.baseTypes = new Set()
                    newType.baseTypes.add(superType)
                    newType.comments = superType.comments && superType.comments.slice()
                    newType.constructorSignatures = superType.constructorSignatures
                    newType.methods = superType.methods && superType.methods.slice()
                    newType.name = superType.name + '_'
                    newType.numberIndexType = superType.numberIndexType
                    newType.stringIndexType = superType.stringIndexType
                    newType.packageName = superType.packageName
                    newType.properties = superType.properties && superType.properties.slice()
                    newType.prototypeNames = superType.prototypeNames
                    newType.shouldOutputClass = true
                    newType.typeParameters = superType.typeParameters && superType.typeParameters.slice()
                    newType.sourceTypes = superType.sourceTypes

                    superType.shouldOutputClass = false
                    superType.constructorSignatures = null
                    superType.prototypeNames = null

                    this.typeMap.set({} as ts.Type, newType)
                }
            }
        }

        return somethingDone
    }

    developMethodOverridesForUnionParameters() {
        let developMethods = (type: PreJavaTypeClassOrInterface) => {
            // constructors and methods with union type parameters or inside parameters...
        }

        for (let type of this.typeMap.values())
            if (type instanceof PreJavaTypeClassOrInterface)
                developMethods(type)
    }

    convertSignature(name: string, tsSignature: ts.Signature, typeParametersToApplyToAnonymousTypes: PreJavaTypeParameter[]): PreJavaTypeCallSignature {
        if (('thisParameter' in tsSignature) && tsSignature['thisParameter'])
            return null

        let signatureTypeParameters = tsSignature.getTypeParameters() ? tsSignature.getTypeParameters().map(t => {
            let res = this.getOrCreatePreJavaTypeForTsType(t, typeParametersToApplyToAnonymousTypes) as PreJavaTypeParameter
            if (!(res instanceof PreJavaTypeParameter))
                console.error(`BLABLABLA`)
            return res
        }) : null

        if (name == 'sort')
            console.log()

        typeParametersToApplyToAnonymousTypes = (typeParametersToApplyToAnonymousTypes && typeParametersToApplyToAnonymousTypes.slice()) || []
        if (signatureTypeParameters)
            typeParametersToApplyToAnonymousTypes = typeParametersToApplyToAnonymousTypes.concat(signatureTypeParameters)

        let returnType = this.getOrCreatePreJavaTypeForTsType(tsSignature.getReturnType(), typeParametersToApplyToAnonymousTypes)

        return new PreJavaTypeCallSignature(
            signatureTypeParameters,
            returnType,
            name,
            tsSignature.getParameters() ? tsSignature.getParameters().map(p => {
                let parameteryType = this.program.getTypeChecker().getTypeAtLocation(p.valueDeclaration)
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

                let preJavaParameterType = this.getOrCreatePreJavaTypeForTsType(parameteryType, typeParametersToApplyToAnonymousTypes)

                let result: PreJavaTypeFormalParameter = {
                    name: p.name,
                    type: preJavaParameterType,
                    optional: (de.questionToken) != null || (de.initializer != null),
                    dotdotdot
                }

                return result
            }) : null
        )
    }

    getOrCreatePreJavaTypeForTsType(tsType: ts.Type, typeParametersToApplyToAnonymousTypes: PreJavaTypeParameter[] = null): PreJavaType {
        if (!tsType)
            return null

        let objectType = (tsType.flags & ts.TypeFlags.Object) && tsType as ts.ObjectType
        let interfaceType = (objectType.objectFlags & ts.ObjectFlags.ClassOrInterface) && tsType as ts.InterfaceType
        let referenceType = (objectType.objectFlags & ts.ObjectFlags.Reference) && tsType as ts.TypeReference

        let typeKey: any = tsType
        if (objectType && objectType.objectFlags & ts.ObjectFlags.Tuple)
            typeKey = 'tuple-' + referenceType.typeArguments.length
        else if (objectType && objectType.objectFlags & ts.ObjectFlags.Anonymous)
            typeKey = tsType['id'] + ((typeParametersToApplyToAnonymousTypes && typeParametersToApplyToAnonymousTypes.length) ? (typeParametersToApplyToAnonymousTypes.map(tp => '-' + tp.name)) : (''))

        if (this.typeMap.has(typeKey))
            return this.typeMap.get(typeKey)

        let preJavaType = this.createPreJavaType(typeKey, tsType, typeParametersToApplyToAnonymousTypes)
        this.typeMap.set(typeKey, preJavaType)

        return preJavaType
    }

    private createPreJavaType(typeKey: any, tsType: ts.Type, typeParametersToApplyToAnonymousTypes: PreJavaTypeParameter[]) {
        if (!tsType)
            return null

        if (tsType.flags & ts.TypeFlags.Any)
            return BUILTIN_TYPE_OBJECT
        if (tsType.flags & ts.TypeFlags.NonPrimitive)
            return BUILTIN_TYPE_OBJECT
        if (tsType.flags & ts.TypeFlags.StringLiteral)
            return BUILTIN_TYPE_STRING
        if (tsType.flags & ts.TypeFlags.Number)
            return BUILTIN_TYPE_NUMBER
        if (tsType.flags & ts.TypeFlags.NumberLiteral)
            return BUILTIN_TYPE_NUMBER
        if (tsType.flags & ts.TypeFlags.Boolean)
            return BUILTIN_TYPE_BOOLEAN
        if (tsType.flags & ts.TypeFlags.BooleanLiteral)
            return BUILTIN_TYPE_BOOLEAN
        if (tsType.flags & ts.TypeFlags.Void)
            return BUILTIN_TYPE_UNIT
        if (tsType.flags & ts.TypeFlags.Undefined)
            return BUILTIN_TYPE_UNIT
        if (tsType.flags & ts.TypeFlags.Null)
            return BUILTIN_TYPE_VOID
        if (tsType.flags & ts.TypeFlags.Never)
            return BUILTIN_TYPE_VOID

        if (tsType.getSymbol() && tsType.getSymbol().getName() == 'String')
            return BUILTIN_TYPE_STRING

        if (tsType.flags & ts.TypeFlags.ESSymbol)
            return FAKE_TYPE_ESSYMBOL

        if (tsType.flags & ts.TypeFlags.IndexedAccess)
            return FAKE_TYPE_INDEXEDACCESS

        if (tsType.flags & ts.TypeFlags.Intersection)
            return FAKE_TYPE_INTERSECTION

        if (tsType.flags & ts.TypeFlags.TypeParameter) {
            let symbol = (tsType as ts.TypeParameter).getSymbol()
            let preJavaType = new PreJavaTypeParameter(symbol ? symbol.getName() : '?')
            this.typeMap.set(typeKey, preJavaType)
            preJavaType.constraint = this.getOrCreatePreJavaTypeForTsType((tsType as ts.TypeParameter).constraint, typeParametersToApplyToAnonymousTypes)
            return preJavaType
        }

        let objectType = (tsType.flags & ts.TypeFlags.Object) && tsType as ts.ObjectType

        if (objectType && objectType.objectFlags & ts.ObjectFlags.Reference) {
            let reference = tsType as ts.TypeReference
            if (reference.target != tsType) {
                let preJavaType = new PreJavaTypeReference()
                this.typeMap.set(typeKey, preJavaType)
                preJavaType.type = this.getOrCreatePreJavaTypeForTsType(reference.target, typeParametersToApplyToAnonymousTypes)
                preJavaType.typeParameters = reference.typeArguments ? reference.typeArguments.map(typeArgument => this.getOrCreatePreJavaTypeForTsType(typeArgument, typeParametersToApplyToAnonymousTypes)) : null
                return preJavaType
            }
        }

        if (tsType.flags & ts.TypeFlags.Union) {
            let unionType = tsType as ts.UnionType

            let res = new PreJavaTypeUnion()
            this.typeMap.set(typeKey, res)
            res.setTypes(unionType.types.map(t => this.getOrCreatePreJavaTypeForTsType(t, typeParametersToApplyToAnonymousTypes)))
            // TODO res.typeParameters = typeParametersToApplyToAnonymousTypes.slice()

            return res
        }

        if (objectType) {
            if (objectType.objectFlags & ts.ObjectFlags.Tuple) {
                let preJavaType = new PreJavaTypeTuple(objectType as ts.TypeReference)
                this.typeMap.set(typeKey, preJavaType)

                return preJavaType
            }
            else {
                let preJavaType = new PreJavaTypeClassOrInterface()
                this.typeMap.set(typeKey, preJavaType)

                preJavaType.addSourceType(objectType, typeParametersToApplyToAnonymousTypes, this.processContext)

                return preJavaType
            }
        }

        if (tsType.flags & ts.TypeFlags.Enum && tsType.getSymbol()) {
            let preJavaEnum = new PreJavaTypeEnum(tsType.getSymbol().getName())
            this.typeMap.set(typeKey, preJavaEnum)
            preJavaEnum.addSourceType(tsType as ts.EnumType)

            return preJavaEnum
        }

        if (tsType.flags & ts.TypeFlags.StringLike)
            return BUILTIN_TYPE_STRING
        if (tsType.flags & ts.TypeFlags.NumberLike)
            return BUILTIN_TYPE_NUMBER
        if (tsType.flags & ts.TypeFlags.BooleanLike)
            return BUILTIN_TYPE_BOOLEAN

        console.warn(`no mapping for ts type ${tsType} `)
        return BUILTIN_TYPE_OBJECT
    }
}