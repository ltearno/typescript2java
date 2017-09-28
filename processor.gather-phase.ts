import * as ts from "typescript"
import * as tsTools from './ts-tools'
import * as path from "path"
import * as Transformers from './transformers'
import { TypescriptToJavaTypemap } from './type-map'
import { PreJavaTypeClassOrInterface } from './prejavatypes/PreJavaTypeClassOrInterface'

export class GatherPhase {
    private typeMap: TypescriptToJavaTypemap
    private ignoredSyntaxKinds: Set<ts.SyntaxKind> = new Set()

    constructor(private baseJavaPackage: string,
        private defaultJavaPackage: string,
        private javaPackages: { [key: string]: string },
        private program: ts.Program) {
        this.typeMap = new TypescriptToJavaTypemap(program, symbol => this.getJavaPackage(symbol), sourceFile => this.getJSPackage(sourceFile))
    }

    getTypeMap() {
        return this.typeMap
    }

    addTypesFromSourceFile(sourceFile: ts.SourceFile) {
        if (sourceFile.fileName.indexOf('testing') >= 0)
            return

        ts.forEachChild(sourceFile, (node) => {
            if (node.kind == ts.SyntaxKind.VariableStatement) {
                this.typeMap.registerVariableStatement(node as ts.VariableStatement)
                return
            }

            if (node.kind == ts.SyntaxKind.FunctionDeclaration) {
                this.typeMap.registerFunctionDeclaration(node as ts.FunctionDeclaration)
                return
            }

            if (node.kind == ts.SyntaxKind.InterfaceDeclaration
                || node.kind == ts.SyntaxKind.ClassDeclaration) {
                this.typeMap.getOrCreatePreJavaTypeForTsType(this.program.getTypeChecker().getTypeAtLocation(node))
                return
            }

            if (node.kind == ts.SyntaxKind.EnumDeclaration) {
                let t = this.program.getTypeChecker().getTypeAtLocation(node)
                this.typeMap.getOrCreatePreJavaTypeForTsType(t)
                return
            }

            if (!this.ignoredSyntaxKinds.has(node.kind)) {
                this.ignoredSyntaxKinds.add(node.kind)
                console.log(`Ignored SyntaxKind: ${ts.SyntaxKind[node.kind]}`)
            }
        });
    }

    sumup() {
        console.log(`statistics:`)
        console.log(`${this.typeMap.nbGlobalClasses()} global scope classes`)
        console.log(`${this.typeMap.typeSet().size} jsinterop types`)
    }

    private getJavaPackage(symbol: ts.Symbol) {
        let jsPackage = this.getJSPackage(symbol)
        return `${this.baseJavaPackage}.${jsPackage ? jsPackage : this.defaultJavaPackage}`
    }

    private getJSPackage(symbol: ts.Symbol) {
        if (!symbol)
            return null

        let baseJsPackage = this.getJSPackageFromSourceFile(symbol)

        let fqn = this.program.getTypeChecker().getFullyQualifiedName(symbol)
        if (!fqn)
            return baseJsPackage

        if (fqn) {
            if (fqn.indexOf('"') >= 0)
                fqn = fqn.substring(fqn.indexOf('"', 1) + 2)

            if (fqn.indexOf('.') > 0) {
                baseJsPackage = (baseJsPackage ? (baseJsPackage + '.') : '') + fqn.substring(0, fqn.lastIndexOf('.'))
            }
        }

        return baseJsPackage
    }

    private getJSPackageFromSourceFile(symbol: ts.Symbol) {
        if (!symbol)
            return null

        let symbolDeclaration = symbol.valueDeclaration || (symbol.declarations && symbol.declarations[0])
        let sourceFile = symbolDeclaration.getSourceFile()

        let relative = path.relative(this.program.getCurrentDirectory(), sourceFile.fileName)

        for (let pathPrefix in this.javaPackages) {
            let sourceRelativePath = path.relative(pathPrefix, relative)
            if (sourceRelativePath.startsWith('..'))
                continue

            let dirRelativePackagePath = path.dirname(sourceRelativePath)
                .replace(new RegExp('\\\\', 'g'), '.')
                .replace(new RegExp('\\/', 'g'), '.')
                .replace(new RegExp('-', 'g'), '.')

            return this.javaPackages[pathPrefix]
        }

        return null
    }
}
