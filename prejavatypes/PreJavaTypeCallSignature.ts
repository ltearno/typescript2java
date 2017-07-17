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
    typeParameters: PreJavaTypeParameter[]
    returnType: PreJavaType
    name: string
    parameters: PreJavaTypeFormalParameter[]
    comments: string[]

    constructor(typeParameters: PreJavaTypeParameter[], returnType: PreJavaType, name: string, parameters: PreJavaTypeFormalParameter[]) {
        this.typeParameters = typeParameters
        this.returnType = returnType
        this.name = name,
            this.parameters = parameters
    }

    addComments(comments: string[]) {
        if (!this.comments)
            this.comments = []
        comments && comments.forEach(c => this.comments.push(c))
    }

    serializeSignature(defaultName: string = null) {
        let res = ''

        if (this.comments && this.comments.length)
            res += this.comments.map(c => `/* ${c} */`).join('\n') + '\n'

        if (this.typeParameters) {
            res += '<'
            res += this.typeParameters.map(tp => {
                return tp.name + (tp.constraint ? ` extends ${tp.constraint.getParametrizedSimpleName()}` : '')
            }).join()
            res += '> '
        }

        if (this.name)
            res += `${this.returnType.getParametrizedSimpleName()} ${this.name}`
        else if (defaultName)
            res += `${defaultName}`

        if (this.parameters && this.parameters.length)
            res += `(${this.parameters.map(p => p.type.getParametrizedSimpleName() + ' ' + p.name).join()})`
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
                    return null
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
