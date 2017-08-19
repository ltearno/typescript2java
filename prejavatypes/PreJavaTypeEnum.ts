import * as ts from "typescript"
import { PreJavaType, ProcessContext, TypeReplacer } from './PreJavaType'

export class PreJavaTypeEnum extends PreJavaType {
    packageName: string
    name: string
    members: {
        name: string
        value: number
    }[] = []

    constructor(name: string) {
        super()
        this.name = name
    }

    getHierachyDepth() {
        return 1
    }

    addSourceType(enumType: ts.EnumType) {
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
    }

    dump() {
        console.log(`enum ${this.getParametrizedSimpleName(null)}`)
        if (this.members && this.members.length)
            this.members.forEach(m => console.log(`enum member ${m.name} = ${m.value}`))
    }

    getParametrization(): string { return '' }

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
