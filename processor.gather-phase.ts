import * as Model from "./model";
import * as ts from "typescript";
import * as path from "path";
import { Identifier } from "typescript";
import { type } from "os";

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
    private BY_INDEX_SETTER = `JsTools.setItem`
    private BY_INDEX_GETTER = `JsTools.getItem`

    types: Set<ts.Type> = new Set()
    private typeMap = new TsToPreJavaTypemap()

    variables: {
        declarationNode: ts.Node;
        name: string;
    }[] = [];

    constructor(private baseJavaPackage: string,
        private javaPackages: { [key: string]: string },
        private program: ts.Program) {
    }

    private registerType(type: ts.Type) {
        if (type)
            this.types.add(type)
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

    private toJava(type: ts.Type) {
        let tab = '    '

        if (type.getSymbol()) {
            console.log(`// FQN : ${this.program.getTypeChecker().getFullyQualifiedName(type.getSymbol())}`)
            console.log(`type flags : ${type.flags}`)

            let comments = type.getSymbol().getDocumentationComment()
            if (comments && comments.length) {
                console.log(`/**`)
                for (let comment of comments) {
                    let text = comment.text
                    console.log(` * ${text.split('\n').join('\n * ')}`)
                }
                console.log(` */`)
            }
        }

        console.log(`@JsType( isNative=true )`)
        console.log(`public class ${this.getTypeName(type)}`)
        console.log(`{`)


        let symbol = type.getSymbol()
        if (symbol && symbol.valueDeclaration) {
            let constructorType = this.program.getTypeChecker().getTypeOfSymbolAtLocation(symbol, symbol.valueDeclaration)
            let constructors = constructorType.getConstructSignatures()
            if (constructors && constructors.length) {
                for (let constructorSignature of constructors) {
                    let paramsDump = this.serializeSignatureParameters(constructorSignature)
                    console.log(`${tab}${this.getTypeName(type)}(${paramsDump}) {`)
                    console.log(`${tab}}`)
                }
            }
        }

        let nit = type.getNumberIndexType()
        if (nit) {
            console.log(`${tab}@JsOverlay`)
            console.log(`${tab}public void setByIndex(int index, ${this.getTypeName(nit)} value) {`)
            console.log(`${tab}${tab}${this.BY_INDEX_SETTER}(index, value);`)
            console.log(`${tab}}`)
            console.log(``)

            console.log(`${tab}@JsOverlay`)
            console.log(`${tab}public ${this.getTypeName(nit)} getByIndex(int index) {`)
            console.log(`${tab}${tab}return ${this.getTypeName(nit)}(Object) ${this.BY_INDEX_GETTER}(index);`)
            console.log(`${tab}}`)
            console.log(``)
        }

        let sit = type.getStringIndexType()
        if (sit) {
            console.log(`${tab}@JsOverlay`)
            console.log(`${tab}public void setByIndex(String index, ${this.getTypeName(sit)} value) {`)
            console.log(`${tab}${tab}${this.BY_INDEX_SETTER}(index, value);`)
            console.log(`${tab}}`)
            console.log(``)

            console.log(`${tab}@JsOverlay`)
            console.log(`${tab}public ${this.getTypeName(sit)} getByIndex(String index) {`)
            console.log(`${tab}${tab}return ${this.getTypeName(sit)}(Object) ${this.BY_INDEX_GETTER}(index);`)
            console.log(`${tab}}`)
            console.log(``)
        }

        let baseTypes = type.getBaseTypes()
        let constructors = type.getConstructSignatures()

        let properties = type.getProperties()
        if (properties && properties.length) {
            for (let property of properties) {
                this.generatePropertiesOrMethods(property)
            }
        }
        console.log(`}`)
    }

    private serializeSignatureParameters(signature: ts.Signature) {
        return signature.getParameters().map(p => {
            let parameteryType = this.program.getTypeChecker().getTypeAtLocation(p.valueDeclaration)
            return this.getTypeName(parameteryType) + ' ' + p.getName()
        }).join()
    }

    private generatePropertiesOrMethods(property: ts.Symbol) {
        if (!property || !property.valueDeclaration)
            return

        let tab = '    '

        let propertyType = this.program.getTypeChecker().getTypeAtLocation(property.valueDeclaration)

        let name = property.getName()
        let upcaseName = name.slice(0, 1).toLocaleUpperCase() + name.slice(1)

        // type of property =>
        // for each callable signature, generate a method

        let callSignatures = propertyType.getCallSignatures()
        if (callSignatures && callSignatures.length) {
            for (let callSignature of callSignatures) {
                console.log(`${tab}/* Call signature */`)
                let paramsDump = this.serializeSignatureParameters(callSignature)
                console.log(`${tab}public final native ${this.getTypeName(callSignature.getReturnType())} ${name}(${paramsDump});`)
                console.log()
            }
        }

        console.log(`${tab}public ${this.getTypeName(propertyType)} ${name};`)
        console.log()

        console.log(`${tab}@JsProperty( name = "${name}")`)
        console.log(`${tab}public final native ${this.getTypeName(propertyType)} get${upcaseName}();`)
        console.log()

        console.log(`${tab}@JsProperty( name = "${name}")`)
        console.log(`${tab}public final native void set${upcaseName}( ${this.getTypeName(propertyType)} value );`)
        console.log()
    }

    private addDeeperTypes(type: ts.Type, typeSet: Set<ts.Type>) {
        if (typeSet.has(type))
            return

        typeSet.add(type)

        if ((type.flags & ts.TypeFlags.TypeParameter) === ts.TypeFlags.TypeParameter) {
            let typeParameter = type as ts.TypeParameter
            if (typeParameter.constraint)
                this.addDeeperTypes(typeParameter.constraint, typeSet)
        }

        if ((type.flags & ts.TypeFlags.Object) === ts.TypeFlags.Object) {
            let objectType = type as ts.ObjectType
            if (objectType.objectFlags & ts.ObjectFlags.ClassOrInterface) {
                let interfaceType = objectType as ts.InterfaceType
                if (interfaceType.typeParameters && interfaceType.typeParameters.length) {
                    for (let typeParameter of interfaceType.typeParameters)
                        this.addDeeperTypes(typeParameter, typeSet)
                }
            }
        }

        let baseTypes = type.getBaseTypes()
        if (baseTypes && baseTypes.length > 0)
            baseTypes.forEach((baseType => this.addDeeperTypes(baseType, typeSet)))

        let properties = type.getProperties()
        if (properties) {
            for (let property of properties) {
                if (!property.valueDeclaration)
                    continue

                /**
                 * TODO
                 * 
                 * One TS property is projected in the java as one or many
                 * - attribute of primitive type (int, char, ...)
                 * - attribute of reference type (Object...)
                 * - method
                 */
                let propertyType = this.program.getTypeChecker().getTypeAtLocation(property.valueDeclaration)
                this.addDeeperTypes(propertyType, typeSet)
            }
        }

        /**
         * TODO
         * 
         * Call and Construct signatures are methods and constructors in the containing type
         */

        let callSignatures = type.getCallSignatures()
        if (callSignatures) {
            for (let callSignature of callSignatures) {
                let parameters = callSignature.getParameters()
                if (parameters && parameters.length) {
                    for (let parameter of parameters) {
                        let parameteryType = this.program.getTypeChecker().getTypeAtLocation(parameter.valueDeclaration)
                        this.addDeeperTypes(parameteryType, typeSet)
                    }
                }

                let returnType = callSignature.getReturnType()
                if (returnType)
                    this.addDeeperTypes(returnType, typeSet)

                let typeParameters = callSignature.getTypeParameters()
                if (typeParameters && typeParameters.length) {
                    for (let typeParameter of typeParameters)
                        this.addDeeperTypes(typeParameter, typeSet)
                }
            }
        }

        let constructSignatures = type.getConstructSignatures()
        if (constructSignatures) {
            for (let constructSignature of constructSignatures) {
                let parameters = constructSignature.getParameters()
                if (parameters && parameters.length) {
                    for (let parameter of parameters) {
                        let parameteryType = this.program.getTypeChecker().getTypeAtLocation(parameter.valueDeclaration)
                        this.addDeeperTypes(parameteryType, typeSet)
                    }
                }

                let returnType = constructSignature.getReturnType()
                if (returnType)
                    this.addDeeperTypes(returnType, typeSet)

                let typeParameters = constructSignature.getTypeParameters()
                if (typeParameters && typeParameters.length) {
                    for (let typeParameter of typeParameters)
                        this.addDeeperTypes(typeParameter, typeSet)
                }
            }
        }
    }

    analyzeType(type: ts.Type, deep: number = 0) {
        let prefix = ''
        for (let i = 0; i < deep; i++)
            prefix += '\t'

        if (type == null) {
            console.log(`${prefix}NO TYPE`)
            return
        }
        let typeName = type.getSymbol() ? type.getSymbol().getName() : "(anonymous type)"
        console.log(`${prefix}TYPE : ${typeName}`);

        let flags = type.getFlags() as number
        let keys = Object.keys(ts.TypeFlags)
        console.log(`${prefix}RAW FLAG: ${flags}`)
        keys.filter(k => parseInt(k)).forEach(flag => {
            let f = parseInt(flag);
            if ((f & flags) === f)
                console.log(`${prefix}FLAG : ${ts.TypeFlags[flag]}`)
        })

        if ((flags & ts.TypeFlags.TypeParameter) === ts.TypeFlags.TypeParameter) {
            console.log(`${prefix}TYPE PARAMETER TYPE`)
            let typeParameter = type as ts.TypeParameter
            if (typeParameter.constraint) {
                console.log(`${prefix} CONSTRAINT`)
                this.analyzeType(typeParameter.constraint, deep + 2)
            }
        }

        if ((flags & ts.TypeFlags.Object) === ts.TypeFlags.Object) {
            console.log(`${prefix}OBJECT TYPE`)
            let objectType = type as ts.ObjectType
            if (objectType.objectFlags & ts.ObjectFlags.ClassOrInterface) {
                let interfaceType = objectType as ts.InterfaceType
                console.log(`${prefix}OBJECTTYPE ${interfaceType.localTypeParameters} ${interfaceType.outerTypeParameters} ${interfaceType.typeParameters} ${interfaceType.aliasTypeArguments}`)

                if (interfaceType.typeParameters && interfaceType.typeParameters.length) {
                    console.log(`${prefix}TYPE PARAMETERS`)
                    for (let typeParameter of interfaceType.typeParameters) {
                        console.log(`${prefix} TYPE PARAMETER :`)
                        this.analyzeType(typeParameter, deep + 2)
                    }
                }
            }
        }

        if (deep > 2)
            return

        let baseTypes = type.getBaseTypes()
        if (baseTypes && baseTypes.length > 0) {
            console.log(`${prefix}BASE TYPES:`)
            baseTypes.forEach((baseType => this.analyzeType(baseType, deep + 1)))
        }

        if (type.aliasTypeArguments && type.aliasTypeArguments.length) {
            console.log(`ALIAS TYPE ARGUMENTS`)
        }

        let properties = type.getProperties()
        if (properties) {
            console.log(`${prefix}PROPERTIES`)
            for (let property of properties) {
                if ("baobab" == property.getName())
                    console.log(`yop`)
                let propertyType = this.program.getTypeChecker().getTypeAtLocation(property.valueDeclaration)

                //this.program.getTypeChecker().getDeclaredTypeOfSymbol(property)
                console.log(`${prefix} PROPERTY ${property.getName()}`)
                this.analyzeType(propertyType, deep + 2)
                console.log(`${prefix} END PROPERTY ${property.getName()}`)
            }
        }

        let callSignatures = type.getCallSignatures()
        if (callSignatures) {
            console.log(`${prefix}CALL SIGNATURE`)
            for (let callSignature of callSignatures) {
                let parameters = callSignature.getParameters()
                if (parameters && parameters.length) {
                    console.log(`${prefix}PARAMETERS`)
                    for (let parameter of parameters) {
                        let parameteryType = this.program.getTypeChecker().getTypeAtLocation(parameter.valueDeclaration)
                        console.log(`${prefix}${parameter.getName()}`)
                        this.analyzeType(parameteryType, deep + 1)
                    }
                }

                let returnType = callSignature.getReturnType()
                if (returnType) {
                    console.log(`${prefix}RETURN TYPE`)
                    this.analyzeType(returnType, deep + 1)
                }

                let typeParameters = callSignature.getTypeParameters()
                if (typeParameters && typeParameters.length) {
                    console.log(`${prefix}TYPE PARAMETERS`)
                    for (let typeParameter of typeParameters) {
                        console.log(`${prefix}TYPE PARAMETER`)
                        this.analyzeType(typeParameter, deep + 1)
                    }
                }
            }
        }

        let constructSignatures = type.getConstructSignatures()
        if (constructSignatures) {
            console.log(`${prefix}CONSTRUCT SIGNATURE`)
            for (let constructSignature of constructSignatures) {
                let parameters = constructSignature.getParameters()
                if (parameters && parameters.length) {
                    console.log(`${prefix}PARAMETERS`)
                    for (let parameter of parameters) {
                        let parameteryType = this.program.getTypeChecker().getTypeAtLocation(parameter.valueDeclaration)
                        console.log(`${prefix}${parameter.getName()}`)
                        this.analyzeType(parameteryType, deep + 1)
                    }
                }

                let returnType = constructSignature.getReturnType()
                if (returnType) {
                    console.log(`${prefix}RETURN TYPE`)
                    this.analyzeType(returnType, deep + 1)
                }

                let typeParameters = constructSignature.getTypeParameters()
                if (typeParameters && typeParameters.length) {
                    console.log(`${prefix}TYPE PARAMETERS`)
                    for (let typeParameter of typeParameters) {
                        console.log(`${prefix}TYPE PARAMETER`)
                        this.analyzeType(typeParameter, deep + 1)
                    }
                }
            }
        }

        console.log(`${prefix}END TYPE ${typeName}`)
    }

    addTypesFromSourceFile(sourceFile: ts.SourceFile, onlyExportedSymbols: boolean) {
        ts.forEachChild(sourceFile, (node) => {
            if (node.kind == ts.SyntaxKind.VariableStatement) {
                this.processVariableStatement(node as ts.VariableStatement)
                return
            }

            if (node.kind == ts.SyntaxKind.InterfaceDeclaration || node.kind == ts.SyntaxKind.ClassDeclaration) {
                this.processClassOrInterfaceDeclaration(this.program.getTypeChecker().getTypeAtLocation(node))
                return;
            }

            console.log(`Ignored SyntaxKind: ${ts.SyntaxKind[node.kind]}`);
        });
    }

    sumup() {
        console.log(this.variables.map(v => 'variable : ' + v.name).join(`\n`))

        this.typeMap.typeMap.forEach((v, k) => {
            let files = k.getSymbol() ? k.getSymbol().declarations.map(d => d.getSourceFile().fileName + ':' + d.getFullStart()).join() : ''
            let fqn = k.getSymbol() ? this.program.getTypeChecker().getFullyQualifiedName(k.getSymbol()) : ''
            console.log(`type ${k['id']} ${k.flags} ${fqn} ${files} : ${this.getTypeName(k)}`)
        })

        // explore types deeper
        // maybe prune and reduce some types
        // export to java

        // todo typemap : builtin-types (String, number, ...)

        /*let typeSet = new Set<ts.Type>()
        for (let type of this.types.values()) {
            console.log(`Searching types from ${this.getTypeName(type)}`)
            this.toJava(type)
            this.addDeeperTypes(type, typeSet)
        }

        let nbAnonymous = 0
        for (let type of typeSet.values()) {
            if (type.getSymbol())
                console.log(`-> ${type.getSymbol().getName()}`)
            else
                nbAnonymous++
        }
        if (nbAnonymous)
            console.log(`-> and ${nbAnonymous} anonymous types`)*/

        // create the set of all required top-level ts types
        // represent those types in the hybrid AST (type, methods, attributes)
        // (each ts type can generate multiple elements in the Java type)
        // (this AST has a much lighter grammar than ts' one)
        // for each of the top-level types, generate a java type

        //for (let type of this.types.values())
        //    this.analyzeType(type)
    }

    private processVariableStatement(statement: ts.VariableStatement) {
        statement.declarationList.declarations.forEach((declaration) => {
            let t = this.program.getTypeChecker().getTypeFromTypeNode(declaration.type)

            let cs = t.getConstructSignatures()
            if (cs && cs.length) {
                cs.forEach(constructorSignature => {
                    if (constructorSignature.getReturnType()) {
                        let preJava = this.typeMap.getOrCreatePreJavaTypeForTsType(constructorSignature.getReturnType())
                        if (preJava.kind == PreJavaTypeKind.CLASS_OR_INTERFACE) {
                            (preJava as ClassOrInterfacePreJavaType).addPrototypeName(null, guessName(declaration.name));
                            (preJava as ClassOrInterfacePreJavaType).addConstructorSignature(constructorSignature)
                        }

                        this.processClassOrInterfaceDeclaration(constructorSignature.getReturnType())
                    }
                })
            }

            if (t.getNumberIndexType()
                || t.getStringIndexType()
                || (t.getCallSignatures() && t.getCallSignatures().some(s => s.declaration && s.declaration.name && s.declaration.name.getText() != '__call'))
                || (t.getProperties() && t.getProperties().some(p => p.name != 'prototype'))) {
                this.processClassOrInterfaceDeclaration(t)

                this.variables.push({ declarationNode: declaration, name: guessName(declaration.name) });
            }
        })
    }

    private processClassOrInterfaceDeclaration(type: ts.Type) {
        let preJava = this.typeMap.getOrCreatePreJavaTypeForTsType(type)

        if (preJava.kind == PreJavaTypeKind.CLASS_OR_INTERFACE) {
            let realPreJavaType = preJava as ClassOrInterfacePreJavaType

            if (realPreJavaType.sourceTypes.has(type)) {
                realPreJavaType.addSourceType(type)

                let symbol = type.getSymbol()

                if (symbol) {
                    if (symbol.getDeclarations().some(d => d.kind == ts.SyntaxKind.ClassDeclaration))
                        realPreJavaType.addPrototypeName(null, this.getTypeName(type))

                    if (symbol.valueDeclaration) {
                        let constructorType = this.program.getTypeChecker().getTypeOfSymbolAtLocation(symbol, symbol.valueDeclaration)
                        let constructors = constructorType.getConstructSignatures()
                        if (constructors)
                            constructors.forEach(constructorSignature => realPreJavaType.addConstructorSignature(constructorSignature))
                    }
                }

                let nit = type.getNumberIndexType()
                if (nit) {
                    this.processClassOrInterfaceDeclaration(nit)

                    realPreJavaType.setNumberIndexType(this.typeMap.getOrCreatePreJavaTypeForTsType(nit))
                }

                let sit = type.getStringIndexType()
                if (sit) {
                    this.processClassOrInterfaceDeclaration(sit)

                    realPreJavaType.setStringIndexType(this.typeMap.getOrCreatePreJavaTypeForTsType(sit))
                }

                let baseTypes = type.getBaseTypes()
                if (baseTypes) {
                    baseTypes.forEach(baseType => {
                        this.processClassOrInterfaceDeclaration(baseType)

                        if ((baseType.flags & ts.TypeFlags.Object) && ((baseType as ts.ObjectType).objectFlags & ts.ObjectFlags.Reference)) {
                            let reference = baseType as ts.TypeReference
                            realPreJavaType.addBaseType({
                                type: this.typeMap.getOrCreatePreJavaTypeForTsType(reference.target),
                                typeParameters: reference.typeArguments.map(typeArgument => this.typeMap.getOrCreatePreJavaTypeForTsType(typeArgument))
                            })
                        }
                        else {
                            realPreJavaType.addBaseType({
                                type: this.typeMap.getOrCreatePreJavaTypeForTsType(baseType),
                                typeParameters: null
                            })
                        }
                    })
                }

                let properties = type.getProperties()
                if (properties)
                    properties.forEach(property => realPreJavaType.addPropertyOrMethod(property))
            }
        }
    }
}

