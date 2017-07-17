import * as ts from "typescript"
import { PreJavaType, ProcessContext, TypeReplacer } from './PreJavaType'

export class PreJavaTypeParameter extends PreJavaType {
    name: string
    constraint: PreJavaType

    constructor(name: string, constraint: PreJavaType = null) {
        super()
        this.name = name
    }

    dump() { console.log(`TypeParameter ${this.name}`) }

    getParametrization(): string { return '' }

    setSimpleName(name: string) {
        if (this.name != null)
            this.name = name
    }

    getSimpleName(): string { return this.name }

    getPackageName(): string { return null }

    setPackageName(name: string) { }

    isClassLike() { return false }

    isCompletablePreJavaType() { return null }

    substituteTypeReal(replacer: TypeReplacer, cache: Map<PreJavaType, PreJavaType>, passThroughTypes: Set<PreJavaType>): PreJavaType {
        let stay = replacer(this)
        if (!stay || stay != this)
            return null

        if (this.constraint)
            this.constraint = this.constraint.substituteType(replacer, cache, passThroughTypes)

        return this
    }
}
