import * as ts from "typescript"
import { PreJavaType, CompletablePreJavaType, ProcessContext, TypeReplacer } from './PreJavaType'

export class PreJavaTypeBuiltinJavaType extends PreJavaType {
    packageName: string
    name: string

    constructor(packageName: string, name: string) {
        super()
        this.packageName = packageName
        this.name = name
    }

    dump() { console.log(`Builtin type ${this.name}`) }

    getParametrization(): string { return '' }

    setSimpleName(name: string) { }

    getSimpleName(): string { return this.name }

    getPackageName(): string { return this.packageName }

    setPackageName(name: string) { }

    isClassLike() { return true }

    isCompletablePreJavaType() { return null }

    substituteTypeReal(replacer: TypeReplacer, cache: Map<PreJavaType, PreJavaType>): PreJavaType { return replacer(this) }
}
