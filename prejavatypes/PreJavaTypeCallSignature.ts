import * as ts from "typescript"
import { PreJavaType, ProcessContext, TypeReplacer } from './PreJavaType'
import { PreJavaTypeParameter } from './PreJavaTypeParameter'

export interface PreJavaTypeFormalParameter {
    name: string
    type: PreJavaType
    optional: boolean
    dotdotdot: boolean
}

export class PreJavaTypeCallSignature {
    comments: string[]

    constructor(
        public typeParameters: PreJavaTypeParameter[],
        public returnType: PreJavaType,
        public name: string,
        public parameters: PreJavaTypeFormalParameter[]) {
    }

    addComments(comments: string[] | string) {
        if (!this.comments)
            this.comments = []
        if (Array.isArray(comments))
            comments && comments.forEach(c => this.comments.push(c))
        else if (typeof comments === 'string')
            this.comments.push(comments)
    }

    serializeSignature(defaultName: string = null) {
        let res = ''

        if (this.comments && this.comments.length)
            res += this.comments.map(c => `/* ${c} */`).join('\n') + '\n'

        if (this.typeParameters) {
            res += '<'
            res += this.typeParameters.map(tp => {
                return tp.name + (tp.constraint ? ` extends ${tp.constraint.getParametrizedSimpleName(null)}` : '')
            }).join()
            res += '> '
        }

        if (this.name)
            res += `${this.returnType.getParametrizedSimpleName(null)} ${this.name}`
        else if (defaultName)
            res += `${defaultName}`

        if (this.parameters && this.parameters.length)
            res += `(${this.parameters.map(p => p.type.getParametrizedSimpleName(null) + ' ' + p.name).join()})`
        else
            res += '()'
        return res
    }

    substituteType(replacer: TypeReplacer, cache: Map<PreJavaType, PreJavaType>, passThroughTypes: Set<PreJavaType>): PreJavaTypeCallSignature {
        let noCache = cache as Map<any, any>
        if (noCache.has(this))
            return noCache.get(this)

        let res = (() => {
            if (this.returnType) {
                this.returnType = this.returnType.substituteType(replacer, cache, passThroughTypes)
                if (!this.returnType)
                    return null // TODO return void instead
            }

            if (this.typeParameters)
                this.typeParameters = this.typeParameters.map(tp => tp.substituteType(replacer, cache, passThroughTypes)).filter(tp => tp != null) as PreJavaTypeParameter[]

            if (this.parameters) {
                this.parameters = this.parameters.map(p => {
                    p.type = p.type.substituteType(replacer, cache, passThroughTypes)
                    if (!p.type)
                        return null
                    return p
                })

                if (this.parameters.some(p => p == null))
                    return null
            }

            return this
        })()

        noCache.set(this, res)

        return res
    }
}