export interface PreJavaTypeReference {
    type: PreJavaType
    typeParameters: PreJavaType[]
}

export enum PreJavaTypeKind {
    BUILTIN,
    CLASS_OR_INTERFACE,
    TYPE_PARAMETER
}

export interface PreJavaType {
    kind: PreJavaTypeKind
}

export interface PreJavaTypeParameter extends PreJavaType {
    kind: PreJavaTypeKind.TYPE_PARAMETER

    name: string
    // TODO : constraints
}

export interface BuiltinJavaType extends PreJavaType {
    kind: PreJavaTypeKind.BUILTIN

    fqn: string
}

export interface ClassOrInterfacePreJavaType extends PreJavaType {
    kind: PreJavaTypeKind.CLASS_OR_INTERFACE

    sourceTypes: Set<ts.Type>

    /*baseTypes: Set<PreJavaType>
    prototypeNames: Set<string>
    constructorSignatures: ts.Signature[]
    propertiesOrMethods: ts.Symbol[]
    numberIndexType: ts.Type
    stringIndexType: ts.Type*/

    addSourceType(type: ts.Type)
    addPrototypeName(namespace: string, name: string)

    addBaseType(baseType: PreJavaTypeReference)
    addConstructorSignature(signature: ts.Signature)
    addPropertyOrMethod(property: ts.Symbol)
    setNumberIndexType(type: PreJavaType)
    setStringIndexType(type: PreJavaType)
}

