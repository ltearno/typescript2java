import * as ts from "typescript"
import { TsToPreJavaTypemap } from '../type-map'
import { preJavaTypeVisit } from './PreJavaTypeVisit'

export interface ProcessContext {
    createAnonymousTypeName(): string
    getJavaPackage(sourceFile: ts.SourceFile): string
    getProgram: () => ts.Program
    getTypeMap: () => TsToPreJavaTypemap
}

export type TypeReplacer = { (type: PreJavaType): PreJavaType }

export abstract class PreJavaType {
    abstract getHierachyDepth(): number

    abstract getSimpleName(): string

    abstract getPackageName(): string
    abstract setPackageName(name: string)

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

    getHumanizedName(): string {
        let result = preJavaTypeVisit(this, {
            onVisitReferenceType: type => {
                let res = type.type.getHumanizedName()
                if (type.typeParameters && type.typeParameters.length)
                    res += `Of${type.typeParameters.map(t => t.getHumanizedName()).join('And')}`
                return res
            },
            onVisitUnion: type => `UnionOf${type.types.map(t => t.getHumanizedName()).join('And')}`
        })

        return result || this.getSimpleName()
    }

    // means a class which extends it should print 'extends XXX'
    // if not one would print 'implements XXX'
    abstract isClassLike(): boolean

    abstract dump()

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
}