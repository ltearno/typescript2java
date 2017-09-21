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

import { TsToPreJavaTypemap } from './type-map'

const MAX_NB_DEVELOPPED_METHODS = 5

let currentIdAnonymousTypes = 1

export function ensureAllTypesHaveNameAndPackage(typeMap: TsToPreJavaTypemap, defaultPackageName: string) {
    for (let type of typeMap.typeSet()) {
        if (type instanceof PreJavaTypeClassOrInterface) {
            if (type.getParametrizedSimpleName(null) == null)
                type.setSimpleName(`AnonymousType_${currentIdAnonymousTypes++}`)
        }
        if (defaultPackageName && !type.getPackageName())
            type.setPackageName(defaultPackageName)
    }
}

export function removeOverridingProperties(typeMap: TsToPreJavaTypemap) {
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
    function getMethodFootprint(method: PreJavaTypeCallSignature) {
        let res = method.name ? method.name : '?'
        if (method.parameters && method.parameters.length)
            res += '-' + method.parameters.map(p => getTypeFootprint(p.type)).join('-')
        return res
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
                    type.methods.forEach(m => methodsByFootprint.set(getMethodFootprint(m), m))

                    typeTools.browseTypeHierarchy(type, visitedType => {
                        visitedType.methods && visitedType.methods
                            .forEach(m => methodsByFootprint.delete(getMethodFootprint(m)))
                    })

                    type.methods = []
                    methodsByFootprint.forEach(m => type.addMethod(m))
                }
            }
        })
    })
}


