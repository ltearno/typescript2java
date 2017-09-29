import * as ts from "typescript"
import * as typeTools from './type-tools'
import * as Visit from './prejavatypes/PreJavaTypeVisit'
import * as Signature from './signature'
import * as BuiltIn from './builtin-types'

import { PreJavaTypeUnion } from './prejavatypes/PreJavaTypeUnion'
import { PreJavaTypeReference, PreJavaTypeTPEnvironnement } from './prejavatypes/PreJavaTypeReference'
import { PreJavaTypeFakeType } from './prejavatypes/PreJavaTypeFakeType'
import { PreJavaType } from './prejavatypes/PreJavaType'
import { PreJavaTypeClassOrInterface, PreJavaTypeProperty } from './prejavatypes/PreJavaTypeClassOrInterface'
import { PreJavaTypeCallSignature, PreJavaTypeFormalParameter } from './prejavatypes/PreJavaTypeCallSignature'
import { PreJavaTypeParameter } from "./prejavatypes/PreJavaTypeParameter";

import { TypescriptToJavaTypemap } from './type-map'

const MAX_NB_DEVELOPPED_METHODS = 5

let currentIdAnonymousTypes = 1

export function applyTransformations(typeMap: TypescriptToJavaTypemap, renaming: { [key: string]: { [key: string]: string } }) {
    console.log(`removing unsupported types`)
    removeNotSupportedTypes(typeMap)

    console.log(`simplifying unions`)
    simplifyUnions(typeMap)

    console.log(`replacing anonymous types`)
    replaceByFunctionAndProcsLambdaTypes(typeMap)

    console.log(`removing OverridingProperties`)
    removeOverridingProperties(typeMap)

    console.log(`reducing anonymous types`)
    deduplicateTypes(typeMap)
    removeEmptyTypes(typeMap)

    console.log(`unanonymising types`)
    ensureAllTypesHaveNameAndPackage(typeMap, this.baseJavaPackage)

    ///console.log(`removing duplicate overloads (with same type erasure)`)
    ///removeDuplicateOverloads(typeMap)

    console.log(`changing DTO interfaces into classes`)
    changeDtoInterfacesIntoClasses(typeMap)

    console.log(`transforming types inheriting multiple implementations`)
    arrangeMultipleImplementationInheritance(typeMap, '', '_Interface')

    console.log(`add missing methods from interface hierarchy in classes`)
    addMethodsFromInterfaceHierarchy(typeMap)

    console.log(`process JsFunctions`)
    processJsFunctions(typeMap)

    console.log(`(todo) Array should be replaced by an externally provided type`)

    console.log(`developping methods with union parameters`)
    developMethodsWithUnionParameters(typeMap)

    if (renaming) {
        console.log(`renaming types specified in configration`)
        renameTypes(typeMap, renaming)
    }

    //console.log(`renaming duplicate fqns`)
    //checkNoDuplicateTypeNames(typeMap)

    console.log(`checking constructors`)
    ensureCorrectConstructors(typeMap)
}

export function ensureAllTypesHaveNameAndPackage(typeMap: TypescriptToJavaTypemap, defaultPackageName: string) {
    for (let type of typeMap.typeSet()) {
        if (type instanceof PreJavaTypeClassOrInterface) {
            if (type.getParametrizedSimpleName(null) == null)
                type.setSimpleName(`AnonymousType_${currentIdAnonymousTypes++}`)
        }
        if (defaultPackageName && !type.getPackageName())
            type.setPackageName(defaultPackageName)
    }
}

export function removeOverridingProperties(typeMap: TypescriptToJavaTypemap) {
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
        Visit.visitPreJavaType<void>(type, {
            caseReferenceType: type => getTypeFootprint(type.type),
            caseTPEnvironnement: type => getTypeFootprint(type.type),
            caseTypeParameter: type => type.name + (type.constraint ? getTypeFootprint(type.constraint) : ''),
            onOther: type => getObjectId(type)
        })
    }
    typeMap.typeSet().forEach(type => {
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
                    type.methods.forEach(m => methodsByFootprint.set(Signature.getCallSignatureTypeErasedSignature(m), m))

                    typeTools.browseTypeHierarchy(type, visitedType => {
                        visitedType.methods && visitedType.methods
                            .forEach(m => methodsByFootprint.delete(Signature.getCallSignatureTypeErasedSignature(m)))
                    })

                    type.methods = []
                    methodsByFootprint.forEach(m => type.addMethod(m))
                }
            }
        })
    })
}


