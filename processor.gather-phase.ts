import * as ts from "typescript";
import * as path from "path";
import { Identifier } from "typescript";
import { type } from "os";
import * as TypeMap from './type-map'

function guessName(identifier: ts.Identifier | ts.BindingPattern): string {
    if (identifier.kind == ts.SyntaxKind.Identifier)
        return identifier.text;
    return "[UNKNOWN]";
}

export class GatherPhase {
    typeMap = new TypeMap.TsToPreJavaTypemap()

    globalVariables: {
        type: TypeMap.PreJavaType;
        name: string;
    }[] = [];

    globalMethods: TypeMap.PreJavaTypeCallSignature[] = []

    private currentIdAnonymousTypes = 1

    private ignoredSyntaxKinds: Set<ts.SyntaxKind> = new Set()

    constructor(private baseJavaPackage: string,
        private javaPackages: { [key: string]: string },
        private program: ts.Program) {
    }

    addTypesFromSourceFile(sourceFile: ts.SourceFile, onlyExportedSymbols: boolean) {
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
                this.typeMap.getOrCreatePreJavaTypeForTsType(this.program.getTypeChecker().getTypeAtLocation(node), null)
                return;
            }

            if (node.kind == ts.SyntaxKind.EnumDeclaration) {
                let t = this.program.getTypeChecker().getTypeAtLocation(node)
                this.typeMap.getOrCreatePreJavaTypeForTsType(t, null)
                return;
            }

