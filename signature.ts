
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
    return getCallSignatureSignature(signature, { onlyTypeErasure: true }, null)
}

export function getCallSignatureStandardSignature(signature: PreJavaTypeCallSignature) {
    return getCallSignatureSignature(signature, { onlyTypeErasure: false }, null)
}

export function getTypeStandardSignature(type: PreJavaType): string {
    return getTypeSignature(type, { onlyTypeErasure: false }, null)
}

export function getCallSignatureSignature(signature: PreJavaTypeCallSignature, options: SignatureOptions, selfReflect: Map<PreJavaType, string>) {
    let res = 'S('
        + (signature.name ? signature.name : '?')
        + (options.onlyTypeErasure ? '' : ',' + getTypeSignature(signature.returnType, options, selfReflect))
        + (options.onlyTypeErasure ? '' : ',' + ((signature.typeParameters && signature.typeParameters.length) ? signature.typeParameters.map(tp => getTypeSignature(tp, options, selfReflect)).join() : ''))
        + ',' + ((signature.parameters && signature.parameters.length) ? signature.parameters.map(param => getParameterSignature(param, options, selfReflect)).join() : '')
        + ')'

    if (res == 'S(next,P(d3))' || res == 'S(next,P(d74))')
        console.log('yop');


    return res
}

export function getParameterSignature(parameter: PreJavaTypeFormalParameter, options: SignatureOptions, selfReflect: Map<PreJavaType, string>) {
    //return `P(${parameter.dotdotdot ? 'D' : 'd'}${parameter.optional ? 'O' : 'o'}${getTypeSignature(parameter.type, selfReflect)})`
    return `P(${parameter.dotdotdot ? 'D' : 'd'}${getTypeSignature(parameter.type, options, selfReflect)})`
}

export function getPropertySignature(property: PreJavaTypeProperty, options: SignatureOptions, selfReflect: Map<PreJavaType, string>) {
    return `p(${property.name}|${getTypeSignature(property.type, options, selfReflect)})`
}

function getTypeSignature(type: PreJavaType, options: SignatureOptions = { onlyTypeErasure: false }, selfReflect: Map<PreJavaType, string>): string {
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
                + (options.onlyTypeErasure ? '-' : ((type.typeParameters && type.typeParameters.length) ? type.typeParameters.map(tp => getTypeSignature(tp, options, selfReflect)).join() : '-'))
                + ((type.constructorSignatures && type.constructorSignatures.length) ? type.constructorSignatures.map(sig => getCallSignatureSignature(sig, options, selfReflect)).join() : '-')
                + ((type.callSignatures && type.callSignatures.length) ? type.callSignatures.map(sig => getCallSignatureSignature(sig, options, selfReflect)).join() : '-')
                + ((type.numberIndexType) ? getTypeSignature(type.numberIndexType, options, selfReflect) : '-')
                + ((type.stringIndexType) ? getTypeSignature(type.stringIndexType, options, selfReflect) : '-')
                + ((type.methods && type.methods.length) ? type.methods.map(sig => getCallSignatureSignature(sig, options, selfReflect)).join() : '-')
                + ((type.properties && type.properties.length) ? type.properties.map(ppty => getPropertySignature(ppty, options, selfReflect)).join() : '-')
                + ((type.staticMethods && type.staticMethods.length) ? type.staticMethods.map(sig => getCallSignatureSignature(sig, options, selfReflect)).join() : '-')
                + ((type.staticProperties && type.staticProperties.length) ? type.staticProperties.map(ppty => getPropertySignature(ppty, options, selfReflect)).join() : '-')
                + ')'
        },

        caseUnion: type => {
            return 'U('
                + (options.onlyTypeErasure ? '-' : ((type.typeParameters && type.typeParameters.length) ? type.typeParameters.map(tp => getTypeSignature(tp, options, selfReflect)).join() : '-'))
                + ((type.types && type.types.length) ? type.types.map(t => getTypeSignature(t, options, selfReflect)).join() : '-')
                + ')'
        },

        caseReferenceType: type => getTypeSignature(type.type, options, selfReflect),
        /*{
            //return `R(${getTypeSignature(type.type, selfReflect)}${(type.typeParameters && type.typeParameters.length) ? type.typeParameters.map(tp => getTypeSignature(tp, selfReflect)).join() : '-'})`
            return `R(${getTypeSignature(type.type, selfReflect)})`
        },*/

        caseTypeParameter: (type) => {
            if (options.onlyTypeErasure)
                return type.constraint ? getTypeSignature(type.constraint, options, selfReflect) : getTypeSignature(BuiltIn.BUILTIN_TYPE_OBJECT, options, selfReflect)
            else
                return type.getSimpleName(null) + (type.constraint ? getTypeSignature(type.constraint, options, selfReflect) : '-')
        },
        //caseTypeParameter: (type) => type.constraint ? getTypeSignature(type.constraint, selfReflect) : getObjectId(BuiltIn.BUILTIN_TYPE_OBJECT),

        caseTPEnvironnement: type => getTypeSignature(type.type, options, selfReflect),

        onOther: (type) => getObjectId(type)// type.getFullyQualifiedName(null)
    })

    return footprint
}