function developMethodWithUnionParameters(method: PreJavaTypeCallSignature, nbMethodsMax: number): PreJavaTypeCallSignature[] {
    if (!method.parameters || !method.parameters.length)
        return null

    // for each of the parameters, make up an array with the type possibilites
    let possibleParams: PreJavaType[][] = []
    let counter = []
    method.parameters.forEach(parameter => {
        counter.push(0)

        let unionedTypes = typeTools.getUnionedTypes(parameter.type)
        if (unionedTypes)
            possibleParams.push(unionedTypes)
        else
            possibleParams.push([parameter.type])
    })

    let nbDups = 1
    for (let ps of possibleParams)
        nbDups *= ps.length
    if (nbDups == 1 || nbDups > MAX_NB_DEVELOPPED_METHODS)
        return null

    let res: PreJavaTypeCallSignature[] = []

    function nextCounter(): boolean {
        let i = 0
        while (true) {
            if (i >= counter.length)
                return false

            counter[i]++
            if (counter[i] < possibleParams[i].length)
                return true

            counter[i] = 0
            i++
        }
    }

    do {
        let dup = new PreJavaTypeCallSignature(method.typeParameters, method.returnType, method.name, method.parameters.map((parameter, index) => {
            return {
                name: parameter.name,
                type: possibleParams[index][counter[index]],
                optional: parameter.optional,
                dotdotdot: parameter.dotdotdot
            } as PreJavaTypeFormalParameter
        }))
        res.push(dup)
    }
    while (nextCounter())
    return res
}

function developMethodWithOptionalParameters(method: PreJavaTypeCallSignature): PreJavaTypeCallSignature[] {
    if (!method.parameters || !method.parameters.length)
        return null

    let res: PreJavaTypeCallSignature[] = []

    for (let i = method.parameters.length - 1; i >= 0; i--) {
        if (method.parameters[i].optional || method.parameters[i].dotdotdot) {
            res.push(new PreJavaTypeCallSignature(method.typeParameters, method.returnType, method.name, method.parameters.slice(0, i)))
        }
    }

    return res.length ? res : null
}

export function developMethodsWithUnionParameters(typeMap: TypescriptToJavaTypemap) {
    let counter = 0
    for (let type of typeMap.typeSet()) {
        Visit.visitPreJavaType(type, {
            caseClassOrInterfaceType: type => {
                let functionalInterface = typeTools.hasOnlyCallSignatures(type)
                if (functionalInterface && type.callSignatures.length == 1)
                    return

                let methodsSignatures = new Set<string>()
                type.methods && type.methods.forEach(m => methodsSignatures.add(Signature.getCallSignatureTypeErasedSignature(m)))
                let maybeAdd = method => {
                    let sig = Signature.getCallSignatureTypeErasedSignature(method)
                    if (methodsSignatures.has(sig))
                        return
                    methodsSignatures.add(sig)
                    type.methods.push(method)
                }

                type.methods && type.methods.forEach(m => {
                    let dups = developMethodWithUnionParameters(m, 5)
                    dups && dups.forEach(dup => maybeAdd(dup))
                    counter += dups && dups.length
                })

                type.methods && type.methods.forEach(m => {
                    let dups = developMethodWithOptionalParameters(m)
                    dups && dups.forEach(dup => maybeAdd(dup))
                    counter += dups && dups.length
                })
            }
        })
    }
    console.log(`added ${counter} developped methods`)
}






