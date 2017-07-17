import * as ts from "typescript"
import { TsToPreJavaTypemap } from '../type-map'

export interface ProcessContext {
    createAnonymousTypeName(): string
    getJavaPackage(sourceFile: ts.SourceFile): string
    getProgram: () => ts.Program
    getTypeMap: () => TsToPreJavaTypemap
}

export interface CompletablePreJavaType {
    isProcessed(): boolean

    processSourceTypes(context: ProcessContext)
}

export type TypeReplacer = { (type: PreJavaType): PreJavaType }

export abstract class PreJavaType {
    sourceTypes: Set<ts.Type>

    abstract getSimpleName(): string
    abstract setSimpleName(name: string)

    abstract setPackageName(name: string)
    abstract getPackageName(): string

    abstract getParametrization(): string

    getParametrizedSimpleName(): string {
        let simpleName = this.getSimpleName()
        if (!simpleName)
            return null
        let parametrization = this.getParametrization()
        return simpleName + (parametrization ? parametrization : '')
    }

    getFullyQualifiedName(): string {
        return `${this.getPackageName()}.${this.getSimpleName()}`
    }

    getParametrizedFullyQualifiedName(): string {
        return `${this.getPackageName()}.${this.getParametrizedSimpleName()}`
    }

    abstract isClassLike(): boolean

    abstract dump()

    abstract isCompletablePreJavaType(): CompletablePreJavaType

    /** returns the type by which it should be substituted */
    abstract substituteTypeReal(replacer: TypeReplacer, cache: Map<PreJavaType, PreJavaType>, passThroughTypes: Set<PreJavaType>): PreJavaType
    substituteType(replacer: TypeReplacer, cache: Map<PreJavaType, PreJavaType>, passThroughTypes: Set<PreJavaType>): PreJavaType {
        if (cache.has(this))
            return cache.get(this)

        if (passThroughTypes == null)
            passThroughTypes = new Set()
        else if (passThroughTypes.has(this))
            return this
        passThroughTypes.add(this)

        let res = this.substituteTypeReal(replacer, cache, passThroughTypes)
        cache.set(this, res)
        return res
    }

    addSourceType(type: ts.Type) {
        if (!this.sourceTypes)
            this.sourceTypes = new Set()
        this.sourceTypes.add(type)
    }
}