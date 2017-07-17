import * as ts from "typescript"
import { PreJavaType, CompletablePreJavaType, ProcessContext, TypeReplacer } from './PreJavaType'

export class PreJavaTypeEnum extends PreJavaType {
    packageName: string
    name: string
    members: {
        name: string
        value: number
    }[] = []

    constructor(name: string) {
        super()
        this.name = name
    }

    dump() {
        console.log(`enum ${this.getParametrizedSimpleName()}`)
        if (this.members && this.members.length)
            this.members.forEach(m => console.log(`enum member ${m.name} = ${m.value}`))
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
