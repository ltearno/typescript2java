import * as ts from "typescript";
import * as path from "path";
import { Identifier } from "typescript";
import { type } from "os";
import * as TypeMap from './type-map'

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
 */
export class GatherPhase {
    private currentIdAnonymousTypes = 1

    typeMap = new TypeMap.TsToPreJavaTypemap()

    variables: {
        type: TypeMap.PreJavaType;
        name: string;
    }[] = [];

    globalMethods: TypeMap.PreJavaTypeCallSignature[] = []

    constructor(private baseJavaPackage: string,
        private javaPackages: { [key: string]: string },
        private program: ts.Program) {
    }

    private getTypeName(type: ts.Type) {
        if (type.getSymbol())
            return type.getSymbol().getName()

        if (type.flags & ts.TypeFlags.Any)
            return "Object"
        if (type.flags & ts.TypeFlags.StringLike)
            return "String"
        if (type.flags & ts.TypeFlags.StringLiteral)
            return "String"
        if (type.flags & ts.TypeFlags.Number)
            return "Number"
        if (type.flags & ts.TypeFlags.NumberLiteral)
            return "Number"
        if (type.flags & ts.TypeFlags.NumberLike)
            return "Number"
        if (type.flags & ts.TypeFlags.Boolean)
            return "Boolean"
        if (type.flags & ts.TypeFlags.BooleanLiteral)
            return "Boolean"
        if (type.flags & ts.TypeFlags.BooleanLike)
            return "Boolean"
        if (type.flags & ts.TypeFlags.Void)
            return "void"
        if (type.flags & ts.TypeFlags.Undefined)
            return "void"
        if (type.flags & ts.TypeFlags.Null)
            return "Void"
        if (type.flags & ts.TypeFlags.Never)
            return "Void"

        if (type.flags & ts.TypeFlags.ESSymbol)
            return "ESSymbol"

        if (type.flags & ts.TypeFlags.Union) {
            let unionType = type as ts.UnionType
            return unionType.types.map(t => this.getTypeName(t)).join('Or')
        }

        if (type.flags & ts.TypeFlags.Intersection) {
            let unionType = type as ts.IntersectionType
            return unionType.types.map(t => this.getTypeName(t)).join('And')
        }

        if (type.flags & ts.TypeFlags.NonPrimitive)
            return "Object"

        if (type.flags & ts.TypeFlags.Object)
            return "Object/*StructuredUnnamed*/"

        if (type.flags & ts.TypeFlags.IndexedAccess) {
            let indexedAccess = type as ts.IndexedAccessType
            return "INDEXEDACCESS"
        }

        //Enum
        //EnumLiteral
        //EnumLike
        //TypeParameter
        //UnionOrIntersection
        //Index
        //Literal
        //StringOrNumberLiteral
        //PossiblyFalsy
        //StructuredType
        //StructuredOrTypeVariable
        //TypeVariable
        //Narrowable
        //NotUnionOrUnit

        return "(type without symbol)"
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

    private ignoredSyntaxKinds: Set<ts.SyntaxKind> = new Set()

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
        console.log(`develop unions for methods`)
        this.typeMap.developMethodOverridesForUnionParameters()

        console.log(`statistics:`)
        console.log(`${this.variables.length} global variables`)
        console.log(`${this.globalMethods.length} global methods`)
        console.log(`${this.typeMap.typeMap.size} jsinterop types`)

        // simplify : merge types with same name and same structure
        // by default for properties : do not generate Caller
        // Array => JsArray and so on for similar custom native types replacement\\freebox
        // remove unreferenced types ?
        // todo rendre les DTO interface en classe : plus facile à instancier ! critère : pas de prototype et interface non utilisée comme interface mère. les classes qui en héritent utilisent maintenant 'extends' => probleme si déjà un extends, et dans ce cas, ce n'est pas possible !

        //console.log(this.variables.map(v => `variable : ${v.type.getParametrizedSimpleName()} ${v.name}`).join(`\n`))

        //console.log(this.globalMethods.map(m => `global method : ${m.serializeSignature()}`).join('\n'))

        /*this.typeMap.typeMap.forEach((type, k) => {
            let files = (k.getSymbol() && k.getSymbol().declarations) ? k.getSymbol().declarations.map(d => d.getSourceFile().fileName + ':' + d.getFullStart()).join() : ''
            let fqn = k.getSymbol() ? this.program.getTypeChecker().getFullyQualifiedName(k.getSymbol()) : ''

            console.log()
            console.log()
            console.log(`ts type ${k['id']} ${k.flags} ${fqn} ${files} : ${this.getTypeName(k)}`)

            type.dump()
        })*/
    }

