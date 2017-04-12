import * as Model from './model';
import * as ts from "typescript";
import * as path from "path";

function hasExportModifier(node: ts.Node) {
    return !node.modifiers || !node.modifiers.find(e => e.kind == ts.SyntaxKind.ExportKeyword);
}

/**
 * Constructs the correspondance between Typescript types
 * and Java types.
 *
 * One typescript type can have several linked java types.
 */
export class SyncPhase {
    symbols: Map<ts.Symbol, Model.JavaNode[]> = new Map();

    constructor(private baseJavaPackage: string,
                private javaPackages: { [key: string]: string }) {
    }

    addTypesFromSourceFile(sourceFile: ts.SourceFile, onlyExportedSymbols: boolean, program: ts.Program) {
        ts.forEachChild(sourceFile, (node) => {
            if (onlyExportedSymbols && !hasExportModifier(node))
                return;

            if(node.kind==ts.SyntaxKind.VariableStatement){
                (node as ts.VariableStatement).declarationList;
            }

            // skip fucked-up nodes
            if (!('name' in node))
                return;

            let symbol = program.getTypeChecker().getSymbolAtLocation((node as ts.EnumDeclaration).name);

            if (node.kind == ts.SyntaxKind.VariableDeclaration) {
                console.log(`skip variable declaration`);
                return;
            }

            //if (symbol.declarations && symbol.declarations.length > 1)
            //    console.log(`symbol MAIN(${symbol.declarations.indexOf(symbol.valueDeclaration)}) ${symbol.name} has ${symbol.declarations.length} declarations : ${symbol.declarations.map(d => d.getSourceFile().fileName + ':' + d.pos + d.getFullText(d.getSourceFile())).join()}`);

            let type = program.getTypeChecker().getTypeAtLocation(node);

            let jsNamespace = this.getJsPackageFromSourceFile(sourceFile, program.getCurrentDirectory());

            let javaPackageName = this.getJavaPackageFromSourceFile(sourceFile, program.getCurrentDirectory());
            let javaName = (node as any).name.text;

            // TOUTES LES DECLARATIONS D'UN SYMBOLE DOIVENT ETRE DU MEME TYPE
            // SINON GROSSE ERREUR : DECLARATIONS INCOH2RENTES POUR LE SYMBOL XXX

            let javaNodes: Model.JavaNode[] = this.symbols.get(symbol);
            if (!javaNodes) {
                javaNodes = [];
                this.symbols.set(symbol, javaNodes);

                switch (node.kind) {
                    case ts.SyntaxKind.EnumDeclaration:
                        javaNodes = [{
                            kind: Model.JavaNodeKind.Enum,
                            packageName: javaPackageName,
                            name: javaName,
                            jsNamespace,
                            tsSymbol: symbol,
                            tsType: type,
                            sourceFile: sourceFile,
                            tsNodes: []
                        }];
                        break

                    case ts.SyntaxKind.ClassDeclaration: {
                        let classNode: Model.ClassNode = {
                            kind: Model.JavaNodeKind.Class,
                            packageName: javaPackageName,
                            name: javaName,
                            jsNamespace,
                            interfaceNode: null,
                            tsSymbol: symbol,
                            tsType: type,
                            sourceFile: sourceFile,
                            tsNodes: []
                        };

                        let interfaceNode: Model.InterfaceForClassNode = {
                            kind: Model.JavaNodeKind.InterfaceForClass,
                            packageName: javaPackageName,
                            name: 'I' + javaName,
                            jsNamespace,
                            tsSymbol: symbol,
                            tsType: type,
                            sourceFile: sourceFile,
                            classNode,
                            tsNodes: []
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
                            packageName: javaPackageName,
                            name: javaName,
                            jsNamespace,
                            tsSymbol: symbol,
                            tsType: type,
                            sourceFile: sourceFile,
                            tsNodes: []
                        }];
                        break;
                    }

                    case ts.SyntaxKind.TypeAliasDeclaration:
                    default: {
                        //console.log(`ignored symbol ${symbol.name}`);
                        return;
                        //toaster.debugNode(node, ' NOT EXPORTED ', false)
                    }
                }
            }

            javaNodes.forEach((javaNode) => {
                (javaNode.tsNodes as ts.Node[]).push(node);

                if (javaName == 'DOMTokenList') {
                    console.log(`ARRAY DECL COUNT ${javaNode.tsNodes.length} ${symbol.declarations.length}`);
                }
            });
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