import * as Model from './model';
import * as ts from "typescript";
import * as path from "path";
import * as fs from "fs";
import {SyncPhase} from './processor.sync-phase';
import{TypeHelper} from './type-helper';
import {childrenOf, firstChildOf, debugNode, mkdirRec} from './tools';

export class ExportPhase {
    constructor(private syncPhase: SyncPhase) {
    }

    exportNodes(program: ts.Program) {
        this.syncPhase.symbols.forEach((javaNodes, symbol) => {
            javaNodes.forEach(javaNode => {
                try {
                    this.exportNode(javaNode, program);
                } catch (error) {
                    console.error(`ERROR exporting java node ${Model.JavaNodeKind[javaNode.kind]} ${javaNode.name} : ${error}`);
                }
            });
        });
    }

    private exportNode(javaNode: Model.JavaNode, program: ts.Program) {
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
    }

    private exportClass(javaNode: Model.ClassNode, program: ts.Program) {
        let className = javaNode.tsSymbol.name;
        console.log(`generate class ${className}`);

        let typeHelper = new TypeHelper(this.syncPhase, {}, program);

        let extendedJavaClass: string = null;
        let implementedJavaInterfaces: string[] = [];
        let typeParameters: string[] = [];

        let classType = javaNode.tsType as ts.InterfaceType;

        typeHelper.imports[`${javaNode.interfaceNode.packageName}.${javaNode.interfaceNode.name}`] = true;

        classType.typeParameters && classType.typeParameters.forEach(typeParameter => {
            typeParameters.push(typeParameter.getSymbol().name);
        });

        extendedJavaClass = this.getExtendedClass(javaNode, typeHelper);
        implementedJavaInterfaces = this.getImplementedInterfaces(javaNode, typeHelper, program);

        let interfaceForClassToken = javaNode.interfaceNode.name;
        if (typeParameters.length)
            interfaceForClassToken += `<${typeParameters.join(', ')}>`;
        implementedJavaInterfaces.push(interfaceForClassToken);

        let inside = this.makeMethodsAndProperties(javaNode, {
            generateConstructors: true,
            override: true,
            generateStatics: true
        }, program, typeHelper);

        this.exportJavaClassOrInterface(javaNode, typeParameters, extendedJavaClass, implementedJavaInterfaces, inside, typeHelper, program);
    }

    private exportInterfaceForClass(javaNode: Model.InterfaceForClassNode, program: ts.Program) {
        let interfaceName = javaNode.tsSymbol.name;
        console.log(`generate interface (for class) ${interfaceName}`);

        let typeHelper = new TypeHelper(this.syncPhase, {
            'jsinterop.annotations.JsPackage': true
        }, program);

        let implementedJavaInterfaces: string[] = this.getImplementedInterfaces(javaNode, typeHelper, program);
        let typeParameters: string[] = [];

        let interfaceType = javaNode.tsType as ts.InterfaceTypeWithDeclaredMembers;

        interfaceType.typeParameters && interfaceType.typeParameters.forEach(typeParameter => {
            typeParameters.push(typeParameter.getSymbol().name);
        });

        let inside = this.makeMethodsAndProperties(javaNode, {
            generateConstructors: false,
            override: false,
            generateStatics: false
        }, program, typeHelper);

        this.exportJavaClassOrInterface(javaNode, typeParameters, null, implementedJavaInterfaces, inside, typeHelper, program);
    }

    private exportInterface(javaNode: Model.InterfaceNode, program: ts.Program) {
        let interfaceName = javaNode.tsSymbol.name;
        console.log(`generate interface ${interfaceName}`);

        let typeHelper = new TypeHelper(this.syncPhase, {
            'jsinterop.annotations.JsPackage': true
        }, program);

        let implementedJavaInterfaces: string[] = this.getImplementedInterfaces(javaNode, typeHelper, program);
        let typeParameters: string[] = [];

        let interfaceType = javaNode.tsType as ts.InterfaceTypeWithDeclaredMembers;

        interfaceType.typeParameters && interfaceType.typeParameters.forEach(typeParameter => {
            typeParameters.push(typeParameter.getSymbol().name);
        });

        let inside = this.makeMethodsAndProperties(javaNode, {
            generateConstructors: false,
            override: false,
            generateStatics: false
        }, program, typeHelper);

        this.exportJavaClassOrInterface(javaNode, typeParameters, null, implementedJavaInterfaces, inside, typeHelper, program);
    }

