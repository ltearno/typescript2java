import * as ts from "typescript"
import * as path from "path";
import { PreJavaType, TypeReplacer, ProcessContext } from './prejavatypes/PreJavaType'
import * as Visit from './prejavatypes/PreJavaTypeVisit'
import * as tsTools from './ts-tools'
import * as typeTools from './type-tools'

import { PreJavaTypeFakeType } from './prejavatypes/PreJavaTypeFakeType'
import { PreJavaTypeBuiltinJavaType } from './prejavatypes/PreJavaTypeBuiltinJavaType'
import { PreJavaTypeReference, PreJavaTypeTPEnvironnement } from './prejavatypes/PreJavaTypeReference'
import { PreJavaTypeUnion } from './prejavatypes/PreJavaTypeUnion'
import { PreJavaTypeClassOrInterface, PreJavaTypeProperty } from './prejavatypes/PreJavaTypeClassOrInterface'
import { PreJavaTypeTuple } from './prejavatypes/PreJavaTypeTuple'
import { PreJavaTypeEnum } from './prejavatypes/PreJavaTypeEnum'
import { PreJavaTypeParameter } from './prejavatypes/PreJavaTypeParameter'
import { PreJavaTypeCallSignature, PreJavaTypeFormalParameter } from './prejavatypes/PreJavaTypeCallSignature'

export const BUILTIN_TYPE_OBJECT = new PreJavaTypeBuiltinJavaType('java.lang', 'Object')
export const BUILTIN_TYPE_STRING = new PreJavaTypeBuiltinJavaType('java.lang', 'String')
export const BUILTIN_TYPE_NUMBER = new PreJavaTypeBuiltinJavaType('java.lang', 'Number')
export const BUILTIN_TYPE_BOOLEAN = new PreJavaTypeBuiltinJavaType('java.lang', 'Boolean')
export const BUILTIN_TYPE_UNIT = new PreJavaTypeBuiltinJavaType(null, 'void')
export const BUILTIN_TYPE_VOID = new PreJavaTypeBuiltinJavaType('java.lang', 'Void')

