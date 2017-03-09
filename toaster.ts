import * as ts from "typescript"
import * as path from "path"
import * as fs from "fs"
import {AnimationEntryAst} from "./tests/@angular/compiler/src/animation/animation_ast";

export interface ExportedNodeInformation {
    node: ts.InterfaceDeclaration|ts.ClassDeclaration|ts.EnumDeclaration|ts.TypeAliasDeclaration;
    sourceFile: ts.SourceFile;
    package: string;
    name: string;
    symbol: ts.Symbol;
    type: ts.Type;
    isEnum: boolean;
    isInterface: boolean;
}

export enum JavaArtifactKind{
    JavaClass,
    JavaInterface,
    JavaEnum
}

export class JavaArtifactToaster {
    exportArtifact(exportedNode: ExportedNodeInformation, baseDirectory: string, typeChecker: ts.TypeChecker, exportedNodes: ExportedNodeInformation[]) {
        let className = exportedNode.node.name.text
        console.log(`${className}`)

        let imports: {[key: string]: any} = {}

        let relative = path.relative(baseDirectory, exportedNode.sourceFile.fileName)

        let content = ''
        content += `\n`
        content += `/**\n`
        content += `  * Generated from ${relative}\n`
        content += `  * Package ${exportedNode.package}\n`
        content += `  * Name ${exportedNode.symbol.getName()}\n`
        content += `  * ${exportedNode.symbol.getDocumentationComment().map(sdp => sdp.text).join().replace(new RegExp('\n', 'g'), '\n  * ')}\n`
        content += `  **/\n`

        if (exportedNode.node.kind == ts.SyntaxKind.EnumDeclaration) {
            content += `public interface ${className} {\n`

            let members = getChildren(exportedNode.node).filter(c => c.kind == ts.SyntaxKind.EnumMember)
            members.forEach(member => {
                let child = getChildren(member)
                if (child.length == 2 && child[0].kind == ts.SyntaxKind.Identifier && child[1].kind == ts.SyntaxKind.FirstLiteralToken)
                    content += `    final int ${(<ts.Identifier>child[0]).text} = ${(<ts.LiteralExpression>child[1]).text};\n`
            })
        } else {
            if (exportedNode.node.kind == ts.SyntaxKind.ClassDeclaration) {
                content += `@JsType( isNative=true, namespace="${exportedNode.package}" )\n`
            }
            else if (exportedNode.node.kind == ts.SyntaxKind.InterfaceDeclaration || exportedNode.node.kind == ts.SyntaxKind.TypeAliasDeclaration) {
                content += `@JsType( isNative=true, name="Object", namespace=JsPackage.GLOBAL )\n`

                imports['jsinterop.annotations.JsPackage'] = true
            }

            let classChildren = getChildren(exportedNode.node)
            let typeParameters = classChildren.filter(c => c.kind == ts.SyntaxKind.TypeParameter)
                .map(c => getChildren(c)[0])
                .map(i => (<ts.Identifier>i).text)

            let heritage = null
            classChildren.filter(c => c.kind == ts.SyntaxKind.HeritageClause)
                .forEach((clause: ts.HeritageClause) => {
                    let expression = <ts.ExpressionWithTypeArguments>getFirstChild(clause)
                    heritage = getTypeName(expression, typeChecker, exportedNodes, imports, false)
                })

            if (exportedNode.isInterface)
                content += `public interface ${className}${typeParameters.length > 0 ? `<${typeParameters.join()}>` : ''} ${heritage ? ('extends ' + heritage) : ''} {\n`
            else
                content += `public class ${className}${typeParameters.length > 0 ? `<${typeParameters.join()}>` : ''} ${heritage ? ('extends ' + heritage) : ''} {\n`

            ts.forEachChild(exportedNode.node, (child: ts.Node) => {
                //let internalSymbol = typeChecker.getSymbolAtLocation(child)
                //if (internalSymbol && internalSymbol.getDocumentationComment() && internalSymbol.getDocumentationComment().length > 0) {
                //    content += `    /**\n`
                //    content += `      * ${internalSymbol.getDocumentationComment().map(sdp => sdp.text).join().replace(new RegExp('\n', 'g'), '\n      * ')}\n`
                //    content += `      */\n`
                //}

                switch (child.kind) {
                    case ts.SyntaxKind.Constructor:
                    case ts.SyntaxKind.MethodDeclaration:
                    case ts.SyntaxKind.MethodSignature: {
                        let methodDeclaration = <ts.MethodDeclaration|ts.MethodSignature>child
                        let methodName = child.kind == ts.SyntaxKind.Constructor ? className : getPropertyName(methodDeclaration.name)

                        let info = getMethodInformation(methodDeclaration, typeChecker, exportedNodes, imports, className)

                        let tp = ''
                        if (info.typeParameters.length > 0) {
                            tp = `<${info.typeParameters.join()}>`
                        }

                        let optional = false
                        if (methodDeclaration.kind == ts.SyntaxKind.MethodSignature)
                            optional = methodDeclaration.questionToken != null

                        if (child.kind == ts.SyntaxKind.Constructor) {
                            imports['jsinterop.annotations.JsConstructor'] = true
                            content += `    @JsConstructor\n    public ${className}(${info.parameters.join()}) {}\n`
                        }
                        else {
                            let methodPrefix = exportedNode.isInterface ? '' : `public${info.isStatic ? ' static' : ''} native `
                            content += `    ${methodPrefix}${tp}${optional ? ' /* optional */' : ''} ${info.returnType} ${methodName}(${info.parameters.join()});\n`
                        }
                        break
                    }

                    case ts.SyntaxKind.PropertyDeclaration: {
                        let propertyDeclaration = <ts.PropertyDeclaration>child
                        let propertyName = getPropertyName(propertyDeclaration.name)
                        let isStatic = getChildren(propertyDeclaration).find(c => c.kind == ts.SyntaxKind.StaticKeyword) != null
                        let typeName = propertyDeclaration.type ? getTypeName(propertyDeclaration.type, typeChecker, exportedNodes, imports, false) : 'Object'

                        if (exportedNode.isInterface) {
                            imports['jsinterop.annotations.JsProperty'] = true

                            content += `    @JsProperty(name="${propertyName}")\n`
                            content += `    ${isStatic ? 'static ' : ''}${typeName} ${propertyName}();\n`
                            content += `    @JsProperty(name="${propertyName}")\n`
                            content += `    ${isStatic ? 'static ' : ''}void ${propertyName}(${typeName} value);\n`
                        }
                        else {
                            content += `    public${isStatic ? ' static' : ''} ${typeName} ${propertyName};\n`
                        }
                        break
                    }

                    case ts.SyntaxKind.PropertySignature: {
                        let signature = <ts.PropertySignature>child
                        let name = getPropertyName(signature.name)
                        let typeName = signature.type ? getTypeName(signature.type, typeChecker, exportedNodes, imports, false) : 'Object'

                        if (exportedNode.isInterface) {
                            imports['jsinterop.annotations.JsProperty'] = true

                            content += `    public${signature.questionToken ? ' /* optional */' : ''} ${typeName} ${name};\n`

                            content += `    @JsProperty(name="${name}")\n`
                            content += `    ${typeName} ${name}();\n`
                            content += `    @JsProperty(name="${name}")\n`
                            content += `    void ${name}(${typeName} value);\n`
                        } else {
                            content += `    public${signature.questionToken ? ' /* optional */' : ''} ${typeName} ${name};\n`
                        }
                        break
                    }

                    case ts.SyntaxKind.ExportKeyword:
                    case ts.SyntaxKind.DeclareKeyword:
                    case ts.SyntaxKind.Identifier:
                    case ts.SyntaxKind.HeritageClause:
                    case ts.SyntaxKind.AbstractKeyword:
                    case ts.SyntaxKind.TypeParameter:
                        break

                    default:
                        content += `    // ignored ${ts.SyntaxKind[child.kind]}\n`
                }
            });
        }

        content += `}\n`

        let prepend = `package fr.lteconsulting.angular2gwt.client.interop.${exportedNode.package};\n`
            + `\n`
            + `import jsinterop.annotations.JsType;\n`

        for (let i in imports) {
            let ip = i.substr(0, i.lastIndexOf('.'))
            if (ip != exportedNode.package)
                prepend += `import ${i};\n`
        }

        content = prepend + content

        mkdirRec(path.join('out', exportedNode.package.replace(new RegExp('\\.', 'g'), '/')))

        let fileName = path.join('out', exportedNode.package.replace(new RegExp('\\.', 'g'), '/'), `${className}.java`)
        fs.writeFileSync(fileName, content, 'utf8')
    }
}


