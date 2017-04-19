import * as Model from "./model";
import * as ts from "typescript";
import * as path from "path";
import {Identifier} from "typescript";
import {type} from "os";

function hasExportModifier(node: ts.Node) {
    return !node.modifiers || !node.modifiers.find(e => e.kind == ts.SyntaxKind.ExportKeyword);
}

function guessName(identifier: ts.Identifier | ts.BindingPattern): string {
    if (identifier.kind == ts.SyntaxKind.Identifier)
        return identifier.text;
    return "[UNKNOWN]";
}

/**
 * Constructs the correspondance between Typescript types
 * and Java types.
 *
 * One typescript type can have several linked java types.
 */
export class GatherPhase {
    symbols: Map<ts.Symbol, Model.JavaNode[]> = new Map();

    variables: {
        declarationNode: ts.Node;
        name: string;
    }[] = [];

    constructor(private baseJavaPackage: string,
                private javaPackages: { [key: string]: string }) {
    }

    private addVariableStatement(statement: ts.VariableStatement) {
        statement.declarationList.declarations.forEach((declaration) => {
            declaration.type;
            this.variables.push({declarationNode: declaration, name: guessName(declaration.name)});
        });
    }

    seen: Set<any> = new Set();

    addTypesFromSourceFile(sourceFile: ts.SourceFile, onlyExportedSymbols: boolean, program: ts.Program) {
        //if (!sourceFile.fileName.endsWith('test.d.ts'))
        //    return;

        ts.forEachChild(sourceFile, (node) => {
            if (node.kind == ts.SyntaxKind.VariableStatement) {
                this.addVariableStatement(node as ts.VariableStatement);
                return;
            }

            if (node.kind == ts.SyntaxKind.InterfaceDeclaration) {
                (node as ts.InterfaceDeclaration);
                let type = program.getTypeChecker().getTypeAtLocation(node);
                let symbol = type.symbol;
                while (symbol.flags & ts.SymbolFlags.Alias) {
                    console.log(`aliased ${symbol.name}`);
                    symbol = program.getTypeChecker().getAliasedSymbol(symbol);
                }
                console.log(`INTERFACE ${guessName((node as ts.InterfaceDeclaration).name)} ${type} ${symbol.name}`);
                this.checkSeen(type, 'type');
                this.checkSeen(symbol, 'symbol');
                return;
            }

            if (node.kind == ts.SyntaxKind.ClassDeclaration) {
                let type = program.getTypeChecker().getTypeAtLocation(node);
                let symbol = type.symbol;
                console.log(`CLASS ${guessName((node as ts.ClassDeclaration).name)} ${type} ${symbol.name}`);
                this.checkSeen(type, 'type');
                this.checkSeen(symbol, 'symbol');
                return;
            }

            console.log(`SyntaxKind: ${ts.SyntaxKind[node.kind]}`);
        });
    }

    checkSeen(object, title = '') {
        if (this.seen.has(object)) {
            console.log(`seen ${title} already seen ${object}`);
            return;
        }

        this.seen.add(object);
    }
}