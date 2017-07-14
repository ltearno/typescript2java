import * as fs from "fs"
import * as path from "path"
import * as ts from "typescript"
import * as TypeMap from './type-map'
import * as GatherPhase from './processor.gather-phase'

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

    exportNodes(program: ts.Program) {
        for (let type of this.gatherPhase.typeMap.typeMap.values()) {
            if (type instanceof TypeMap.PreJavaTypeUnion) {
                let javaWriter = new JavaWriter()
                let flow = new TextFlow()

                flow.startJavaDocComments()
                flow.push(`Union adapter`).finishLine()
                flow.endJavaDocComments()
                flow.push(`@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")`).finishLine()
                flow.push(`public class ${type.getParametrizedSimpleName()} {`).finishLine()
                flow.pushLineStart('    ')
                for (let unionedType of type.types) {
                    flow.push(`@JsOverlay`).finishLine()
                    flow.push(`public ${javaWriter.importTypeParametrized(unionedType)} as${unionedType.getSimpleName()} {`).finishLine()
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

                console.log()
                console.log(`package ${type.getPackageName()};`)
                console.log()
                for (let importedType of javaWriter.imports.keys())
                    console.log(`import ${importedType.getFullyQualifiedName()};`)
                console.log()
                console.log(flow.content())
            }
            else if (type instanceof TypeMap.PreJavaTypeEnum) {
                let javaWriter = new JavaWriter()
                let flow = new TextFlow()

                flow.startJavaDocComments()
                flow.push(`Enumeration adapter`).finishLine()
                flow.endJavaDocComments()
                flow.push(`public abstract class ${type.getParametrizedSimpleName()} extends Number {`).finishLine()
                flow.pushLineStart('    ')
                for (let member of type.members)
                    flow.push(`public static final ${type.getParametrizedSimpleName()} ${member.name} = Js.uncheckedCast( ${member.value} );`).finishLine()
                flow.pullLineStart()
                flow.push(`}`).finishLine()

                console.log()
                console.log(`package ${type.getPackageName()};`)
                console.log()
                for (let importedType of javaWriter.imports.keys())
                    console.log(`import ${importedType.getFullyQualifiedName()};`)
                console.log()
                console.log(flow.content())
            }
            else if (type instanceof TypeMap.PreJavaTypeClassOrInterface) {
                let javaWriter = new JavaWriter()
                let flow = new TextFlow()

                flow.startJavaDocComments()
                if (type.sourceTypes && type.sourceTypes.size) {
                    type.sourceTypes.forEach(sourceType => flow.push(`base type: ${sourceType.getSymbol() ? program.getTypeChecker().getFullyQualifiedName(sourceType.getSymbol()) : 'no symbol'} flags ${sourceType.flags}`))
                }
                if (type.comments && type.comments.length) {
                    flow.blankLine()
                    flow.push(type.comments)
                }
                flow.endJavaDocComments()

                let hasImplementation = hasImplementationInHierarchy(type)
                let prototypeName = null
                let prototypeNamespace = null
                if (type.prototypeNames) {
                    for (let name of type.prototypeNames.values()) {
                        let index = name.lastIndexOf('.')
                        if (index) {
                            prototypeNamespace = name.slice(0, index)
                            prototypeName = name.slice(index + 1)
                        }
                        else {
                            prototypeName = name
                        }
                        break
                    }
                }
                flow.push(`@JsInterop(isNative=true, namespace=${prototypeNamespace ? ('"' + prototypeNamespace + '"') : 'JsPackage.GLOBAL'}, name=${prototypeName ? ('"' + prototypeName + '"') : '"Object"'})`)
                flow.finishLine()
                flow.push(`public ${hasImplementation ? 'class' : 'interface'} ${type.name}`)
                if (type.typeParameters && type.typeParameters.length)
                    flow.push(`<${type.typeParameters.map(tp => javaWriter.importType(tp)).join(', ')}>`)
                if (type.baseTypes) {
                    let classes: TypeMap.PreJavaType[] = []
                    let interfaces: TypeMap.PreJavaType[] = []

                    for (let baseType of type.baseTypes.values()) {
                        if (hasImplementation && baseType.isClassLike())
                            classes.push(baseType)
                        else
                            interfaces.push(baseType)
                    }

                    if (classes.length)
                        flow.push(` extends ${classes.map(t => javaWriter.importTypeParametrized(t)).join(', ')}`)

                    if (interfaces.length)
                        flow.push(` implements ${interfaces.map(t => javaWriter.importTypeParametrized(t)).join(', ')}`)
                }
                flow.finishLine()

                flow.push(`{`)
                flow.finishLine()

                flow.pushLineStart('    ')

                let nit = type.numberIndexType
                if (nit) {
                    flow.blankLine()
                    flow.push(`@JsOverlay`).finishLine()
                    flow.push(`public void setByIndex(int index, ${javaWriter.importTypeParametrized(nit)} value) {`).finishLine()
                    flow.pushLineStart('    ')
                    flow.push(`${this.BY_INDEX_SETTER}(index, value);`).finishLine()
                    flow.pullLineStart()
                    flow.push(`}`).finishLine()

                    flow.blankLine()
                    flow.push(`@JsOverlay`).finishLine()
                    flow.push(`public ${javaWriter.importTypeParametrized(nit)} getByIndex(int index) {`).finishLine()
                    flow.pushLineStart('    ')
                    flow.push(`return (${javaWriter.importTypeParametrized(nit)})(Object) ${this.BY_INDEX_GETTER}(index);`).finishLine()
                    flow.pullLineStart()
                    flow.push(`}`).finishLine()
                }

                let sit = type.stringIndexType
                if (sit) {
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
                    flow.push('// TODO : Should use Js.uncheckedCast...')
                    flow.push(`return (${javaWriter.importTypeParametrized(sit)})(Object) ${this.BY_INDEX_GETTER}(index);`).finishLine()
                    flow.pullLineStart()
                    flow.push(`}`).finishLine()
                }

                if (type.properties && type.properties.length) {
                    flow.blankLine()
                        .push('/*\n    Properties\n*/').finishLine()

                    type.properties.forEach(property => {
                        if (property.comments && property.comments.length) {
                            flow.startJavaDocComments()
                            flow.push(property.comments)
                            flow.endJavaDocComments()
                        }

                        flow.push(`public ${javaWriter.importTypeParametrized(property.type)} ${property.name};`).finishLine()

                        let upcaseName = property.name.slice(0, 1).toLocaleUpperCase() + property.name.slice(1)

                        flow.blankLine()
                        flow.push(`@JsProperty( name = "${property.name}")`).finishLine()
                        flow.push(`public final native ${javaWriter.importTypeParametrized(property.type)} get${upcaseName}();`).finishLine()

                        flow.blankLine()
                        flow.push(`@JsProperty( name = "${property.name}")`).finishLine()
                        flow.push(`public final native void set${upcaseName}( ${javaWriter.importTypeParametrized(property.type)} value );`).finishLine()
                    })
                }

                if (type.methods && type.methods.length) {
                    flow.blankLine()
                        .push('/*\n    Methods\n*/').finishLine()

                    type.methods.forEach(method => {
                        if (method.comments && method.comments.length) {
                            flow.startJavaDocComments()
                            flow.push(method.comments)
                            flow.endJavaDocComments()
                        }

                        flow.push(`public final native ${javaWriter.importTypeParametrized(method.returnType)} ${method.name}(`)
                        if (method.parameters)
                            flow.push(method.parameters.map(p => `${javaWriter.importTypeParametrized(p.type)} ${p.name}`).join(', '))
                        flow.push(`);`).finishLine()
                    })
                }

                flow.pullLineStart()

                flow.push(`}`)
                flow.finishLine()

                console.log()
                console.log(`package ${type.getPackageName()};`)
                console.log()
                for (let importedType of javaWriter.imports.keys())
                    console.log(`import ${importedType.getFullyQualifiedName()};`)
                console.log()
                console.log(flow.content())
            }
            else if (type instanceof TypeMap.PreJavaTypeEnum) {
            }
            else if (type instanceof TypeMap.PreJavaTypeUnion) {
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

    push(text: string | string[]): this {
        if (!text)
            return this

        let parts = text instanceof Array ? text : text.split('\n')

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
        this.currentPositionInLine = 0
        this.buffer += '\n'
        return this
    }

    /** ensures that there is a blank line before any previous non-empty line */
    blankLine(): this {
        this.finishLine()
        return this
    }
}

class JavaWriter {
    imports: Map<TypeMap.PreJavaType, string> = new Map()

    importType(type: TypeMap.PreJavaType): string {
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