export class ClassOrInterfacePreJavaType implements ClassOrInterfacePreJavaType {
    kind: PreJavaTypeKind.CLASS_OR_INTERFACE = PreJavaTypeKind.CLASS_OR_INTERFACE

    sourceTypes = new Set<ts.Type>()

    baseTypes = new Set<PreJavaTypeReference>()
    prototypeNames = new Set<string>()

    constructorSignatures: ts.Signature[] = []
    propertiesOrMethods: ts.Symbol[] = []

    numberIndexType: PreJavaType
    stringIndexType: PreJavaType

    addSourceType(type: ts.Type) {
        this.sourceTypes.add(type)
    }

    addPrototypeName(namespace: string, name: string) {
        name = namespace ? `${namespace}.${name}` : name

        if (this.prototypeNames.size && !this.prototypeNames.has(name))
            console.log(`MULTIPLE PROTOTYPES ${this.prototypeNames} + ${name}`)

        this.prototypeNames.add(name)
    }

    addBaseType(baseType: PreJavaTypeReference) {
        this.baseTypes.add(baseType)
    }

    addConstructorSignature(signature: ts.Signature) {
        this.constructorSignatures.push(signature)
    }

    addPropertyOrMethod(property: ts.Symbol) {
        this.propertiesOrMethods.push(property)
    }

