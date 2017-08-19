import * as ts from "typescript"
import { PreJavaType, ProcessContext, TypeReplacer } from './PreJavaType'

export const TUPLE_TYPE_VARIABLE_NAMES = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K']

export class PreJavaTypeTuple extends PreJavaType {
    packageName: string
    nbTypeParameters: number

    constructor(type: ts.TypeReference) {
        super()
        this.nbTypeParameters = type.typeArguments && type.typeArguments.length
    }

    dump() {
        console.log(`tuple ${this.getParametrizedSimpleName(null)}`)
    }

    getParametrization(): string {
        if (!this.nbTypeParameters)
            return ''
        return `<${TUPLE_TYPE_VARIABLE_NAMES.slice(0, this.nbTypeParameters).join(', ')}>`
    }

    getSimpleName(): string {
        if (this.nbTypeParameters == 2)
            return `Tuple`
        else
            return `TupleOf${this.nbTypeParameters}`
    }

    getPackageName(): string { return this.packageName }

    setPackageName(name: string) {
        if (!this.packageName)
            this.packageName = name
    }

    isClassLike() { return true }

    getHierachyDepth() {
        return 1
    }

    isCompletablePreJavaType() { return null }

    substituteTypeReal(replacer: TypeReplacer, cache: Map<PreJavaType, PreJavaType>): PreJavaType { return replacer(this) }
}
