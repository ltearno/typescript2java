import * as ts from "typescript";
import * as path from "path";
import * as Transformers from './transformers'
import { TsToPreJavaTypemap } from './type-map'

import { PreJavaTypeClassOrInterface } from './prejavatypes/PreJavaTypeClassOrInterface'

function guessName(identifier: ts.Identifier | ts.BindingPattern): string {
    if (identifier.kind == ts.SyntaxKind.Identifier)
        return identifier.text;
    return "[UNKNOWN]";
}

export class GatherPhase {
    typeMap: TsToPreJavaTypemap

    private ignoredSyntaxKinds: Set<ts.SyntaxKind> = new Set()

    constructor(private baseJavaPackage: string,
        private defaultJavaPackage: string,
        private javaPackages: { [key: string]: string },
        private program: ts.Program) {
        this.typeMap = new TsToPreJavaTypemap(program, sourceFile => this.getJavaPackage(sourceFile), sourceFile => this.getJSPackage(sourceFile))
    }

    private getJSPackage(sourceFile: ts.SourceFile) {
        if (!sourceFile)
            return null

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

    private getJavaPackage(sourceFile: ts.SourceFile) {
        let jsPackage = this.getJSPackage(sourceFile)
        return `${this.baseJavaPackage}.${jsPackage ? jsPackage : this.defaultJavaPackage}`
    }

    addTypesFromSourceFile(sourceFile: ts.SourceFile, onlyExportedSymbols: boolean) {
        if (sourceFile.fileName.indexOf('testing') >= 0)
            return

        ts.forEachChild(sourceFile, (node) => {
            if (node.kind == ts.SyntaxKind.VariableStatement) {
                this.registerVariableStatement(node as ts.VariableStatement)
                return
            }

            if (node.kind == ts.SyntaxKind.FunctionDeclaration) {
                this.registerFunctionDeclaration(node as ts.FunctionDeclaration)
                return
            }

            if (node.kind == ts.SyntaxKind.InterfaceDeclaration || node.kind == ts.SyntaxKind.ClassDeclaration) {
                this.typeMap.getOrCreatePreJavaTypeForTsType(this.program.getTypeChecker().getTypeAtLocation(node))
                return;
            }

            if (node.kind == ts.SyntaxKind.EnumDeclaration) {
                let t = this.program.getTypeChecker().getTypeAtLocation(node)
                this.typeMap.getOrCreatePreJavaTypeForTsType(t)
                return;
            }

            if (!this.ignoredSyntaxKinds.has(node.kind)) {
                this.ignoredSyntaxKinds.add(node.kind)
                console.log(`Ignored SyntaxKind: ${ts.SyntaxKind[node.kind]}`)
            }
        });
    }

    sumup() {
        console.log(`removing unsupported types`)
        Transformers.removeNotSupportedTypes(this.typeMap)

        console.log(`removing OverridingProperties`)
        Transformers.removeOverridingProperties(this.typeMap)

        console.log(`reducing anonymous types`)
        Transformers.reduceAnonymousTypes(this.typeMap)

        console.log(`unanonymising types`)
        Transformers.ensureAllTypesHaveNameAndPackage(this.typeMap, this.baseJavaPackage)

        console.log(`simplifying unions`)
        Transformers.simplifyUnions(this.typeMap)

        console.log(`removing duplicate overloads (with same type erasure)`)
        Transformers.removeDuplicateOverloads(this.typeMap)

        console.log(`changing DTO interfaces into classes`)
        Transformers.changeDtoInterfacesIntoClasses(this.typeMap)

        console.log(`transforming types inheriting multiple implementations`)
        Transformers.arrangeMultipleImplementationInheritance(this.typeMap, 'Impl')

        console.log(`add missing methods from interface hierarchy in classes`)
        Transformers.addMethodsFromInterfaceHierarchy(this.typeMap)

        console.log(`(todo) Array should be replaced by an externally provided type`)

        console.log(`replacing anonymous types`)
        Transformers.replaceAnonymousTypes(this.typeMap)

        console.log(`developping methods with union parameters`)
        Transformers.developMethodsWithUnionParameters(this.typeMap)

        console.log(`renaming duplicate fqns`)
        Transformers.checkNoDuplicateTypeNames(this.typeMap)

        console.log(`statistics:`)
        console.log(`${this.globalClasses.size} global scope classes`)
        console.log(`${this.typeMap.typeSet().size} jsinterop types`)
    }

    // maps js package names to global element holder java classes
    private globalClasses = new Map<string, PreJavaTypeClassOrInterface>()

    private getGlobalClass(sourceFile: ts.SourceFile): PreJavaTypeClassOrInterface {
        let jsPackage = this.getJSPackage(sourceFile)
        let key = jsPackage ? jsPackage : '-'

        if (!this.globalClasses.has(key)) {
            let javaPackage = this.getJavaPackage(sourceFile)

            let globalClass = new PreJavaTypeClassOrInterface()
            globalClass.comments = [`Wrapper class for all global definition of ${jsPackage} (java ${javaPackage}) package`]
            globalClass.isClass = true

            globalClass.name = "GlobalScope"
            globalClass.packageName = javaPackage
            if (jsPackage)
                globalClass.name = "GlobalScope_" + jsPackage.split('.').map(each => each ? (each.substring(0, 1).toUpperCase() + each.substring(1)) : '').join('')

            let dotIndex = jsPackage && jsPackage.indexOf('.')
            if (dotIndex > 0) {
                globalClass.jsNamespace = jsPackage.substring(0, dotIndex)
                globalClass.jsName = jsPackage.substring(dotIndex + 1)
            }
            else {
                globalClass.jsNamespace = null
                globalClass.jsName = jsPackage
            }

            this.globalClasses.set(key, globalClass)
            this.typeMap.typeMap.set('global-declarations-class-' + javaPackage, globalClass)

            return globalClass
        }

        return this.globalClasses.get(key)
    }

    private registerVariableStatement(statement: ts.VariableStatement) {
        statement.declarationList.declarations.forEach((declaration) => {
            let t = this.program.getTypeChecker().getTypeFromTypeNode(declaration.type)

            let cs = t.getConstructSignatures()
            if (cs && cs.length) {
                cs.forEach(constructorSignature => {
                    if (constructorSignature.getReturnType()) {
                        let preJava = this.typeMap.getOrCreatePreJavaTypeForTsType(constructorSignature.getReturnType())
                        if (preJava instanceof PreJavaTypeClassOrInterface) {
                            preJava.setPrototypeName(null, guessName(declaration.name))
                            preJava.setSimpleName(guessName(declaration.name))
                        }
                    }
                })
            }

            let callSignatures = t.getCallSignatures()
            if (callSignatures && callSignatures.length) {
                callSignatures.forEach(tsSignature => {
                    if (declaration && declaration.name && declaration.name.getText()) {
                        let signature = this.typeMap.convertSignature(declaration.name.getText(), tsSignature, null)
                        if (signature)
                            this.getGlobalClass(declaration.getSourceFile()).addStaticMethod(signature)
                    }
                })
            }
            else if (t.getNumberIndexType()
                || t.getStringIndexType()
                || (t.getCallSignatures() && t.getCallSignatures().some(s => s.declaration && s.declaration.name && s.declaration.name.getText() != '__call'))
                || (t.getProperties() && t.getProperties().some(p => p.name != 'prototype'))) {
                let variableType = this.typeMap.getOrCreatePreJavaTypeForTsType(t, false)

                this.getGlobalClass(declaration.getSourceFile()).addStaticProperty({ name: guessName(declaration.name), comments: null, type: variableType, writable: true })
            }
        })
    }

    private registerFunctionDeclaration(declaration: ts.FunctionDeclaration) {
        let t = this.program.getTypeChecker().getTypeAtLocation(declaration)

        let name = declaration && declaration.name && declaration.name.text
        if (!name)
            return

        let callSignatures = t.getCallSignatures()
        if (callSignatures && callSignatures.length) {
            callSignatures.forEach(tsSignature => {
                let signature = this.typeMap.convertSignature(name, tsSignature, null)
                if (signature) {
                    this.getGlobalClass(declaration.getSourceFile()).addStaticMethod(signature)
                }
            })
        }
    }
}
