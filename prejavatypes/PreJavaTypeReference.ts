import * as ts from "typescript"
import { PreJavaType, ProcessContext, TypeReplacer } from './PreJavaType'

export class PreJavaTypeTPEnvironnement extends PreJavaType {
    constructor(public type: PreJavaType,
        public environment: { [key: string]: PreJavaType }) {
        super()
    }

    getSourceTypes(): Set<ts.Type> { return null }

    dump() {
        console.log(`TypeEnvironment for`)
        this.type.dump()
    }

    getTypeParameters(typeParametersEnv: { [key: string]: PreJavaType }) {
        let env = typeParametersEnv || this.environment
        if (typeParametersEnv && this.environment) {
            env = Object.create(typeParametersEnv)
            for (let ppty in this.environment)
                env[ppty] = this.environment[ppty]
        }
        return this.type.getTypeParameters(env)
    }

    getHierachyDepth() {
        return this.type.getHierachyDepth()
    }

    getSimpleName(): string { return this.type.getSimpleName(this.environment) }

    getPackageName(): string { return this.type.getPackageName() }
    setPackageName(name: string) { this.type.setPackageName(name) }

    isClassLike() {
        return this.type.isClassLike()
    }

    substituteTypeReal(replacer: TypeReplacer, cache: Map<PreJavaType, PreJavaType>, passThroughTypes: Set<PreJavaType>): PreJavaType {
        let stay = replacer(this)
        if (!stay || stay != this)
            return null

        this.type = this.type.substituteType(replacer, cache, passThroughTypes)
        if (!this.type)
            return null

        return this
    }
}

export class PreJavaTypeReference extends PreJavaType {
    type: PreJavaType
    typeParameters: PreJavaType[]

    dump() { console.log(`TypeReference to ${this.type.getParametrizedSimpleName(null)}`) }

    getSourceTypes(): Set<ts.Type> { return null }

    getTypeParameters(typeParametersEnv: { [key: string]: PreJavaType }) {
        return this.typeParameters
        //return this.type.getTypeParameters(typeParametersEnv)
    }

    getSimpleName(): string { return this.type.getSimpleName(null) }

    getPackageName(): string { return this.type.getPackageName() }

    setPackageName(name: string) { }

    isClassLike() { return this.type.isClassLike() }

    isCompletablePreJavaType() { return null }

    getHierachyDepth() {
        return this.type.getHierachyDepth()
    }

    substituteTypeReal(replacer: TypeReplacer, cache: Map<PreJavaType, PreJavaType>, passThroughTypes: Set<PreJavaType>): PreJavaType {
        let stay = replacer(this)
        if (!stay || stay != this)
            return null

        this.type = replacer(this.type)
        if (!this.type)
            return null

        if (this.typeParameters)
            this.typeParameters = this.typeParameters.map(p => p.substituteType(replacer, cache, passThroughTypes)).filter(p => p != null)

        return this
    }
}
