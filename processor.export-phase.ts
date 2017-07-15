import * as fs from "fs"
import * as path from "path"
import * as ts from "typescript"
import * as TypeMap from './type-map'
import * as GatherPhase from './processor.gather-phase'
import { mkdirRec } from './tools';

function hasImplementationInHierarchy(type: TypeMap.PreJavaType) {
    if (type instanceof TypeMap.PreJavaTypeClassOrInterface) {
        if (type.prototypeNames && type.prototypeNames.size)
            return true
        if (type.baseTypes) {
            for (let baseType of type.baseTypes.values())
                if (hasImplementationInHierarchy(baseType))
                    return true
        }
    }

    return type.isClassLike()
}

export class ExportPhase {
    private BY_INDEX_SETTER = `JsTools.setItem`
    private BY_INDEX_GETTER = `JsTools.getItem`

    constructor(public gatherPhase: GatherPhase.GatherPhase) { }

    exportJavaUnit(type: TypeMap.PreJavaType, javaWriter: JavaWriter, flow: TextFlow, baseDirectory: string) {
        let content = ''
        content += `package ${type.getPackageName()};\n`
        content += '\n'
        for (let importedType of javaWriter.imports.keys())
            content += `import ${importedType.getFullyQualifiedName()};\n`
        content += '\n'
        content += flow.content()

        let fileDirectory = path.join(baseDirectory, type.getPackageName().replace(new RegExp('\\.', 'g'), '/'))
        mkdirRec(fileDirectory)

        let fileName = path.join(fileDirectory, `${type.getSimpleName()}.java`)
        fs.writeFileSync(fileName, content, 'utf8')
    }

    private reservedWords: { [key: string]: string } = {
        '_': '_underscore_',
        'public': '_public_',
        'protected': 'protected_',
        'private': 'private_',
        'do': 'do_',
        'switch': 'switch_',
        'char': 'char_',
        'class': 'class_',
        'extends': 'extends_',
        'return': 'return_',
        'throw': 'throw_',
        'catch': 'catch_',
        'finally': 'finally_',
        'import': 'import_',
        'assert': 'assert_',
        'default': 'default_',
        'continue': 'continue_'
    }

    escapePropertyName(symbolName: string) {
        if (symbolName.indexOf('@') >= 0)
            symbolName = symbolName.replace(new RegExp('@', 'g'), '_at_')
        if (symbolName.indexOf('-') >= 0)
            symbolName = symbolName.replace(new RegExp('-', 'g'), '_dash_')
        if (symbolName.indexOf('[') >= 0)
            symbolName = symbolName.replace(new RegExp('\\[', 'g'), '_open_bracket_')
        if (symbolName.indexOf(']') >= 0)
            symbolName = symbolName.replace(new RegExp('\\]', 'g'), '_close_bracket_')
        if (symbolName.indexOf('.') >= 0)
            symbolName = symbolName.replace(new RegExp('\\.', 'g'), '_dot_')
        if (symbolName in this.reservedWords && typeof this.reservedWords[symbolName] === 'string')
            return this.reservedWords[symbolName]
        return symbolName
    }

    escapeMethodName(symbolName: string) {
        return this.escapePropertyName(symbolName)
    }

    JS_TYPE = new TypeMap.PreJavaTypeBuiltinJavaType('jsinterop.annotations', 'JsType')
    JS_OVERLAY = new TypeMap.PreJavaTypeBuiltinJavaType('jsinterop.annotations', 'JsOverlay')
    JS_PROPERTY = new TypeMap.PreJavaTypeBuiltinJavaType('jsinterop.annotations', 'JsProperty')
    JS_PACKAGE = new TypeMap.PreJavaTypeBuiltinJavaType('jsinterop.annotations', 'JsPackage')
    JS_METHOD = new TypeMap.PreJavaTypeBuiltinJavaType('jsinterop.annotations', 'JsMethod')

