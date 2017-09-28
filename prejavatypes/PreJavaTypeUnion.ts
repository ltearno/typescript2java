import * as ts from "typescript"
import { PreJavaType, ProcessContext, TypeReplacer } from './PreJavaType'
import { PreJavaTypeClassOrInterface } from './PreJavaTypeClassOrInterface'
import { PreJavaTypeReference, PreJavaTypeTPEnvironnement } from './PreJavaTypeReference'
import { PreJavaTypeParameter } from './PreJavaTypeParameter'
import * as Visit from './PreJavaTypeVisit'
import * as tsTools from '../ts-tools'

let currentUnionId = 1

export class PreJavaTypeUnion extends PreJavaType {
    name: string
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
                .map(t => {
                    let pjt = context.getTypeMap().getOrCreatePreJavaTypeForTsType(t, false, this.typeParameters)
                    if (pjt.getSimpleName(null) == null) {
                        console.log(`here`)
                        context.getTypeMap().getOrCreatePreJavaTypeForTsType(t, false, this.typeParameters)
                    }
                    return t
                })
                .map(t => context.getTypeMap().getOrCreatePreJavaTypeForTsType(t, false, this.typeParameters))
                .map(t => {
                    if (t instanceof PreJavaTypeClassOrInterface
                        && t.typeParameters && t.typeParameters.length) {
                        return new PreJavaTypeReference(t, t.typeParameters.slice())
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
            else
                this.packageName = this.findPackage(context)
        }

        if ((!this.types) || this.types.length == 0)
            this.name = 'EmptyUnion'
        else
            this.name = this.getHumanizedName(null)
    }

    private findPackage(context: ProcessContext) {
        let usableTypes = new Set<string>()
        this.types
            .filter(type => {
                return Visit.visitPreJavaType(type, {
                    caseTypeParameter: type => false,
                    caseBuiltinType: type => false,
                    caseFakeType: type => false,
                    onOther: type => true
                })
            })
            .forEach(type => type.getPackageName() && usableTypes.add(type.getPackageName()))

        if (!usableTypes.size)
            return context.getJavaPackage(null)

        let minPackage: string = null
        usableTypes.forEach(packageName => {
            if (minPackage == null) {
                minPackage = packageName
            }
            else {
                let lastCaracterToKeep = 0
                while (
                    lastCaracterToKeep < minPackage.length
                    && lastCaracterToKeep < packageName.length
                    && minPackage.charCodeAt(lastCaracterToKeep) == packageName.charCodeAt(lastCaracterToKeep))
                    lastCaracterToKeep++
                minPackage = minPackage.substring(0, lastCaracterToKeep)
                let dotIndex = minPackage.lastIndexOf('.')
                if (dotIndex >= 0)
                    minPackage = minPackage.substring(0, dotIndex)
            }
        })

        return minPackage
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

    getSimpleName(): string { return this.name }

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