function getMethodInformation(method: ts.MethodDeclaration|ts.MethodSignature|ts.ConstructorDeclaration, typeChecker: ts.TypeChecker, exportedNodes: ExportedNodeInformation[], imports: {[key: string]: any}, containerName: string) {
    let info = {
        returnType: 'void',
        name: null,
        typeParameters: [],
        parameters: [],
        isStatic: false
    }

    let children: ts.Node[] = getChildren(method)

    for (let child of children) {
        switch (child.kind) {
            case ts.SyntaxKind.StaticKeyword :
                info.isStatic = true
                break

            case ts.SyntaxKind.AbstractKeyword :
            case ts.SyntaxKind.PrivateKeyword :
            case ts.SyntaxKind.ProtectedKeyword:
                break

            case ts.SyntaxKind.Identifier:
                info.name = (<ts.Identifier> child).text
                break

            case ts.SyntaxKind.TypeParameter:
                info.typeParameters.push((<ts.Identifier>getChildren(child)[0]).text)
                break

            case ts.SyntaxKind.Parameter: {
                // child 0 : name (Identifier)
                // child 1 : type
                let paramChilds = getChildren(child)
                if (paramChilds.length == 2) {
                    info.parameters.push(`${getTypeName(paramChilds[1], typeChecker, exportedNodes, imports, false)} ${(<ts.Identifier>paramChilds[0]).text}`)
                }
                else if (paramChilds.length == 3) {
                    info.parameters.push(`${getTypeName(paramChilds[2], typeChecker, exportedNodes, imports, false)} /* optional */ ${(<ts.Identifier>paramChilds[0]).text}`)
                }
                break
            }

            case ts.SyntaxKind.VoidKeyword:
            case ts.SyntaxKind.NumberKeyword:
            case ts.SyntaxKind.BooleanKeyword:
            case ts.SyntaxKind.StringKeyword:
            case ts.SyntaxKind.AnyKeyword:
            case ts.SyntaxKind.UnionType :
            case ts.SyntaxKind.TypeReference:
            case ts.SyntaxKind.ArrayType :
            case ts.SyntaxKind.TupleType:
            case ts.SyntaxKind.TypeLiteral:
            case ts.SyntaxKind.FunctionType:
            case ts.SyntaxKind.ParenthesizedType:
                info.returnType = getTypeName(child, typeChecker, exportedNodes, imports, false)
                break

            case ts.SyntaxKind.ThisType:
                info.returnType = containerName
                break

            default:
                debugNode(method, `~~ Ignored in method: ${ts.SyntaxKind[child.kind]} ~~`)
        }
    }

    return info
}

