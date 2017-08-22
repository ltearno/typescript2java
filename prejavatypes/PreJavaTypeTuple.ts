import * as ts from "typescript"
import { PreJavaType, ProcessContext, TypeReplacer } from './PreJavaType'
import { PreJavaTypeParameter } from './PreJavaTypeParameter'

export const TUPLE_TYPE_VARIABLE_NAMES = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K']

export class PreJavaTypeTuple extends PreJavaType {
    packageName: string
    typeParameters: PreJavaTypeParameter[]

    constructor(type: ts.TypeReference) {
        super()
        let nbTypeParameters = type.typeArguments && type.typeArguments.length
        if (nbTypeParameters)
            this.typeParameters = TUPLE_TYPE_VARIABLE_NAMES.slice(0, nbTypeParameters).map(name => new PreJavaTypeParameter(name))
        else
            this.typeParameters = null
    }

    dump() {
        console.log(`tuple ${this.getParametrizedSimpleName(null)}`)
    }

    getTypeParameters(typeParametersEnv: { [key: string]: PreJavaType }) {
        return this.typeParameters
    }

    getSimpleName(): string {
        if (this.typeParameters && this.typeParameters.length == 2)
            return `Tuple`
        else
            return `TupleOf${this.typeParameters.length}`
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
