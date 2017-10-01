import * as ts from "typescript"
import * as typeTools from './type-tools'
import * as Visit from './prejavatypes/PreJavaTypeVisit'
import * as Signature from './signature'
import * as BuiltIn from './builtin-types'

import { PreJavaTypeUnion } from './prejavatypes/PreJavaTypeUnion'
import { PreJavaTypeReference, PreJavaTypeTPEnvironnement } from './prejavatypes/PreJavaTypeReference'
import { PreJavaTypeFakeType } from './prejavatypes/PreJavaTypeFakeType'
import { PreJavaType, TypeEnvironment } from './prejavatypes/PreJavaType'
import { PreJavaTypeClassOrInterface, PreJavaTypeProperty } from './prejavatypes/PreJavaTypeClassOrInterface'
import { PreJavaTypeCallSignature, PreJavaTypeFormalParameter } from './prejavatypes/PreJavaTypeCallSignature'
import { PreJavaTypeParameter } from "./prejavatypes/PreJavaTypeParameter";

import { TypescriptToJavaTypemap } from './type-map'

const MAX_NB_DEVELOPPED_METHODS = 5

let currentIdAnonymousTypes = 1

type Transformer = (
    typeMap: TypescriptToJavaTypemap,
    defaultPackageName: string,
    renaming: { [key: string]: { [key: string]: string } })
    => boolean

export function applyTransformations(typeMap: TypescriptToJavaTypemap, renaming: { [key: string]: { [key: string]: string } }) {
    console.log(`removing unsupported types`)

    let transformers = [
        removeNotSupportedTypes,
        simplifyUnions,
        replaceByFunctionAndProcsLambdaTypes,
        //removeOverridingProperties,
        deduplicateTypes,
        removeEmptyTypes,
        ensureAllTypesHaveNameAndPackage,
        arrangeMultipleImplementationInheritance,
        changeDtoInterfacesIntoClasses,
        addMethodsFromInterfaceHierarchy,
        processJsFunctions,
        developMethodsWithUnionParameters,
        renameTypes
    ]

    let passCounter = 1
    while (true) {
        let somethingChanged = false

        console.log(`transformation, pass ${passCounter}\n`)

        for (let i = 0; i < transformers.length; i++) {
            let result = transformers[i](typeMap, this.baseJavaPackage, renaming)
            console.log(`transformer ${i} : ${result}`)
            if (result)
                somethingChanged = true
        }

        if (!somethingChanged)
            break
        passCounter++
        if (passCounter > 10) {
            console.log(`ERROR : too many transformation passes !`)
            break
        }
    }

    console.log(`transformation applied`)
}

export let ensureAllTypesHaveNameAndPackage: Transformer = function (typeMap: TypescriptToJavaTypemap, defaultPackageName: string) {
    console.log(`unanonymising types`)

    let somethingChanged = false
    for (let type of typeMap.typeSet()) {
        if (type instanceof PreJavaTypeClassOrInterface) {
            if (type.getParametrizedSimpleName(null) == null) {
                type.setSimpleName(`AnonymousType_${currentIdAnonymousTypes++}`)
                somethingChanged = true
            }
        }
        if (defaultPackageName && !type.getPackageName()) {
            type.setPackageName(defaultPackageName)
            somethingChanged = true
        }
    }
    return somethingChanged
}

export let removeOverridingProperties: Transformer = function (typeMap: TypescriptToJavaTypemap) {
    console.log(`removing OverridingProperties`)

    let somethingChanged = false
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
                        visitedType.properties && visitedType.properties.forEach(p => {
                            propertiesByName.delete(p.name)
                            somethingChanged = true
                            console.log(`remove property ${p.name} from ${type.getParametrizedFullyQualifiedName(null)}`)
                        })
                    })

                    type.properties = []
                    propertiesByName.forEach(p => type.properties.push(p))
                }

                if (type.methods && type.methods.length) {
                    let methodsByFootprint = new Map<string, PreJavaTypeCallSignature>()
                    type.methods.forEach(m => methodsByFootprint.set(Signature.getCallSignatureTypeErasedSignature(m), m))

                    typeTools.browseTypeHierarchy(type, visitedType => {
                        visitedType.methods && visitedType.methods.forEach(m => {
                            let sig = Signature.getCallSignatureTypeErasedSignature(m)
                            methodsByFootprint.delete(sig)
                            somethingChanged = true
                            console.log(`remove method ${sig} from ${type.getParametrizedFullyQualifiedName(null)}`)
                        })
                    })

                    type.methods = []
                    methodsByFootprint.forEach(m => type.addMethod(m))
                }
            }
        })
    })
    return somethingChanged
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

