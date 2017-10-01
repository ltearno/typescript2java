import * as fs from "fs"
import * as path from "path"
import * as ts from "typescript"
import * as TypeMap from './type-map'
import * as GatherPhase from './processor.gather-phase'
import * as typeTools from './type-tools'
import * as Signature from './signature'
import * as BuiltIn from './builtin-types'
import { mkdirRec } from './tools';
import { visitPreJavaType } from './prejavatypes/PreJavaTypeVisit'
import { TextFlow, JavaWriter } from './TextFlow'

import { PreJavaType } from './prejavatypes/PreJavaType'
import { PreJavaTypeClassOrInterface } from './prejavatypes/PreJavaTypeClassOrInterface'
import { PreJavaTypeBuiltinJavaType } from './prejavatypes/PreJavaTypeBuiltinJavaType'
import { PreJavaTypeEnum } from './prejavatypes/PreJavaTypeEnum'
import { PreJavaTypeUnion } from './prejavatypes/PreJavaTypeUnion'
import { PreJavaTypeParameter } from './prejavatypes/PreJavaTypeParameter'
import { PreJavaTypeTuple, TUPLE_TYPE_VARIABLE_NAMES } from './prejavatypes/PreJavaTypeTuple'
import { PreJavaTypeReference } from './prejavatypes/PreJavaTypeReference'
import { PreJavaTypeCallSignature, PreJavaTypeFormalParameter } from './prejavatypes/PreJavaTypeCallSignature'


export class ExportPhase {
    private exportedFqns = new Set<string>()

    JS_TYPE = new PreJavaTypeBuiltinJavaType('jsinterop.annotations', 'JsType')
    JS_OVERLAY = new PreJavaTypeBuiltinJavaType('jsinterop.annotations', 'JsOverlay')
    JS_PROPERTY = new PreJavaTypeBuiltinJavaType('jsinterop.annotations', 'JsProperty')
    JS_PACKAGE = new PreJavaTypeBuiltinJavaType('jsinterop.annotations', 'JsPackage')
    JS_METHOD = new PreJavaTypeBuiltinJavaType('jsinterop.annotations', 'JsMethod')
    JS_ARRAY_LIKE = new PreJavaTypeBuiltinJavaType('jsinterop.base', 'JsArrayLike')
    JS_FUNCTION = new PreJavaTypeBuiltinJavaType('jsinterop.annotations', 'JsFunction')
    JS = new PreJavaTypeBuiltinJavaType('jsinterop.base', 'Js')
    DO_NOT_AUTOBOX = new PreJavaTypeBuiltinJavaType('javaemul.internal.annotations', 'DoNotAutobox')

    exportNodes(types: Set<PreJavaType>, program: ts.Program, baseDirectory: string, adding: { [key: string]: { [key: string]: string } }, removing: { [key: string]: { [key: string]: string[] } }) {
        for (let type of types) {
            let fqn = type.getParametrizedFullyQualifiedName(null)
            console.log(`exporting ${fqn}`)

            visitPreJavaType(type, {
                caseUnion: type => this.exportUnionType(type, program, baseDirectory),
                caseTuple: type => this.exportTuple(type, program, baseDirectory),
                caseEnumType: type => this.exportEnum(type, program, baseDirectory),
                caseClassOrInterfaceType: type => this.exportClassOrInterface(type, program, baseDirectory, adding, removing)
            })
        }
    }

