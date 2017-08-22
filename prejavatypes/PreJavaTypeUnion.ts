import * as ts from "typescript"
import { PreJavaType, ProcessContext, TypeReplacer } from './PreJavaType'
import { PreJavaTypeClassOrInterface } from './PreJavaTypeClassOrInterface'
import { PreJavaTypeReference } from './PreJavaTypeReference'
import { PreJavaTypeParameter } from './PreJavaTypeParameter'

export class PreJavaTypeUnion extends PreJavaType {
    packageName: string
    types: PreJavaType[]
    typeParameters: PreJavaTypeParameter[]

    setTypes(types: PreJavaType[]) {
        this.types = []
        types.forEach(type => {
            if (this.types.indexOf(type) < 0)
                this.types.push(type)
        })
    }

    dump() {
        console.log(`UnionType ${this.getParametrizedSimpleName(null)}`)
        if (this.types && this.types.length)
            this.types.forEach(t => console.log(`- ${t.getParametrizedSimpleName(null)}`))
    }

    getTypeParameters(typeParametersEnv: { [key: string]: PreJavaType }) { return this.typeParameters }

    setSimpleName(name: string) { }

    getSimpleName(): string {
        if ((!this.types) || this.types.length == 0)
            return 'EmptyUnion'

        return this.getHumanizedName(null).replace(new RegExp('\\?', 'g'), 'UNKOWNTYPE')
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

        if (this.types)
            this.types = this.types.map(t => t.substituteType(replacer, cache, passThroughTypes)).filter(t => t != null)

        return this
    }

    getHierachyDepth() {
        return 1
    }
}
