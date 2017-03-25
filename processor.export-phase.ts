import * as Model from './model';
import * as ts from "typescript";
import * as path from "path";
import * as fs from "fs";
import {SyncPhase} from './processor.sync-phase';
import{TypeHelper} from './type-helper';

export class ExportPhase {
    constructor(private syncPhase: SyncPhase) {
    }

    exportNodes(program: ts.Program) {
        this.syncPhase.nodes.forEach((javaNodes, tsNode) => {
            javaNodes.forEach(javaNode => {
                switch (javaNode.kind) {
                    case Model.JavaNodeKind.Enum:
                        this.exportEnum(javaNode, program);
                        break;
                    case Model.JavaNodeKind.Class:
                        this.exportClass(javaNode, program);
                        break;
                    case Model.JavaNodeKind.InterfaceForClass:
                        this.exportInterfaceForClass(javaNode, program);
                        break;
                    case Model.JavaNodeKind.Interface:
                        this.exportInterface(javaNode, program);
                        break;
                }
            });
            /*
             let t: toaster.JavaArtifactToaster = new toaster.JavaArtifactToaster()
             t.exportArtifact(info, program.getCurrentDirectory(), program.getTypeChecker(), exportedNodes)
             */
        });
    }

    private exportClass(javaNode: Model.ClassNode, program: ts.Program) {
        let typeHelper = new TypeHelper(this.syncPhase, {});

        let className = javaNode.tsSymbol.name;
        let extendedJavaClass: string = null;
        let implementedJavaInterfaces: string[] = [];
        let typeParameters: string[] = [];

        let classType = javaNode.tsType as ts.InterfaceType;

        typeHelper.imports[`${javaNode.interfaceNode.packageName}.${javaNode.interfaceNode.name}`] = true;
        let interfaceForClassToken = javaNode.interfaceNode.name;

        classType.typeParameters && classType.typeParameters.forEach(typeParameter => {
            typeParameters.push(typeParameter.getSymbol().name);
        });

        if (typeParameters.length)
            interfaceForClassToken += `<${typeParameters.join(', ')}>`;
        implementedJavaInterfaces.push(interfaceForClassToken);

        console.log(`generate class ${className}`);

        let heritageClauses = (javaNode.tsSymbol.valueDeclaration as ts.ClassLikeDeclaration).heritageClauses;

        heritageClauses && heritageClauses && heritageClauses[1] && heritageClauses[1].types.forEach((implementedTypeNodeObject: ts.ExpressionWithTypeArguments) => {
            let implementedType = program.getTypeChecker().getTypeFromTypeNode(implementedTypeNodeObject);
            //let ttt = program.getTypeChecker().getTypeAtLocation(implementedTypeNodeObject);

            implementedJavaInterfaces.push(typeHelper.getTypeName(implementedType));
        });

        javaNode.tsType.getBaseTypes().forEach(baseType => {
            if (baseType.flags & ts.TypeFlags.Intersection) {
                console.log(`NOT YET IMPLEMENTED Intersection BaseType`);
                return;
            }

            if ((baseType as ts.ObjectType).objectFlags & ts.ObjectFlags.Class)
                extendedJavaClass = typeHelper.getTypeName(baseType, {requiresClass: true});
            else
                implementedJavaInterfaces.push(typeHelper.getTypeName(baseType));
        });

        this.exportJavaClassOrInterface(javaNode, typeParameters, extendedJavaClass, implementedJavaInterfaces, typeHelper, program);
    }

    private exportInterfaceForClass(javaNode: Model.InterfaceForClassNode, program: ts.Program) {
        let typeHelper = new TypeHelper(this.syncPhase, {
            'jsinterop.annotations.JsPackage': true
        });

        let interfaceName = javaNode.tsSymbol.name;
        let implementedJavaInterfaces: string[] = [];
        let typeParameters: string[] = [];

        let interfaceType = javaNode.tsType as ts.InterfaceTypeWithDeclaredMembers;

        interfaceType.typeParameters && interfaceType.typeParameters.forEach(typeParameter => {
            typeParameters.push(typeParameter.getSymbol().name);
        });

        console.log(`generate interface (for class) ${interfaceName}`);

        javaNode.tsType.getBaseTypes().forEach(baseType => {
            if (baseType.flags & ts.TypeFlags.Intersection) {
                console.log(`NOT YET IMPLEMENTED Intersection BaseType`);
                return;
            }

            implementedJavaInterfaces.push(typeHelper.getTypeName(baseType));
        });

        this.exportJavaClassOrInterface(javaNode, typeParameters, null, implementedJavaInterfaces, typeHelper, program);
    }

    private exportInterface(javaNode: Model.InterfaceNode, program: ts.Program) {
        let typeHelper = new TypeHelper(this.syncPhase, {
            'jsinterop.annotations.JsPackage': true
        });

        let interfaceName = javaNode.tsSymbol.name;
        let implementedJavaInterfaces: string[] = [];
        let typeParameters: string[] = [];

        let interfaceType = javaNode.tsType as ts.InterfaceTypeWithDeclaredMembers;

        interfaceType.typeParameters && interfaceType.typeParameters.forEach(typeParameter => {
            typeParameters.push(typeParameter.getSymbol().name);
        });

        console.log(`generate interface ${interfaceName}`);

        javaNode.tsType.getBaseTypes().forEach(baseType => {
            if (baseType.flags & ts.TypeFlags.Intersection) {
                console.log(`NOT YET IMPLEMENTED Intersection BaseType`);
                return;
            }

            implementedJavaInterfaces.push(typeHelper.getTypeName(baseType));
        });

        this.exportJavaClassOrInterface(javaNode, typeParameters, null, implementedJavaInterfaces, typeHelper, program);
    }

