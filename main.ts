import * as fs from "fs";
import * as path from "path";
import * as ts from "typescript";

/**
 * TODO
 *
 * - Interfaces
 * - TypeParameters
 * - Enums
 * - Callable
 * - new operator
 *
 * - generate multiple method signatures when optional parameters
 */

function properties(obj) {
    if (obj == null)
        return []

    let res = Object.getOwnPropertyNames(obj)

    properties(obj.prototype).forEach(p => res.push(p))

    return res
}


function delintNode(node: ts.Node, space: string) {
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

            text = `PROPERTY ${propertyDeclaration.type && getTypeName(propertyDeclaration.type)} ${propertyDeclaration.name.toString()}`
            break
    }

    console.log(`${space}${text} kind ${ts.SyntaxKind[node.kind]}`)

    ts.forEachChild(node, child => delintNode(child, ' ' + space));
}

export function delint(sourceFile: ts.SourceFile) {
    delintNode(sourceFile, '');

}

let walkSync = function (dir, filelist = []) {
    let files = fs.readdirSync(dir);
    filelist = filelist || [];
    files.forEach(function (file) {
        if (fs.statSync(path.join(dir, file)).isDirectory()) {
            filelist = walkSync(path.join(dir, file), filelist);
        }
        else {
            filelist.push(path.join(dir, file));
        }
    });
    return filelist;
};

//const fileNames = process.argv.slice(2);
//fileNames.forEach(fileName => {
let files = walkSync("./tests")

let program = ts.createProgram(files, ts.getDefaultCompilerOptions())

let addExportableNodes = (sourceFile: ts.SourceFile, exportedNodes: ts.Node[]): void => {
    ts.forEachChild(sourceFile, (node) => {
        switch (node.kind) {
            case ts.SyntaxKind.InterfaceDeclaration:
            case ts.SyntaxKind.ClassDeclaration:
            case ts.SyntaxKind.MethodDeclaration:
            case ts.SyntaxKind.PropertyDeclaration:
                if (node.modifiers && node.modifiers.filter(e => e.kind == ts.SyntaxKind.ExportKeyword).length > 0) {
                    (<any>node).sourceFile = sourceFile
                    exportedNodes.push(node)

                    delintNode(node, '')
                }
                break;
        }
    })
}

let exportedNodes: ts.Node[] = []

files.map(file => program.getSourceFile(file))
    .forEach(sf => {
        // find exported classes
        console.log(`SOURCE FILE ${sf.fileName}, ${sf.languageVariant}, ${sf.languageVersion}`)
        //if (sf.fileName.indexOf('view_container_ref.d.ts') > 0)
        //if (sf.fileName.indexOf('common_module.d.ts') > 0)
        addExportableNodes(sf, exportedNodes)
    })

exportedNodes.forEach((node: ts.Node) => {
    switch (node.kind) {
        case ts.SyntaxKind.InterfaceDeclaration:
        case ts.SyntaxKind.ClassDeclaration: {
            let declaration: ts.InterfaceDeclaration|ts.ClassDeclaration = <ts.InterfaceDeclaration>node
            let className = declaration.name.text
            console.log(`${className}`)

            let relative = path.relative(program.getCurrentDirectory(), (<any>node).sourceFile.fileName)

            let content = ''
            content += `package fr.lteconsulting.angular2gwt.client.interop.ng.core;\n`
            content += `\n`
            content += `import jsinterop.annotations.JsType;\n`
            content += `\n`
            content += `/**\n`
            content += `  * Generated from ${relative}\n`
            content += `  **/\n`
            if (node.kind == ts.SyntaxKind.ClassDeclaration)
                content += `@JsType( isNative=true, namespace="ng.core" )\n`
            else
                content += `@JsType( isNative=true, name="Object", namespace=JsPackage.GLOBAL )\n`

            let classChildren = getChildren(node)
            let typeParameters = classChildren.filter(c => c.kind == ts.SyntaxKind.TypeParameter)
                .map(c => getChildren(c)[0])
                .map(i => (<ts.Identifier>i).text)

            let heritage = null
            classChildren.filter(c => c.kind == ts.SyntaxKind.HeritageClause)
                .forEach((clause: ts.HeritageClause) => {
                    let expression = <ts.ExpressionWithTypeArguments>getFirstChild(clause)
                    heritage = getTypeName(expression)
                })

            content += `public class ${className}${typeParameters.length > 0 ? `<${typeParameters.join()}>` : ''} ${heritage ? ('extends ' + heritage) : ''} {\n`

            ts.forEachChild(node, (child: ts.Node) => {
                switch (child.kind) {
                    case ts.SyntaxKind.Constructor:
                    case ts.SyntaxKind.MethodDeclaration:
                    case ts.SyntaxKind.MethodSignature: {
                        let methodDeclaration = <ts.MethodDeclaration|ts.MethodSignature>child
                        let methodName = child.kind == ts.SyntaxKind.Constructor ? className : getPropertyName(methodDeclaration.name)

                        let info = getMethodInformation(methodDeclaration)

                        let tp = ''
                        if (info.typeParameters.length > 0) {
                            tp = ` <${info.typeParameters.join()}>`
                        }

                        let optional = false
                        if (methodDeclaration.kind == ts.SyntaxKind.MethodSignature)
                            optional = methodDeclaration.questionToken != null

                        if (child.kind == ts.SyntaxKind.Constructor)
                            content += `    @JsContructor\n    public ${className}(${info.parameters.join()}) {}\n`
                        else
                            content += `    public${info.isStatic ? ' static' : ''} native${tp}${optional ? ' /* optional */' : ''} ${info.returnType} ${methodName}(${info.parameters.join()});\n`
                        break
                    }

                    case ts.SyntaxKind.PropertyDeclaration: {
                        let propertyDeclaration = <ts.PropertyDeclaration>child
                        let propertyName = getPropertyName(propertyDeclaration.name)

                        let isStatic = getChildren(propertyDeclaration).filter(c => c.kind == ts.SyntaxKind.StaticKeyword).length > 0

                        let typeName = propertyDeclaration.type ? getTypeName(propertyDeclaration.type) : 'Object'
                        content += `    public${isStatic ? ' static' : ''} ${typeName} ${propertyName};\n`
                        break
                    }

                    case ts.SyntaxKind.PropertySignature: {
                        let signature = <ts.PropertySignature>child
                        let name = getPropertyName(signature.name)

                        let typeName = signature.type ? getTypeName(signature.type) : 'Object'
                        content += `    public${signature.questionToken ? ' /* optional */' : ''} ${typeName} ${name};\n`
                        break
                    }

                    case ts.SyntaxKind.ExportKeyword:
                    case ts.SyntaxKind.DeclareKeyword:
                    case ts.SyntaxKind.Identifier:
                    case ts.SyntaxKind.HeritageClause:
                        break

                    default:
                        content += `    // ignored ${ts.SyntaxKind[child.kind]}\n`
                }
            });

            content += `}\n`

            let fileName = path.join('out', `${className}.java`)
            fs.writeFileSync(fileName, content, 'utf8')
            break
        }

        default:
            console.log(`(${node.name.text})`)
    }
})