function developMethod(method: PreJavaTypeCallSignature, nbMethodsMax: number): PreJavaTypeCallSignature[] {
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

export function developMethodsWithUnionParameters(typeMap: TsToPreJavaTypemap) {
    let maxCounter = 0
    let maxType = null

    for (let type of typeMap.typeSet()) {
        Visit.visitPreJavaType(type, {
            caseClassOrInterfaceType: type => {
                let counter = 0
                let functionalInterface = typeTools.hasOnlyCallSignatures(type)
                if (functionalInterface && type.callSignatures.length == 1)
                    return

                type.methods && type.methods.forEach(m => {
                    let dups = developMethod(m, 5)
                    counter += dups && dups.length

                    dups && dups.forEach(dup => type.addMethod(dup))
                })

                if (maxType == null || maxCounter < counter) {
                    maxType = type
                    maxCounter = counter
                }
            }
        })
    }

    console.log(`${maxCounter} on ${maxType} developped methods with union parameters`)
}






export function reduceAnonymousTypes(typeMap: TsToPreJavaTypemap) {
    let types = typeMap.typeSet()

    let typeDuplicates = new Map<string, PreJavaType[]>()

    console.log(`finding duplicate anonymous types`)
    types.forEach(type => {
        Visit.visitPreJavaType(type, {
            caseClassOrInterfaceType: (classType) => {
                if (!classType.isAnonymousSourceType)
                    return

                let footprint = Signature.getTypeSignature(classType, null)
                let list = typeDuplicates.get(footprint)
                if (list == null) {
                    list = []
                    typeDuplicates.set(footprint, list)
                }
                list.push(classType)
            },

            caseUnion: unionType => {
                let footprint = Signature.getTypeSignature(unionType, null)
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
    let totalDuplicates = 0
    typeDuplicates.forEach((list, footprint) => {
        if (list.length < 2)
            return

        totalDuplicates += list.length - 1

        let replacedTypes = list.slice(1, list.length - 1)
        let replacementType = list[0] as PreJavaTypeClassOrInterface

        replacedTypes
            .filter(t => t instanceof PreJavaTypeClassOrInterface && t.comments && t.comments.length)
            .forEach(t => {
                if (!replacementType.comments)
                    replacementType.comments = []
                replacementType.comments.concat((t as PreJavaTypeClassOrInterface).comments)
            })

        typeMap.substituteType((type: PreJavaType): PreJavaType => {
            if (replacedTypes.some(replacedType => replacedType === type))
                return replacementType
            return type
        })
    })
    console.log(`found and removed ${totalDuplicates} duplicates`)

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





export function simplifyUnions(typeMap: TsToPreJavaTypemap) {
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

export function removeNotSupportedTypes(typeMap: TsToPreJavaTypemap) {
    typeMap.substituteType((type) => type instanceof PreJavaTypeFakeType ? null : type)
    typeMap.substituteType((type) => type.getSimpleName(null) == '?' ? BuiltIn.BUILTIN_TYPE_OBJECT : type)
    typeMap.substituteType((type) => type.getSimpleName(null) == '' ? null : type)
}

// TODO : for classes : add methods from interface hierarchy which are not in the method list
export function addMethodsFromInterfaceHierarchy(typeMap: TsToPreJavaTypemap) {
    for (let pjt of typeMap.typeSet()) {
        Visit.visitPreJavaType(pjt, {
            caseClassOrInterfaceType: type => {
                if (type.isClassLike()) {
                    let methodsSignatures = new Set<string>()
                    type.methods && type.methods.forEach(m => methodsSignatures.add(Signature.getCallSignatureSignature(m)))

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
                            type.addMethod(method)
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



export function removeDuplicateOverloads(typeMap: TsToPreJavaTypemap) {
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






export function changeDtoInterfacesIntoClasses(typeMap: TsToPreJavaTypemap) {
    let nb = 0
    for (let type of typeMap.typeSet()) {
        if (type instanceof PreJavaTypeClassOrInterface && (!type.isClass) && type.hasOnlyProperties() && !typeMap.hasSubType(type) && (!type.staticMethods || !type.staticMethods.length) && (!type.staticProperties || !type.staticProperties.length)) {
            type.isClass = true
            nb++
        }
    }
    console.log(`${nb} DTO types converted to classes`)
}



export function arrangeMultipleImplementationInheritance(typeMap: TsToPreJavaTypemap, implementationSuffix: string) {
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

                    superType.isClass = false
                    superType.constructorSignatures = null
                    superType.jsName = null
                    superType.jsNamespace = null

                    newType.cleanAndCheckMethods()

                    typeMap.typeMap.set({} as ts.Type, newType)
                }
            }
        }

        if (!somethingDone)
            break
    }
}

export function checkNoDuplicateTypeNames(typeMap: TsToPreJavaTypemap) {
    let typeFqnCache: Map<string, PreJavaType> = new Map()
    let hasDuplicate = false
    console.log(`duplicate types :`)
    for (let type of typeMap.typeSet()) {
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

export function replaceAnonymousTypes(typeMap: TsToPreJavaTypemap) {
    let PARAMETER_NAMES = ['P1', 'P2', 'P3', 'P4', 'P5', 'P6', 'P7', 'P8', 'P9', 'P10', 'P11', 'P12', 'P13']
    let NB_PARAMS = PARAMETER_NAMES.length
    let LAMBDAS: PreJavaTypeClassOrInterface[] = []
    for (let i = 0; i < NB_PARAMS; i++) {
        let LAMBDA = new PreJavaTypeClassOrInterface()
        LAMBDA.setSimpleName(`Function${i ? i : ''}`)
        LAMBDA.setPackageName('fr.lteconsulting.prebuilt')
        let typeParameters = [new PreJavaTypeParameter('R')]
        for (let j = 0; j < i; j++)
            typeParameters.push(new PreJavaTypeParameter(PARAMETER_NAMES[j]))
        LAMBDA.setTypeParameters(typeParameters)

        let parameters: PreJavaTypeFormalParameter[] = []
        for (let j = 0; j < i; j++)
            parameters.push({
                dotdotdot: false,
                optional: false,
                type: typeParameters[j + 1],
                name: `p${j + 1}`
            })
        let method = new PreJavaTypeCallSignature(null, typeParameters[0], null, parameters)
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
            caseClassOrInterfaceType: type => {
                if (PROCS.indexOf(type) >= 0 || LAMBDAS.indexOf(type) >= 0)
                    return type

                if (type.callSignatures && type.callSignatures.length == 1 && type.isAnonymousSourceType && typeTools.hasOnlyCallSignatures(type)) {
                    let functionalMethod = type.callSignatures[0]
                    if (!functionalMethod.parameters || functionalMethod.parameters.length < NB_PARAMS) {
                        let returnType = functionalMethod.returnType
                        let nbParameters = functionalMethod.parameters && functionalMethod.parameters.length

                        if (returnType == BuiltIn.BUILTIN_TYPE_UNIT) {
                            typeMap.typeMap.set(`prebuilt-action-${nbParameters}`, PROCS[nbParameters])

                            let ref = new PreJavaTypeReference()
                            ref.type = PROCS[nbParameters]
                            ref.typeParameters = []
                            for (let i = 0; i < nbParameters; i++)
                                ref.typeParameters.push(functionalMethod.parameters[i].type)
                            return ref
                        }
                        else {
                            typeMap.typeMap.set(`prebuilt-function-${nbParameters}`, LAMBDAS[nbParameters])

                            let ref = new PreJavaTypeReference()
                            ref.type = LAMBDAS[nbParameters]
                            ref.typeParameters = [returnType]
                            for (let i = 0; i < nbParameters; i++)
                                ref.typeParameters.push(functionalMethod.parameters[i].type)
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