    setNumberIndexType(type: PreJavaType) {
        this.numberIndexType = type
    }

    setStringIndexType(type: PreJavaType) {
        this.stringIndexType = type
    }

    private toJava() {
        this.propertiesOrMethods.forEach(property => {
        })
    }
}

const BUILTIN_TYPE_OBJECT = { kind: PreJavaTypeKind.BUILTIN, fqn: 'java.lang.Object' }
const BUILTIN_TYPE_STRING = { kind: PreJavaTypeKind.BUILTIN, fqn: 'java.lang.String' }
const BUILTIN_TYPE_NUMBER = { kind: PreJavaTypeKind.BUILTIN, fqn: 'java.lang.Number' }
const BUILTIN_TYPE_BOOLEAN = { kind: PreJavaTypeKind.BUILTIN, fqn: 'java.lang.Boolean' }
const BUILTIN_TYPE_UNIT = { kind: PreJavaTypeKind.BUILTIN, fqn: 'void' }
const BUILTIN_TYPE_VOID = { kind: PreJavaTypeKind.BUILTIN, fqn: 'java.lang.Void' }

export class TsToPreJavaTypemap {
    typeMap = new Map<ts.Type, PreJavaType>()

    getOrCreatePreJavaTypeForTsType(tsType: ts.Type): PreJavaType {
        if (tsType.flags & ts.TypeFlags.Any)
            return BUILTIN_TYPE_OBJECT
        if (tsType.flags & ts.TypeFlags.StringLike)
            return BUILTIN_TYPE_STRING
        if (tsType.flags & ts.TypeFlags.StringLiteral)
            return BUILTIN_TYPE_STRING
        if (tsType.flags & ts.TypeFlags.Number)
            return BUILTIN_TYPE_NUMBER
        if (tsType.flags & ts.TypeFlags.NumberLiteral)
            return BUILTIN_TYPE_NUMBER
        if (tsType.flags & ts.TypeFlags.NumberLike)
            return BUILTIN_TYPE_NUMBER
        if (tsType.flags & ts.TypeFlags.Boolean)
            return BUILTIN_TYPE_BOOLEAN
        if (tsType.flags & ts.TypeFlags.BooleanLiteral)
            return BUILTIN_TYPE_BOOLEAN
        if (tsType.flags & ts.TypeFlags.BooleanLike)
            return BUILTIN_TYPE_BOOLEAN
        if (tsType.flags & ts.TypeFlags.Void)
            return BUILTIN_TYPE_UNIT
        if (tsType.flags & ts.TypeFlags.Undefined)
            return BUILTIN_TYPE_UNIT
        if (tsType.flags & ts.TypeFlags.Null)
            return BUILTIN_TYPE_VOID
        if (tsType.flags & ts.TypeFlags.Never)
            return BUILTIN_TYPE_VOID

        if (tsType.flags & ts.TypeFlags.TypeParameter) {
            let res: PreJavaTypeParameter = {
                kind: PreJavaTypeKind.TYPE_PARAMETER,
                name: (tsType as ts.TypeParameter).symbol.getName()
            }

            return res
        }

        if (this.typeMap.has(tsType))
            return this.typeMap.get(tsType)

        let preJavaType = new ClassOrInterfacePreJavaType()
        preJavaType.addSourceType(tsType)

        this.typeMap.set(tsType, preJavaType)

        return preJavaType
    }
}