            if (!this.ignoredSyntaxKinds.has(node.kind)) {
                this.ignoredSyntaxKinds.add(node.kind)
                console.log(`Ignored SyntaxKind: ${ts.SyntaxKind[node.kind]}`)
            }
        });
    }

    sumup() {
        console.log(`processing types...`)
        while (true) {
            let notProcessed = this.typeMap.getNotProcessedTypes()
            if (notProcessed == null || notProcessed.length <= 0)
                break

            for (let preJavaType of notProcessed) {
                this.processClassOrInterfaceDeclaration(preJavaType)
            }
        }

        console.log(`removing unsupported types`)
        this.typeMap.removeNotSupportedTypes()

        console.log(`unanonymising types`)
        this.currentIdAnonymousTypes = this.typeMap.ensureAllTypesHaveName(this.currentIdAnonymousTypes, this.baseJavaPackage)

        console.log(`simplify unions`)
        this.typeMap.simplifyUnions()

        console.log(`change DTO interfaces into classes`)
        this.typeMap.changeDtoInterfacesIntoClasses()

        while (true) {
            console.log(`transforming types inheriting multiple implementations`)
            if (!this.typeMap.arrangeMultipleImplementationInheritance())
                break
        }

        console.log(`develop union types in methods parameters into overrides`)
        this.typeMap.developMethodOverridesForUnionParameters()

        console.log(`(todo) removing invalid method duplicates (same type erasure overrides and so on...)`)
        console.log(`(todo) merge types with same name and same structure`)
        console.log(`(todo) Array should be replaced by an externally provided type`)

        console.log(`statistics:`)
        console.log(`${this.globalVariables.length} global variables`)
        console.log(`${this.globalMethods.length} global methods`)
        console.log(`${this.typeMap.typeMap.size} jsinterop types`)
    }

    private registerVariableStatement(statement: ts.VariableStatement) {
        statement.declarationList.declarations.forEach((declaration) => {
            let t = this.program.getTypeChecker().getTypeFromTypeNode(declaration.type)

            let cs = t.getConstructSignatures()
            if (cs && cs.length) {
                cs.forEach(constructorSignature => {
                    if (constructorSignature.getReturnType()) {
                        let preJava = this.typeMap.getOrCreatePreJavaTypeForTsType(constructorSignature.getReturnType(), null)
                        if (preJava instanceof TypeMap.PreJavaTypeClassOrInterface) {
                            preJava.addPrototypeName(null, guessName(declaration.name))
                            preJava.setSimpleName(guessName(declaration.name))
                        }
                    }
                })
            }

            if (t.getNumberIndexType()
                || t.getStringIndexType()
                || (t.getCallSignatures() && t.getCallSignatures().some(s => s.declaration && s.declaration.name && s.declaration.name.getText() != '__call'))
                || (t.getProperties() && t.getProperties().some(p => p.name != 'prototype'))) {
                let variableType = this.typeMap.getOrCreatePreJavaTypeForTsType(t, null)

                this.globalVariables.push({ type: variableType, name: guessName(declaration.name) });
            }
        })
    }

    private registerFunctionDeclaration(declaration: ts.FunctionDeclaration) {
        let t = this.program.getTypeChecker().getTypeAtLocation(declaration)

        let name = declaration && declaration.name && declaration.name.text
        if (!name)
            return

        let callSignatures = t.getCallSignatures()
        if (callSignatures && callSignatures.length == 1) {
            let signature = this.convertSignature(name, callSignatures[0], null)
            if (signature)
                this.globalMethods.push(signature)
        }
    }

    private processClassOrInterfaceDeclaration(preJavaType: TypeMap.PreJavaType & TypeMap.CompletablePreJavaType) {
        if (preJavaType.isProcessed())
            return

        preJavaType.setProcessed()

        let classOrInterface = preJavaType instanceof TypeMap.PreJavaTypeClassOrInterface ? preJavaType : null

        if (!preJavaType.sourceTypes)
            return

        for (let type of preJavaType.sourceTypes) {
            let symbol = type.getSymbol()

            if (symbol) {
                if ((symbol.flags & ts.SymbolFlags.Class) || (symbol.flags & ts.SymbolFlags.Interface))
                    preJavaType.setSimpleName(symbol.getName())
                else if (symbol.flags & ts.SymbolFlags.TypeLiteral)
                    preJavaType.setSimpleName(`AnonymousType_${this.currentIdAnonymousTypes++}`)

                if (symbol.getDeclarations()) {
                    symbol.getDeclarations()
                        .filter(d => d.kind == ts.SyntaxKind.ClassDeclaration)
                        .forEach(declaration => {
                            let classDeclaration = declaration as ts.ClassDeclaration

                            let sourceFile = classDeclaration.getSourceFile()
                            let relative = path.relative(this.program.getCurrentDirectory(), sourceFile.fileName);

                            let jsNamespace = null
                            let jsName = guessName(classDeclaration.name)
                            if (jsName) {
                                for (let pathPrefix in this.javaPackages) {
                                    if (!path.relative(pathPrefix, relative).startsWith('..')) {
                                        jsNamespace = this.javaPackages[pathPrefix]
                                        break
                                    }
                                }

                                if (classOrInterface)
                                    classOrInterface.addPrototypeName(jsNamespace, jsName)
                            }

                            if (jsNamespace)
                                preJavaType.setPackageName(jsNamespace)
                        })
                }

                if (symbol.valueDeclaration) {
                    let constructorType = this.program.getTypeChecker().getTypeOfSymbolAtLocation(symbol, symbol.valueDeclaration)
                    let constructors = constructorType.getConstructSignatures()
                    if (classOrInterface && constructors)
                        constructors.forEach(constructorSignature => {
                            let signature = this.convertSignature(null, constructorSignature, classOrInterface.typeParameters)
                            classOrInterface.addConstructorSignature(signature)
                        })
                }

                let comments = this.getCommentFromSymbol(symbol)
                if (classOrInterface && comments && comments.length > 0)
                    classOrInterface.addComments(comments)
            }

            if (type.flags & ts.TypeFlags.Object) {
                let objectType = type as ts.ObjectType

                if (objectType.objectFlags & ts.ObjectFlags.Class || objectType.objectFlags & ts.ObjectFlags.Interface) {
                    let interfaceType = objectType as ts.InterfaceType
                    if (classOrInterface && interfaceType.typeParameters && interfaceType.typeParameters.length) {
                        classOrInterface.setTypeParameters(interfaceType.typeParameters.map(tp => (new TypeMap.PreJavaTypeParameter(tp.symbol.getName(), this.typeMap.getOrCreatePreJavaTypeForTsType(tp.constraint, null)))))
                    }
                }
            }

            let nit = type.getNumberIndexType()
            if (classOrInterface && nit) {
                classOrInterface.setNumberIndexType(this.typeMap.getOrCreatePreJavaTypeForTsType(nit, classOrInterface.typeParameters))
            }

            let sit = type.getStringIndexType()
            if (classOrInterface && sit) {
                classOrInterface.setStringIndexType(this.typeMap.getOrCreatePreJavaTypeForTsType(sit, classOrInterface.typeParameters))
            }

            let baseTypes = type.getBaseTypes()
            if (classOrInterface && baseTypes) {
                baseTypes.forEach(baseType => {
                    classOrInterface.addBaseType(this.typeMap.getOrCreatePreJavaTypeForTsType(baseType, null /*no need*/))
                })
            }

            let properties = (type as ts.InterfaceTypeWithDeclaredMembers).declaredProperties// type.getProperties()
            if (classOrInterface && properties && properties.length) {
                properties.forEach(property => {
                    let propertyName = property.getName()

                    if (propertyName == 'mygod')
                        console.log()

                    if (!property.valueDeclaration)
                        return

                    let comments = this.getCommentFromSymbol(property)

                    let propertyType = this.program.getTypeChecker().getTypeAtLocation(property.valueDeclaration)

                    // TODO : generating property accessors for callable types should be configurable
                    let callSignatures = propertyType.getCallSignatures()
                    if (callSignatures && callSignatures.length && !(propertyName.startsWith('on'))) {
                        for (let callSignature of callSignatures) {
                            let method = this.convertSignature(propertyName, callSignature, classOrInterface.typeParameters)
                            if (method) {
                                method.addComments(comments)
                                classOrInterface.addMethod(method)
                            }
                        }
                    }
                    else {
                        let propertyPreJavaType = this.typeMap.getOrCreatePreJavaTypeForTsType(propertyType, classOrInterface.typeParameters)
                        propertyPreJavaType.setSimpleName(`${propertyName.slice(0, 1).toUpperCase() + propertyName.slice(1)}Caller`)

                        classOrInterface.addProperty({
                            name: propertyName,
                            type: propertyPreJavaType,
                            writable: true,
                            comments
                        })
                    }
                })
            }

            let callSignatures = type.getCallSignatures()
            if (classOrInterface && callSignatures && callSignatures.length) {
                // TODO : Check that the method is alone so that it is a correct functional type
                // TODO : check if it can be melted down with other similar types
                // TODO : try to get a name for it from where it has been created (callback of a function, ...)
                callSignatures.forEach(callSignature => {
                    let signature = this.convertSignature('execute', callSignature, classOrInterface.typeParameters)
                    if (signature)
                        classOrInterface.addMethod(signature)
                })
            }
        }
    }

    private convertSignature(name: string, tsSignature: ts.Signature, typeParametersToApplyToAnonymousTypes: TypeMap.PreJavaTypeParameter[]): TypeMap.PreJavaTypeCallSignature {
        if (('thisParameter' in tsSignature) && tsSignature['thisParameter'])
            return null

        let signatureTypeParameters = tsSignature.getTypeParameters() ? tsSignature.getTypeParameters().map(t => {
            let res = this.typeMap.getOrCreatePreJavaTypeForTsType(t, typeParametersToApplyToAnonymousTypes) as TypeMap.PreJavaTypeParameter
            if (!(res instanceof TypeMap.PreJavaTypeParameter))
                console.error(`BLABLABLA`)
            return res
        }) : null

        if (name == 'sort')
            console.log()

        typeParametersToApplyToAnonymousTypes = (typeParametersToApplyToAnonymousTypes && typeParametersToApplyToAnonymousTypes.slice()) || []
        if (signatureTypeParameters)
            typeParametersToApplyToAnonymousTypes = typeParametersToApplyToAnonymousTypes.concat(signatureTypeParameters)

        let returnType = this.typeMap.getOrCreatePreJavaTypeForTsType(tsSignature.getReturnType(), typeParametersToApplyToAnonymousTypes)

        return new TypeMap.PreJavaTypeCallSignature(
            signatureTypeParameters,
            returnType,
            name,
            tsSignature.getParameters() ? tsSignature.getParameters().map(p => {
                let parameteryType = this.program.getTypeChecker().getTypeAtLocation(p.valueDeclaration)
                let objectType = (parameteryType.flags & ts.TypeFlags.Object) && parameteryType as ts.ObjectType
                let referenceType = objectType && (objectType.objectFlags & ts.ObjectFlags.Reference) && parameteryType as ts.TypeReference
                let dotdotdot = false

                let de = p.valueDeclaration as ts.ParameterDeclaration
                if (de.dotDotDotToken) {
                    if (referenceType && referenceType.typeArguments && referenceType.typeArguments.length == 1) {
                        parameteryType = referenceType.typeArguments[0]
                        dotdotdot = true
                    }
                    else {
                        console.error(`... token in parameters but expected type is not good`)
                    }
                }

                let preJavaParameterType = this.typeMap.getOrCreatePreJavaTypeForTsType(parameteryType, typeParametersToApplyToAnonymousTypes)

                let result: TypeMap.PreJavaTypeFormalParameter = {
                    name: p.name,
                    type: preJavaParameterType,
                    optional: (de.questionToken) != null || (de.initializer != null),
                    dotdotdot
                }

                return result
            }) : null
        )
    }

    private getCommentFromSymbol(symbol: ts.Symbol): string[] {
        let comments = symbol && symbol.getDocumentationComment()
        if (comments && comments.length > 0) {
            let res = comments.map(c => c.text).filter(c => c != null && c.trim().length)
            if (res.length == 0)
                return null
            return res
        }

        return null
    }
}
