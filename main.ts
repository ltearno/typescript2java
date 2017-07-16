import * as fs from "fs"
import * as path from "path"
import * as ts from "typescript"
import { GatherPhase } from "./processor.gather-phase"
import * as ExportPhase from './processor.export-phase'

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

let sourceRootDir = './tests';

let files = walkSync(sourceRootDir)

let compilerOptions: ts.CompilerOptions = {
    baseUrl: sourceRootDir,
    rootDir: sourceRootDir,
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
        let { line, character } = diagnostic.file.getLineAndCharacterOfPosition(diagnostic.start)
        console.error(`${diagnostic.file.fileName} (${line + 1},${character + 1}): ${message}`);
    }
    else {
        console.error(`${message}`);
    }
});

if (emitResult.emitSkipped) {
    console.log(`emit has been skipped, exit.`);
}

console.log(`Adding exportable nodes...`);

let baseJavaPackage = 'fr.lteconsulting.angular2gwt.client.interop';
let javaPackages = {
    "tests/@angular/common/": "ng.core",
    "tests/@angular/compiler/": "ng.core",
    "tests/@angular/core/": "ng.core",
    "tests/@angular/forms/": "ng.forms",
    "tests/@angular/http/": "ng.http",
    "tests/@angular/platform-browser/": "ng.platformBrowser",
    "tests/@angular/platform-browser-dynamic/": "ng.platformBrowserDynamic",
    "tests/@angular/router/": "ng.router",
    "tests/rxjs": "rxjs",
    "tests": "fr.lteconsulting.test"
}

let syncPhase = new GatherPhase(baseJavaPackage, javaPackages, program)

program.getSourceFiles().forEach(sourceFile => {
    console.log(`source ${sourceFile.fileName}`);

    let isInternalFile = !files.find(file => path.normalize(file) === path.normalize(sourceFile.fileName));
    if (!isInternalFile)
        syncPhase.addTypesFromSourceFile(sourceFile, !isInternalFile);
});

syncPhase.sumup()

console.log(`Exporting nodes...`);
let exportPhase = new ExportPhase.ExportPhase(syncPhase)
exportPhase.exportNodes(program, './out/src/main/java')

console.log(`Finished.`);