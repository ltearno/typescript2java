import * as ts from "typescript"
import { PreJavaType, ProcessContext, TypeReplacer } from './PreJavaType'
import { PreJavaTypeClassOrInterface } from './PreJavaTypeClassOrInterface'
import { PreJavaTypeReference, PreJavaTypeTPEnvironnement } from './PreJavaTypeReference'
import { PreJavaTypeParameter } from './PreJavaTypeParameter'
import * as Visit from './PreJavaTypeVisit'
import * as tsTools from '../ts-tools'

let currentUnionId = 1

export class PreJavaTypeUnion extends PreJavaType {
    packageName: string
    types: PreJavaType[]
    typeParameters: PreJavaTypeParameter[]
    baseTypes: Set<PreJavaType> = undefined
    aliasName: string = null
    sourceTypes: ts.Type[] = []

    unionId = currentUnionId++

    processSourceType(type: ts.Type, typeParametersToApplyToAnonymousTypes: PreJavaTypeParameter[], context: ProcessContext) {
        if (type.aliasSymbol)
            this.aliasName = type.aliasSymbol.name

        this.sourceTypes.push(type)

        let unionType = type as ts.UnionType

        if (this.aliasName == 'PartialObserver')
            tsTools.fetchUsedFreeTypeParameters(type, context.getProgram().getTypeChecker())

        let usedTypeParameters = tsTools.fetchUsedFreeTypeParameters(type, context.getProgram().getTypeChecker())
        this.typeParameters = usedTypeParameters
            .map(typeParameterName => {
                let typeParameter = new PreJavaTypeParameter(typeParameterName)
                let existing = typeParametersToApplyToAnonymousTypes && typeParametersToApplyToAnonymousTypes.find(tp => tp.name == typeParameterName)
                if (existing && existing.constraint)
                    typeParameter.constraint = existing.constraint
                return typeParameter
            })

        this.setTypes(
            unionType.types
                .map(t => context.getTypeMap().getOrCreatePreJavaTypeForTsType(t, false, this.typeParameters))
                .map(t => {
                    if (t instanceof PreJavaTypeClassOrInterface
                        && t.typeParameters && t.typeParameters.length) {
                        //&& t.typeParameters.map(tp => tp.name).join() != this.typeParameters.map(tp => tp.name).join()) {
                        let res = new PreJavaTypeReference()
                        res.type = t
                        res.typeParameters = t.typeParameters.slice()
                        return res
                    }
                    return t
                })
                .sort((a, b) => {
                    let sa = a.getSimpleName(null)
                    let sb = b.getSimpleName(null)
                    if (sa == sb)
                        return 0
                    if (sa > sb)
                        return 1
                    return -1
                }))

        if (type) {
            if (type.aliasSymbol && type.aliasSymbol.valueDeclaration)
                this.packageName = context.getJavaPackage(type.aliasSymbol.valueDeclaration.getSourceFile())
            else if (type.symbol && type.symbol.valueDeclaration)
                this.packageName = context.getJavaPackage(type.symbol.valueDeclaration.getSourceFile())
        }

        if (this.getSimpleName() == 'UnionWithROfFunction1OfObjectAndROfRAndArrayLikeOfObjectAndPromiseLikeOfObjectAndSubscribableOfObject') {
            let tc = context.getProgram().getTypeChecker()
            tsTools.fetchUsedFreeTypeParameters(type, tc)
            unionType.types
                .map(t => context.getTypeMap().getOrCreatePreJavaTypeForTsType(t, false, this.typeParameters))
        }
    }

    private fetchTypeParameters(type: ts.Type, typeParametersToApplyToAnonymousTypes: PreJavaTypeParameter[], typeParameters: string[]) {
        if (type.flags == ts.TypeFlags.TypeParameter) {
            if (typeParameters.indexOf(type.symbol.name) < 0)
                typeParameters.push(type.symbol.name)
        }
        else if (type.flags == ts.TypeFlags.Object) {
            let objectType = type as ts.ObjectType
            if (objectType.objectFlags & ts.ObjectFlags.Reference) {
                let typeReference = type as ts.TypeReference
                if (typeReference.target != typeReference) {
                    this.fetchTypeParameters(typeReference.target, typeParametersToApplyToAnonymousTypes, typeParameters)
                    if (typeReference.typeArguments)
                        typeReference.typeArguments.forEach(typeArgument => this.fetchTypeParameters(typeArgument, typeParametersToApplyToAnonymousTypes, typeParameters))
                }
            }
            else if (objectType.objectFlags & ts.ObjectFlags.Anonymous) {
                if (typeParametersToApplyToAnonymousTypes)
                    typeParametersToApplyToAnonymousTypes.forEach(t => {
                        if (typeParameters.indexOf(t.name) < 0)
                            typeParameters.push(t.name)
                    })
            }
        }
    }

