import * as ts from "typescript"
import { PreJavaType, ProcessContext, TypeReplacer } from './PreJavaType'
import { PreJavaTypeParameter } from './PreJavaTypeParameter'

export class PreJavaTypeEnum extends PreJavaType {
    packageName: string
    name: string
    members: {
        name: string
        value: number
    }[] = []
    sourceTypes: Set<ts.EnumType>

    getSourceTypes(): Set<ts.EnumType> { return null }

    getHierachyDepth() {
        return 1
    }

    processSourceType(type: ts.Type, typeParametersToApplyToAnonymousTypes: PreJavaTypeParameter[], context: ProcessContext) {
        let enumType = type as ts.EnumType

        this.name = type.getSymbol().getName()

        if (this.sourceTypes == null)
            this.sourceTypes = new Set()
        this.sourceTypes.add(enumType)

        let enumDeclaration = enumType.getSymbol().valueDeclaration as ts.EnumDeclaration
        if (enumDeclaration.members && enumDeclaration.members.length) {
            let memberValue = 0
            for (let enumMember of enumDeclaration.members) {
                let propertyName = enumMember.name
                if (propertyName.kind == ts.SyntaxKind.Identifier) {
                    let memberName = (propertyName as ts.Identifier).text
                    if (enumMember.initializer) {
                        if (enumMember.initializer['text']) {
                            let initializer = parseInt(enumMember.initializer['text'])
                            if (initializer)
                                memberValue = initializer
                        }
                    }

                    this.members.push({
                        name: memberName,
                        value: memberValue
                    })
                }
                else {
                    console.warn(`unsupported enum member`)
                }

                memberValue++
            }
        }

        if (type && type.symbol && type.symbol.valueDeclaration)
            this.packageName = context.getJavaPackage(type.symbol)
    }

    dump() {
        console.log(`enum ${this.getParametrizedSimpleName(null)}`)
        if (this.members && this.members.length)
            this.members.forEach(m => console.log(`enum member ${m.name} = ${m.value}`))
    }

    getTypeParameters(typeParametersEnv: { [key: string]: PreJavaType }) { return null }

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
