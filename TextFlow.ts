import { PreJavaType } from './prejavatypes/PreJavaType'
import { PreJavaTypeClassOrInterface } from './prejavatypes/PreJavaTypeClassOrInterface'
import { PreJavaTypeBuiltinJavaType } from './prejavatypes/PreJavaTypeBuiltinJavaType'
import { PreJavaTypeEnum } from './prejavatypes/PreJavaTypeEnum'
import { PreJavaTypeUnion } from './prejavatypes/PreJavaTypeUnion'
import { PreJavaTypeParameter } from './prejavatypes/PreJavaTypeParameter'
import { PreJavaTypeTuple, TUPLE_TYPE_VARIABLE_NAMES } from './prejavatypes/PreJavaTypeTuple'
import { PreJavaTypeReference } from './prejavatypes/PreJavaTypeReference'

export class TextFlow {
    lineStarts: string[] = []

    private buffer: string = ''

    /** 
     * 0 = nothing happened on current line yet,
     * 1 = line has been happened at least one char
     */
    private currentPositionInLine = 0

    private shouldInsertBlankLine = false

    startJavaDocComments() {
        this.push('/** ').finishLine()
            .pushLineStart('  * ')
    }

    endJavaDocComments() {
        this.finishLine()
            .pullLineStart()
            .push(' */').finishLine()
    }

    content(): string {
        return this.buffer
    }

    pushLineStart(lineStart: string): this {
        this.lineStarts.push(lineStart)
        return this
    }

    pullLineStart(): this {
        this.lineStarts.pop()
        return this
    }

    private listStrings(v: string | string[], result: string[]) {
        if (typeof v === 'string') {
            if (v.indexOf('\n') >= 0)
                this.listStrings(v.split('\n'), result)
            else
                result.push(v)
        }
        else if (Array.isArray(v)) {
            v.forEach(i => this.listStrings(i, result))
        }
    }

    push(text: string | string[]): this {
        if (!text)
            return this

        let parts = []
        this.listStrings(text, parts)

        if (this.shouldInsertBlankLine) {
            this.buffer += '\n'
            this.shouldInsertBlankLine = false
            this.currentPositionInLine = 0
        }

        for (let i = 0; i < parts.length; i++) {
            let part = parts[i]

            if (i > 0)
                this.finishLine()

            if (this.currentPositionInLine == 0) {
                if (this.lineStarts)
                    this.lineStarts.forEach(lineStart => this.buffer += lineStart)
                this.currentPositionInLine = 1
            }

            this.buffer += part
        }

        return this
    }

    finishLine(): this {
        if (this.currentPositionInLine == 0) {
            if (this.lineStarts)
                this.lineStarts.forEach(lineStart => this.buffer += lineStart)
        }
        this.currentPositionInLine = 0
        this.buffer += '\n'
        return this
    }

    /** ensures that there is a blank line before any previous non-empty line */
    blankLine(): this {
        this.shouldInsertBlankLine = true
        return this
    }
}

export class JavaWriter {
    imports: Map<PreJavaType, string> = new Map()

    constructor(public unitPackageName: string) { }

    importType(type: PreJavaType): string {
        if (!type)
            console.log('cvc');

        if (type.getPackageName() == null || type.getPackageName() == this.unitPackageName || type.getPackageName() == 'java.lang')
            return type.getSimpleName(null)

        if (this.imports.has(type))
            return this.imports.get(type)

        let importedFqn = type.getFullyQualifiedName(null)
        let name = type.getSimpleName(null)

        for (let [alreadyImportedType, alreadyImportedName] of this.imports) {
            if (alreadyImportedName == name && alreadyImportedType.getFullyQualifiedName(null) != importedFqn) {
                name = importedFqn
                return importedFqn
            }
        }

        this.imports.set(type, name)
        return name
    }

    importTypeParametrized(type: PreJavaType): string {
        let res = this.importType(type)
        let typeParameters = type.getTypeParameters(null)
        if (typeParameters && typeParameters.length)
            res += `<${typeParameters.map(tp => this.importTypeParametrized(tp)).join(', ')}>`
        return res
    }

    // package name
    // unit name
    // imports
}