    exportNodes(program: ts.Program, baseDirectory: string) {
        for (let type of this.gatherPhase.typeMap.typeMap.values()) {
            if (type instanceof TypeMap.PreJavaTypeUnion) {
                let javaWriter = new JavaWriter(type.getPackageName())
                let flow = new TextFlow()

                javaWriter.importType(this.JS_TYPE)

                flow.startJavaDocComments()
                flow.push(`Union adapter`).finishLine()
                flow.endJavaDocComments()
                javaWriter.importType(this.JS_PACKAGE)
                flow.push(`@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")`).finishLine()
                flow.push(`public class ${type.getParametrizedSimpleName()} {`).finishLine()
                flow.pushLineStart('    ')
                for (let unionedType of type.types) {
                    javaWriter.importType(this.JS_OVERLAY)

                    flow.push(`@JsOverlay`).finishLine()
                    flow.push(`public ${javaWriter.importTypeParametrized(unionedType)} as${unionedType.getSimpleName()}() {`).finishLine()
                    flow.pushLineStart('    ')
                    flow.push(`return Js.uncheckedCast( this );`).finishLine()
                    flow.pullLineStart()
                    flow.push(`}`).finishLine()

                    flow.push(`public static ${type.getParametrizedSimpleName()} of(${unionedType.getSimpleName()} value) {`).finishLine()
                    flow.pushLineStart('    ')
                    flow.push(`return Js.uncheckedCast( value );`).finishLine()
                    flow.pullLineStart()
                    flow.push(`}`).finishLine()
                }
                flow.pullLineStart()
                flow.push(`}`).finishLine()

                this.exportJavaUnit(type, javaWriter, flow, baseDirectory)
            }
            else if (type instanceof TypeMap.PreJavaTypeEnum) {
                let javaWriter = new JavaWriter(type.getPackageName())
                let flow = new TextFlow()

                flow.startJavaDocComments()
                flow.push(`Enumeration adapter`).finishLine()
                flow.endJavaDocComments()
                flow.push(`public abstract class ${type.getParametrizedSimpleName()} extends Number {`).finishLine()
                flow.pushLineStart('    ')
                for (let member of type.members)
                    flow.push(`public static ${type.getParametrizedSimpleName()} ${member.name} = Js.uncheckedCast( ${member.value} );`).finishLine()
                flow.pullLineStart()
                flow.push(`}`).finishLine()

                this.exportJavaUnit(type, javaWriter, flow, baseDirectory)
            }
            else if (type instanceof TypeMap.PreJavaTypeClassOrInterface) {
                let javaWriter = new JavaWriter(type.getPackageName())
                let flow = new TextFlow()

                flow.startJavaDocComments()
                if (type.sourceTypes && type.sourceTypes.size) {
                    type.sourceTypes.forEach(sourceType => {
                        flow.push(`base type: ${sourceType.getSymbol() ? program.getTypeChecker().getFullyQualifiedName(sourceType.getSymbol()) : 'no symbol'}`).finishLine()
                        flow.push(`flags: ${sourceType.flags}`).finishLine()
                        if (sourceType && sourceType.symbol && sourceType.symbol && sourceType.symbol.declarations && sourceType.symbol.declarations.length)
                            sourceType.symbol.declarations.forEach(declaration => flow.push(`declared in: ${declaration.getSourceFile().fileName}:${declaration.pos}`).finishLine())
                    })
                }
                if (type.constructorSignatures && type.constructorSignatures.length) {
                    flow.push(`${type.constructorSignatures.length} constructors`)
                }
                if (type.comments && type.comments.length) {
                    flow.blankLine()
                    flow.push(type.comments)
                }
                flow.endJavaDocComments()

                let isClass = hasImplementationInHierarchy(type)

                let prototypeName = null
                let prototypeNamespace = null
                if (type.prototypeNames) {
                    for (let name of type.prototypeNames.values()) {
                        let index = name.lastIndexOf('.')
                        if (index >= 0) {
                            prototypeNamespace = name.substring(0, index)
                            prototypeName = name.substring(index + 1)
                        }
                        else {
                            prototypeName = name
                        }
                        break
                    }
                }
                javaWriter.importType(this.JS_TYPE)
                if (!prototypeName)
                    javaWriter.importType(this.JS_PACKAGE)
                flow.push(`@JsType(isNative=true, namespace=${prototypeNamespace ? ('"' + prototypeNamespace + '"') : 'JsPackage.GLOBAL'}, name=${prototypeName ? ('"' + prototypeName + '"') : '"Object"'})`)
                flow.finishLine()
                flow.push(`public ${isClass ? 'class' : 'interface'} ${type.getSimpleName()}`)
                if (type.typeParameters && type.typeParameters.length)
                    flow.push(`<${type.typeParameters.map(tp => javaWriter.importType(tp)).join(', ')}>`)
                if (type.baseTypes) {
                    let extendsTypes: TypeMap.PreJavaType[] = []
                    let implementsTypes: TypeMap.PreJavaType[] = []

                    for (let baseType of type.baseTypes.values()) {
                        if ((isClass && baseType.isClassLike() || !isClass))
                            extendsTypes.push(baseType)
                        else
                            implementsTypes.push(baseType)
                    }

                    if (extendsTypes.length)
                        flow.push(` extends ${extendsTypes.map(t => javaWriter.importTypeParametrized(t)).join(', ')}`)

                    if (implementsTypes.length)
                        flow.push(` implements ${implementsTypes.map(t => javaWriter.importTypeParametrized(t)).join(', ')}`)
                }
                flow.finishLine()

                flow.push(`{`)
                flow.finishLine()

                flow.pushLineStart('    ')

                if (isClass && type.constructorSignatures && type.constructorSignatures.length) {
                    flow.blankLine()
                        .push('/*\n    Constructors\n*/').finishLine()

                    type.constructorSignatures.forEach(constructr => {
                        if (constructr.comments && constructr.comments.length) {
                            flow.startJavaDocComments()
                            flow.push(constructr.comments)
                            flow.endJavaDocComments()
                        }

                        let escapedMethodName = type.getSimpleName()

                        flow.push(`public ${type.getSimpleName()}(`)
                        if (constructr.parameters)
                            flow.push(constructr.parameters.map(p => `${javaWriter.importTypeParametrized(p.type)} ${this.escapePropertyName(p.name)}`).join(', ')).push(`)`)

                        flow.push(`{\n}`).finishLine()
                    })
                }

                let nit = type.numberIndexType
                if (nit) {
                    javaWriter.importType(this.JS_OVERLAY)

                    flow.blankLine()
                    flow.push(`@JsOverlay`).finishLine()
                    flow.push(`${isClass ? 'public' : 'default'} void setByIndex(int index, ${javaWriter.importTypeParametrized(nit)} value) {`).finishLine()
                    flow.pushLineStart('    ')
                    flow.push(`${this.BY_INDEX_SETTER}(index, value);`).finishLine()
                    flow.pullLineStart()
                    flow.push(`}`).finishLine()

                    flow.blankLine()
                    flow.push(`@JsOverlay`).finishLine()
                    flow.push(`${isClass ? 'public' : 'default'} ${javaWriter.importTypeParametrized(nit)} getByIndex(int index) {`).finishLine()
                    flow.pushLineStart('    ')
                    flow.push(`return (${javaWriter.importTypeParametrized(nit)})(Object) ${this.BY_INDEX_GETTER}(index);`).finishLine()
                    flow.pullLineStart()
                    flow.push(`}`).finishLine()
                }

                let sit = type.stringIndexType
                if (sit) {
                    javaWriter.importType(this.JS_OVERLAY)

                    flow.blankLine()
                    flow.push(`@JsOverlay`).finishLine()
                    flow.push(`public void setByIndex(String index, ${javaWriter.importTypeParametrized(sit)} value) {`).finishLine()
                    flow.pushLineStart('    ')
                    flow.push(`${this.BY_INDEX_SETTER}(index, value);`).finishLine()
                    flow.pullLineStart()
                    flow.push(`}`).finishLine()

                    flow.blankLine()
                    flow.push(`@JsOverlay`).finishLine()
                    flow.push(`public ${javaWriter.importTypeParametrized(sit)} getByIndex(String index) {`).finishLine()
                    flow.pushLineStart('    ')
                    flow.push('// TODO : Should use Js.uncheckedCast...').finishLine()
                    flow.push(`return (${javaWriter.importTypeParametrized(sit)})(Object) ${this.BY_INDEX_GETTER}(index);`).finishLine()
                    flow.pullLineStart()
                    flow.push(`}`).finishLine()
                }

                if (type.properties && type.properties.length) {
                    javaWriter.importType(this.JS_PROPERTY)

                    flow.blankLine()
                        .push('/*\n    Properties\n*/').finishLine()

                    type.properties.forEach(property => {
                        flow.blankLine()

                        if (property.comments && property.comments.length) {
                            flow.startJavaDocComments()
                            flow.push(property.comments)
                            flow.endJavaDocComments()
                        }

                        let escapedPropertyName = this.escapePropertyName(property.name)

                        if (isClass) {
                            if (escapedPropertyName != property.name)
                                flow.push(`@JsProperty(name="${property.name}")`).finishLine()

                            flow.push(`public ${javaWriter.importTypeParametrized(property.type)} ${escapedPropertyName};`).finishLine()

                            flow.blankLine()
                        }

                        let upcaseName = escapedPropertyName.slice(0, 1).toLocaleUpperCase() + escapedPropertyName.slice(1)

                        flow.push(`@JsProperty( name = "${property.name}")`).finishLine()
                        flow.push(`${isClass ? 'public native ' : ''}${javaWriter.importTypeParametrized(property.type)} get${upcaseName}();`).finishLine()

                        flow.blankLine()
                        flow.push(`@JsProperty( name = "${property.name}")`).finishLine()
                        flow.push(`${isClass ? 'public native ' : ''}void set${upcaseName}( ${javaWriter.importTypeParametrized(property.type)} value );`).finishLine()
                    })
                }

                if (type.methods && type.methods.length) {
                    flow.blankLine()
                        .push('/*\n    Methods\n*/').finishLine()

                    type.methods.filter(method => method.name != 'toString').forEach(method => {
                        if (method.comments && method.comments.length) {
                            flow.startJavaDocComments()
                            flow.push(method.comments)
                            flow.endJavaDocComments()
                        }

                        let escapedMethodName = this.escapePropertyName(method.name)

                        if (escapedMethodName != method.name) {
                            javaWriter.importType(this.JS_METHOD)
                            flow.push(`@JsMethod(name = "${method.name}")`).finishLine()
                        }
                        flow.push(`${isClass ? 'public native ' : ''}`)
                        if (method.typeParameters && method.typeParameters.length)
                            flow.push(`<${method.typeParameters.map(tp => tp.name).join(', ')}> `)
                        flow.push(`${javaWriter.importTypeParametrized(method.returnType)} ${escapedMethodName}(`)
                        if (method.parameters)
                            flow.push(method.parameters.map(p => `${javaWriter.importTypeParametrized(p.type)} ${this.escapePropertyName(p.name)}`).join(', '))
                        flow.push(`);`).finishLine()
                    })
                }

                flow.pullLineStart()

                flow.push(`}`)
                flow.finishLine()

                this.exportJavaUnit(type, javaWriter, flow, baseDirectory)
            }
        }
    }
}

class TextFlow {
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

class JavaWriter {
    imports: Map<TypeMap.PreJavaType, string> = new Map()

    constructor(public unitPackageName: string) { }

    importType(type: TypeMap.PreJavaType): string {
        if (type.getPackageName() == null || type.getPackageName() == this.unitPackageName || type.getPackageName() == 'java.lang')
            return type.getSimpleName()

        if (type instanceof TypeMap.PreJavaTypeParameter)
            return type.getSimpleName()

        if (this.imports.has(type))
            return this.imports.get(type)

        let name = type.getSimpleName()
        for (let simpleName of this.imports.values()) {
            if (simpleName == name) {
                let fqn = type.getFullyQualifiedName()
                this.imports.set(type, fqn)
                return fqn
            }
        }

        this.imports.set(type, name)
        return name
    }

    importTypeParametrized(type: TypeMap.PreJavaType): string {
        let res = this.importType(type)
        return res + type.getParametrization()
    }

    // package name
    // unit name
    // imports
}