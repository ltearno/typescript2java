import * as ts from "typescript"
import { PreJavaType, CompletablePreJavaType, ProcessContext, TypeReplacer } from './PreJavaType'

export class PreJavaTypeTuple extends PreJavaType {
    packageName: string
    name: string

    constructor(name: string) {
        super()
        this.name = name
    }

    dump() {
        console.log(`tuple ${this.getParametrizedSimpleName()}`)
    }

    getParametrization(): string { return '' }

    setSimpleName(name: string) {
        if (!this.name)
            this.name = name
    }

    getSimpleName(): string { return this.name }

    getPackageName(): string { return this.packageName }

    setPackageName(name: string) {
        if (!this.packageName)
            this.packageName = name
    }

    isClassLike() { return true }

    isCompletablePreJavaType() { return null }

    substituteTypeReal(replacer: TypeReplacer, cache: Map<PreJavaType, PreJavaType>): PreJavaType { return replacer(this) }
}