export function deduplicateTypes(typeMap: TypescriptToJavaTypemap) {
    let types = typeMap.typeSet()

    let typeDuplicates = new Map<string, PreJavaType[]>()

    console.log(`finding duplicate anonymous types`)
    let replacements = new Map()
    types.forEach(type => {
        Visit.visitPreJavaType(type, {
            caseClassOrInterfaceType: (classType) => {
                if (!classType.isAnonymousSourceType)
                    return

                let footprint = Signature.getTypeStandardSignature(classType)
                let list = typeDuplicates.get(footprint)
                if (list == null) {
                    list = []
                    typeDuplicates.set(footprint, list)
                }
                list.push(classType)
            },

            caseUnion: unionType => {
                let footprint = Signature.getTypeStandardSignature(unionType)
                let list = typeDuplicates.get(footprint)
                if (list == null) {
                    list = []
                    typeDuplicates.set(footprint, list)
                }
                list.push(unionType)
            }
        })
    })

    console.log(`merging duplicate anonymous types`)
    typeDuplicates.forEach((list, footprint) => {
        for (let i = 1; i < list.length; i++) {
            //console.log(`${list[i].getSimpleName(null)} => ${list[0].getSimpleName(null)}`)
            replacements.set(list[i], list[0])
        }
    })
    typeMap.substituteType((type: PreJavaType): PreJavaType => replacements.get(type) || type)
}

export function removeEmptyTypes(typeMap: TypescriptToJavaTypemap) {
    console.log(`replacing empty classes by Object`)
    typeMap.substituteType(type => {
        return Visit.visitPreJavaType<PreJavaType>(type, {
            caseClassOrInterfaceType: type => {
                if (type.callSignatures && type.callSignatures.length)
                    return type
                if (type.baseTypes && type.baseTypes.size)
                    return type
                if (type.comments && type.comments.length)
                    return type
                if (type.constructorSignatures && type.constructorSignatures.length)
                    return type
                if (!type.isAnonymousSourceType)
                    return type
                if ((type.methods && type.methods.length) || (type.staticMethods && type.staticMethods.length))
                    return type
                if ((type.properties && type.properties.length) || (type.staticProperties && type.staticProperties.length))
                    return type
                if (type.jsName)
                    return type
                if (type.numberIndexType || type.stringIndexType)
                    return type
                return BuiltIn.BUILTIN_TYPE_OBJECT
            },
            onOther: type => type
        })
    })
}





export function simplifyUnions(typeMap: TypescriptToJavaTypemap) {
    typeMap.substituteType(type => Visit.visitPreJavaType(type, {
        caseUnion: type => {
            if (!type.types || !type.types.length)
                return BuiltIn.BUILTIN_TYPE_OBJECT
            else if (type.types.every(t => (type as PreJavaTypeUnion).types[0] == t))
                return type.types[0]
            return type
        },
        onOther: type => type
    }))
}

export function removeNotSupportedTypes(typeMap: TypescriptToJavaTypemap) {
    typeMap.substituteType((type) => type instanceof PreJavaTypeFakeType ? null : type)
    typeMap.substituteType((type) => type.getSimpleName(null) == '?' ? BuiltIn.BUILTIN_TYPE_OBJECT : type)
    typeMap.substituteType((type) => type.getSimpleName(null) == '' ? null : type)
}