    private registerVariableStatement(statement: ts.VariableStatement) {
        statement.declarationList.declarations.forEach((declaration) => {
            let t = this.program.getTypeChecker().getTypeFromTypeNode(declaration.type)

            let cs = t.getConstructSignatures()
            if (cs && cs.length) {
                cs.forEach(constructorSignature => {
                    if (constructorSignature.getReturnType()) {
                        let preJava = this.typeMap.getOrCreatePreJavaTypeForTsType(constructorSignature.getReturnType())
                        if (preJava instanceof TypeMap.PreJavaTypeClassOrInterface) {
                            preJava.addPrototypeName(null, guessName(declaration.name));
                            preJava.setSimpleName(guessName(declaration.name));
                            //preJava.addConstructorSignature(this.convertSignature(null, constructorSignature))
                        }
                    }
                })
            }

            if (t.getNumberIndexType()
                || t.getStringIndexType()
                || (t.getCallSignatures() && t.getCallSignatures().some(s => s.declaration && s.declaration.name && s.declaration.name.getText() != '__call'))
                || (t.getProperties() && t.getProperties().some(p => p.name != 'prototype'))) {
                let variableType = this.typeMap.getOrCreatePreJavaTypeForTsType(t)

                this.variables.push({ type: variableType, name: guessName(declaration.name) });
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
            this.globalMethods.push(this.convertSignature(name, callSignatures[0]))
        }
    }

    private nameOfIdentifier(identifier: ts.Identifier): string {
        return identifier.text
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
                            let jsName = this.nameOfIdentifier(classDeclaration.name)
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
                        constructors.forEach(constructorSignature => classOrInterface.addConstructorSignature(this.convertSignature(null, constructorSignature)))
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
                        classOrInterface.setTypeParameters(interfaceType.typeParameters.map(tp => (new TypeMap.PreJavaTypeParameter(tp.symbol.getName(), this.typeMap.getOrCreatePreJavaTypeForTsType(tp.constraint)))))
                    }
                }
            }

            let nit = type.getNumberIndexType()
            if (classOrInterface && nit) {
                classOrInterface.setNumberIndexType(this.typeMap.getOrCreatePreJavaTypeForTsType(nit))
            }

            let sit = type.getStringIndexType()
            if (classOrInterface && sit) {
                classOrInterface.setStringIndexType(this.typeMap.getOrCreatePreJavaTypeForTsType(sit))
            }

            let baseTypes = type.getBaseTypes()
            if (classOrInterface && baseTypes) {
                baseTypes.forEach(baseType => {
                    classOrInterface.addBaseType(this.typeMap.getOrCreatePreJavaTypeForTsType(baseType))
                })
            }

            let properties = type.getProperties()
            if (classOrInterface && properties) {
                properties.forEach(property => {
                    let propertyName = property.getName()

                    if (!property.valueDeclaration)
                        return

                    let comments = this.getCommentFromSymbol(property)

                    let propertyType = this.program.getTypeChecker().getTypeAtLocation(property.valueDeclaration)

                    // TODO : generating property accessors for callable types should be configurable
                    let callSignatures = propertyType.getCallSignatures()
                    if (callSignatures && callSignatures.length && !(propertyName.startsWith('on'))) {
                        for (let callSignature of callSignatures) {
                            let method = this.convertSignature(propertyName, callSignature)
                            method.addComments(comments)
                            classOrInterface.addMethod(method)
                        }
                    }
                    else {
                        let propertyPreJavaType = this.typeMap.getOrCreatePreJavaTypeForTsType(propertyType)
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
                callSignatures.forEach(callSignature => classOrInterface.addMethod(this.convertSignature('execute', callSignature)))
            }
        }
    }

    private convertSignature(name: string, tsSignature: ts.Signature): TypeMap.PreJavaTypeCallSignature {
        return new TypeMap.PreJavaTypeCallSignature(
            tsSignature.getTypeParameters() ? tsSignature.getTypeParameters().map(t => {
                let res = this.typeMap.getOrCreatePreJavaTypeForTsType(t) as TypeMap.PreJavaTypeParameter
                if (!(res instanceof TypeMap.PreJavaTypeParameter))
                    console.error(`BLABLABLA`)
                return res
            }) : null,
            this.typeMap.getOrCreatePreJavaTypeForTsType(tsSignature.getReturnType()),
            name,
            tsSignature.getParameters() ? tsSignature.getParameters().map(p => {
                let parameteryType = this.program.getTypeChecker().getTypeAtLocation(p.valueDeclaration)
                return { name: p.name, type: this.typeMap.getOrCreatePreJavaTypeForTsType(parameteryType) } as TypeMap.PreJavaTypeFormalParameter
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
