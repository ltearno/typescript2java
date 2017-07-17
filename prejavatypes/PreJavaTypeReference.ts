import * as ts from "typescript"
import { PreJavaType, ProcessContext, TypeReplacer } from './PreJavaType'

export class PreJavaTypeReference extends PreJavaType {
    type: PreJavaType
    typeParameters: PreJavaType[]

    dump() { console.log(`TypeReference to ${this.type.getParametrizedSimpleName()}`) }

    getParametrization(): string {
        if (this.typeParameters && this.typeParameters.length)
            return `<${this.typeParameters.map(tp => tp.getParametrizedSimpleName()).join(', ')}>`
        return ''
    }

    setSimpleName(name: string) { }

    getSimpleName(): string { return this.type.getSimpleName() }

    getPackageName(): string { return this.type.getPackageName() }

    setPackageName(name: string) { }

    isClassLike() { return this.type.isClassLike() }

    isCompletablePreJavaType() { return null }

    getHierachyDepth() {
        return this.type.getHierachyDepth()
    }

    substituteTypeReal(replacer: TypeReplacer, cache: Map<PreJavaType, PreJavaType>, passThroughTypes: Set<PreJavaType>): PreJavaType {
        let stay = replacer(this)
        if (!stay || stay != this)
            return null

        this.type = replacer(this.type)
        if (!this.type)
            return null

        if (this.typeParameters)
            this.typeParameters = this.typeParameters.map(p => p.substituteType(replacer, cache, passThroughTypes)).filter(p => p != null)

        return this
    }
}