function getMethodInformation(method: ts.MethodDeclaration|ts.MethodSignature|ts.ConstructorDeclaration) {
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
                    info.parameters.push(`${getTypeName(paramChilds[1])} ${(<ts.Identifier>paramChilds[0]).text}`)
                }
                else if (paramChilds.length == 3) {
                    info.parameters.push(`${getTypeName(paramChilds[2])} /* optional */ ${(<ts.Identifier>paramChilds[0]).text}`)
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
                info.returnType = getTypeName(child)
                break

            default:
                console.log(`OUPS ${ts.SyntaxKind[child.kind]}`)
                delintNode(child, `~~ OUPS ${ts.SyntaxKind[child.kind]} ~~`)
        }
    }

    return info
}

function getTypeReferenceName(ref: ts.Node) {
    if (ref.kind == ts.SyntaxKind.StringKeyword)
        return "String"

    let typeChildren = getChildren(ref)
    if (typeChildren && typeChildren.length > 0) {
        return getEntityName(typeChildren[0])
        //if (typeChildren[0].kind == ts.SyntaxKind.Identifier)
        //    return (<ts.Identifier>typeChildren[0]).text
    }
}

function getArrayTypeName(ref: ts.Node) {
    let typeChildren = getChildren(ref)
    if (typeChildren && typeChildren.length > 0) {
        return `JsArray<${getTypeName(typeChildren[0])}>`
    }
}

function getChildren(node: ts.Node) {
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

function getTypeName(type: ts.Node) {
    switch (type.kind) {
        case ts.SyntaxKind.TypeReference:
            if ((<ts.TypeReferenceNode>type).typeArguments)
                return getEntityName((<ts.TypeReferenceNode>type).typeName) + `<${(<ts.TypeReferenceNode>type).typeArguments.map(t => getTypeName(t)).join()}>`
            else
                return getEntityName((<ts.TypeReferenceNode>type).typeName)
        case ts.SyntaxKind.NumberKeyword:
            return "int" // TODO should be also double sometimes... (maybe use the property name to guess that...)
        case ts.SyntaxKind.ObjectKeyword:
        case ts.SyntaxKind.AnyKeyword:
            return "Object"
        case ts.SyntaxKind.BooleanKeyword :
            return "boolean"
        case ts.SyntaxKind.StringKeyword:
            return "String"
        case ts.SyntaxKind.VoidKeyword:
            return "void"
        case ts.SyntaxKind.UnionType :
            return "Object /* UnionType */"
        case ts.SyntaxKind.ArrayType :
            return getArrayTypeName(type)
        case ts.SyntaxKind.ExpressionWithTypeArguments: {
            let expression = <ts.ExpressionWithTypeArguments>type
            if (expression.typeArguments && expression.typeArguments.length > 0)
                return (<ts.Identifier>getFirstChild(type)).text + `<${expression.typeArguments.map(a => getTypeName(a)).join()}>`
            else
                return (<ts.Identifier>getFirstChild(type)).text
        }
        case ts.SyntaxKind.TupleType: {
            let child = getChildren(type)
            if (getTypeName(child[0]) == getTypeName(child[1]))
                return `JsArray<${getTypeName(child[0])}> /* Tuple [${getTypeName(child[0])}, ${getTypeName(child[1])}] */`
            else
                return `JsArray<Object> /* Tuple [${getTypeName(child[0])}, ${getTypeName(child[1])}] */`
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

/*program.getSourceFiles().forEach(sf => {
 console.log(`SOURCE FILE ${sf.fileName}, ${sf.languageVariant}, ${sf.languageVersion}`)
 if (sf.fileName.indexOf('view_container_ref.d.ts') > 0)
 delint(sf)
 })*/

//let sourceFile: SourceFile = ts.createSourceFile(fileName, readFileSync(fileName).toString(), ts.ScriptTarget.ES2016, /*setParentNodes */ true);
//delint(sourceFile);
//});