    private exportUnionType(type: PreJavaTypeUnion, program: ts.Program, baseDirectory: string) {
        let javaWriter = new JavaWriter(type.getPackageName(), type.getSimpleName())
        let flow = new TextFlow()

        let baseTypes: PreJavaType[] = []
        type.getBaseTypes() && type.getBaseTypes().forEach(baseType => baseTypes.push(baseType))
        let implementedBaseTypes = baseTypes.filter(bt => !bt.isClassLike())
        let extendedBaseTypes = baseTypes.filter(bt => bt.isClassLike())

        javaWriter.importType(this.JS_TYPE)
        javaWriter.importType(this.JS)

        flow.startJavaDocComments()
        flow.push(`Union adapter`).finishLine()
        if (type.sourceTypes && type.sourceTypes.length) {
            type.sourceTypes.forEach(sourceType => {
                if (sourceType && sourceType.symbol && sourceType.symbol.declarations && sourceType.symbol.declarations.length)
                    sourceType.symbol.declarations.forEach(declaration => flow.push(`declared in: ${declaration.getSourceFile().fileName}:${declaration.pos}`).finishLine())
                if (sourceType && sourceType.aliasSymbol && sourceType.aliasSymbol.declarations && sourceType.aliasSymbol.declarations.length)
                    sourceType.aliasSymbol.declarations.forEach(declaration => flow.push(`aliased in: ${declaration.getSourceFile().fileName}:${declaration.pos}`).finishLine())
            })
        }
        flow.endJavaDocComments()

        let exportUnionAsAbstractClass = extendedBaseTypes.length > 0
        if (type.isClassLike()) {
            javaWriter.importType(this.JS_PACKAGE)
            flow.push(`@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")`).finishLine()
            flow.push(`public abstract class ${type.getSimpleName()}${this.getParametrizationWithConstraints(type, javaWriter)} ${extendedBaseTypes.length ? `extends ${extendedBaseTypes.map(t => javaWriter.importTypeParametrized(t)).join()} ` : ''}${implementedBaseTypes.length ? `implements ${implementedBaseTypes.map(t => javaWriter.importTypeParametrized(t)).join()} ` : ''} {`).finishLine()
            flow.pushLineStart('    ')

            let baseConstructors = typeTools.getSuperConstructors(type, false)
            let baseConstructor = baseConstructors && baseConstructors.length && baseConstructors[0]
            let baseClassConstructorParameters = baseConstructor && baseConstructor.parameters
            if (baseClassConstructorParameters && baseClassConstructorParameters.length) {
                flow.push(`public ${type.getSimpleName()}() {`).finishLine()
                flow.pushLineStart('    ').push(`super(${baseClassConstructorParameters.map(p => 'null').join(', ')});`).finishLine().pullLineStart()
                flow.push(`}`).finishLine()
            }

            for (let unionedType of type.types) {
                this.exportClassLikeUnionMethodAsUnionedType(unionedType, javaWriter, flow)
                this.exportClassLikeUnionMethodOfUnionedType(type, unionedType, javaWriter, flow)
            }

            flow.pullLineStart()
            flow.push(`}`).finishLine()
        }
        else {
            javaWriter.importType(this.JS_PACKAGE)
            flow.push(`@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")`).finishLine()
            flow.push(`public interface ${type.getSimpleName()}${this.getParametrizationWithConstraints(type, javaWriter)} ${implementedBaseTypes.length ? `extends ${implementedBaseTypes.map(t => javaWriter.importTypeParametrized(t)).join()} ` : ''} {`).finishLine()
            flow.pushLineStart('    ')

            for (let unionedType of type.types) {
                this.exportInterfaceLikeUnionMethodAsUnionedType(unionedType, javaWriter, flow)
                this.exportInterfaceLikeUnionMethodOfUnionedType(type, unionedType, javaWriter, flow)
            }

            flow.pullLineStart()
            flow.push(`}`).finishLine()
        }

        this.exportJavaUnit(type, javaWriter, flow, baseDirectory)
    }

    private exportTuple(type: PreJavaTypeTuple, program: ts.Program, baseDirectory: string) {
        let javaWriter = new JavaWriter(type.getPackageName(), type.getSimpleName())
        let flow = new TextFlow()

        javaWriter.importType(this.JS_TYPE)

        flow.startJavaDocComments()
        flow.push(`Tuple adapter`).finishLine()
        flow.endJavaDocComments()

        javaWriter.importType(this.JS_PACKAGE)
        flow.push(`@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")`).finishLine()
        flow.push(`public class ${type.getParametrizedSimpleName(null)} {`).finishLine()
        flow.pushLineStart('    ')
        javaWriter.importType(this.JS_OVERLAY)
        javaWriter.importType(this.JS)
        for (let i = 0; i < type.typeParameters.length; i++) {
            let variableName = TUPLE_TYPE_VARIABLE_NAMES[i]

            flow.push(`@JsOverlay`).finishLine()
            flow.push(`public final ${variableName} getNb${i + 1}() {`).finishLine()
            flow.pushLineStart('    ')
            flow.push(`return (${variableName}) Js.asArrayLike(this).getAt(${i});`).finishLine()
            flow.pullLineStart()
            flow.push(`}`).finishLine()

            flow.push(`@JsOverlay`).finishLine()
            flow.push(`public final void setNb${i + 1}(${variableName} value) {`).finishLine()
            flow.pushLineStart('    ')
            flow.push(`Js.asArrayLike(this).setAt(${i}, value);`).finishLine()
            flow.pullLineStart()
            flow.push(`}`).finishLine()
        }

        flow.push(`@JsOverlay`).finishLine()
        flow.push(`public final ${javaWriter.importType(this.JS_ARRAY_LIKE)}<Object> asList() {`).finishLine()
        flow.pushLineStart('    ')
        flow.push(`return Js.uncheckedCast(this);`).finishLine()
        flow.pullLineStart()
        flow.push(`}`).finishLine()

        flow.pullLineStart()
        flow.push(`}`).finishLine()

        this.exportJavaUnit(type, javaWriter, flow, baseDirectory)
    }

