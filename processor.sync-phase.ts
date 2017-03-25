import * as Model from './model';
import * as ts from "typescript";
import * as path from "path";

/**
 * Constructs the correspondance between Typescript types
 * and Java types.
 *
 * One typescript type can have several linked java types.
 */
export class SyncPhase {
    nodes: Map<ts.Node, Model.JavaNode[]> = new Map();
    symbols: Map<ts.Symbol, Model.JavaNode[]> = new Map();

    constructor(private baseJavaPackage: string,
                private javaPackages: { [key: string]: string }) {
    }

    addTypesFromSourceFile(sourceFile: ts.SourceFile, program: ts.Program) {
        ts.forEachChild(sourceFile, (node) => {
            if (!node.modifiers || !node.modifiers.find(e => e.kind == ts.SyntaxKind.ExportKeyword))
                return;

            /*
             isEnum: node.kind == ts.SyntaxKind.EnumDeclaration,
             isInterface: node.kind == ts.SyntaxKind.InterfaceDeclaration,
             isAbstract: (toaster.getChildren(node).find(c => c.kind == ts.SyntaxKind.AbstractKeyword)) != null

             symbol: program.getTypeChecker().getSymbolAtLocation(declaration.name),
             type: program.getTypeChecker().getTypeAtLocation(declaration),
             */

            let javaNodes: Model.JavaNode[];

            let jsNamespace = this.getJsPackageFromSourceFile(sourceFile, program.getCurrentDirectory());

            switch (node.kind) {
                case ts.SyntaxKind.EnumDeclaration:
                    javaNodes = [{
                        kind: Model.JavaNodeKind.Enum,
                        packageName: this.getJavaPackageFromSourceFile(sourceFile, program.getCurrentDirectory()),
                        name: (node as ts.EnumDeclaration).name.text,
                        jsNamespace,
                        tsNode: node as ts.EnumDeclaration,
                        tsSymbol: program.getTypeChecker().getSymbolAtLocation((node as ts.EnumDeclaration).name),
                        tsType: program.getTypeChecker().getTypeAtLocation(node),
                        sourceFile: sourceFile
                    }];
                    break

                case ts.SyntaxKind.ClassDeclaration: {
                    let className = (node as ts.ClassDeclaration).name.text;
                    let interfaceName = 'I' + className;
                    let implementationName = className;

                    let classNode: Model.ClassNode = {
                        kind: Model.JavaNodeKind.Class,
                        packageName: this.getJavaPackageFromSourceFile(sourceFile, program.getCurrentDirectory()),
                        name: className,
                        jsNamespace,
                        interfaceNode: null,
                        tsNode: node as ts.ClassDeclaration,
                        tsSymbol: program.getTypeChecker().getSymbolAtLocation((node as ts.ClassDeclaration).name),
                        tsType: program.getTypeChecker().getTypeAtLocation(node),
                        sourceFile: sourceFile
                    };

                    let interfaceNode: Model.InterfaceForClassNode = {
                        kind: Model.JavaNodeKind.InterfaceForClass,
                        packageName: this.getJavaPackageFromSourceFile(sourceFile, program.getCurrentDirectory()),
                        name: 'I' + className,
                        jsNamespace,
                        tsNode: node as ts.ClassDeclaration,
                        tsSymbol: program.getTypeChecker().getSymbolAtLocation((node as ts.ClassDeclaration).name),
                        tsType: program.getTypeChecker().getTypeAtLocation(node),
                        sourceFile: sourceFile,
                        classNode
                    };

                    classNode.interfaceNode = interfaceNode;

                    javaNodes = [
                        interfaceNode,
                        classNode
                    ];

                    break;
                }

                case ts.SyntaxKind.InterfaceDeclaration: {
                    javaNodes = [{
                        kind: Model.JavaNodeKind.Interface,
                        packageName: this.getJavaPackageFromSourceFile(sourceFile, program.getCurrentDirectory()),
                        name: (node as ts.ClassDeclaration).name.text,
                        jsNamespace,
                        tsNode: node as ts.InterfaceDeclaration,
                        tsSymbol: program.getTypeChecker().getSymbolAtLocation((node as ts.InterfaceDeclaration).name),
                        tsType: program.getTypeChecker().getTypeAtLocation(node),
                        sourceFile: sourceFile
                    }];
                    break;
                }

                case ts.SyntaxKind.TypeAliasDeclaration:
                    // TODO
                    break;

                default: {
                    //toaster.debugNode(node, ' NOT EXPORTED ', false)
                }
            }

            if (javaNodes) {
                this.nodes.set(node, javaNodes);
                this.symbols.set(program.getTypeChecker().getSymbolAtLocation((node as ts.Declaration).name), javaNodes);
            }
        });
    }

    private getJavaPackageFromSourceFile(sourceFile: ts.SourceFile, sourcesRootPath) {
        let relative = path.relative(sourcesRootPath, sourceFile.fileName);
        for (let pathPrefix in this.javaPackages) {
            if (!path.relative(pathPrefix, relative).startsWith('..'))
                return this.baseJavaPackage + '.' + this.javaPackages[pathPrefix];
        }

        return this.baseJavaPackage;
    }

    private getJsPackageFromSourceFile(sourceFile: ts.SourceFile, sourcesRootPath) {
        let relative = path.relative(sourcesRootPath, sourceFile.fileName);
        for (let pathPrefix in this.javaPackages) {
            if (!path.relative(pathPrefix, relative).startsWith('..'))
                return this.javaPackages[pathPrefix];
        }

        return '';
    }
}