    private exportJavaClassOrInterface(javaNode: Model.JavaNode,
                                       typeParameters: string[],
                                       extendedJavaClass: string,
                                       implementedJavaInterfaces: string[],
                                       typeHelper: TypeHelper,
                                       program: ts.Program) {
        let content = '';
        content += generateHeaderComments(javaNode, program);

        let javaType = javaNode.kind == Model.JavaNodeKind.Interface ? 'interface' :
            javaNode.kind == Model.JavaNodeKind.InterfaceForClass ? 'interface' :
                javaNode.kind == Model.JavaNodeKind.Class ? 'class' : 'UNKNOWN_JAVA_TYPE';

        let classInheritance = '';
        if (extendedJavaClass)
            classInheritance = ` extends ${extendedJavaClass}`;

        let inheritance = '';
        if (implementedJavaInterfaces && implementedJavaInterfaces.length)
            inheritance = ` ${javaType == 'class' ? 'implements' : 'extends'} ${implementedJavaInterfaces.join(', ')}`;

        let typeParams = '';
        if (typeParameters.length)
            typeParams = `<${typeParameters.join(', ')}>`;

        let jsNamespace = javaType == 'interface' ? 'JsPackage.GLOBAL' : `"${javaNode.jsNamespace}"`;
        let jsName = javaType == 'interface' ? 'Object' : javaNode.name;

        content += `@JsType( isNative=true, namespace=${jsNamespace}, name="${jsName}" )\n`;
        content += `public ${javaType} ${javaNode.name}${typeParams}${classInheritance}${inheritance} {\n`;
        content += `}\n`;

        writeArtifact(javaNode.packageName, javaNode.name, content, typeHelper.imports);
    }

    private exportEnum(javaNode: Model.EnumNode, program: ts.Program) {
        console.log(`generate enum ${javaNode.tsNode.name.text}`);

        let content = '';
        content += generateHeaderComments(javaNode, program);

        content += `public interface ${javaNode.name} {\n`;

        childrenOf(javaNode.tsNode)
            .filter(c => c.kind == ts.SyntaxKind.EnumMember)
            .forEach(member => {
                let child = childrenOf(member);
                if (child.length == 2 && child[0].kind == ts.SyntaxKind.Identifier && child[1].kind == ts.SyntaxKind.FirstLiteralToken)
                    content += `    final int ${(<ts.Identifier>child[0]).text} = ${(<ts.LiteralExpression>child[1]).text};\n`;
            });

        content += `}\n`;

        writeArtifact(javaNode.packageName, javaNode.name, content);
    }
}

function childrenOf(node: ts.Node) {
    let res = [];
    ts.forEachChild(node, child => {
        res.push(child);
    });
    return res;
}

function firstChildOf(node: ts.Node) {
    return childrenOf(node)[0];
}

function generateHeaderComments(javaNode: Model.JavaNode, program: ts.Program) {
    let relativePath = path.relative(program.getCurrentDirectory(), javaNode.sourceFile.fileName);
    let symbol = program.getTypeChecker().getSymbolAtLocation(javaNode.tsNode.name);

    let content = `\n`;
    content += `/**\n`;
    content += `  * Generated from ${relativePath}\n`;
    if (symbol) {
        content += `  * Name ${symbol.getName()}\n`;
        content += `  *\n`;
        content += `  * ${symbol.getDocumentationComment().map(item => item.text).join().replace(new RegExp('\n', 'g'), '\n  * ')}\n`;
    }
    else {
        content += `  * WARNING: No Symbol found for this node.\n`;
    }
    content += `  **/\n`;

    return content;
}

function writeArtifact(artifactPackageName: string, artifactName: string, content: string, imports: { [key: string]: boolean } = {}) {
    let prepend = `package ${artifactPackageName};\n\n`;

    imports['jsinterop.annotations.JsType'] = true;

    let listImports = [];

    for (let importFqn in imports) {
        let importPackage = importFqn.substr(0, importFqn.lastIndexOf('.'));
        if (importPackage != artifactPackageName)
            listImports.push(importFqn);
    }

    listImports.sort()
        .forEach(i => prepend += `import ${i};\n`);

    mkdirRec(path.join('out', artifactPackageName.replace(new RegExp('\\.', 'g'), '/')));

    let fileName = path.join('out', artifactPackageName.replace(new RegExp('\\.', 'g'), '/'), `${artifactName}.java`);
    fs.writeFileSync(fileName, prepend + content, 'utf8');
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


function debugNode(node: ts.Node, space: string, rec: boolean = true) {
    let text = '(unk name)'

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

            text = `PROPERTY ${propertyDeclaration.name.toString()}`
            break

        case ts.SyntaxKind.UnionType:
            let unionType = <ts.UnionTypeNode>node
            unionType.types
            break
    }

    console.log(`${space}${text} of kind ${ts.SyntaxKind[node.kind]}`)

    if (rec)
        ts.forEachChild(node, child => debugNode(child, ' ' + space));
}