    private exportEnum(type: PreJavaTypeEnum, program: ts.Program, baseDirectory: string) {
        let javaWriter = new JavaWriter(type.getPackageName(), type.getSimpleName())
        let flow = new TextFlow()

        javaWriter.importType(this.JS)

        flow.startJavaDocComments()
        flow.push(`Enumeration adapter`).finishLine()
        flow.endJavaDocComments()
        flow.push(`public abstract class ${type.getParametrizedSimpleName(null)} extends Number {`).finishLine()
        flow.pushLineStart('    ')
        for (let member of type.members)
            flow.push(`public static final ${type.getParametrizedSimpleName(null)} ${member.name} = Js.uncheckedCast( ${member.value} );`).finishLine()
        flow.pullLineStart()
        flow.push(`}`).finishLine()

        this.exportJavaUnit(type, javaWriter, flow, baseDirectory)
    }

    private exportComments(type: PreJavaTypeClassOrInterface, flow: TextFlow, program: ts.Program) {
        flow.startJavaDocComments()
        if (type.sourceTypes && type.sourceTypes.size) {
            type.sourceTypes.forEach(sourceType => {
                flow.push(`source type: ${sourceType.getSymbol() ? program.getTypeChecker().getFullyQualifiedName(sourceType.getSymbol()) : 'no symbol'}`).finishLine()
                flow.push(`flags: ${ts.TypeFlags[sourceType.flags]} (${sourceType.flags})`).finishLine()
                if (sourceType && sourceType.symbol && sourceType.symbol && sourceType.symbol.declarations && sourceType.symbol.declarations.length)
                    sourceType.symbol.declarations.forEach(declaration => flow.push(`declared in: ${declaration.getSourceFile().fileName} at pos ${declaration.pos}`).finishLine())
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
    }

    private splitNamespace(value: string) {
        let namespace: string = null
        let name: string = null
        let index = value.lastIndexOf('.')
        if (index >= 0) {
            namespace = value.substring(0, index)
            name = value.substring(index + 1)
        }
        else {
            name = value
        }
        return { namespace, name }
    }

    private typeParameterString(tp: PreJavaTypeParameter, javaWriter: JavaWriter): string {
        return javaWriter.importType(tp) + (tp.constraint ? ` extends ${javaWriter.importType(tp.constraint) + tp.constraint.getParametrization(null)}` : '')
    }

    private exportClassOrInterface(type: PreJavaTypeClassOrInterface, program: ts.Program, baseDirectory: string, adding: { [key: string]: { [key: string]: string } }, removing: { [key: string]: { [key: string]: string[] } }) {
        let javaWriter = new JavaWriter(type.getPackageName(), type.getSimpleName(null))
        let flow = new TextFlow()

        this.exportComments(type, flow, program)

        let functionalInterface = type.isFunctionalInterface// typeTools.hasOnlyCallSignatures(type)
        if (functionalInterface /*&& type.callSignatures.length == 1*/) {
            // easy functional interface : @JsFunction
            javaWriter.importType(this.JS_FUNCTION)

            if (type.isClassLike())
                console.log(`kjhgjgh`)

            flow.push(`@JsFunction`).finishLine()
            flow.push(`public interface ${type.getSimpleName(null)}`)

            if (type.typeParameters && type.typeParameters.length)
                flow.push(`<${type.typeParameters.map(tp => this.typeParameterString(tp, javaWriter)).join(', ')}>`)

            if (type.baseTypes && type.baseTypes.size) {
                let bts: PreJavaType[] = []
                type.baseTypes.forEach(bt => bts.push(bt))
                flow.push(` extends ${bts.map(bt => javaWriter.importTypeParametrized(bt)).join(', ')}`)
            }

            flow.push(`{`)
            flow.finishLine()
            flow.pushLineStart('    ')

            let method = type.callSignatures[0]

            if (method.comments && method.comments.length) {
                flow.startJavaDocComments()
                flow.push(method.comments)
                flow.endJavaDocComments()
            }

            this.exportJsFunctionCallMethod(method, javaWriter, flow)

            if (method.parameters && method.parameters.length == 1 && (method.parameters[0].type instanceof PreJavaTypeUnion)) {
                // TODO first : don't replace JsFunction types with Unioned parameter by Function or Action...
                // develop unioned types...
            }

            flow.pullLineStart()
            flow.push(`}`)
            flow.finishLine()
        }
        else {
            javaWriter.importType(this.JS_TYPE)

            let isClass = type.isClassLike()

            if (!type.jsNamespace)
                javaWriter.importType(this.JS_PACKAGE)

            flow.push(`@JsType(isNative=true, namespace=${type.jsNamespace ? ('"' + type.jsNamespace + '"') : 'JsPackage.GLOBAL'}, name=${type.jsName ? ('"' + type.jsName + '"') : '"Object"'})`)
            flow.finishLine()
            flow.push(`public ${isClass ? 'class' : 'interface'} ${type.getSimpleName(null)}`)

            if (type.typeParameters && type.typeParameters.length)
                flow.push(`<${type.typeParameters.map(tp => this.typeParameterString(tp, javaWriter)).join(', ')}>`)

            let theClassBaseType: PreJavaType = null
            if (type.baseTypes) {
                let extendsTypes: PreJavaType[] = []
                let implementsTypes: PreJavaType[] = []

                for (let baseType of type.baseTypes.values()) {
                    if (baseType == BuiltIn.BUILTIN_TYPE_OBJECT)
                        continue

                    if (!isClass || baseType.isClassLike())
                        extendsTypes.push(baseType)
                    else
                        implementsTypes.push(baseType)
                }

                if (extendsTypes.length) {
                    flow.push(` extends ${extendsTypes.map(t => javaWriter.importTypeParametrized(t)).join(', ')} `)
                    if (type.isClassLike())
                        theClassBaseType = extendsTypes[0]
                }

                if (implementsTypes.length)
                    flow.push(` implements ${implementsTypes.map(t => javaWriter.importTypeParametrized(t)).join(', ')} `)
            }
            flow.finishLine()

            flow.push(`{`)
            flow.finishLine()
            flow.pushLineStart('    ')

            type.callSignatures && type.callSignatures.forEach(callSignature => flow.push(`/** SKIPPED CALL SIGNATURE ! */`).finishLine())

            if (isClass) {
                let baseConstructors = typeTools.getSuperConstructors(type, false)
                let baseConstructor = baseConstructors && baseConstructors.length && baseConstructors[0]
                let theBaseClassConstructorParameters = baseConstructor && baseConstructor.parameters

                if (theBaseClassConstructorParameters && theBaseClassConstructorParameters.length && (!type.constructorSignatures || !type.constructorSignatures.length)) {
                    flow.blankLine().push('/*\n    Default constructor\n*/').finishLine()

                    flow.push(`public ${type.getSimpleName(null)}() `)
                    flow.push(`{`).finishLine()
                    if (theBaseClassConstructorParameters && theBaseClassConstructorParameters.length) {
                        flow.pushLineStart('    ').push(`super(${theBaseClassConstructorParameters.map(p => 'null').join(', ')}); `).finishLine().pullLineStart()
                    }
                    flow.push(`} `).finishLine()
                }
                else if (type.constructorSignatures && type.constructorSignatures.length) {
                    flow.blankLine().push('/*\n    Constructors\n*/').finishLine()

                    type.constructorSignatures.forEach(constructor => {
                        if (constructor.comments && constructor.comments.length) {
                            flow.startJavaDocComments()
                            flow.push(constructor.comments)
                            flow.endJavaDocComments()
                        }

                        let escapedMethodName = type.getSimpleName(null)

                        flow.push(`public ${type.getSimpleName(null)} (`)
                        if (constructor.parameters)
                            flow.push(constructor.parameters.map(p => this.formalParameterJavaString(p, javaWriter)).join(', ')).push(`) `)

                        flow.push(`{`).finishLine()
                        if (theBaseClassConstructorParameters && theBaseClassConstructorParameters.length) {
                            flow.pushLineStart('    ').push(`super(${theBaseClassConstructorParameters.map(p => 'null').join(', ')}); `).finishLine().pullLineStart()
                        }
                        flow.push(`} `).finishLine()
                    })
                }
            }

            // added code
            this.mabeAddCustomizedCode(type.packageName, type.name, adding, flow)


            let nit = type.numberIndexType
            if (nit) {
                if (typeTools.hasIndexInTypeHierarchy(type)) {
                    flow.blankLine().push(`/** skipped index of type {@link ${javaWriter.importTypeParametrized(nit)}} because already in type hierarchy */`).finishLine()
                }
                else {
                    this.exportNumberIndexSetterMethod(nit, isClass, javaWriter, flow)
                    this.exportNumberIndexGetterMethod(nit, isClass, javaWriter, flow)
                }
            }

            let sit = type.stringIndexType
            if (sit) {
                if (typeTools.hasIndexInTypeHierarchy(type)) {
                    flow.blankLine().push(`/** skipped index of type {@link ${javaWriter.importTypeParametrized(sit)}} because already in type hierarchy */`).finishLine()
                }
                else {
                    this.exportStringIndexSetterMethod(sit, isClass, javaWriter, flow)
                    this.exportStringIndexGetterMethod(sit, isClass, javaWriter, flow)
                }
            }

            if (type.isClassLike() && type.staticProperties && type.staticProperties.length) {
                javaWriter.importType(this.JS_PROPERTY)

                flow.blankLine()
                    .push('/*\n    Static properties\n*/').finishLine()

                type.staticProperties.forEach(property => {
                    flow.blankLine()

                    if (property.name.indexOf('@') >= 0) {
                        flow.push(`// skipped static property ${property.name}`).blankLine().blankLine()
                    }
                    else {
                        if (property.comments && property.comments.length) {
                            flow.startJavaDocComments()
                            flow.push(property.comments)
                            flow.endJavaDocComments()
                        }

                        let escapedPropertyName = typeTools.escapePropertyName(property.name)
                        let propertyNamespace = type.jsNamespace ? (type.jsNamespace + '.' + type.jsName) : type.jsName
                        if (!propertyNamespace)
                            javaWriter.importType(this.JS_PACKAGE)

                        flow.push(`@JsProperty(namespace=${propertyNamespace ? ('"' + propertyNamespace + '"') : 'JsPackage.GLOBAL'}, name="${property.name}")`).finishLine()
                        flow.push(`public static ${javaWriter.importTypeParametrized(property.type)} ${escapedPropertyName};`).finishLine()
                        flow.blankLine()
                    }
                })
            }

            let removedMethods: string[] = null
            if (removing && (type.packageName in removing) && (type.name in removing[type.packageName]))
                removedMethods = removing[type.packageName][type.name]

            if (type.isClassLike() && type.staticMethods && type.staticMethods.length) {
                flow.blankLine()
                    .push('/*\n    Static methods\n*/').finishLine()

                let fixBug = new Set<string>()

                type.staticMethods
                    .filter(method => {
                        let sig = Signature.getCallSignatureTypeErasedSignature(method)
                        let seen = fixBug.has(sig)
                        fixBug.add(sig)
                        return !seen
                    })
                    .forEach(method => {
                        if (method.name.indexOf('@') >= 0) {
                            flow.push(`// skipped static method ${method.name}`).finishLine().blankLine()
                            return
                        }

                        if (removedMethods) {
                            let methodRemovingSignature = this.getMethodRemovingSignature(method, true)
                            if (removedMethods.indexOf(methodRemovingSignature) >= 0) {
                                flow.push(`// removed static method ${method.name}`).finishLine().blankLine()
                                return
                            }
                        }

                        this.exportStaticMethod(method, type, javaWriter, flow)
                    })
            }

            if (isClass && type.properties && type.properties.length) {
                javaWriter.importType(this.JS_PROPERTY)

                flow.blankLine()
                    .push('/*\n    Properties\n*/').finishLine()

                type.properties
                    .sort((a, b) => a.name == b.name ? 0 : (a.name < b.name ? -1 : 1))
                    .filter(property => !type.staticProperties || !type.staticProperties.some(p => p.name == property.name))
                    .forEach(property => {
                        flow.blankLine()

                        if (property.name.indexOf('@') >= 0) {
                            flow.push(`// skipped property ${property.name}`).blankLine().blankLine()
                            return
                        }

                        if (property.comments && property.comments.length) {
                            flow.startJavaDocComments()
                            flow.push(property.comments)
                            flow.endJavaDocComments()
                        }

                        let escapedPropertyName = typeTools.escapePropertyName(property.name)

                        if (escapedPropertyName != property.name)
                            flow.push(`@JsProperty(name="${property.name}")`).finishLine()

                        flow.push(`public ${javaWriter.importTypeParametrized(property.type)} ${escapedPropertyName};`).finishLine()

                        flow.blankLine()
                    })
            }

            if (type.methods && type.methods.length) {
                flow.blankLine()
                    .push('/*\n    Methods\n*/').finishLine()

                let fixBug = new Set<string>()

                type.methods
                    .filter(method => {
                        let sig = Signature.getCallSignatureTypeErasedSignature(method)
                        let seen = fixBug.has(sig)
                        fixBug.add(sig)
                        return !seen
                    })
                    .sort((a, b) => {
                        let sa = Signature.getCallSignatureTypeErasedSignature(a)
                        let sb = Signature.getCallSignatureTypeErasedSignature(b)

                        if (sa == sb)
                            return 0
                        return sa > sb ? 1 : -1
                    })
                    .forEach(method => {
                        if (method.name.indexOf('@') >= 0) {
                            flow.push(`// skipped method ${method.name}`).blankLine().blankLine()
                            return
                        }

                        if (removedMethods) {
                            let methodRemovingSignature = this.getMethodRemovingSignature(method, true)
                            if (removedMethods.indexOf(methodRemovingSignature) >= 0) {
                                flow.push(`// removed method ${method.name}`).blankLine().blankLine()
                                return
                            }
                        }

                        this.exportClassMethod(method, type, isClass, javaWriter, flow)
                    })
            }

            flow.pullLineStart()
            flow.push(`}`)
            flow.finishLine()
        }

        this.exportJavaUnit(type, javaWriter, flow, baseDirectory)
    }

    private getMethodRemovingSignature(method: PreJavaTypeCallSignature, isStatic: boolean) {
        //"static Array of(T)"
        return `${isStatic ? 'static ' : ''}${method.returnType.getSimpleName(null)} ${method.name}(${method.parameters ? method.parameters.map(p => p.type.getSimpleName(null)).join(',') : ''})`
    }

    private mabeAddCustomizedCode(packageName: string, name: string, adding: { [key: string]: { [key: string]: string } }, flow: TextFlow) {
        if (adding && (packageName in adding) && (name in adding[packageName])) {
            flow.blankLine().push('/*\n    Added customized code\n*/').finishLine()

            let fileName = adding[packageName][name]
            let content = fs.readFileSync(fileName, 'utf8')
            flow.finishLine().push(content).finishLine()
        }
    }

    private exportJavaUnit(type: PreJavaType, javaWriter: JavaWriter, flow: TextFlow, baseDirectory: string) {
        let fqn = type.getParametrizedFullyQualifiedName(null)

        if (this.exportedFqns.has(fqn))
            console.log(`WARNING, already exported !`)
        else
            this.exportedFqns.add(fqn)

        let content = ''
        content += `package ${type.getPackageName()};\n`
        content += '\n'
        let importedNames = new Set<string>()
        javaWriter.imports.forEach((value, type) => importedNames.add(type.getFullyQualifiedName(null)))
        let sortedImportedNames: string[] = []
        importedNames.forEach(name => sortedImportedNames.push(name))
        sortedImportedNames = sortedImportedNames.sort()
        sortedImportedNames.forEach(name => content += `import ${name};\n`)
        content += '\n'
        content += flow.content()

        let fileDirectory = path.join(baseDirectory, type.getPackageName().replace(new RegExp('\\.', 'g'), '/'))
        mkdirRec(fileDirectory)

        let fileName = path.join(fileDirectory, `${type.getSimpleName(null)}.java`)
        fs.writeFileSync(fileName, content, 'utf8')
    }

    /**
     * Method exportation
     */

    private formalParameterJavaString(parameter: PreJavaTypeFormalParameter, javaWriter: JavaWriter) {
        let noAutoBox = false
        if (parameter.type == BuiltIn.BUILTIN_TYPE_NUMBER || parameter.type instanceof PreJavaTypeParameter) {
            javaWriter.importType(this.DO_NOT_AUTOBOX)
            noAutoBox = true
        }

        return `${noAutoBox ? '@DoNotAutobox ' : ''}${javaWriter.importTypeParametrized(parameter.type)}${parameter.dotdotdot ? '... ' : ''} ${parameter.name}${parameter.optional ? ' /* optional */' : ''}`
    }

    private exportClassLikeUnionMethodAsUnionedType(unionedType: PreJavaType, javaWriter: JavaWriter, flow: TextFlow) {
        javaWriter.importType(this.JS_OVERLAY)

        flow.push(`@JsOverlay`).finishLine()
        flow.push(`public final ${javaWriter.importTypeParametrized(unionedType)} as${unionedType.getHumanizedName(null)}() {`).finishLine()
        flow.pushLineStart('    ')
        flow.push(`return Js.uncheckedCast( this );`).finishLine()
        flow.pullLineStart()
        flow.push(`}`).finishLine()
        flow.finishLine()
    }

    private exportClassLikeUnionMethodOfUnionedType(unionType: PreJavaTypeUnion, unionedType: PreJavaType, javaWriter: JavaWriter, flow: TextFlow) {
        javaWriter.importType(this.JS_OVERLAY)

        let parameter: PreJavaTypeFormalParameter = {
            name: 'value',
            type: unionedType,
            dotdotdot: false,
            optional: false
        }

        flow.push(`@JsOverlay`).finishLine()
        flow.push(`public static ${this.getParametrizationWithConstraints(unionType, javaWriter)} ${unionType.getParametrizedSimpleName(null)} of${unionedType.getHumanizedName(null)}(${this.formalParameterJavaString(parameter, javaWriter)}) {`).finishLine()
        flow.pushLineStart('    ')
        flow.push(`return Js.uncheckedCast( value );`).finishLine()
        flow.pullLineStart()
        flow.push(`}`).finishLine()
        flow.finishLine()
    }

    private exportInterfaceLikeUnionMethodAsUnionedType(unionedType: PreJavaType, javaWriter: JavaWriter, flow: TextFlow) {
        javaWriter.importType(this.JS_OVERLAY)

        flow.push(`@JsOverlay`).finishLine()
        flow.push(`default ${javaWriter.importTypeParametrized(unionedType)} as${unionedType.getHumanizedName(null)}() {`).finishLine()
        flow.pushLineStart('    ')
        flow.push(`return Js.cast( this );`).finishLine()
        flow.pullLineStart()
        flow.push(`}`).finishLine()
        flow.finishLine()
    }

    private getParametrizationWithConstraints(unionType: PreJavaTypeUnion, javaWriter: JavaWriter) {
        if (!unionType.typeParameters || !unionType.typeParameters.length)
            return ''

        return `<${unionType.typeParameters.map(tp => this.typeParameterString(tp, javaWriter)).join(', ')}>`
    }

    private exportInterfaceLikeUnionMethodOfUnionedType(unionType: PreJavaTypeUnion, unionedType: PreJavaType, javaWriter: JavaWriter, flow: TextFlow) {
        javaWriter.importType(this.JS_OVERLAY)

        let parameter: PreJavaTypeFormalParameter = {
            name: 'value',
            type: unionedType,
            dotdotdot: false,
            optional: false
        }

        flow.push(`@JsOverlay`).finishLine()
        flow.push(`static ${this.getParametrizationWithConstraints(unionType, javaWriter)} ${unionType.getParametrizedSimpleName(null)} of${unionedType.getHumanizedName(null)}(${this.formalParameterJavaString(parameter, javaWriter)}) {`).finishLine()
        flow.pushLineStart('    ')
        flow.push(`return Js.cast( value );`).finishLine()
        flow.pullLineStart()
        flow.push(`}`).finishLine()
        flow.finishLine()
    }

    private exportJsFunctionCallMethod(method: PreJavaTypeCallSignature, javaWriter: JavaWriter, flow: TextFlow) {
        if (method.typeParameters && method.typeParameters.length)
            flow.push(`<${method.typeParameters.map(tp => tp.name).join(', ')}> `)
        flow.push(`${javaWriter.importTypeParametrized(method.returnType)} call(`)
        if (method.parameters)
            flow.push(method.parameters.map(p => this.formalParameterJavaString(p, javaWriter)).join(', '))
        flow.push(`);`).finishLine()
    }

    private exportNumberIndexSetterMethod(nit: PreJavaType, isClass: boolean, javaWriter: JavaWriter, flow: TextFlow) {
        javaWriter.importType(this.JS_OVERLAY)
        javaWriter.importType(this.JS)

        let parameter: PreJavaTypeFormalParameter = {
            name: 'value',
            type: nit,
            dotdotdot: false,
            optional: false
        }

        flow.blankLine()
        flow.push(`@JsOverlay`).finishLine()
        flow.push(`${isClass ? 'public final' : 'default'} void setByIndex(int index, ${this.formalParameterJavaString(parameter, javaWriter)}) {`).finishLine()
        flow.pushLineStart('    ')
        flow.push(`Js.asArrayLike(this).setAt(index, value);`).finishLine()
        flow.pullLineStart()
        flow.push(`}`).finishLine()
    }

    private exportNumberIndexGetterMethod(nit: PreJavaType, isClass: boolean, javaWriter: JavaWriter, flow: TextFlow) {
        javaWriter.importType(this.JS_OVERLAY)
        javaWriter.importType(this.JS)

        flow.blankLine()
        flow.push(`@JsOverlay`).finishLine()
        flow.push(`${isClass ? 'public final' : 'default'} ${javaWriter.importTypeParametrized(nit)} getByIndex(int index) {`).finishLine()
        flow.pushLineStart('    ')
        flow.push(`return (${javaWriter.importTypeParametrized(nit)}) Js.asArrayLike(this).getAt(index);`).finishLine()
        flow.pullLineStart()
        flow.push(`}`).finishLine()
    }

    private exportStringIndexSetterMethod(sit: PreJavaType, isClass: boolean, javaWriter: JavaWriter, flow: TextFlow) {
        javaWriter.importType(this.JS_OVERLAY)
        javaWriter.importType(this.JS)

        let parameter: PreJavaTypeFormalParameter = {
            name: 'value',
            type: sit,
            dotdotdot: false,
            optional: false
        }

        flow.blankLine()
        flow.push(`@JsOverlay`).finishLine()
        flow.push(`${isClass ? 'public final' : 'default'} void setByIndex(String index, ${this.formalParameterJavaString(parameter, javaWriter)}) {`).finishLine()
        flow.pushLineStart('    ')
        flow.push(`Js.asPropertyMap(this).set(index, value);`).finishLine()
        flow.pullLineStart()
        flow.push(`}`).finishLine()
    }

    private exportStringIndexGetterMethod(sit: PreJavaType, isClass: boolean, javaWriter: JavaWriter, flow: TextFlow) {
        javaWriter.importType(this.JS_OVERLAY)
        javaWriter.importType(this.JS)

        flow.blankLine()
        flow.push(`@JsOverlay`).finishLine()
        flow.push(`${isClass ? 'public final' : 'default'} ${javaWriter.importTypeParametrized(sit)} getByIndex(String index) {`).finishLine()
        flow.pushLineStart('    ')
        flow.push(`return (${javaWriter.importTypeParametrized(sit)}) Js.asPropertyMap(this).get(index);`).finishLine()
        flow.pullLineStart()
        flow.push(`}`).finishLine()
    }

    private exportStaticMethod(method: PreJavaTypeCallSignature, type: PreJavaTypeClassOrInterface, javaWriter: JavaWriter, flow: TextFlow) {
        flow.blankLine()

        if (method.comments && method.comments.length) {
            flow.startJavaDocComments()
            flow.push(method.comments)
            flow.endJavaDocComments()
        }

        let escapedMethodName = method.name
        if (type.methods && type.methods.some(m => m.name == escapedMethodName))
            escapedMethodName = '_' + escapedMethodName
        escapedMethodName = typeTools.escapePropertyName(escapedMethodName)
        let methodNamespace = type.jsNamespace ? (type.jsNamespace + '.' + type.jsName) : type.jsName
        if (!methodNamespace)
            javaWriter.importType(this.JS_PACKAGE)

        javaWriter.importType(this.JS_METHOD)
        flow.push(`@JsMethod(namespace=${methodNamespace ? ('"' + methodNamespace + '"') : 'JsPackage.GLOBAL'}, name = "${method.name}")`).finishLine()
        flow.push(`public static native `)
        let typeParameters = method.typeParameters
        if (typeParameters && typeParameters.length)
            flow.push(`<${typeParameters.map(tp => this.typeParameterString(tp, javaWriter)).join(', ')}> `)
        flow.push(`${javaWriter.importTypeParametrized(method.returnType)} ${escapedMethodName}(`)
        if (method.parameters)
            flow.push(method.parameters.map(p => this.formalParameterJavaString(p, javaWriter)).join(', '))
        flow.push(`);`).finishLine()
    }

    private exportClassMethod(method: PreJavaTypeCallSignature, type: PreJavaTypeClassOrInterface, isClass: boolean, javaWriter: JavaWriter, flow: TextFlow) {
        if (method.comments && method.comments.length) {
            flow.startJavaDocComments()
            flow.push(method.comments)
            flow.endJavaDocComments()
        }

        if (method.jsMethodName) {
            if (method.name != method.jsMethodName) {
                javaWriter.importType(this.JS_METHOD)
                flow.push(`@JsMethod(name = "${method.jsMethodName}")`).finishLine()
            }
        }

        if (method.jsPropertyName) {
            javaWriter.importType(this.JS_PROPERTY)
            flow.push(`@JsProperty(name = "${method.jsPropertyName}")`).finishLine()
        }

        flow.push(`${isClass ? 'public native ' : ''}`)

        if (method.typeParameters && method.typeParameters.length)
            flow.push(`<${method.typeParameters.map(tp => this.typeParameterString(tp, javaWriter)).join(', ')}> `)

        flow.push(`${javaWriter.importTypeParametrized(method.returnType)} ${method.name}(`)

        if (method.parameters)
            flow.push(method.parameters.map(p => this.formalParameterJavaString(p, javaWriter)).join(', '))

        flow.push(`);`).finishLine()
    }
}