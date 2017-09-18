import { PreJavaType } from './prejavatypes/PreJavaType'
import { PreJavaTypeClassOrInterface } from './prejavatypes/PreJavaTypeClassOrInterface'
import * as Visit from './prejavatypes/PreJavaTypeVisit'
import { PreJavaTypeCallSignature } from './prejavatypes/PreJavaTypeCallSignature'

export function browseTypeHierarchy(type: PreJavaType, visitor: { (visitedInterface: PreJavaTypeClassOrInterface, typeVariableEnv: { [key: string]: PreJavaType }) }, typeVariableEnv: { [key: string]: PreJavaType } = null, visitSelf: boolean = false) {
    Visit.visitPreJavaType(type, {
        caseReferenceType: type => {
            let newEnv = {}
            let targetTypeParameters = type.type.getTypeParameters(null)
            for (let tpi = 0; tpi < type.typeParameters.length; tpi++) {
                let value = type.typeParameters[tpi]
                Visit.visitPreJavaType(value, {
                    caseTypeParameter: t => {
                        if (typeVariableEnv && t.name in typeVariableEnv)
                            value = typeVariableEnv[t.name]
                    }
                })
                newEnv[targetTypeParameters[tpi].getSimpleName(null)] = value
            }

            browseTypeHierarchy(type.type, visitor, newEnv, true)
        },

        caseClassOrInterfaceType: type => {
            if (visitSelf)
                visitor(type, typeVariableEnv)

            type.baseTypes && type.baseTypes.forEach(baseType => browseTypeHierarchy(baseType, visitor, typeVariableEnv, true))
        }
    })
}

export function getBaseTypes(type: PreJavaType): Set<PreJavaType> {
    return Visit.visitPreJavaType(type, {
        // TODO : build a type env...
        caseTPEnvironnement: type => getBaseTypes(type.type),
        caseReferenceType: type => getBaseTypes(type.type),
        caseUnion: type => type.getBaseTypes(),
        caseClassOrInterfaceType: type => type.baseTypes,
        onOther: type => null
    })
}

export function getConstructors(type: PreJavaType): PreJavaTypeCallSignature[] {
    return Visit.visitPreJavaType(type, {
        // TODO : build a type env...
        caseTPEnvironnement: type => getConstructors(type.type),
        caseReferenceType: type => getConstructors(type.type),
        caseClassOrInterfaceType: type => type.constructorSignatures,
        onOther: type => null
    })
}

/**
 * finds the super constructor of the passed type.
 * 
 * if no explicit constructor is found, null is returned
 */
export function getSuperConstructors(type: PreJavaType): PreJavaTypeCallSignature[] {
    let baseTypes = getBaseTypes(type)
    if (!baseTypes)
        return null

    let implementationBaseType: PreJavaType = null
    baseTypes.forEach(type => {
        if (implementationBaseType)
            console.log(`WARNING : found multiple implementation base types on type ${type.getSimpleName(null)}`);

        if (type.isClassLike())
            implementationBaseType = type
    })

    if (!implementationBaseType)
        return null

    let constructors = getConstructors(implementationBaseType)
    if (constructors && constructors.length)
        return constructors

    return getSuperConstructors(implementationBaseType)
}