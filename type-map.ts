import * as ts from "typescript"
import * as path from "path";
import { PreJavaType, TypeReplacer, ProcessContext } from './prejavatypes/PreJavaType'
import { guessName } from './tools'
import * as Visit from './prejavatypes/PreJavaTypeVisit'

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

    // TODO : for classes  : add methods from interface hierarchy which are not in the method list
    addMethodsFromInterfaceHierarchy() {
        let recBrowseInterfaceHierarchy = (type: PreJavaType, visitor: { (visitedInterface: PreJavaTypeClassOrInterface) }) => {
            Visit.preJavaTypeVisit(type, {
                onVisitReferenceType: type => recBrowseInterfaceHierarchy(type.type, visitor),
                onVisitClassOrInterfaceType: type => {
                    if (!type.isClassLike())
                        visitor(type)
                    type.baseTypes && type.baseTypes.forEach(baseType => recBrowseInterfaceHierarchy(baseType, visitor))
                }
            })
        }

        for (let type of this.typeMap.values()) {
            Visit.preJavaTypeVisit(type, {
                onVisitClassOrInterfaceType: type => {
                    if (type.isClassLike()) {
                        recBrowseInterfaceHierarchy(type, visitedInterface => {
                            visitedInterface.methods && visitedInterface.methods.forEach(visitedMethod => {
                                if (!type.methods || !type.methods.some(m => m.name == visitedMethod.name))
                                    type.addMethod(visitedMethod)
                            })

                            visitedInterface.properties && visitedInterface.properties.forEach(visitedProperty => {
                                if (!type.properties || !type.properties.some(p => p.name == visitedProperty.name))
                                    type.addProperty(visitedProperty)
                            })
                        })
                    }
                }
            })
        }
    }

    private groupBy<K, V>(items: V[], keySelector: { (value: V): K }) {
        let groups = new Map<K, V[]>()

        items.forEach(item => {
            let key = keySelector(item)
            let signatures = groups.get(key)
            if (signatures) {
                signatures.push(item)
            }
            else {
                signatures = [item]
                groups.set(key, signatures)
            }
        })

        return groups
    }

    removeDuplicateOverloads() {
        for (let type of this.typeMap.values()) {
            if (type instanceof PreJavaTypeClassOrInterface && type.methods && type.methods.length) {
                let classOrInterface = type as PreJavaTypeClassOrInterface
                let methodsByName = this.groupBy(type.methods, method => method.name)
                for (let methodGroup of methodsByName.values()) {
                    if (methodGroup.length < 2)
                        continue

                    // minimal type hierarchy depth
                    let methodsByReturnType = this.groupBy(methodGroup, method => method.returnType)
                    let methodsToFilterForParameter: PreJavaTypeCallSignature[] = []
                    if (methodsByReturnType.size <= 0) {
                        console.log(`weirdo 77`)
                        continue
                    }
                    else if (methodsByReturnType.size == 1) {
                        // everything ok so far
                        // need to use the group of methods we have
                        methodsToFilterForParameter = methodsByReturnType.values().next().value
                    }
                    else {
                        // only keep one, the most general
                        let minHierarchyDepth = 1000
                        for (let returnType of methodsByReturnType.keys()) {
                            let depth = returnType.getHierachyDepth()
                            if (depth < minHierarchyDepth)
                                minHierarchyDepth = depth
                        }

                        let minHierarchyDepthPrototypes: PreJavaType[] = []
                        for (let returnType of methodsByReturnType.keys()) {
                            let depth = returnType.getHierachyDepth()
                            if (depth == minHierarchyDepth)
                                minHierarchyDepthPrototypes.push(returnType)
                            else
                                methodsByReturnType.get(returnType).forEach(m => classOrInterface.removeMethod(m))
                        }

                        if (minHierarchyDepthPrototypes.length <= 0) {
                            console.log(`weirdo 940`)
                            continue
                        }
                        else if (minHierarchyDepthPrototypes.length == 1) {
                            // ok that is the one group of methods
                            methodsToFilterForParameter = methodsByReturnType.get(minHierarchyDepthPrototypes[0])
                        }
                        else {
                            // TODO choose one, but which one ?
                            // TODO maybe transform them to use Object
                            methodsToFilterForParameter = methodsByReturnType.get(minHierarchyDepthPrototypes[0])

                            // remove non used methods
                            for (let i = 1; i < minHierarchyDepthPrototypes.length; i++)
                                methodsByReturnType.get(minHierarchyDepthPrototypes[i])
                                    .forEach(m => classOrInterface.removeMethod(m))
                        }

                        // TODO need to remove the ones we did not keep
                    }

                    // those methods are the one which are left...
                }
                // use type erased methods
                // group by name, select most general return type, in this group, select the most general parameter types
                // method signature typerased footprint => those with same sig resume to the most general
            }
        }
    }

    changeDtoInterfacesIntoClasses() {
        let nb = 0
        for (let type of this.typeMap.values()) {
            if (type instanceof PreJavaTypeClassOrInterface && type.hasOnlyProperties() && !this.hasSubType(type)) {
                type.isClass = true
                nb++
            }
        }
        console.log(`${nb} DTO types converted to classes`)
    }

    arrangeMultipleImplementationInheritance(): boolean {
        let somethingDone = false
        for (let type of this.typeMap.values()) {
            if (type instanceof PreJavaTypeClassOrInterface && type.baseTypes && type.baseTypes.size) {
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
                    newType.isClass = true
                    newType.typeParameters = superType.typeParameters && superType.typeParameters.slice()
                    newType.sourceTypes = superType.sourceTypes

                    superType.isClass = false
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

        if (name == 'sort')
            console.log()

        typeParametersToApplyToAnonymousTypes = (typeParametersToApplyToAnonymousTypes && typeParametersToApplyToAnonymousTypes.slice()) || []
        signatureTypeParameters && signatureTypeParameters
            .filter(tp => !typeParametersToApplyToAnonymousTypes.some(tpIn => tpIn.name == tp.name))
            .forEach(tp => typeParametersToApplyToAnonymousTypes.push(tp))

        let returnType = this.getOrCreatePreJavaTypeForTsType(tsSignature.getReturnType(), true, typeParametersToApplyToAnonymousTypes)

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

                let preJavaParameterType = this.getOrCreatePreJavaTypeForTsType(parameteryType, false, typeParametersToApplyToAnonymousTypes)

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

    getOrCreatePreJavaTypeForTsType(tsType: ts.Type, preferNothingVoid: boolean = false, typeParametersToApplyToAnonymousTypes: PreJavaTypeParameter[] = null): PreJavaType {
        if (!tsType)
            return null

        let objectType = (tsType.flags & ts.TypeFlags.Object) && tsType as ts.ObjectType
        let interfaceType = (objectType.objectFlags & ts.ObjectFlags.ClassOrInterface) && tsType as ts.InterfaceType
        let referenceType = (objectType.objectFlags & ts.ObjectFlags.Reference) && tsType as ts.TypeReference

        let typeKey: any = tsType
        if (tsType.flags & ts.TypeFlags.Void)
            typeKey = 'void-' + preferNothingVoid
        if (objectType && objectType.objectFlags & ts.ObjectFlags.Tuple)
            typeKey = 'tuple-' + referenceType.typeArguments.length
        else if (objectType && objectType.objectFlags & ts.ObjectFlags.Anonymous)
            typeKey = tsType['id'] + ((typeParametersToApplyToAnonymousTypes && typeParametersToApplyToAnonymousTypes.length) ? (typeParametersToApplyToAnonymousTypes.map(tp => '-' + tp.name)) : (''))

        if (this.typeMap.has(typeKey))
            return this.typeMap.get(typeKey)

        let preJavaType = this.createPreJavaType(typeKey, tsType, preferNothingVoid, typeParametersToApplyToAnonymousTypes)
        this.typeMap.set(typeKey, preJavaType)

        return preJavaType
    }

    private createPreJavaType(typeKey: any, tsType: ts.Type, preferNothingVoid: boolean, typeParametersToApplyToAnonymousTypes: PreJavaTypeParameter[]) {
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
        if (tsType.getSymbol() && tsType.getSymbol().getName() == 'Boolean')
            return BUILTIN_TYPE_BOOLEAN
        if (tsType.flags & ts.TypeFlags.Void)
            return preferNothingVoid ? BUILTIN_TYPE_UNIT : BUILTIN_TYPE_VOID
        if (tsType.flags & ts.TypeFlags.Undefined)
            return BUILTIN_TYPE_UNIT
        if (tsType.flags & ts.TypeFlags.Null)
            return BUILTIN_TYPE_VOID
        if (tsType.flags & ts.TypeFlags.Never)
            return BUILTIN_TYPE_VOID

        if (tsType.getSymbol() && tsType.getSymbol().getName() == 'String')
            return BUILTIN_TYPE_STRING

        if (tsType.getSymbol() && tsType.getSymbol().getName() == 'Object')
            return BUILTIN_TYPE_OBJECT

        if (tsType.getSymbol() && tsType.getSymbol().getName() == 'Number')
            return BUILTIN_TYPE_NUMBER

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
            preJavaType.constraint = this.getOrCreatePreJavaTypeForTsType((tsType as ts.TypeParameter).constraint, false, typeParametersToApplyToAnonymousTypes)
            return preJavaType
        }

        let objectType = (tsType.flags & ts.TypeFlags.Object) && tsType as ts.ObjectType

        if (objectType && objectType.objectFlags & ts.ObjectFlags.Reference) {
            let reference = tsType as ts.TypeReference
            if (reference.target != tsType) {
                let preJavaType = new PreJavaTypeReference()
                this.typeMap.set(typeKey, preJavaType)
                preJavaType.type = this.getOrCreatePreJavaTypeForTsType(reference.target, false, typeParametersToApplyToAnonymousTypes)
                preJavaType.typeParameters = reference.typeArguments ? reference.typeArguments.map(typeArgument => this.getOrCreatePreJavaTypeForTsType(typeArgument, false, typeParametersToApplyToAnonymousTypes)) : null
                return preJavaType
            }
        }

        if (tsType.flags & ts.TypeFlags.Union) {
            let unionType = tsType as ts.UnionType

            let res = new PreJavaTypeUnion()
            this.typeMap.set(typeKey, res)
            res.setTypes(unionType.types.map(t => this.getOrCreatePreJavaTypeForTsType(t, false, typeParametersToApplyToAnonymousTypes)))
            res.typeParameters = typeParametersToApplyToAnonymousTypes && typeParametersToApplyToAnonymousTypes.slice()

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