    private makeMethodsAndProperties(javaNode: Model.JavaNode, options: { generateConstructors: boolean; override: boolean; generateStatics: boolean; }, program: ts.Program, typeHelper: TypeHelper) {
        let inside = [];

        // TODO : merge things together...
        javaNode.tsNodes.forEach(tsNode => {
            let children = childrenOf(tsNode);
            children.byKind(ts.SyntaxKind.PropertySignature)
                .forEach((child: ts.PropertySignature) => {
                    inside.push(this.makePropertySignatureContent(child, options.override, program, typeHelper));
                });

            children.byKind(ts.SyntaxKind.PropertyDeclaration)
                .forEach((child: ts.PropertyDeclaration) => {
                    inside.push(this.makePropertyDeclarationContent(child, options.override, program, typeHelper));
                });

            options.generateConstructors && children.byKind(ts.SyntaxKind.Constructor)
                .forEach((child: ts.ConstructorDeclaration) => {
                    inside.push(this.makeMethodContent(child, javaNode.name, false, program, typeHelper));
                });

            children.forEach((child) => {
                switch (child.kind) {
                    case ts.SyntaxKind.MethodDeclaration:
                    case ts.SyntaxKind.MethodSignature: {
                        if (options.generateStatics || childrenOf(child).find(c => c.kind == ts.SyntaxKind.StaticKeyword) == null)
                            inside.push(this.makeMethodContent(child as ts.ConstructorDeclaration, javaNode.name, options.override, program, typeHelper));
                        break;
                    }
                }
            });
        });

        return inside.join('\n');
    }

    private getJsDocs(node: ts.Node) {
        let result = '';

        if ('jsDoc' in node) {
            let docs: ts.Node[] = (node as any).jsDoc;
            if (docs && docs.length) {
                result += `    /**\n`;
                result += docs.map(d => '     * ' + ((d as any).comment as string).trim()).join('\n').replace(new RegExp('\n', 'g'), '\n     * ');
                result += '\n';
                result += `     */\n`;
            }
        }

        return result;
    }

    private makeMethodContent(signature: ts.MethodDeclaration
                                  | ts.MethodSignature
                                  | ts.ConstructorDeclaration,
                              artifactNameForConstructor: string,
                              override: boolean,
                              program: ts.Program,
                              typeHelper: TypeHelper) {
        let methodName = signature.kind == ts.SyntaxKind.Constructor ? artifactNameForConstructor : propertyName(signature.name);

        let info = this.getMethodInformation(signature, artifactNameForConstructor, program, typeHelper);

        let result = this.getJsDocs(signature);

        let tp = info.typeParameters.length ? `<${info.typeParameters.join()}> ` : '';

        let optional = signature.kind == ts.SyntaxKind.MethodSignature && signature.questionToken;

        if (signature.kind == ts.SyntaxKind.Constructor) {
            typeHelper.imports['jsinterop.annotations.JsConstructor'] = true;
            result += `    @JsConstructor\n    public ${artifactNameForConstructor}(${info.parameters.join()}) {}\n`
        }
        else {
            if (override)
                result += `    @Override\n`;
            result += `    ${override ? 'public native ' : ''}${info.isStatic ? 'static ' : ''}${tp}${optional ? '/* optional */ ' : ''}${info.returnType} ${methodName}(${info.parameters.join(', ')});\n`
        }

        return result;
    }

