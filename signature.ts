
import { PreJavaType } from "./prejavatypes/PreJavaType"
import { visitPreJavaType } from './prejavatypes/PreJavaTypeVisit'
import { PreJavaTypeCallSignature, PreJavaTypeFormalParameter } from './prejavatypes/PreJavaTypeCallSignature'
import { PreJavaTypeProperty } from './prejavatypes/PreJavaTypeClassOrInterface'
import * as typeTools from './type-tools'

let nextObjectId = 1
let objectMap = new WeakMap<any, number>()
function getObjectId(o) {
    if (objectMap.has(o))
        return objectMap.get(o)

    let id = nextObjectId++
    objectMap.set(o, id)
    return `${id}`
}

export function getCallSignatureSignature(signature: PreJavaTypeCallSignature, selfReflect: Map<PreJavaType, string> = null) {
    return 'S('
        + (signature.name ? signature.name : '?')
        + ',' + getTypeSignature(signature.returnType, selfReflect)
        + ',' + ((signature.typeParameters && signature.typeParameters.length) ? signature.typeParameters.map(tp => getTypeSignature(tp, selfReflect)).join() : '')
        + ',' + ((signature.parameters && signature.parameters.length) ? signature.parameters.map(param => getParameterSignature(param, selfReflect)).join() : '')
        + ')'
}

export function getParameterSignature(parameter: PreJavaTypeFormalParameter, selfReflect: Map<PreJavaType, string> = null) {
    //return `P(${parameter.dotdotdot ? 'D' : 'd'}${parameter.optional ? 'O' : 'o'}${getTypeSignature(parameter.type, selfReflect)})`
    return `P(${parameter.dotdotdot ? 'D' : 'd'}${getTypeSignature(parameter.type, selfReflect)})`
}

export function getPropertySignature(property: PreJavaTypeProperty, selfReflect: Map<PreJavaType, string> = null) {
    return `p(${property.name}|${getTypeSignature(property.type, selfReflect)})`
}

export function getTypeSignature(type: PreJavaType, selfReflect: Map<PreJavaType, string> = null): string {
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
                + ((type.typeParameters && type.typeParameters.length) ? type.typeParameters.map(tp => getTypeSignature(tp, selfReflect)).join() : '-')
                + ((type.constructorSignatures && type.constructorSignatures.length) ? type.constructorSignatures.map(sig => getCallSignatureSignature(sig, selfReflect)).join() : '-')
                + ((type.callSignatures && type.callSignatures.length) ? type.callSignatures.map(sig => getCallSignatureSignature(sig, selfReflect)).join() : '-')
                + ((type.numberIndexType) ? getTypeSignature(type.numberIndexType, selfReflect) : '-')
                + ((type.stringIndexType) ? getTypeSignature(type.stringIndexType, selfReflect) : '-')
                + ((type.methods && type.methods.length) ? type.methods.map(sig => getCallSignatureSignature(sig, selfReflect)).join() : '-')
                + ((type.properties && type.properties.length) ? type.properties.map(ppty => getPropertySignature(ppty, selfReflect)).join() : '-')
                + ')'
        },

        caseUnion: type => {
            return 'U('
                + ((type.typeParameters && type.typeParameters.length) ? type.typeParameters.map(tp => getTypeSignature(tp, selfReflect)).join() : '-')
                + ((type.types && type.types.length) ? type.types.map(t => getTypeSignature(t, selfReflect)).join() : '-')
                + ')'
        },

        caseReferenceType: type => {
            //return `R(${getTypeSignature(type.type, selfReflect)}${(type.typeParameters && type.typeParameters.length) ? type.typeParameters.map(tp => getTypeSignature(tp, selfReflect)).join() : '-'})`
            return `R(${getTypeSignature(type.type, selfReflect)})`
        },


        caseTypeParameter: (type) => type.getSimpleName(null) + (type.constraint ? getTypeSignature(type.constraint, selfReflect) : '-'),

        caseTPEnvironnement: type => getTypeSignature(type.type, selfReflect),

        onOther: (type) => getObjectId(type)// type.getFullyQualifiedName(null)
    })

    return footprint
}