    setTypes(types: PreJavaType[]) {
        this.types = []
        types.forEach(type => {
            if (this.types.indexOf(type) < 0)
                this.types.push(type)
        })

        this.baseTypes = undefined
    }

    getSourceTypes(): Set<ts.Type> { return null }

    dump() {
        console.log(`UnionType ${this.getParametrizedSimpleName(null)}`)
        if (this.types && this.types.length)
            this.types.forEach(t => console.log(`- ${t.getParametrizedSimpleName(null)}`))
    }

    getTypeParameters(typeParametersEnv: { [key: string]: PreJavaType }) {
        // TODO SHOULD REFACTO WITH SAME CODE IN TYPE_REFERENCE
        if (!typeParametersEnv || !this.typeParameters)
            return this.typeParameters

        return this.typeParameters.map(tp => {
            return Visit.visitPreJavaType(tp, {
                caseTypeParameter: type => type.name in typeParametersEnv ? typeParametersEnv[type.name] : type,
                onOther: type => new PreJavaTypeTPEnvironnement(type, typeParametersEnv)
            })
        })
    }

    getSimpleName(): string {
        if ((!this.types) || this.types.length == 0)
            return 'EmptyUnion'// + '_id_' + this.unionId

        return this.getHumanizedName(null)// + '_id_' + this.unionId
    }

    getPackageName(): string { return this.packageName }

    setPackageName(name: string) {
        if (!this.packageName)
            this.packageName = name
    }

    isClassLike() {
        if (!this.getBaseTypes())
            return false
        for (let baseType of this.getBaseTypes())
            if (baseType.isClassLike())
                return true
        return false
    }

    isCompletablePreJavaType() { return null }

    substituteTypeReal(replacer: TypeReplacer, cache: Map<PreJavaType, PreJavaType>, passThroughTypes: Set<PreJavaType>): PreJavaType {
        let stay = replacer(this)
        if (!stay || stay != this)
            return stay

        if (this.types) {
            let oldTypes = this.types
            this.types = []
            oldTypes.forEach(t => {
                let nt = t.substituteType(replacer, cache, passThroughTypes)
                if (nt && this.types.indexOf(nt) < 0)
                    this.types.push(nt)
            })

            this.baseTypes = undefined
        }

        return this
    }

    getHierachyDepth() {
        return 1
    }

    private addBaseTypesOf(type: PreJavaType, set: Set<PreJavaType>) {
        Visit.visitPreJavaType(type, {
            caseReferenceType: type => this.addBaseTypesOf(type.type, set),

            caseClassOrInterfaceType: type => type.baseTypes && type.baseTypes.forEach(baseType => {
                if (!set.has(baseType)) {
                    set.add(baseType)
                    this.addBaseTypesOf(baseType, set)
                }
            }),

            caseTypeParameter: type => {
                if (type.constraint && !set.has(type.constraint)) {
                    set.add(type.constraint)
                    this.addBaseTypesOf(type.constraint, set)
                }
            },

            caseUnion: type => type.getBaseTypes() && type.getBaseTypes().forEach(baseType => {
                if (!set.has(baseType)) {
                    set.add(baseType)
                    this.addBaseTypesOf(baseType, set)
                }
            })
        })
    }

    private getBaseTypesOf(type: PreJavaType): Set<PreJavaType> {
        let res = new Set()
        this.addBaseTypesOf(type, res)
        return res
    }

    getBaseTypes(): Set<PreJavaType> {
        if (this.baseTypes === undefined) {
            this.baseTypes = null

            for (let type of this.types) {
                if (!this.baseTypes) {
                    this.baseTypes = this.getBaseTypesOf(type)
                }
                else {
                    let unionedBaseTypes = this.getBaseTypesOf(type)
                    let typesToRemove: PreJavaType[] = []
                    this.baseTypes.forEach(baseType => { if (!unionedBaseTypes.has(baseType)) typesToRemove.push(baseType) })
                    typesToRemove.forEach(t => this.baseTypes.delete(t))
                }
            }

            if (this.baseTypes && this.baseTypes.size) {
                // keep only leaf types
                let toRemove = new Set<PreJavaType>()
                this.baseTypes.forEach(type => this.getBaseTypesOf(type).forEach(t => toRemove.add(t)))
                toRemove.forEach(type => this.baseTypes.delete(type))
            }
        }

        return this.baseTypes
    }
}
