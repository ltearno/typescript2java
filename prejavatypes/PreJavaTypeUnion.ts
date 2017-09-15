import * as ts from "typescript"
import { PreJavaType, ProcessContext, TypeReplacer } from './PreJavaType'
import { PreJavaTypeClassOrInterface } from './PreJavaTypeClassOrInterface'
import { PreJavaTypeReference } from './PreJavaTypeReference'
import { PreJavaTypeParameter } from './PreJavaTypeParameter'
import * as Visit from './PreJavaTypeVisit'
import * as tsTools from '../ts-tools'

let currentUnionId = 1

export class PreJavaTypeUnion extends PreJavaType {
    packageName: string
    types: PreJavaType[]
    typeParameters: PreJavaTypeParameter[]
    baseTypes: Set<PreJavaType>
    aliasName: string = null

    unionId = currentUnionId++

    private getAliasSymbolDeclarationTypeParametersList(type: ts.Type): string[] {
        let res = []

        if (!type.aliasSymbol)
            return res

        if (type.aliasSymbol.declarations && type.aliasSymbol.declarations.length) {
            let declaration = type.aliasSymbol.declarations[0] as ts.TypeAliasDeclaration
            if (declaration.kind == ts.SyntaxKind.TypeAliasDeclaration && declaration.typeParameters && declaration.typeParameters.length) {
                for (let typeParameter of declaration.typeParameters) {
                    if (typeParameter.kind == ts.SyntaxKind.TypeParameter && 'symbol' in typeParameter)
                        res.push(typeParameter['symbol'].name)
                    else
                        res.push('ERROR')
                }
            }

        }
        return res
    }

    private getAliasTypeArgumentsDeclarationTypeParametersList(type: ts.Type, context: ProcessContext): string[] {
        return type.aliasTypeArguments && type.aliasTypeArguments.map(t => {
            let typeArgJavaType = context.getTypeMap().getOrCreatePreJavaTypeForTsType(t, false, null)
            return Visit.visitPreJavaType(typeArgJavaType, {
                caseClassOrInterfaceType: type => type.name,
                onOther: type => type.getSimpleName(null)
            })
        })
    }

    processSourceType(type: ts.Type, typeParametersToApplyToAnonymousTypes: PreJavaTypeParameter[], context: ProcessContext) {
        if (type.aliasSymbol)
            this.aliasName = type.aliasSymbol.name

        let unionType = type as ts.UnionType

        let typeParameters: string[] = []
        unionType.types.forEach(t => this.fetchTypeParameters(t, typeParameters))
        if (typeParameters.length)
            this.typeParameters = typeParameters.map(name => new PreJavaTypeParameter(name))

        this.setTypes(unionType.types.map(t => context.getTypeMap().getOrCreatePreJavaTypeForTsType(t, false, this.typeParameters)))
    }

    private fetchTypeParameters(type: ts.Type, typeParameters: string[]) {
        if (type.flags == ts.TypeFlags.TypeParameter) {
            if (typeParameters.indexOf(type.symbol.name) < 0)
                typeParameters.push(type.symbol.name)
        }
        else if (type.flags == ts.TypeFlags.Object && (type as ts.ObjectType).objectFlags & ts.ObjectFlags.Reference) {
            let typeReference = type as ts.TypeReference
            if (typeReference.target != typeReference) {
                this.fetchTypeParameters(typeReference.target, typeParameters)
                if (typeReference.typeArguments)
                    typeReference.typeArguments.forEach(typeArgument => this.fetchTypeParameters(typeArgument, typeParameters))
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
        if (!typeParametersEnv || !this.typeParameters)
            return this.typeParameters

        return this.typeParameters.map(tp => {
            if (tp instanceof PreJavaTypeParameter && tp.name in typeParametersEnv)
                return typeParametersEnv[tp.name]
            return tp
        })
    }

    getSimpleName(): string {
        if ((!this.types) || this.types.length == 0)
            return 'EmptyUnion' + '_id_' + this.unionId

        return this.getHumanizedName(null).replace(new RegExp('\\?', 'g'), 'UNKOWNTYPE') + (this.aliasName ? `_${this.aliasName}_` : '') + '_id_' + this.unionId
    }

    getPackageName(): string { return this.packageName }

    setPackageName(name: string) {
        if (!this.packageName)
            this.packageName = name
    }

    isClassLike() { return true }

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
            onOther: type => null,

            caseReferenceType: type => this.addBaseTypesOf(type.type, set),

            caseClassOrInterfaceType: type => type.baseTypes && type.baseTypes.forEach(baseType => {
                set.add(baseType)
                this.addBaseTypesOf(baseType, set)
            }),

            caseTypeParameter: type => {
                if (type.constraint) {
                    set.add(type.constraint)
                    this.addBaseTypesOf(type.constraint, set)
                }
            },

            caseUnion: type => type.getBaseTypes() && type.getBaseTypes().forEach(baseType => {
                set.add(baseType)
                this.addBaseTypesOf(baseType, set)
            })
        })
    }

    private getBaseTypesOf(type: PreJavaType): Set<PreJavaType> {
        let res = new Set()
        this.addBaseTypesOf(type, res)
        return res
    }

    getBaseTypes(): Set<PreJavaType> {
        if (this.baseTypes)
            return this.baseTypes

        let baseTypes: Set<PreJavaType> = null
        for (let type of this.types) {
            if (!baseTypes) {
                baseTypes = this.getBaseTypesOf(type)
            }
            else {
                let unionedBaseTypes = this.getBaseTypesOf(type)
                let typesToRemove: PreJavaType[] = []
                baseTypes.forEach(baseType => unionedBaseTypes.has(baseType) || typesToRemove.push(baseType))
                typesToRemove.forEach(t => baseTypes.delete(t))
            }
        }

        if (baseTypes.size == 0)
            return null

        let toRemove = new Set<PreJavaType>()
        baseTypes.forEach(type => this.getBaseTypesOf(type).forEach(t => toRemove.add(t)))
        toRemove.forEach(type => baseTypes.delete(type))

        this.baseTypes = baseTypes

        return baseTypes
    }
}
