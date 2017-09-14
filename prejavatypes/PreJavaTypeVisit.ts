import { PreJavaType } from './PreJavaType'
import { PreJavaTypeBuiltinJavaType } from './PreJavaTypeBuiltinJavaType'
import { PreJavaTypeClassOrInterface } from './PreJavaTypeClassOrInterface'
import { PreJavaTypeEnum } from './PreJavaTypeEnum'
import { PreJavaTypeFakeType } from './PreJavaTypeFakeType'
import { PreJavaTypeReference } from './PreJavaTypeReference'
import { PreJavaTypeTuple } from './PreJavaTypeTuple'
import { PreJavaTypeUnion } from './PreJavaTypeUnion'
import { PreJavaTypeParameter } from './PreJavaTypeParameter'

export interface PreJavaTypeVisitor<T> {
    caseBuiltinType?(type: PreJavaTypeBuiltinJavaType): T
    caseClassOrInterfaceType?(type: PreJavaTypeClassOrInterface): T
    caseEnumType?(type: PreJavaTypeEnum): T
    caseFakeType?(type: PreJavaTypeFakeType): T
    caseReferenceType?(type: PreJavaTypeReference): T
    caseTuple?(type: PreJavaTypeTuple): T
    caseUnion?(type: PreJavaTypeUnion): T
    caseTypeParameter?(type: PreJavaTypeParameter): T
    onOther?(type: PreJavaType): T
}

export function visitPreJavaType<T>(type: PreJavaType, visitor: PreJavaTypeVisitor<T>) {
    if (visitor.caseBuiltinType && type instanceof PreJavaTypeBuiltinJavaType)
        return visitor.caseBuiltinType(type)
    else if (visitor.caseFakeType && type instanceof PreJavaTypeFakeType)
        return visitor.caseFakeType(type)
    else if (visitor.caseClassOrInterfaceType && type instanceof PreJavaTypeClassOrInterface)
        return visitor.caseClassOrInterfaceType(type)
    else if (visitor.caseEnumType && type instanceof PreJavaTypeEnum)
        return visitor.caseEnumType(type)
    else if (visitor.caseReferenceType && type instanceof PreJavaTypeReference)
        return visitor.caseReferenceType(type)
    else if (visitor.caseTuple && type instanceof PreJavaTypeTuple)
        return visitor.caseTuple(type)
    else if (visitor.caseUnion && type instanceof PreJavaTypeUnion)
        return visitor.caseUnion(type)
    else if (visitor.caseTypeParameter && type instanceof PreJavaTypeParameter)
        return visitor.caseTypeParameter(type)
    else if (visitor.onOther)
        return visitor.onOther(type)
    return null
}