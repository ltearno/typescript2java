import * as ts from "typescript"
import { PreJavaType, ProcessContext, TypeReplacer } from './PreJavaType'
import { PreJavaTypeClassOrInterface } from './PreJavaTypeClassOrInterface'
import { PreJavaTypeReference } from './PreJavaTypeReference'
import { PreJavaTypeParameter } from './PreJavaTypeParameter'
import * as Visit from './PreJavaTypeVisit'

let currentUnionId = 1

export class PreJavaTypeUnion extends PreJavaType {
    packageName: string
    types: PreJavaType[]
    typeParameters: PreJavaTypeParameter[]
    baseType: PreJavaType

    unionId = currentUnionId++

    processSourceType(type: ts.Type, typeParametersToApplyToAnonymousTypes: PreJavaTypeParameter[], context: ProcessContext) {
        this.typeParameters = typeParametersToApplyToAnonymousTypes

        let unionType = type as ts.UnionType
        this.setTypes(unionType.types.map(t => context.getTypeMap().getOrCreatePreJavaTypeForTsType(t, false, typeParametersToApplyToAnonymousTypes)))
    }

    setTypes(types: PreJavaType[]) {
        this.types = []
        types.forEach(type => {
            if (this.types.indexOf(type) < 0)
                this.types.push(type)
        })
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

        return this.getHumanizedName(null).replace(new RegExp('\\?', 'g'), 'UNKOWNTYPE') + '_id_' + this.unionId
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
        }

        return this
    }

    getHierachyDepth() {
        return 1
    }

    private getBaseTypeOf(type: PreJavaType): Set<PreJavaType> {
        return Visit.preJavaTypeVisit(type, {
            onVisitOther: type => null,
            onVisitClassOrInterfaceType: type => type.baseTypes,
            onVisitReferenceType: type => this.getBaseTypeOf(type.type),
            onVisitTypeParameter: type => type.constraint,
            onVisitUnion: type => type.findBaseTypes()
        })
    }

    findBaseTypes() {
    }
}