    private getMethodInformation(signature: ts.MethodDeclaration
                                     | ts.MethodSignature
                                     | ts.ConstructorDeclaration,
                                 artifactName: string,
                                 program: ts.Program,
                                 typeHelper: TypeHelper) {
        let info = {
            returnType: 'void',
            name: null,
            typeParameters: [],
            parameters: [],
            isStatic: false
        };

        let children: ts.Node[] = childrenOf(signature);

        for (let child of children) {
            switch (child.kind) {
                case ts.SyntaxKind.StaticKeyword :
                    info.isStatic = true;
                    break

                case ts.SyntaxKind.AbstractKeyword :
                case ts.SyntaxKind.PrivateKeyword :
                case ts.SyntaxKind.ProtectedKeyword:
                    break;

                case ts.SyntaxKind.Identifier:
                    info.name = (<ts.Identifier> child).text;
                    break;

                case ts.SyntaxKind.TypeParameter:
                    info.typeParameters.push((firstChildOf(child) as ts.Identifier).text);
                    break;

                case ts.SyntaxKind.Parameter: {
                    // child 0 : name (Identifier)
                    // child 1 : type
                    let parameterNode = child as ts.ParameterDeclaration;

                    let name = (parameterNode.name as ts.Identifier).text;

                    let paramChilds = childrenOf(parameterNode);
                    let parameterTypeNode: ts.Node = null;
                    let optional = false;
                    if (paramChilds.length == 2) {
                        parameterTypeNode = paramChilds[1];
                    }
                    else if (paramChilds.length == 3) {
                        parameterTypeNode = paramChilds[2];
                        optional = true;
                    }

                    if (parameterTypeNode) {
                        let parameterTypeName = typeHelper.getTypeName(parameterTypeNode);

                        info.parameters.push(`${parameterTypeName}${optional ? ' /* optional */' : ''} ${name}`);
                    }
                    break;
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

                case ts.SyntaxKind.ThisType: {
                    info.returnType = typeHelper.getTypeName(child);
                    break;
                }

                default:
                //debugNode(method, `~~ Ignored in method: ${ts.SyntaxKind[child.kind]} ~~`)
            }
        }

        return info;
    }

    private makePropertyDeclarationContent(declaration: ts.PropertyDeclaration, override: boolean, program: ts.Program, typeHelper: TypeHelper) {
        let typeName = typeHelper.getTypeName(declaration);
        let name = propertyName(declaration.name);

        let isStatic = childrenOf(declaration).find(c => c.kind == ts.SyntaxKind.StaticKeyword) != null;

        //if (artifactType != 'interface' || !isStatic) {
        typeHelper.imports['jsinterop.annotations.JsProperty'] = true;

        let upcaseName = name.slice(0, 1).toUpperCase() + name.slice(1);

        let doc = this.getJsDocs(declaration);

        let content = doc;
        content += `    @JsProperty(name="${name}")\n`;
        if (override)
            content += `    @Override\n`;
        content += `    ${override ? 'public ' : ''}${isStatic ? 'static ' : ''}${typeName} get${upcaseName}();\n\n`;
        content += doc;
        content += `    @JsProperty(name="${name}")\n`;
        if (override)
            content += `    @Override\n`;
        content += `    ${override ? 'public ' : ''}${isStatic ? 'static ' : ''}void set${upcaseName}(${typeName} value);\n`;

        return content;
    }

    private makePropertySignatureContent(signature: ts.PropertySignature, override: boolean, program: ts.Program, typeHelper: TypeHelper) {
        let typeName = typeHelper.getTypeName(signature);
        let name = propertyName(signature.name);

        typeHelper.imports['jsinterop.annotations.JsProperty'] = true;

        let doc = this.getJsDocs(signature);

        let upcaseName = name.slice(0, 1).toUpperCase() + name.slice(1);

        let isStatic = !!childrenOf(signature).find(c => c.kind == ts.SyntaxKind.StaticKeyword);

        let inside = doc;
        if (signature.questionToken)
            inside += `    /* optional property ${name}*/`;
        inside += `    @JsProperty(name="${name}")\n`;
        if (override)
            inside += `    @Override\n`;
        inside += `    ${override ? 'public ' : ''}${isStatic ? 'static ' : ''}${typeName} get${upcaseName}();\n\n`;
        inside += doc;
        inside += `    @JsProperty(name="${name}")\n`;
        if (override)
            inside += `    @Override\n`;
        inside += `    ${override ? 'public ' : ''}${isStatic ? 'static ' : ''}void set${upcaseName}(${typeName} value);\n`;

        return inside;
    }

    private getExtendedClass(javaNode: Model.JavaNode, typeHelper: TypeHelper) {
        if (javaNode.kind != Model.JavaNodeKind.Class)
            return null;

        let classBaseType = javaNode.tsType.getBaseTypes()
            .filter(baseType => {
                if (baseType.flags & ts.TypeFlags.Intersection) {
                    console.log(`NOT YET IMPLEMENTED Intersection BaseType`);
                    return false;
                }
                return true;
            })
            .find(baseType => {
                return !!((baseType as ts.ObjectType).objectFlags & ts.ObjectFlags.Class);
            });

        if (classBaseType)
            return typeHelper.getTypeName(classBaseType.symbol.valueDeclaration, {requiresClass: true});

        return null;
    }

    private getImplementedInterfaces(javaNode: Model.JavaNode, typeHelper: TypeHelper, program: ts.Program) {
        let interfaces = [];

        javaNode.tsType.getBaseTypes().forEach(baseType => {
            if (baseType.flags & ts.TypeFlags.Intersection) {
                console.log(`NOT YET IMPLEMENTED Intersection BaseType`);
                return;
            }

            if (javaNode.kind != Model.JavaNodeKind.Class || !((baseType as ts.ObjectType).objectFlags & ts.ObjectFlags.Class))
                interfaces.push(typeHelper.getTypeName(baseType.symbol.valueDeclaration));
        });

        let heritageClauses = javaNode.tsSymbol.valueDeclaration && (javaNode.tsSymbol.valueDeclaration as ts.ClassLikeDeclaration).heritageClauses;
        heritageClauses && heritageClauses && heritageClauses[1] && heritageClauses[1].types && heritageClauses[1].types.forEach((implementedTypeNodeObject: ts.ExpressionWithTypeArguments) => {
            interfaces.push(typeHelper.getTypeName(implementedTypeNodeObject));
        });

        return interfaces;
    }

    private exportJavaClassOrInterface(javaNode: Model.InterfaceNode | Model.InterfaceForClassNode | Model.ClassNode,
                                       typeParameters: string[],
                                       extendedJavaClass: string,
                                       implementedJavaInterfaces: string[],
                                       insideContent: string,
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
        content += insideContent;
        content += `}\n`;

        writeArtifact(javaNode.packageName, javaNode.name, content, typeHelper.imports);
    }

    private exportEnum(javaNode: Model.EnumNode, program: ts.Program) {
        console.log(`generate enum ${javaNode.name}`);

        let content = '';
        content += generateHeaderComments(javaNode, program);

        content += `public interface ${javaNode.name} {\n`;

        // TODO CHECK THINGS TOGETHER...
        childrenOf(javaNode.tsNodes[0])
            .filter(c => c.kind == ts.SyntaxKind.EnumMember)
            .forEach(member => {
                let child = childrenOf(member);
                if (child.length == 1 && child[0].kind == ts.SyntaxKind.Identifier)
                    content += `    final int ${(<ts.Identifier>child[0]).text};\n`;
                else if (child.length == 2 && child[0].kind == ts.SyntaxKind.Identifier && child[1].kind == ts.SyntaxKind.FirstLiteralToken)
                    content += `    final int ${(<ts.Identifier>child[0]).text} = ${(<ts.LiteralExpression>child[1]).text};\n`;
            });

        content += `}\n`;

        writeArtifact(javaNode.packageName, javaNode.name, content);
    }
}

function propertyName(name: ts.PropertyName) {
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

function generateHeaderComments(javaNode: Model.JavaNode, program: ts.Program) {
    let relativePath = path.relative(program.getCurrentDirectory(), javaNode.sourceFile.fileName);
    let symbol = javaNode.tsSymbol; // program.getTypeChecker().getSymbolAtLocation(javaNode.tsNode.name);

    let content = `\n`;
    content += `/**\n`;
    content += `  * Generated from ${relativePath}\n`;
    if (symbol) {
        content += `  * Name ${symbol.getName()}\n`;
        content += `  * Typescript fqn ${program.getTypeChecker().getFullyQualifiedName(symbol)}\n`;
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

    let fileDirectory = path.join('out', artifactPackageName.replace(new RegExp('\\.', 'g'), '/'));

    mkdirRec(fileDirectory);

    let fileName = path.join(fileDirectory, `${artifactName}.java`);
    fs.writeFileSync(fileName, prepend + content, 'utf8');
}