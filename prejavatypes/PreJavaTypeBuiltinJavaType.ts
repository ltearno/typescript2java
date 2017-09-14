import * as ts from "typescript"
import { PreJavaType, ProcessContext, TypeReplacer } from './PreJavaType'
import { PreJavaTypeParameter } from './PreJavaTypeParameter'

export class PreJavaTypeBuiltinJavaType extends PreJavaType {
    packageName: string
    name: string

    constructor(packageName: string, name: string) {
        super()
        this.packageName = packageName
        this.name = name
    }

    processSourceType(type: ts.Type, typeParametersToApplyToAnonymousTypes: PreJavaTypeParameter[], context: ProcessContext) {
    }

    getSourceTypes(): Set<ts.Type> { return null }

    dump() { console.log(`Builtin type ${this.name}`) }

    getTypeParameters(typeParametersEnv: { [key: string]: PreJavaType }) { return null }

    setSimpleName(name: string) { }

    getSimpleName(): string { return this.name }

    getPackageName(): string { return this.packageName }

    setPackageName(name: string) { }

    isClassLike() { return true }

    isCompletablePreJavaType() { return null }

    substituteTypeReal(replacer: TypeReplacer, cache: Map<PreJavaType, PreJavaType>): PreJavaType { return replacer(this) }

    getHierachyDepth() {
        return 1
    }
}
