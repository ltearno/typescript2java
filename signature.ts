
import { PreJavaType, TypeEnvironment } from "./prejavatypes/PreJavaType"
import { visitPreJavaType } from './prejavatypes/PreJavaTypeVisit'
import { PreJavaTypeCallSignature, PreJavaTypeFormalParameter } from './prejavatypes/PreJavaTypeCallSignature'
import { PreJavaTypeProperty } from './prejavatypes/PreJavaTypeClassOrInterface'
import * as typeTools from './type-tools'
import * as BuiltIn from './builtin-types'

let nextObjectId = 1
let objectMap = new WeakMap<any, number>()
function getObjectId(o) {
    if (objectMap.has(o))
        return objectMap.get(o)

    let id = nextObjectId++
    objectMap.set(o, id)
    return `${id}`
}

export interface SignatureOptions {
    onlyTypeErasure: boolean
}

export function getCallSignatureTypeErasedSignature(signature: PreJavaTypeCallSignature) {
    return getCallSignatureSignature(signature, null, { onlyTypeErasure: true }, null)
}

export function getCallSignatureStandardSignature(signature: PreJavaTypeCallSignature) {
    return getCallSignatureSignature(signature, null, { onlyTypeErasure: false }, null)
}

export function getTypeStandardSignature(type: PreJavaType): string {
    return getTypeSignature(type, null, { onlyTypeErasure: false }, null)
}

export function getCallSignatureSignature(signature: PreJavaTypeCallSignature, typeEnvironment: TypeEnvironment, options: SignatureOptions, selfReflect: Map<PreJavaType, string>) {
    return 'S('
        + (signature.name ? signature.name : '?')
        + (options.onlyTypeErasure ? '' : ',' + getTypeSignature(signature.returnType, typeEnvironment, options, selfReflect))
        + (options.onlyTypeErasure ? '' : ',' + ((signature.typeParameters && signature.typeParameters.length) ? signature.typeParameters.map(tp => getTypeSignature(tp, typeEnvironment, options, selfReflect)).join() : ''))
        + ',' + ((signature.parameters && signature.parameters.length) ? signature.parameters.map(param => getParameterSignature(param, typeEnvironment, options, selfReflect)).join() : '')
        + ')'
}

function getParameterSignature(parameter: PreJavaTypeFormalParameter, typeEnvironment: TypeEnvironment, options: SignatureOptions, selfReflect: Map<PreJavaType, string>) {
    //return `P(${parameter.dotdotdot ? 'D' : 'd'}${parameter.optional ? 'O' : 'o'}${getTypeSignature(parameter.type, selfReflect)})`
    return `P(${parameter.dotdotdot ? 'D' : 'd'}${getTypeSignature(parameter.type, typeEnvironment, options, selfReflect)})`
}

function getPropertySignature(property: PreJavaTypeProperty, typeEnvironment: TypeEnvironment, options: SignatureOptions, selfReflect: Map<PreJavaType, string>) {
    return `p(${property.name}|${getTypeSignature(property.type, typeEnvironment, options, selfReflect)})`
}

function getTypeSignature(type: PreJavaType, typeEnvironment: TypeEnvironment, options: SignatureOptions = { onlyTypeErasure: false }, selfReflect: Map<PreJavaType, string>): string {
    if (selfReflect == null)
        selfReflect = new Map()

    if (selfReflect.has(type))
        return selfReflect.get(type)

    selfReflect.set(type, `${selfReflect.size + 1}`)

    let footprint = visitPreJavaType(type, {
        caseClassOrInterfaceType: (type) => {
            let isFunctional = type.callSignatures && type.callSignatures.length == 1 && typeTools.hasOnlyCallSignatures(type)
            if (!isFunctional && !type.isAnonymousSourceType)
                return getObjectId(type)

            return (isFunctional ? 'F' : (type.isAnonymousSourceType ? (type.isClass ? 'C(' : 'I(') : `_${type.name}(`))
                + (options.onlyTypeErasure ? '-' : ((type.typeParameters && type.typeParameters.length) ? type.typeParameters.map(tp => getTypeSignature(tp, typeEnvironment, options, selfReflect)).join() : '-'))
                + ((type.constructorSignatures && type.constructorSignatures.length) ? type.constructorSignatures.map(sig => getCallSignatureSignature(sig, typeEnvironment, options, selfReflect)).join() : '-')
                + ((type.callSignatures && type.callSignatures.length) ? type.callSignatures.map(sig => getCallSignatureSignature(sig, typeEnvironment, options, selfReflect)).join() : '-')
                + ((type.numberIndexType) ? getTypeSignature(type.numberIndexType, typeEnvironment, options, selfReflect) : '-')
                + ((type.stringIndexType) ? getTypeSignature(type.stringIndexType, typeEnvironment, options, selfReflect) : '-')
                + ((type.methods && type.methods.length) ? type.methods.map(sig => getCallSignatureSignature(sig, typeEnvironment, options, selfReflect)).join() : '-')
                + ((type.properties && type.properties.length) ? type.properties.map(ppty => getPropertySignature(ppty, typeEnvironment, options, selfReflect)).join() : '-')
                + ((type.staticMethods && type.staticMethods.length) ? type.staticMethods.map(sig => getCallSignatureSignature(sig, typeEnvironment, options, selfReflect)).join() : '-')
                + ((type.staticProperties && type.staticProperties.length) ? type.staticProperties.map(ppty => getPropertySignature(ppty, typeEnvironment, options, selfReflect)).join() : '-')
                + ')'
        },

        caseUnion: type => {
            return 'U('
                + (options.onlyTypeErasure ? '-' : ((type.typeParameters && type.typeParameters.length) ? type.typeParameters.map(tp => getTypeSignature(tp, typeEnvironment, options, selfReflect)).join() : '-'))
                + ((type.types && type.types.length) ? type.types.map(t => getTypeSignature(t, typeEnvironment, options, selfReflect)).join() : '-')
                + ')'
        },

        caseReferenceType: type => {
            let res = getTypeSignature(type.type, typeEnvironment, options, selfReflect)
            if (!options.onlyTypeErasure && type.typeParameters && type.typeParameters.length)
                res += `<${type.typeParameters.map(tp => getTypeSignature(tp, typeEnvironment, options, selfReflect)).join()}>`
            return res
        },

        caseTypeParameter: type => {
            if (typeEnvironment && (type.name in typeEnvironment))
                return getTypeSignature(typeEnvironment[type.name], null, options, selfReflect)

            if (options.onlyTypeErasure)
                return type.constraint ? getTypeSignature(type.constraint, typeEnvironment, options, selfReflect) : getTypeSignature(BuiltIn.BUILTIN_TYPE_OBJECT, typeEnvironment, options, selfReflect)
            else
                return type.getSimpleName(null) + (type.constraint ? getTypeSignature(type.constraint, typeEnvironment, options, selfReflect) : '-')
        },

        caseTPEnvironnement: type => {
            // TODO one day, really implement this concept of merging two type environments !
            let env = type.environment || typeEnvironment
            if (type.environment && typeEnvironment)
                console.log(`FUCK !`)
            return getTypeSignature(type.type, env, options, selfReflect)
        },

        onOther: (type) => getObjectId(type)// type.getFullyQualifiedName(null)
    })

    return footprint
}