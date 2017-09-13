import { PreJavaType } from './PreJavaType'
import { PreJavaTypeBuiltinJavaType } from './PreJavaTypeBuiltinJavaType'
import { PreJavaTypeClassOrInterface } from './PreJavaTypeClassOrInterface'
import { PreJavaTypeEnum } from './PreJavaTypeEnum'
import { PreJavaTypeFakeType } from './PreJavaTypeFakeType'
import { PreJavaTypeReference } from './PreJavaTypeReference'
import { PreJavaTypeTuple } from './PreJavaTypeTuple'
import { PreJavaTypeUnion } from './PreJavaTypeUnion'

export interface PreJavaTypeVisitor<T> {
    onVisitBuiltinType?(type: PreJavaTypeBuiltinJavaType): T
    onVisitClassOrInterfaceType?(type: PreJavaTypeClassOrInterface): T
    onVisitEnumType?(type: PreJavaTypeEnum): T
    onVisitFakeType?(type: PreJavaTypeFakeType): T
    onVisitReferenceType?(type: PreJavaTypeReference): T
    onVisitTuple?(type: PreJavaTypeTuple): T
    onVisitUnion?(type: PreJavaTypeUnion): T
    onVisitOther?(type: PreJavaType): T
}

export function preJavaTypeVisit<T>(type: PreJavaType, visitor: PreJavaTypeVisitor<T>) {
    if (type instanceof PreJavaTypeBuiltinJavaType)
        return visitor.onVisitBuiltinType && visitor.onVisitBuiltinType(type)
    else if (visitor.onVisitFakeType && type instanceof PreJavaTypeFakeType)
        return visitor.onVisitFakeType(type)
    else if (visitor.onVisitClassOrInterfaceType && type instanceof PreJavaTypeClassOrInterface)
        return visitor.onVisitClassOrInterfaceType(type)
    else if (visitor.onVisitEnumType && type instanceof PreJavaTypeEnum)
        return visitor.onVisitEnumType(type)
    else if (visitor.onVisitReferenceType && type instanceof PreJavaTypeReference)
        return visitor.onVisitReferenceType(type)
    else if (visitor.onVisitTuple && type instanceof PreJavaTypeTuple)
        return visitor.onVisitTuple(type)
    else if (visitor.onVisitUnion && type instanceof PreJavaTypeUnion)
        return visitor.onVisitUnion(type)
    else if (visitor.onVisitOther)
        return visitor.onVisitOther(type)
    return null
}