// TODO : for classes : add methods from interface hierarchy which are not in the method list
export function addMethodsFromInterfaceHierarchy(typeMap: TypescriptToJavaTypemap) {
    for (let type of typeMap.typeSet()) {
        Visit.visitPreJavaType(type, {
            caseClassOrInterfaceType: type => {
                if (type.isClassLike()) {
                    let methodsSignatures = new Set<string>()
                    type.methods && type.methods.forEach(m => methodsSignatures.add(Signature.getCallSignatureTypeErasedSignature(m)))

                    typeTools.browseTypeHierarchy(type, (visitedInterface, typeVariableEnv) => {
                        if (visitedInterface.isClassLike())
                            return

                        visitedInterface.methods && visitedInterface.methods.forEach(visitedMethod => {
                            let method = new PreJavaTypeCallSignature(visitedMethod.typeParameters, visitedMethod.returnType, visitedMethod.name, visitedMethod.parameters)
                            method.returnType = typeVariableEnv ? new PreJavaTypeTPEnvironnement(visitedMethod.returnType, typeVariableEnv) : visitedMethod.returnType
                            if (method.parameters)
                                method.parameters = method.parameters.map(p => ({
                                    name: p.name,
                                    type: typeVariableEnv ? new PreJavaTypeTPEnvironnement(p.type, typeVariableEnv) : p.type,
                                    optional: p.optional,
                                    dotdotdot: p.dotdotdot
                                }))
                            method.addComments(`added from type hierarchy`)

                            // optimization of type.addMethod(method)
                            let sig = Signature.getCallSignatureTypeErasedSignature(method)
                            if (!methodsSignatures.has(sig)) {
                                methodsSignatures.add(sig)
                                type.methods.push(method)
                            }
                        })

                        visitedInterface.properties && visitedInterface.properties.forEach(visitedProperty => {
                            // TODO minimal management of property redefinitions : should allow the type to be tightened and not widened
                            // TODO For the moment, we just keep the super type class
                            let existingProperty = type.properties && type.properties.find(p => p.name == visitedProperty.name)
                            if (existingProperty) {
                                existingProperty.type = typeVariableEnv ? new PreJavaTypeTPEnvironnement(visitedProperty.type, typeVariableEnv) : visitedProperty.type
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
                        })
                    })
                }
            }
        })
    }
}



export function removeDuplicateOverloads(typeMap: TypescriptToJavaTypemap) {
    for (let type of typeMap.typeSet()) {
        if (type instanceof PreJavaTypeClassOrInterface && type.methods && type.methods.length) {
            let classOrInterface = type as PreJavaTypeClassOrInterface
            // TODO in the process we loose type parameters information.
            // TODO so when sometimes instead of removing a method, we should arrange type parameters according to the removed method
            let methodsByNameAndParameters = groupBy(type.methods, method => method.name + '-' + (method.parameters ? method.parameters.map(p => p.type.getFullyQualifiedName(null)).join('-') : ''))
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

function groupBy<K, V>(items: V[], keySelector: { (value: V): K }) {
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






export function changeDtoInterfacesIntoClasses(typeMap: TypescriptToJavaTypemap) {
    let nb = 0
    for (let type of typeMap.typeSet()) {
        if (type instanceof PreJavaTypeClassOrInterface && (!type.isClass) && type.hasOnlyProperties() && !typeMap.hasSubType(type) && (!type.staticMethods || !type.staticMethods.length) && (!type.staticProperties || !type.staticProperties.length)) {
            if (!type.comments)
                type.comments = []
            type.comments.push(`*** changed to class to reflect the possible DTO use of this type ***`)
            type.isClass = true
            nb++
        }
    }
    console.log(`${nb} DTO types converted to classes`)
}



export function arrangeMultipleImplementationInheritance(typeMap: TypescriptToJavaTypemap, implementationSuffix: string, interfaceSuffix: string) {
    let maxPasses = 10

    while (maxPasses-- >= 0) {
        let somethingDone = false
        for (let type of typeMap.typeSet()) {
            if (type instanceof PreJavaTypeClassOrInterface && type.baseTypes && type.baseTypes.size) {
                let implementationSuperTypes: PreJavaTypeClassOrInterface[] = []
                for (let superType of type.baseTypes.values()) {
                    while (superType && superType instanceof PreJavaTypeReference)
                        superType = superType.type
                    if (superType instanceof PreJavaTypeClassOrInterface && superType.isClassLike()) {
                        implementationSuperTypes.push(superType)
                    }
                }

                if ((type.isClassLike() && implementationSuperTypes.length <= 1) || (!type.isClassLike() && implementationSuperTypes.length == 0))
                    continue

                somethingDone = true

                let nbConstructors = type.constructorSignatures && type.constructorSignatures.length

                for (let superType of implementationSuperTypes) {
                    // super_type doit maintenant être une interface => on le transforme comme ca tout le monde pointe vers l'interface
                    let newType = new PreJavaTypeClassOrInterface()
                    newType.baseTypes = new Set()
                    newType.baseTypes.add(superType)
                    newType.comments = superType.comments && superType.comments.slice()
                    newType.constructorSignatures = superType.constructorSignatures
                    newType.methods = superType.methods && superType.methods.slice()
                    newType.callSignatures = superType.callSignatures && superType.callSignatures.slice()
                    newType.name = superType.name + implementationSuffix
                    newType.numberIndexType = superType.numberIndexType
                    newType.stringIndexType = superType.stringIndexType
                    newType.packageName = superType.packageName
                    newType.properties = superType.properties && superType.properties.slice()
                    newType.jsNamespace = superType.jsNamespace
                    newType.jsName = superType.jsName
                    newType.isClass = true
                    newType.typeParameters = superType.typeParameters && superType.typeParameters.slice()
                    newType.sourceTypes = superType.sourceTypes

                    superType.name = superType.name + interfaceSuffix
                    superType.isClass = false
                    superType.constructorSignatures = null
                    superType.jsName = null
                    superType.jsNamespace = null

                    newType.cleanAndCheckMethods()

                    typeMap.registerType({} as ts.Type, newType)
                }
            }
        }

        if (!somethingDone)
            break
    }
}

export function checkNoDuplicateTypeNames(typeMap: TypescriptToJavaTypemap) {
    let typeFqnCache: Map<string, PreJavaType> = new Map()
    let hasDuplicate = false
    console.log(`duplicate types :`)
    for (let type of typeMap.typeSet()) {
        Visit.visitPreJavaType(type, {
            caseClassOrInterfaceType: type => {
                if (type.constructorSignatures && type.constructorSignatures.length > 1)
                    console.log(`WARNING : multiple constructors on type ${type.getParametrizedFullyQualifiedName(null)}`)
            }
        })
        if (Visit.visitPreJavaType(type, {
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
        }))
            hasDuplicate = true
    }
    if (!hasDuplicate)
        console.log(`no duplicate found`)
}

export function replaceByFunctionAndProcsLambdaTypes(typeMap: TypescriptToJavaTypemap) {
    let PARAMETER_NAMES = ['P1', 'P2', 'P3', 'P4', 'P5', 'P6', 'P7', 'P8', 'P9', 'P10', 'P11', 'P12', 'P13']
    let NB_PARAMS = PARAMETER_NAMES.length
    let LAMBDAS: PreJavaTypeClassOrInterface[] = []
    for (let i = 0; i < NB_PARAMS; i++) {
        let LAMBDA = new PreJavaTypeClassOrInterface()
        LAMBDA.setSimpleName(`Function${i ? i : ''}`)
        LAMBDA.setPackageName('fr.lteconsulting.prebuilt')
        let typeParameters = []
        for (let j = 0; j < i; j++)
            typeParameters.push(new PreJavaTypeParameter(PARAMETER_NAMES[j]))
        typeParameters.push(new PreJavaTypeParameter('R'))
        LAMBDA.setTypeParameters(typeParameters)

        let parameters: PreJavaTypeFormalParameter[] = []
        for (let j = 0; j < i; j++)
            parameters.push({
                dotdotdot: false,
                optional: false,
                type: typeParameters[j],
                name: `p${j + 1}`
            })
        let method = new PreJavaTypeCallSignature(null, typeParameters[i], null, parameters)
        LAMBDA.callSignatures.push(method)

        LAMBDAS.push(LAMBDA)
    }

    let PROCS: PreJavaTypeClassOrInterface[] = []
    for (let i = 0; i < NB_PARAMS; i++) {
        let PROC = new PreJavaTypeClassOrInterface()
        PROC.setSimpleName(`Action${i ? i : ''}`)
        PROC.setPackageName('fr.lteconsulting.prebuilt')
        let typeParameters = []
        for (let j = 0; j < i; j++)
            typeParameters.push(new PreJavaTypeParameter(PARAMETER_NAMES[j]))
        PROC.setTypeParameters(typeParameters)

        let parameters: PreJavaTypeFormalParameter[] = []
        for (let j = 0; j < i; j++)
            parameters.push({
                dotdotdot: false,
                optional: false,
                type: typeParameters[j],
                name: `p${j + 1}`
            })
        let method = new PreJavaTypeCallSignature(null, BuiltIn.BUILTIN_TYPE_UNIT, null, parameters)
        PROC.callSignatures.push(method)

        PROCS.push(PROC)
    }

    typeMap.substituteType(type => {
        return Visit.visitPreJavaType(type, {
            caseReferenceType: type => {
                // not really shure if there's no possibility of failure with that...
                // WHY THIS FIX : 
                // when a ref refs a type parametrized anonymous type that is replaced by a LAMBDA or PROC,
                // the ref should be replaced because it will miss the LAMBDA or PROC type parameters
                if (type.type instanceof PreJavaTypeReference
                    && type.type.type instanceof PreJavaTypeClassOrInterface
                    && (LAMBDAS.indexOf(type.type.type) >= 0 || PROCS.indexOf(type.type.type) >= 0))
                    return type.type
                return type
            },
            caseClassOrInterfaceType: type => {
                if (PROCS.indexOf(type) >= 0 || LAMBDAS.indexOf(type) >= 0)
                    return type

                if (type.callSignatures
                    && type.callSignatures.length == 1
                    && (!(type.callSignatures[0].typeParameters && type.callSignatures[0].typeParameters.length))
                    && type.isAnonymousSourceType
                    && typeTools.hasOnlyCallSignatures(type)) {
                    let functionalMethod = type.callSignatures[0]
                    if (!functionalMethod.parameters || functionalMethod.parameters.length < NB_PARAMS) {
                        let returnType = functionalMethod.returnType
                        let nbParameters = functionalMethod.parameters && functionalMethod.parameters.length

                        if (returnType == BuiltIn.BUILTIN_TYPE_UNIT) {
                            typeMap.registerType(`prebuilt-action-${nbParameters}`, PROCS[nbParameters])

                            let refTypeParameters = []
                            for (let i = 0; i < nbParameters; i++)
                                refTypeParameters.push(functionalMethod.parameters[i].type)
                            return new PreJavaTypeReference(PROCS[nbParameters], refTypeParameters)
                        }
                        else {
                            typeMap.registerType(`prebuilt-function-${nbParameters}`, LAMBDAS[nbParameters])

                            let refTypeParameters = []
                            for (let i = 0; i < nbParameters; i++)
                                refTypeParameters.push(functionalMethod.parameters[i].type)
                            refTypeParameters.push(returnType)

                            let ref = new PreJavaTypeReference(LAMBDAS[nbParameters], refTypeParameters)
                            return ref
                        }
                    }
                }
                return type as PreJavaType
            },

            onOther: type => type as PreJavaType
        })
    })
}


export function ensureCorrectConstructors(typeMap: TypescriptToJavaTypemap) {
    for (let type of typeMap.typeSet()) {
        Visit.visitPreJavaType(type, {
            caseClassOrInterfaceType: type => {
                if (!type.isClass)
                    return
            }
        })
    }
}

export function renameTypes(typeMap: TypescriptToJavaTypemap, renaming: { [key: string]: { [key: string]: string } }) {
    for (let type of typeMap.typeSet()) {
        Visit.visitPreJavaType(type, {
            caseClassOrInterfaceType: type => {
                if (type.packageName in renaming && type.name in renaming[type.packageName]) {
                    console.log(`renaming ${type.name} to ${renaming[type.packageName][type.name]}`)
                    type.name = renaming[type.packageName][type.name]
                }
            },
            caseUnion: type => {
                if (type.packageName in renaming && type.name in renaming[type.packageName]) {
                    console.log(`renaming ${type.name} to ${renaming[type.packageName][type.name]}`)
                    type.name = renaming[type.packageName][type.name]
                }
            }
        })
    }
}

function processJsFunctions(typeMap: TypescriptToJavaTypemap) {
    while (true) {
        let somethingChanged = false
        for (let type of typeMap.typeSet()) {
            Visit.visitPreJavaType(type, {
                caseClassOrInterfaceType: type => {
                    if (type.isFunctionalInterface)
                        return

                    if (!type.hasOnlyOneCallSignature())
                        return

                    if (type.baseTypes && type.baseTypes.size) {
                        for (let baseType of type.baseTypes) {
                            // TODO : by traversing references and typeEnv, we should build a Type env for method signatures
                            while (baseType instanceof PreJavaTypeReference)
                                baseType = baseType.type
                            while (baseType instanceof PreJavaTypeTPEnvironnement)
                                baseType = baseType.type
                            if (!(baseType instanceof PreJavaTypeClassOrInterface))
                                return
                            if (!baseType.isFunctionalInterface)
                                return
                            if (Signature.getCallSignatureTypeErasedSignature(type.callSignatures[0]) != Signature.getCallSignatureTypeErasedSignature(baseType.callSignatures[0]))
                                return
                        }
                    }

                    type.isFunctionalInterface = true
                    type.isClass = false
                    somethingChanged = true
                }
            })
        }
        if (!somethingChanged)
            break
    }
}