import * as ts from "typescript"
import * as tools from "./tools"
import * as path from "path"
import * as Transformers from './transformers'
import { GatherPhase } from "./processor.gather-phase"
import { ExportPhase } from './processor.export-phase'

export interface Configuration {
    sourceRootDir: string
    baseJavaPackage: string
    defaultJavaPackage: string
    javaPackages: { [key: string]: string }
    processInternalTypes: boolean
    outputDirectory: string
    renaming: { [key: string]: { [key: string]: string } }
}

export class Engine {
    constructor(private configuration: Configuration) {
    }

    run() {
        let files = tools.browseTypescriptDefinitionFilesRecursively(this.configuration.sourceRootDir)

        let compilerOptions: ts.CompilerOptions = {
            baseUrl: this.configuration.sourceRootDir,
            rootDir: this.configuration.sourceRootDir,
            moduleResolution: ts.ModuleResolutionKind.NodeJs,
            listFiles: true,
            //typeRoots: ["./typings/index.d.ts"],
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

        console.log(`Analyzing exportable nodes...`)
        let gatherPhase = new GatherPhase(this.configuration.baseJavaPackage, this.configuration.defaultJavaPackage, this.configuration.javaPackages, program)
        program.getSourceFiles().forEach(sourceFile => {
            let isInternalFile = !files.find(file => path.normalize(file) === path.normalize(sourceFile.fileName))
            if (this.configuration.processInternalTypes || !isInternalFile) {
                //console.log(`source ${sourceFile.fileName}`)
                gatherPhase.addTypesFromSourceFile(sourceFile)
            }
        })

        Transformers.applyTransformations(gatherPhase.getTypeMap(), this.configuration.renaming)

        gatherPhase.sumup()
        let types = gatherPhase.getTypeMap().typeSet()

        console.log(`Exporting nodes...`)
        let exportPhase = new ExportPhase()
        exportPhase.exportNodes(types, program, this.configuration.outputDirectory)

        console.log(`Finished.`)
    }
}