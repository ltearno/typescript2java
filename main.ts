import * as fs from "fs";
import * as path from "path";
import * as ts from "typescript";
import * as toaster from "./toaster"

/**
 * TODO
 *
 * - Enums (suite)
 * - Callable
 * - new operator
 *
 * - generate multiple method signatures when optional parameters
 */

let walkSync = function (dir, filelist = []) {
    let files = fs.readdirSync(dir);
    filelist = filelist || [];
    files.forEach(function (file) {
        if (fs.statSync(path.join(dir, file)).isDirectory()) {
            filelist = walkSync(path.join(dir, file), filelist);
        }
        else if (file.endsWith('.d.ts')) {
            filelist.push(path.join(dir, file));
        }
    });
    return filelist;
};

let files = walkSync("./tests")

let baseJavaPackage = 'fr.lteconsulting.angular2gwt.client.interop'
let javaPackages = {
    "tests/@angular/common/": "ng.core",
    "tests/@angular/compiler/": "ng.core",
    "tests/@angular/core/": "ng.core",
    "tests/@angular/forms/": "ng.forms",
    "tests/@angular/http/": "ng.http",
    "tests/@angular/platform-browser/": "ng.platformBrowser",
    "tests/@angular/platform-browser-dynamic/": "ng.platformBrowserDynamic",
    "tests/@angular/router/": "ng.router",
    "tests/rxjs": "rxjs"
}

let compilerOptions: ts.CompilerOptions = {
    baseUrl: './tests',
    rootDir: './tests',
    moduleResolution: ts.ModuleResolutionKind.NodeJs,
    listFiles: true,
    typeRoots: ["./typings/index.d.ts"],
    //traceResolution: true,
    //module: ts.ModuleKind.System,
    target: ts.ScriptTarget.ES2015,
    //lib: ["DOM", "ES6", "DOM.Iterable", "ScriptHost", "BOUduu"]
    exclude: [
        "**/*.js",
        "**/*.map"
    ]
}

console.log(`Program creation...`)

let program = ts.createProgram(files, compilerOptions)

console.log(`Emitting result...`)

let emitResult = program.emit();

console.log(`Compiling diagnostics...`)

let allDiagnostics = ts.getPreEmitDiagnostics(program).concat(emitResult.diagnostics);

allDiagnostics.forEach(diagnostic => {
    let message = ts.flattenDiagnosticMessageText(diagnostic.messageText, '\n');

    if (diagnostic.file) {
        let {line, character} = diagnostic.file.getLineAndCharacterOfPosition(diagnostic.start)
        console.error(`${diagnostic.file.fileName} (${line + 1},${character + 1}): ${message}`);
    }
    else {
        console.error(`${message}`);
    }
});

if (emitResult.emitSkipped) {
    console.log(`emit has been skipped, exit.`);
}

let getJavaPackageFromSourceFile = (sourceFile: ts.SourceFile) => {
    let relative = path.relative(program.getCurrentDirectory(), sourceFile.fileName)
    for (let pathPrefix in javaPackages) {
        if (!path.relative(pathPrefix, relative).startsWith('..'))
            return javaPackages[pathPrefix]
    }

    return "ng"
}

let addExportableNodes = (sourceFile: ts.SourceFile, exportedNodes: toaster.ExportedNodeInformation[]): void => {
    ts.forEachChild(sourceFile, (node) => {
        if (node.modifiers && node.modifiers.filter(e => e.kind == ts.SyntaxKind.ExportKeyword).length > 0) {
            switch (node.kind) {
                case ts.SyntaxKind.InterfaceDeclaration:
                case ts.SyntaxKind.ClassDeclaration:
                case ts.SyntaxKind.EnumDeclaration:
                case ts.SyntaxKind.TypeAliasDeclaration:
                    let declaration = <ts.EnumDeclaration|ts.InterfaceDeclaration|ts.ClassDeclaration|ts.TypeAliasDeclaration>node

                    // TODO seulement c'est si c'est un alias vers un type non nommé à ce moment il devient l'alias naturel des alias vers ce type
                    toaster.debugNode(node, ' exported ', false)

                    exportedNodes.push({
                        node: declaration,
                        sourceFile,
                        name: declaration.name.text,
                        symbol: program.getTypeChecker().getSymbolAtLocation(declaration.name),
                        type: program.getTypeChecker().getTypeAtLocation(declaration),

                        package: getJavaPackageFromSourceFile(sourceFile),
                        isEnum: node.kind == ts.SyntaxKind.EnumDeclaration,
                        isInterface: node.kind == ts.SyntaxKind.InterfaceDeclaration,
                        isAbstract: (toaster.getChildren(node).find(c => c.kind == ts.SyntaxKind.AbstractKeyword)) != null
                    })
                    break;

                default: {
                    toaster.debugNode(node, ' NOT EXPORTED ', false)
                }
            }
        }
    })
}

let exportedNodes: toaster.ExportedNodeInformation[] = []

console.log(`Adding exportable nodes...`)

program.getSourceFiles().forEach(sourceFile => {
    console.log(`SOURCE FILE ${sourceFile.fileName}, language variant:${sourceFile.languageVariant}, version:${sourceFile.languageVersion}`)
    addExportableNodes(sourceFile, exportedNodes)
})

console.log(`Exporting nodes...`)

exportedNodes.forEach((info: toaster.ExportedNodeInformation) => {
    let t: toaster.JavaArtifactToaster = new toaster.JavaArtifactToaster()
    t.exportArtifact(info, program.getCurrentDirectory(), program.getTypeChecker(), exportedNodes)
})

console.log(`Finished.`)