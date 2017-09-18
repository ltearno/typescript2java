import * as ts from "typescript"
import { PreJavaType, ProcessContext, TypeReplacer } from './PreJavaType'

export class PreJavaTypeParameter extends PreJavaType {
    name: string
    constraint: PreJavaType

    constructor(name: string = null, constraint: PreJavaType = null) {
        super()
        this.name = name
        this.constraint = constraint
    }

    processSourceType(type: ts.Type, typeParametersToApplyToAnonymousTypes: PreJavaTypeParameter[], context: ProcessContext) {
        let symbol = type.getSymbol()
        this.name = symbol ? symbol.getName() : '?'
        this.constraint = context.getTypeMap().getOrCreatePreJavaTypeForTsType((type as ts.TypeParameter).constraint, false, typeParametersToApplyToAnonymousTypes)
    }

    getSourceTypes(): Set<ts.Type> { return null }

    dump() { console.log(`TypeParameter ${this.name}`) }

    getTypeParameters(typeParametersEnv: { [key: string]: PreJavaType }) { return null }

    setSimpleName(name: string) {
        if (this.name != null)
            this.name = name
    }

    getHierachyDepth() {
        return 1
    }

    getSimpleName(typeParametersEnv: { [key: string]: PreJavaType }): string {
        if (typeParametersEnv && typeParametersEnv[this.name])
            return typeParametersEnv[this.name].getSimpleName(null)
        return this.name
    }

    getPackageName(): string { return null }

    setPackageName(name: string) { }

    isClassLike() { return false }

    substituteTypeReal(replacer: TypeReplacer, cache: Map<PreJavaType, PreJavaType>, passThroughTypes: Set<PreJavaType>): PreJavaType {
        let stay = replacer(this)
        if (!stay || stay != this)
            return null

        if (this.constraint)
            this.constraint = this.constraint.substituteType(replacer, cache, passThroughTypes)

        return this
    }
}