export function getChildren(node: ts.Node) {
    let res = []
    ts.forEachChild(node, child => {
        res.push(child)
    })
    return res
}

function getFirstChild(node: ts.Node) {
    return getChildren(node)[0]
}

function getEntityName(entity: ts.EntityName) {
    switch (entity.kind) {
        case ts.SyntaxKind.Identifier:
            return (<ts.Identifier>entity).text
        case ts.SyntaxKind.QualifiedName:
            return getEntityName((<ts.QualifiedName>entity).right)
    }
}

function getTypeName(type: ts.Node, typeChecker: ts.TypeChecker, exportedNodes: ExportedNodeInformation[], imports: {[key: string]: any} = {}, needBoxedType: boolean): string {
    switch (type.kind) {
        case ts.SyntaxKind.ParenthesizedType:
            return getTypeName((<ts.ParenthesizedTypeNode>type).type, typeChecker, exportedNodes, imports, needBoxedType)

        case ts.SyntaxKind.TypeLiteral: {
            let typeLiteral = <ts.TypeLiteralNode>type

            if (typeLiteral.members && typeLiteral.members.length > 0 && typeLiteral.members[0].kind == ts.SyntaxKind.IndexSignature) {
                //if (getChildren(type).length > 0 && getFirstChild(type).kind == ts.SyntaxKind.IndexSignature) {
                let indexSignature = <ts.IndexSignatureDeclaration> getFirstChild(type)
                let keyType = indexSignature.parameters[0].type
                let valueType = indexSignature.type

                let nameToImport = `fr.lteconsulting.angular2gwt.client.JsTypedObject`
                if (!(nameToImport in imports))
                    imports[nameToImport] = true

                return `JsTypedObject<${getTypeName(keyType, typeChecker, exportedNodes, imports, true)},${getTypeName(valueType, typeChecker, exportedNodes, imports, true)}>`
            }

            debugNode(type, `not implemented TypeLiteral`)
            return "/* TypeLiteral */ Object"
        }

        case ts.SyntaxKind.TypeReference: {
            let typeReference = <ts.TypeReferenceNode>type
            let refType = typeChecker ? typeChecker.getTypeFromTypeNode(typeReference) : null
            let prefix = ''
            if (exportedNodes && refType && refType.symbol) {
                let referencedExportedNode = exportedNodes.find(n => n.symbol == refType.symbol)
                if (referencedExportedNode) {
                    if (referencedExportedNode.isEnum)
                        return `/* ${referencedExportedNode.package}.${referencedExportedNode.name} */ int`

                    let nameToImport = `${referencedExportedNode.package}.${referencedExportedNode.name}`
                    if (!(nameToImport in imports))
                        imports[nameToImport] = true
                }
            }
            else {
                prefix = `/* NO SYMBOL */`
                debugNode(typeReference, "==[ NOT FOUND SYMBOL ON TYPE REFERENCE ]==")
            }

            if (typeReference.typeArguments)
                return prefix + getEntityName(typeReference.typeName) + `<${typeReference.typeArguments.map(t => getTypeName(t, typeChecker, exportedNodes, imports, true)).join()}>`
            else
                return prefix + getEntityName(typeReference.typeName)
        }
        case ts.SyntaxKind.NumberKeyword:
            return needBoxedType ? "Integer" : "int" // TODO should be also double sometimes... (maybe use the property name to guess that...)
        case ts.SyntaxKind.ObjectKeyword:
        case ts.SyntaxKind.AnyKeyword:
            return "Object"
        case ts.SyntaxKind.BooleanKeyword :
            return needBoxedType ? "Boolean" : "boolean"
        case ts.SyntaxKind.StringKeyword:
            return "String"
        case ts.SyntaxKind.VoidKeyword:
            return needBoxedType ? "Void" : "void"
        case ts.SyntaxKind.UnionType :
            return "Object /* UnionType */"
        case ts.SyntaxKind.ArrayType : {
            imports['fr.lteconsulting.angular2gwt.client.JsArray'] = true
            let typeChildren = getChildren(type)
            if (typeChildren && typeChildren.length > 0) {
                return `JsArray<${getTypeName(typeChildren[0], typeChecker, exportedNodes, imports, true)}>`
            }
            return 'JsArray<Object>'
        }
        case ts.SyntaxKind.ExpressionWithTypeArguments: {
            let expression = <ts.ExpressionWithTypeArguments>type
            if (expression.typeArguments && expression.typeArguments.length > 0)
                return (<ts.Identifier>getFirstChild(type)).text + `<${expression.typeArguments.map(a => getTypeName(a, typeChecker, exportedNodes, imports, true)).join()}>`
            else
                return (<ts.Identifier>getFirstChild(type)).text
        }
        case ts.SyntaxKind.TupleType: {
            imports['fr.lteconsulting.angular2gwt.client.JsArray'] = true
            let child = getChildren(type)
            if (getTypeName(child[0], typeChecker, exportedNodes, imports, needBoxedType) == getTypeName(child[1], typeChecker, exportedNodes, imports, needBoxedType))
                return `JsArray<${getTypeName(child[0], typeChecker, exportedNodes, imports, true)}> /* Tuple [${getTypeName(child[0], typeChecker, exportedNodes, imports, needBoxedType)}, ${getTypeName(child[1], typeChecker, exportedNodes, imports, needBoxedType)}] */`
            else
                return `JsArray<Object> /* Tuple [${getTypeName(child[0], typeChecker, exportedNodes, imports, needBoxedType)}, ${getTypeName(child[1], typeChecker, exportedNodes, imports, needBoxedType)}] */`
        }

        case ts.SyntaxKind.FunctionType: {
            let functionType = <ts.FunctionTypeNode>type

            let parameters = functionType.parameters
            let returnType = functionType.type

            let javaClassName = `JsFunction${parameters.length > 0 ? parameters.length : ''}`

            imports['fr.lteconsulting.angular2gwt.client.' + javaClassName] = true

            return `${javaClassName}<${parameters.map((p: ts.ParameterDeclaration) => getTypeName(p.type, typeChecker, exportedNodes, imports, true) + ',').join('')}${getTypeName(returnType, typeChecker, exportedNodes, imports, true)}>`
        }
    }

    return `UNKNOWN_TYPE_NAME_${ts.SyntaxKind[type.kind]}`
}

