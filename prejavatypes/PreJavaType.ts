import * as ts from "typescript"
import { TypescriptToJavaTypemap } from '../type-map'
import { visitPreJavaType } from './PreJavaTypeVisit'
import { PreJavaTypeParameter } from './PreJavaTypeParameter'

export interface ProcessContext {
    createAnonymousTypeName(): string
    getJavaPackage(symbol: ts.Symbol): string
    getJsPackage(symbol: ts.Symbol): string
    getProgram: () => ts.Program
    getTypeMap: () => TypescriptToJavaTypemap
}

export type TypeReplacer = { (type: PreJavaType): PreJavaType }

export type TypeEnvironment = { [key: string]: PreJavaType }

export abstract class PreJavaType {
    abstract getSourceTypes(): Set<ts.Type>

    abstract getHierachyDepth(): number

    abstract getSimpleName(typeParametersEnv: TypeEnvironment): string

    abstract getPackageName(): string

    abstract setPackageName(name: string)

    abstract getTypeParameters(typeParametersEnv: { [key: string]: PreJavaType }): PreJavaType[]

    abstract processSourceType(type: ts.Type, typeParametersToApplyToAnonymousTypes: PreJavaTypeParameter[], context: ProcessContext)

    getParametrization(typeParametersEnv: { [key: string]: PreJavaType }): string {
        let typeParameters = this.getTypeParameters(typeParametersEnv)
        if (typeParameters && typeParameters.length)
            return `<${typeParameters.map(tp => tp.getSimpleName(typeParametersEnv)).join(', ')}>`
        else
            return ''
    }

    getParametrizedSimpleName(typeParametersEnv: { [key: string]: PreJavaType }): string {
        let simpleName = this.getSimpleName(typeParametersEnv)
        if (!simpleName)
            return null
        let parametrization = this.getParametrization(typeParametersEnv)
        return simpleName + (parametrization ? parametrization : '')
    }

    getFullyQualifiedName(typeParametersEnv: { [key: string]: PreJavaType }): string {
        return `${this.getPackageName()}.${this.getSimpleName(typeParametersEnv)}`
    }

    getParametrizedFullyQualifiedName(typeParametersEnv: { [key: string]: PreJavaType }): string {
        return `${this.getPackageName()}.${this.getParametrizedSimpleName(typeParametersEnv)}`
    }

    getHumanizedName(typeParametersEnv: { [key: string]: PreJavaType }): string {
        let res = visitPreJavaType(this, {
            caseReferenceType: type => {
                let res = type.type.getHumanizedName(typeParametersEnv)
                if (type.typeParameters && type.typeParameters.length)
                    res += `Of${type.typeParameters.map(t => t.getHumanizedName(typeParametersEnv)).join('And')}`
                return res
            },

            caseUnion: type => {
                let res = ''
                res += `${type.aliasName ? `${type.aliasName}_` : ''}`
                res += 'Union'
                //res += `${(type.typeParameters && type.typeParameters.length) ? `With${type.typeParameters.map(tp => tp.getSimpleName(null)).join('And')}` : ''}`
                res += `Of${type.types.map(t => t.getHumanizedName(typeParametersEnv)).join('And')}`
                return res
            },

            onOther: type => this.getSimpleName(typeParametersEnv)
        })

        if (!res)
            console.log(`empp`)

        res = res.replace(new RegExp('\\?', 'g'), 'UNKOWNTYPE')

        return res
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