export let developMethodsWithUnionParameters: Transformer = function (typeMap: TypescriptToJavaTypemap) {
    console.log(`developping methods with union parameters`)

    let somethingChanged = false
    let counter = 0
    for (let type of typeMap.typeSet()) {
        Visit.visitPreJavaType(type, {
            caseClassOrInterfaceType: type => {
                if (type.isFunctionalInterface)
                    return

                let methodsSignatures = new Set<string>()
                type.methods && type.methods.forEach(m => methodsSignatures.add(Signature.getCallSignatureTypeErasedSignature(m)))
                let maybeAdd = method => {
                    let sig = Signature.getCallSignatureTypeErasedSignature(method)
                    if (methodsSignatures.has(sig))
                        return
                    methodsSignatures.add(sig)
                    type.methods.push(method)
                    somethingChanged = true
                    counter++
                }

                type.methods && type.methods.forEach(m => {
                    let dups = developMethodWithUnionParameters(m, 5)
                    dups && dups.forEach(dup => maybeAdd(dup))
                })

                type.methods && type.methods.forEach(m => {
                    let dups = developMethodWithOptionalParameters(m)
                    dups && dups.forEach(dup => maybeAdd(dup))
                })
            }
        })
    }
    console.log(`added ${counter} developped methods`)
    return somethingChanged
}






export let deduplicateTypes: Transformer = function (typeMap: TypescriptToJavaTypemap) {
    console.log(`deduplicating types`)

    let types = typeMap.typeSet()
    let typeDuplicates = new Map<string, PreJavaType[]>()
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

    let replacements = new Map()
    typeDuplicates.forEach((list, footprint) => {
        for (let i = 1; i < list.length; i++)
            replacements.set(list[i], list[0])
    })

    return typeMap.substituteType((type: PreJavaType): PreJavaType => replacements.get(type) || type)
}