export const FAKE_TYPE_INTERSECTION = new PreJavaTypeFakeType('gwt.ext', 'FakeIntersection')
export const FAKE_TYPE_ESSYMBOL = new PreJavaTypeFakeType('gwt.ext', 'FakeEsSymbol')
export const FAKE_TYPE_INDEXEDACCESS = new PreJavaTypeFakeType('gwt.ext', 'FakeIndexedAccess');

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

    ensureAllTypesHaveNameAndPackage(defaultPackageName: string) {
        for (let type of this.typeMap.values()) {
            if (type instanceof PreJavaTypeClassOrInterface) {
                if (type.getParametrizedSimpleName(null) == null)
                    type.setSimpleName(`AnonymousType_${this.currentIdAnonymousTypes++}`)
            }
            if (defaultPackageName && !type.getPackageName())
                type.setPackageName(defaultPackageName)
        }
    }

    removeOverridingProperties() {
        let nextObjectId = 1
        let objectMap = new WeakMap<any, number>()
        function getObjectId(o) {
            if (objectMap.has(o))
                return objectMap.get(o)

            let id = nextObjectId++
            objectMap.set(o, id)
            return id
        }
        function getTypeFootprint(type: PreJavaType) {
            Visit.visitPreJavaType(type, {
                caseReferenceType: type => getTypeFootprint(type.type),
                caseTPEnvironnement: type => getTypeFootprint(type.type),
                caseTypeParameter: type => type.name + (type.constraint ? getTypeFootprint(type.constraint) : ''),
                onOther: type => getObjectId(type)
            })
        }
        function getMethodFootprint(method: PreJavaTypeCallSignature) {
            let res = method.name
            if (method.parameters && method.parameters.length)
                res += '-' + method.parameters.map(p => getTypeFootprint(p.type)).join('-')
            return res
        }
        this.typeSet().forEach(type => {
            Visit.visitPreJavaType(type, {
                caseClassOrInterfaceType: type => {
                    if (type.properties && type.properties.length) {
                        let propertiesByName = new Map<string, PreJavaTypeProperty>()
                        type.properties.forEach(p => propertiesByName.set(p.name, p))

                        typeTools.browseTypeHierarchy(type, visitedType => {
                            visitedType.properties && visitedType.properties
                                .forEach(p => propertiesByName.delete(p.name))
                        })

                        type.properties = []
                        propertiesByName.forEach(p => type.properties.push(p))
                    }

                    if (type.methods && type.methods.length) {
                        let methodsByFootprint = new Map<string, PreJavaTypeCallSignature>()
                        type.methods.forEach(m => methodsByFootprint.set(getMethodFootprint(m), m))

                        typeTools.browseTypeHierarchy(type, visitedType => {
                            visitedType.methods && visitedType.methods
                                .forEach(m => methodsByFootprint.delete(getMethodFootprint(m)))
                        })

                        type.methods = []
                        methodsByFootprint.forEach(m => type.methods.push(m))
                    }
                }
            })
        })
    }

    typeSet() {
        let result = new Set<PreJavaType>()
        for (let type of this.typeMap.values())
            result.add(type)
        return result
    }

    private mapSignature(signature: PreJavaTypeCallSignature, selfReflect: Map<PreJavaType, string>) {
        return 'S('
            + signature.name
            + ',' + this.getAnonymousClassFootprint(signature.returnType, selfReflect)
            + ',' + ((signature.typeParameters && signature.typeParameters.length) ? signature.typeParameters.map(tp => this.getAnonymousClassFootprint(tp, selfReflect)).join() : '')
            + ',' + ((signature.parameters && signature.parameters.length) ? signature.parameters.map(param => this.mapParameter(param, selfReflect)).join() : '')
            + ')'
    }

    private mapParameter(parameter: PreJavaTypeFormalParameter, selfReflect: Map<PreJavaType, string>) {
        return `P(${parameter.dotdotdot ? 'D' : 'd'}${parameter.optional ? 'O' : 'o'}${this.getAnonymousClassFootprint(parameter.type, selfReflect)})`
    }

    private mapProperty(property: PreJavaTypeProperty, selfReflect: Map<PreJavaType, string>) {
        return `p(${property.name}|${this.getAnonymousClassFootprint(property.type, selfReflect)})`
    }

    private getAnonymousClassFootprint(type: PreJavaType, selfReflect: Map<PreJavaType, string>): string {
        if (selfReflect == null)
            selfReflect = new Map()

        if (selfReflect.has(type))
            return selfReflect.get(type)

        selfReflect.set(type, `${selfReflect.size + 1}`)

        let footprint = Visit.visitPreJavaType(type, {
            caseClassOrInterfaceType: (type) => {
                let res =
                    type.isClass ? 'C(' : 'I('
                        + ((type.typeParameters && type.typeParameters.length) ? type.typeParameters.map(tp => this.getAnonymousClassFootprint(tp, selfReflect)).join() : '-')
                        + ((type.constructorSignatures && type.constructorSignatures.length) ? type.constructorSignatures.map(sig => this.mapSignature(sig, selfReflect)).join() : '-')
                        + ((type.numberIndexType) ? this.getAnonymousClassFootprint(type.numberIndexType, selfReflect) : '-')
                        + ((type.stringIndexType) ? this.getAnonymousClassFootprint(type.stringIndexType, selfReflect) : '-')
                        + ((type.methods && type.methods.length) ? type.methods.map(sig => this.mapSignature(sig, selfReflect)).join() : '-')
                        + ((type.properties && type.properties.length) ? type.properties.map(ppty => this.mapProperty(ppty, selfReflect)).join() : '-')
                        + ')'
                return res
            },

            caseTypeParameter: (type) => type.getSimpleName(null),

            onOther: (type) => type.getFullyQualifiedName(null)
        })

        return footprint
    }

    reduceAnonymousTypes() {
        let types = this.typeSet()

        let typeDuplicates = new Map<string, PreJavaType[]>()

        types.forEach(type => {
            Visit.visitPreJavaType(type, {
                caseClassOrInterfaceType: (classType) => {
                    if (!classType.isAnonymousSourceType)
                        return

                    let footprint = this.getAnonymousClassFootprint(classType, null)
                    let list = typeDuplicates.get(footprint)
                    if (list == null) {
                        list = []
                        typeDuplicates.set(footprint, list)
                    }
                    list.push(classType)
                }
            })
        })

        let totalDuplicates = 0
        typeDuplicates.forEach((list, footprint) => {
            if (list.length < 2)
                return

            totalDuplicates += list.length - 1

            console.log(`type duplicates : ${list.length} for footprint ${footprint}`)

            let replacedTypes = list.slice(1, list.length - 1)

            let replacementType = list[0] as PreJavaTypeClassOrInterface
            replacedTypes
                .filter(t => t instanceof PreJavaTypeClassOrInterface && t.comments && t.comments.length)
                .forEach(t => {
                    if (!replacementType.comments)
                        replacementType.comments = []
                    replacementType.comments.concat((t as PreJavaTypeClassOrInterface).comments)
                })

            this.substituteType((type: PreJavaType): PreJavaType => {
                if (replacedTypes.some(replacedType => replacedType === type))
                    return list[0]
                return type
            })
        })
        console.log(`total duplicates removed : ${totalDuplicates}`)
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

        for (let [typeKey, type] of this.typeMap.entries()) {
            let substitute = type.substituteType(replacer, cache, new Set())
            if (!substitute)
                this.typeMap.delete(typeKey)
            else if (substitute != type)
                this.typeMap.set(typeKey, substitute)
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
        let typesToSimplifyToObject: PreJavaTypeUnion[] = []
        let typesToSimplifyToOnlyType: PreJavaTypeUnion[] = []

        for (let type of this.typeMap.values()) {
            if (type instanceof PreJavaTypeUnion) {
                if (!type.types || !type.types.length)
                    typesToSimplifyToObject.push(type)
                else if (type.types.every(t => (type as PreJavaTypeUnion).types[0] == t))
                    typesToSimplifyToOnlyType.push(type)
            }
        }

        typesToSimplifyToObject.forEach(type => this.substituteType(t => t != type ? t : BUILTIN_TYPE_OBJECT))
        typesToSimplifyToOnlyType.forEach(type => this.substituteType(t => (t != type) ? t : type.types[0]))
    }

    removeNotSupportedTypes() {
        this.substituteType((type) => type instanceof PreJavaTypeFakeType ? null : type)
        this.substituteType((type) => type.getSimpleName(null) == '?' ? BUILTIN_TYPE_OBJECT : type)
        this.substituteType((type) => type.getSimpleName(null) == '' ? null : type)
    }

    // TODO : for classes : add methods from interface hierarchy which are not in the method list
    addMethodsFromInterfaceHierarchy() {
        for (let pjt of this.typeMap.values()) {
            Visit.visitPreJavaType(pjt, {
                caseClassOrInterfaceType: type => {
                    if (type.isClassLike()) {
                        typeTools.browseTypeHierarchy(type, (visitedInterface, typeVariableEnv) => {
                            if (visitedInterface.isClassLike())
                                return

                            visitedInterface.methods && visitedInterface.methods.forEach(visitedMethod => {
                                if (!type.methods || !type.methods.some(m => {
                                    // vérifie que deux méthodes ne sont pas identiques du point de vue de leur noms et des type erasure de leurs paramètres.
                                    if (m.name != visitedMethod.name)
                                        return false
                                    if ((m.parameters && m.parameters.length) != (visitedMethod.parameters && visitedMethod.parameters.length))
                                        return false
                                    for (let i = 0; i < m.parameters.length; i++) {
                                        if (m.parameters[i].type.getFullyQualifiedName(null) != visitedMethod.parameters[i].type.getFullyQualifiedName(null))
                                            return false
                                    }
                                    return true
                                })) {
                                    let method = new PreJavaTypeCallSignature(visitedMethod.typeParameters, visitedMethod.returnType, visitedMethod.name, visitedMethod.parameters)
                                    method.returnType = new PreJavaTypeTPEnvironnement(visitedMethod.returnType, typeVariableEnv)
                                    if (method.parameters)
                                        method.parameters = method.parameters.map(p => ({
                                            name: p.name,
                                            type: new PreJavaTypeTPEnvironnement(p.type, typeVariableEnv),
                                            optional: p.optional,
                                            dotdotdot: p.dotdotdot
                                        }))
                                    type.addMethod(method)
                                }
                            })

                            visitedInterface.properties && visitedInterface.properties.forEach(visitedProperty => {
                                // TODO minimal management of property redefinitions : should allow the type to be tightened and not widened
                                // TODO For the moment, we just keep the super type class
                                let existingProperty = type.properties && type.properties.find(p => p.name == visitedProperty.name)
                                if (existingProperty) {
                                    existingProperty.type = new PreJavaTypeTPEnvironnement(visitedProperty.type, typeVariableEnv)
                                }
                                else {
                                    let newProperty: PreJavaTypeProperty = {
                                        name: visitedProperty.name,
                                        type: typeVariableEnv ? new PreJavaTypeTPEnvironnement(visitedProperty.type, typeVariableEnv) : visitedProperty.type,
                                        writable: visitedProperty.writable,
                                        comments: visitedProperty.comments
                                    }

                                    type.addProperty(newProperty)
                                }
                                //if (!type.properties || !type.properties.some(p => p.name == visitedProperty.name))
                                //    type.addProperty(visitedProperty) // TODO Take care of the concretized type parameters
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

    checkNoDuplicateTypeNames() {
        let typeFqnCache: Map<string, PreJavaType> = new Map()
        let hasDuplicate = false
        for (let type of this.typeSet()) {
            hasDuplicate = hasDuplicate || Visit.visitPreJavaType(type, {
                caseReferenceType: type => false,
                caseTPEnvironnement: type => false,
                caseTypeParameter: type => false,
                onOther: type => {
                    let typeFqn = type.getFullyQualifiedName(null)
                    if (typeFqnCache.has(typeFqn)) {
                        let alreadyType = typeFqnCache.get(typeFqn)
                        console.log(`WARNING : duplicate fqn ${typeFqn}`)
                        return true
                    }
                    typeFqnCache.set(typeFqn, type)
                    return false
                }
            })
        }
        if (hasDuplicate)
            console.log(`ERROR : duplicates found`)
    }

    removeDuplicateOverloads() {
        for (let type of this.typeMap.values()) {
            if (type instanceof PreJavaTypeClassOrInterface && type.methods && type.methods.length) {
                let classOrInterface = type as PreJavaTypeClassOrInterface
                // TODO in the process we loose type parameters information.
                // TODO so when sometimes instead of removing a method, we should arrange type parameters according to the removed method
                let methodsByNameAndParameters = this.groupBy(type.methods, method => method.name + '-' + (method.parameters ? method.parameters.map(p => p.type.getFullyQualifiedName(null)).join('-') : ''))
                for (let methodGroup of methodsByNameAndParameters.values()) {
                    if (methodGroup.length < 2)
                        continue

                    // only keep one, the most general return type
                    let minHierarchyDepth = 1000
                    for (let method of methodGroup) {
                        let depth = method.returnType.getHierachyDepth()
                        if (depth < minHierarchyDepth)
                            minHierarchyDepth = depth
                    }

                    let minReturnTypeHierarchyDepthMethods: PreJavaTypeCallSignature[] = []
                    for (let method of methodGroup) {
                        let returnType = method.returnType
                        if (returnType.getHierachyDepth() == minHierarchyDepth)
                            minReturnTypeHierarchyDepthMethods.push(method)
                        else
                            classOrInterface.removeMethod(method)
                    }

                    if (minReturnTypeHierarchyDepthMethods.length > 1) {
                        // TODO let's keep the first one but we could fins something else, use Object, create a Union type, ...
                        for (let i = 1; i < minReturnTypeHierarchyDepthMethods.length; i++)
                            classOrInterface.removeMethod(minReturnTypeHierarchyDepthMethods[i])
                    }
                }
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
                    while (superType && superType instanceof PreJavaTypeReference)
                        superType = superType.type
                    if (superType instanceof PreJavaTypeClassOrInterface && superType.isClassLike()) {
                        implementationSuperTypes.push(superType)
                    }
                }

                console.log(`maybe arrange ${type.getSimpleName(null)}`)

                if ((type.isClassLike() && implementationSuperTypes.length <= 1) || (!type.isClassLike() && implementationSuperTypes.length == 0))
                    continue

                somethingDone = true

                console.log(`arrange from ${type.getSimpleName(null)} with ${implementationSuperTypes.length} super implementations`)

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
                                type: BUILTIN_TYPE_OBJECT,
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
            return BUILTIN_TYPE_OBJECT
        if (type.flags & ts.TypeFlags.NonPrimitive)
            return BUILTIN_TYPE_OBJECT

        if (type.flags & ts.TypeFlags.StringLiteral)
            return BUILTIN_TYPE_STRING

        if (type.flags & ts.TypeFlags.Number)
            return BUILTIN_TYPE_NUMBER
        if (type.flags & ts.TypeFlags.NumberLiteral)
            return BUILTIN_TYPE_NUMBER

        if (type.flags & ts.TypeFlags.Boolean)
            return BUILTIN_TYPE_BOOLEAN
        if (type.flags & ts.TypeFlags.BooleanLiteral)
            return BUILTIN_TYPE_BOOLEAN
        if (type.getSymbol() && type.getSymbol().getName() == 'Boolean')
            return BUILTIN_TYPE_BOOLEAN

        if (type.flags & ts.TypeFlags.Void)
            return preferNothingVoid ? BUILTIN_TYPE_UNIT : BUILTIN_TYPE_VOID
        if (type.flags & ts.TypeFlags.Undefined)
            return preferNothingVoid ? BUILTIN_TYPE_UNIT : BUILTIN_TYPE_VOID
        if (type.flags & ts.TypeFlags.Null)
            return BUILTIN_TYPE_VOID
        if (type.flags & ts.TypeFlags.Never)
            return BUILTIN_TYPE_VOID

        if (type.getSymbol() && type.getSymbol().getName() == 'String')
            return BUILTIN_TYPE_STRING

        if (type.getSymbol() && type.getSymbol().getName() == 'Object')
            return BUILTIN_TYPE_OBJECT

        if (type.getSymbol() && type.getSymbol().getName() == 'Number')
            return BUILTIN_TYPE_NUMBER

        if (type.flags & ts.TypeFlags.ESSymbol)
            return FAKE_TYPE_ESSYMBOL

        if (type.flags & ts.TypeFlags.IndexedAccess)
            return FAKE_TYPE_INDEXEDACCESS

        if (type.flags & ts.TypeFlags.Intersection)
            return FAKE_TYPE_INTERSECTION

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

        if (type.flags & ts.TypeFlags.Union)
            return new PreJavaTypeUnion()

        if (objectType) {
            if (objectType.objectFlags & ts.ObjectFlags.Tuple)
                return new PreJavaTypeTuple(objectType as ts.TypeReference)
            else
                return new PreJavaTypeClassOrInterface()
        }

        if (type.flags & ts.TypeFlags.Enum && type.getSymbol())
            return new PreJavaTypeEnum()

        if (type.flags & ts.TypeFlags.StringLike)
            return BUILTIN_TYPE_STRING
        if (type.flags & ts.TypeFlags.NumberLike)
            return BUILTIN_TYPE_NUMBER
        if (type.flags & ts.TypeFlags.BooleanLike)
            return BUILTIN_TYPE_BOOLEAN

        console.warn(`no mapping for ts type ${type} `)
        return BUILTIN_TYPE_OBJECT
    }
}