function getPropertyName(name: ts.PropertyName) {
    switch (name.kind) {
        case ts.SyntaxKind.Identifier:
            return name.text

        case ts.SyntaxKind.StringLiteral:
            return name.text

        case ts.SyntaxKind.NumericLiteral:
            return name.text

        case ts.SyntaxKind.ComputedPropertyName:
            return "[ComputedPropertyName]"
    }
}

export function debugNode(node: ts.Node, space: string) {
    let text = '*'

    switch (node.kind) {
        case ts.SyntaxKind.SourceFile:
            let t = <ts.SourceFile>node
            text = `SOURCE ${t.fileName}`
            break

        case ts.SyntaxKind.InterfaceDeclaration:
            text = 'INTERFACE ' + (<ts.InterfaceDeclaration>node).name.text;

            (<ts.InterfaceDeclaration>node).members
            break

        case ts.SyntaxKind.ClassDeclaration:
            let classDeclaration = <ts.ClassDeclaration>node

            let modifiers: ts.Modifier[] = classDeclaration.modifiers
            let elements: ts.ClassElement[] = classDeclaration.members
            text = `CLASS ${classDeclaration.name.text} modifiers: ${modifiers && modifiers.map(e => ts.SyntaxKind[e.kind]).join()}`
            break

        case ts.SyntaxKind.MethodDeclaration: {
            let methodDeclaration = <ts.MethodDeclaration>node

            let modifiers: ts.Modifier[] = methodDeclaration.modifiers
            text = `METHOD ${methodDeclaration.name.toString()} modifiers: ${modifiers && modifiers.map(e => ts.SyntaxKind[e.kind]).join()}`
            break
        }

        case ts.SyntaxKind.PropertyDeclaration:
            let propertyDeclaration = <ts.PropertyDeclaration>node

            text = `PROPERTY ${propertyDeclaration.type && getTypeName(propertyDeclaration.type, null, null, undefined, false)} ${propertyDeclaration.name.toString()}`
            break

        case ts.SyntaxKind.UnionType:
            let unionType = <ts.UnionTypeNode>node
            unionType.types
            break
    }

    console.log(`${space}${text} kind ${ts.SyntaxKind[node.kind]}`)

    ts.forEachChild(node, child => debugNode(child, ' ' + space));
}

function mkdirRec(p, opts = undefined, made = null) {
    if (!opts || typeof opts !== 'object') {
        opts = {mode: opts};
    }

    var mode = opts.mode;
    var xfs = opts.fs || fs;

    if (mode === undefined) {
        mode = 0x777 & (~process.umask());
    }
    if (!made) made = null;

    p = path.resolve(p);

    try {
        xfs.mkdirSync(p, mode);
        made = made || p;
    }
    catch (err0) {
        switch (err0.code) {
            case 'ENOENT' :
                made = mkdirRec(path.dirname(p), opts, made);
                mkdirRec(p, opts, made);
                break;

            // In the case of any other error, just see if there's a dir
            // there already.  If so, then hooray!  If not, then something
            // is borked.
            default:
                var stat;
                try {
                    stat = xfs.statSync(p);
                }
                catch (err1) {
                    throw err0;
                }
                if (!stat.isDirectory()) throw err0;
                break;
        }
    }

    return made;
};