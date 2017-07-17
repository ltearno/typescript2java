import { PreJavaType } from './PreJavaType'
import { PreJavaTypeBuiltinJavaType } from './PreJavaTypeBuiltinJavaType'
import { PreJavaTypeClassOrInterface } from './PreJavaTypeClassOrInterface'
import { PreJavaTypeEnum } from './PreJavaTypeEnum'
import { PreJavaTypeFakeType } from './PreJavaTypeFakeType'
import { PreJavaTypeReference } from './PreJavaTypeReference'
import { PreJavaTypeTuple } from './PreJavaTypeTuple'
import { PreJavaTypeUnion } from './PreJavaTypeUnion'

export interface PreJavaTypeVisitor {
    onVisitBuiltinType?(type: PreJavaTypeBuiltinJavaType): any
    onVisitClassOrInterfaceType?(type: PreJavaTypeClassOrInterface): any
    onVisitEnumType?(type: PreJavaTypeEnum): any
    onVisitFakeType?(type: PreJavaTypeFakeType): any
    onVisitReferenceType?(type: PreJavaTypeReference): any
    onVisitTuple?(type: PreJavaTypeTuple): any
    onVisitUnion?(type: PreJavaTypeUnion): any
}

export function preJavaTypeVisit(type: PreJavaType, visitor: PreJavaTypeVisitor) {
    if (type instanceof PreJavaTypeBuiltinJavaType)
        return visitor.onVisitBuiltinType && visitor.onVisitBuiltinType(type)
    else if (type instanceof PreJavaTypeFakeType)
        return visitor.onVisitFakeType && visitor.onVisitFakeType(type)
    else if (type instanceof PreJavaTypeClassOrInterface)
        return visitor.onVisitClassOrInterfaceType && visitor.onVisitClassOrInterfaceType(type)
    else if (type instanceof PreJavaTypeEnum)
        return visitor.onVisitEnumType && visitor.onVisitEnumType(type)
    else if (type instanceof PreJavaTypeReference)
        return visitor.onVisitReferenceType && visitor.onVisitReferenceType(type)
    else if (type instanceof PreJavaTypeTuple)
        return visitor.onVisitTuple && visitor.onVisitTuple(type)
    else if (type instanceof PreJavaTypeUnion)
        return visitor.onVisitUnion && visitor.onVisitUnion(type)
    return null
}