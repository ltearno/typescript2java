import * as fs from "fs"
import * as path from "path"
import * as ts from "typescript"
import { GatherPhase } from "./processor.gather-phase"
import * as ExportPhase from './processor.export-phase'

interface Configuration {
    sourceRootDir: string
    baseJavaPackage: string
    defaultJavaPackage: string,
    javaPackages: { [key: string]: string }
    processInternalTypes: boolean
}

let configuration: Configuration

configuration = {
    sourceRootDir: './tests',
    baseJavaPackage: 'fr.lteconsulting.jsinterop',
    defaultJavaPackage: 'env',
    javaPackages: {
        "tests/@angular/platform-browser-dynamic/src": "ng.platformBrowserDynamic",
        "tests/@angular/platform-browser/src": "ng.platformBrowser",
        "tests/@angular/http/src": "ng.http",
        "tests/@angular/forms/src": "ng.forms",
        "tests/@angular/router/src": "ng.router",
        "tests/@angular/core/src": "ng.core",
        "tests/@angular/common/src": "ng.common",
        "tests/@angular/compiler/src": "ng.compiler",
        "tests/@angular/": "ng",
        "tests/rxjs": "rxjs",
        "tests": "fr.lteconsulting.test"
    },
    processInternalTypes: true
}
if (2 * 3 > 4) {
    configuration = {
        sourceRootDir: './tests.mini',
        baseJavaPackage: 'fr.lteconsulting.jsinterop',
        defaultJavaPackage: 'env',
        javaPackages: {
            "tests.mini": "mini"
        },
        processInternalTypes: false
    }
}



/**
 * TODO
 *
 * - generate multiple method signatures when optional parameters
 */

let walkSync = function (dir, filelist = []) {
    let files = fs.readdirSync(dir)
    filelist = filelist || [];
    files.forEach(function (file) {
        if (fs.statSync(path.join(dir, file)).isDirectory()) {
            filelist = walkSync(path.join(dir, file), filelist)
        }
        else if (file.endsWith('.d.ts')) {
            filelist.push(path.join(dir, file))
        }
    });
    return filelist
};

let files = walkSync(configuration.sourceRootDir)

let compilerOptions: ts.CompilerOptions = {
    baseUrl: configuration.sourceRootDir,
    rootDir: configuration.sourceRootDir,
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

let emitResult = program.emit()

console.log(`Compiling diagnostics...`)

let allDiagnostics = ts.getPreEmitDiagnostics(program).concat(emitResult.diagnostics);

allDiagnostics.forEach(diagnostic => {
    let message = ts.flattenDiagnosticMessageText(diagnostic.messageText, '\n')

    if (diagnostic.file) {
        let { line, character } = diagnostic.file.getLineAndCharacterOfPosition(diagnostic.start)
        console.error(`${diagnostic.file.fileName} (${line + 1},${character + 1}): ${message}`)
    }
    else {
        console.error(`${message}`)
    }
});

if (emitResult.emitSkipped) {
    console.log(`emit has been skipped, exit.`)
}

console.log(`Adding exportable nodes...`)

let syncPhase = new GatherPhase(configuration.baseJavaPackage, configuration.defaultJavaPackage, configuration.javaPackages, program)

program.getSourceFiles().forEach(sourceFile => {
    console.log(`source ${sourceFile.fileName}`)

    let isInternalFile = !files.find(file => path.normalize(file) === path.normalize(sourceFile.fileName))
    if (configuration.processInternalTypes || !isInternalFile)
        syncPhase.addTypesFromSourceFile(sourceFile, !isInternalFile)
});

syncPhase.sumup()

console.log(`Exporting nodes...`)
let exportPhase = new ExportPhase.ExportPhase(syncPhase)
exportPhase.exportNodes(program, './out/src/main/java')

console.log(`Finished.`)