export let removeEmptyTypes: Transformer = function (typeMap: TypescriptToJavaTypemap) {
    console.log(`replacing empty classes by Object`)

    return typeMap.substituteType(type => {
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





export let removeNotSupportedTypes: Transformer = function (typeMap: TypescriptToJavaTypemap) {
    return typeMap.substituteType((type) => {
        if (type instanceof PreJavaTypeFakeType)
            return null
        if (type.getSimpleName(null) == '?')
            return BuiltIn.BUILTIN_TYPE_OBJECT
        if (type.getSimpleName(null) == '')
            return null

        return type
    })
}

export let simplifyUnions: Transformer = function (typeMap: TypescriptToJavaTypemap) {
    console.log(`simplifying unions`)

    return typeMap.substituteType(type => Visit.visitPreJavaType(type, {
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

export let addMethodsFromInterfaceHierarchy: Transformer = function (typeMap: TypescriptToJavaTypemap) {
    console.log(`add missing methods from interface hierarchy in classes`)

    let somethingChanged = false
    for (let type of typeMap.typeSet()) {
        Visit.visitPreJavaType(type, {
            caseClassOrInterfaceType: type => {
                if (type.isClassLike()) {
                    let methodsSignatures = new Map<string, { isImplemented: boolean; method: PreJavaTypeCallSignature }>()

                    // register type methods as implemented
                    type.methods && type.methods.forEach(m => methodsSignatures.set(Signature.getCallSignatureTypeErasedSignature(m), { isImplemented: true, method: m }))

                    function translateMethod(visitedMethod: PreJavaTypeCallSignature, visitedType: PreJavaType, typeVariableEnv: TypeEnvironment) {
                        let method = new PreJavaTypeCallSignature(visitedMethod.typeParameters, visitedMethod.returnType, visitedMethod.name, visitedMethod.parameters)
                        method.returnType = typeVariableEnv ? new PreJavaTypeTPEnvironnement(visitedMethod.returnType, typeVariableEnv) : visitedMethod.returnType
                        if (method.parameters)
                            method.parameters = method.parameters.map(p => ({
                                name: p.name,
                                type: typeVariableEnv ? new PreJavaTypeTPEnvironnement(p.type, typeVariableEnv) : p.type,
                                optional: p.optional,
                                dotdotdot: p.dotdotdot
                            }))
                        method.addComments(`inherited from (${visitedType.getFullyQualifiedName(null)})`)
                        return method
                    }

                    // browse type hierarchy and account for non implmeented (abstract) methods
                    typeTools.browseTypeHierarchy(type, (visitedType, typeVariableEnv) => {
                        if (visitedType.isClassLike()) {
                            visitedType.methods && visitedType.methods.forEach(visitedMethod => {
                                let method = translateMethod(visitedMethod, visitedType, typeVariableEnv)
                                let sig = Signature.getCallSignatureTypeErasedSignature(method)
                                if (!methodsSignatures.has(sig))
                                    methodsSignatures.set(sig, { isImplemented: true, method: method })
                                else
                                    methodsSignatures.get(sig).isImplemented = true
                            })
                        }
                        else {
                            visitedType.methods && visitedType.methods.forEach(visitedMethod => {
                                let method = translateMethod(visitedMethod, visitedType, typeVariableEnv)
                                let sig = Signature.getCallSignatureTypeErasedSignature(method)
                                if (!methodsSignatures.has(sig)) {
                                    methodsSignatures.set(sig, { isImplemented: false, method: method })
                                }
                            })

                            visitedType.properties && visitedType.properties.forEach(visitedProperty => {
                                let existingProperty = type.properties && type.properties.find(p => p.name == visitedProperty.name)
                                if (existingProperty) {
                                    // TODO minimal management of property redefinitions : should allow the type to be tightened and not widened
                                    // TODO For the moment, we just keep the super type class
                                    let newType = typeVariableEnv ? new PreJavaTypeTPEnvironnement(visitedProperty.type, typeVariableEnv) : visitedProperty.type
                                    if (newType.getParametrizedFullyQualifiedName(null) != existingProperty.type.getParametrizedFullyQualifiedName(null)) {
                                        existingProperty.type = newType
                                        somethingChanged = true
                                    }
                                }
                                else {
                                    let newProperty: PreJavaTypeProperty = {
                                        name: visitedProperty.name,
                                        type: typeVariableEnv ? new PreJavaTypeTPEnvironnement(visitedProperty.type, typeVariableEnv) : visitedProperty.type,
                                        writable: visitedProperty.writable,
                                        comments: visitedProperty.comments
                                    }

                                    type.addProperty(newProperty)

                                    somethingChanged = true
                                }
                            })
                        }
                    })

                    for (let info of methodsSignatures.values()) {
                        if (!info.isImplemented) {
                            type.methods.push(info.method)
                            somethingChanged = true
                        }
                    }
                }
            }
        })
    }
    return somethingChanged
}

export let changeDtoInterfacesIntoClasses: Transformer = function (typeMap: TypescriptToJavaTypemap) {
    console.log(`changing DTO interfaces into classes`)

    let nb = 0
    for (let type of typeMap.typeSet()) {
        if (type instanceof PreJavaTypeClassOrInterface && (!type.isClass) && !type.isFunctionalInterface /*&& type.hasOnlyProperties()*/ && !typeMap.hasSubType(type) && (!type.staticMethods || !type.staticMethods.length) && (!type.staticProperties || !type.staticProperties.length)) {
            if (!type.comments)
                type.comments = []
            type.comments.push(`*** changed to class to reflect the possible DTO use of this type ***`)
            type.isClass = true
            nb++
        }
    }
    console.log(`${nb} DTO types converted to classes`)
    return nb > 0
}



export let arrangeMultipleImplementationInheritance: Transformer = function (typeMap: TypescriptToJavaTypemap) {
    console.log(`transforming types inheriting multiple implementations`)

    const implementationSuffix = ''
    const interfaceSuffix = '_Interface'

    let interfaceProxyCache = new Map<PreJavaType, PreJavaTypeClassOrInterface>()
    function createInterfaceProxyForClass(type: PreJavaTypeClassOrInterface) {
        if (interfaceProxyCache.has(type))
            return interfaceProxyCache.get(type)

        let newType = new PreJavaTypeClassOrInterface()
        newType.baseTypes = type.baseTypes
        newType.comments = type.comments && type.comments.slice()
        newType.methods = type.methods && type.methods.slice()
        newType.callSignatures = type.callSignatures && type.callSignatures.slice()
        newType.name = type.name + interfaceSuffix
        newType.numberIndexType = type.numberIndexType
        newType.stringIndexType = type.stringIndexType
        newType.packageName = type.packageName
        newType.properties = type.properties && type.properties.slice()
        newType.jsNamespace = type.jsNamespace
        newType.jsName = type.jsName
        newType.isClass = false
        newType.typeParameters = type.typeParameters && type.typeParameters.slice()
        newType.sourceTypes = type.sourceTypes

        type.baseTypes = new Set()
        type.baseTypes.add(newType)

        interfaceProxyCache.set(type, newType)
        typeMap.registerType({} as ts.Type, newType)

        return newType
    }

    let maxPasses = 10

    let somethingDone = false
    while (maxPasses-- >= 0) {
        for (let type of typeMap.typeSet()) {
            if (type instanceof PreJavaTypeClassOrInterface && type.baseTypes && type.baseTypes.size) {
                let implementationSuperTypes: PreJavaType[] = []
                for (let superType of type.baseTypes.values()) {
                    if (superType.isClassLike())
                        implementationSuperTypes.push(superType)
                }

                if ((type.isClassLike() && implementationSuperTypes.length <= 1) || (!type.isClassLike() && implementationSuperTypes.length == 0))
                    continue

                somethingDone = true

                for (let superType of implementationSuperTypes) {
                    let originalSuperType = superType

                    while (superType && superType instanceof PreJavaTypeReference)
                        superType = superType.type
                    while (superType && superType instanceof PreJavaTypeTPEnvironnement)
                        superType = superType.type

                    if (!(superType instanceof PreJavaTypeClassOrInterface))
                        continue

                    let newType = createInterfaceProxyForClass(superType)
                    if (!newType.comments)
                        newType.comments = []
                    newType.comments.push(`created because of multiple implementation inheritance of ${type.getParametrizedFullyQualifiedName(null)}`)

                    if (!type.comments)
                        type.comments = []
                    type.comments.push(`\noriginal implementationSuperTypes :`)
                    implementationSuperTypes.forEach(st => (type as PreJavaTypeClassOrInterface).comments.push(`- ${st.getParametrizedFullyQualifiedName(null)}`))
                    type.comments.push(`original super type ${originalSuperType.getParametrizedFullyQualifiedName(null)} has been replaced by ${newType.getParametrizedFullyQualifiedName(null)}`)

                    if (originalSuperType instanceof PreJavaTypeReference) {
                        if (originalSuperType.type != superType)
                            console.log(`god`)
                        originalSuperType.type = newType
                    }
                    else if (originalSuperType instanceof PreJavaTypeClassOrInterface) {
                        type.baseTypes.delete(originalSuperType)
                        type.baseTypes.add(newType)
                    }
                    else {
                        console.log(`DONT KNOW WHAT TO DO ANKJSU`)
                    }
                }
            }
        }

        if (!somethingDone)
            break
    }
    return somethingDone
}

export let checkNoDuplicateTypeNames: Transformer = function (typeMap: TypescriptToJavaTypemap) {
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
    return false
}

const PARAMETER_NAMES = ['P1', 'P2', 'P3', 'P4', 'P5', 'P6', 'P7', 'P8', 'P9', 'P10', 'P11', 'P12', 'P13']
const NB_PARAMS = PARAMETER_NAMES.length
let LAMBDAS: PreJavaTypeClassOrInterface[]
let PROCS: PreJavaTypeClassOrInterface[]

function ensureLambdasAndProcsCreated() {
    if (LAMBDAS || PROCS)
        return

    LAMBDAS = []
    for (let i = 0; i < NB_PARAMS; i++) {
        let LAMBDA = new PreJavaTypeClassOrInterface()
        LAMBDA.setSimpleName(`Function${i ? i : ''}`)
        LAMBDA.setPackageName('fr.lteconsulting.prebuilt')
        LAMBDA.isFunctionalInterface = true
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

    PROCS = []
    for (let i = 0; i < NB_PARAMS; i++) {
        let PROC = new PreJavaTypeClassOrInterface()
        PROC.setSimpleName(`Action${i ? i : ''}`)
        PROC.setPackageName('fr.lteconsulting.prebuilt')
        PROC.isFunctionalInterface = true
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
}

export let replaceByFunctionAndProcsLambdaTypes: Transformer = function (typeMap: TypescriptToJavaTypemap) {
    console.log(`replacing anonymous types`)

    ensureLambdasAndProcsCreated()

    return typeMap.substituteType(type => {
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

export let renameTypes: Transformer = function (typeMap: TypescriptToJavaTypemap, baseJavaPackage: string, renaming: { [key: string]: { [key: string]: string } }) {
    if (!renaming)
        return false

    console.log(`renaming types specified in configration`)

    let somethingChanged = false
    for (let type of typeMap.typeSet()) {
        Visit.visitPreJavaType(type, {
            caseClassOrInterfaceType: type => {
                if (type.packageName in renaming && type.name in renaming[type.packageName]) {
                    console.log(`renaming ${type.name} to ${renaming[type.packageName][type.name]}`)
                    type.name = renaming[type.packageName][type.name]
                    somethingChanged = true
                }
            },
            caseUnion: type => {
                if (type.packageName in renaming && type.name in renaming[type.packageName]) {
                    console.log(`renaming ${type.name} to ${renaming[type.packageName][type.name]}`)
                    type.name = renaming[type.packageName][type.name]
                    somethingChanged = true
                }
            }
        })
    }

    return somethingChanged
}

let processJsFunctions: Transformer = function (typeMap: TypescriptToJavaTypemap) {
    console.log(`process JsFunctions`)

    let hasMadeChange = false
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

        hasMadeChange = true
    }

    return hasMadeChange
}