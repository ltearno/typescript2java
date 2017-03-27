import {SyncPhase} from './processor.sync-phase';
import * as ts from 'typescript';
import {childrenOf, firstChildOf} from './tools';

export interface Options {
    boxedType?: boolean;
    requiresClass?: boolean;
}

export class TypeHelper {
    constructor(private syncPhase: SyncPhase,
                public imports: { [key: string]: boolean },
                public program: ts.Program) {
    }

    getTypeName(typeReferenceNode: ts.Node, options: Options = null): string {
        options = options || {};

        let typeReferenceType = this.program.getTypeChecker().getTypeAtLocation(typeReferenceNode);

        switch (typeReferenceNode.kind) {
            case ts.SyntaxKind.UnionType :
                return "Object /* UnionType */";

            case ts.SyntaxKind.IntersectionType:
                return "Object /* IntersectionType */";

            case ts.SyntaxKind.ParenthesizedType:
                return this.getTypeName((typeReferenceNode as ts.ParenthesizedTypeNode).type, options);

            case ts.SyntaxKind.TypeLiteral: {
                let typeLiteral = typeReferenceNode as ts.TypeLiteralNode;

                if (typeLiteral.members && typeLiteral.members.length > 0 && typeLiteral.members[0].kind == ts.SyntaxKind.IndexSignature) {
                    let indexSignature = <ts.IndexSignatureDeclaration> firstChildOf(typeReferenceNode);
                    let keyType = indexSignature.parameters[0].type;
                    let valueType = indexSignature.type;

                    let nameToImport = `fr.lteconsulting.angular2gwt.client.JsTypedObject`;
                    this.imports[nameToImport] = true;

                    return `JsTypedObject<${this.getTypeName(keyType, {
                        boxedType: true,
                        requiresClass: true
                    })},${this.getTypeName(valueType, {
                        boxedType: true,
                        requiresClass: true
                    })}>`
                }

                return "/* TypeLiteral */ Object";
            }

            case ts.SyntaxKind.ArrayType : {
                this.imports['fr.lteconsulting.angular2gwt.client.JsArray'] = true;

                let typeChildren = childrenOf(typeReferenceNode);
                if (typeChildren && typeChildren.length)
                    return `JsArray<${this.getTypeName(typeChildren[0], {requiresClass: true, boxedType: true})}>`;

                return 'JsArray<Object>';
            }
        }

        return this.__getTypeName(typeReferenceType, options);
    }

    __getTypeName(type: ts.Type, options: Options = null): string {
        if (type.flags & ts.TypeFlags.Boolean || type.flags & ts.TypeFlags.BooleanLike)
            return options.boxedType ? 'Boolean' : 'boolean';

        switch (type.flags) {
            case ts.TypeFlags.Number:
                return 'Number';

            case ts.TypeFlags.Void:
                return options.boxedType ? 'Void' : 'void';

            case ts.TypeFlags.Union:
                return 'Object /* Union type */';

            case ts.TypeFlags.String:
                return 'String';

            case ts.TypeFlags.TypeParameter:
                return (type as ts.TypeParameter).symbol.name;

            case ts.TypeFlags.Object: {
                let objectType = type as ts.ObjectType;

                let javaNodes = this.syncPhase.symbols.get(objectType.symbol);
                if (!javaNodes) {
                    let declarationNode = type.symbol.getDeclarations()[0];
                    if (declarationNode.kind == ts.SyntaxKind.FunctionType) {
                        let functionType = <ts.FunctionTypeNode>declarationNode;

                        let parameters = functionType.parameters;
                        let returnType = this.__getTypeName(this.program.getTypeChecker().getTypeAtLocation(functionType.type), {
                            requiresClass: true,
                            boxedType: true
                        });

                        let javaClassName = `JsFunction${parameters.length > 0 ? parameters.length : ''}`;

                        this.imports['fr.lteconsulting.angular2gwt.client.' + javaClassName] = true;

                        return `${javaClassName}<${parameters.map((p: ts.ParameterDeclaration) => this.__getTypeName(this.program.getTypeChecker().getTypeAtLocation(p.type), {
                            requiresClass: true,
                            boxedType: true
                        }) + ',').join('')}${returnType}>`
                    }
                    if (declarationNode.kind == ts.SyntaxKind.ArrayType) {
                        this.imports['fr.lteconsulting.angular2gwt.client.JsArray'] = true;
                        let typeChildren = childrenOf(declarationNode);
                        if (typeChildren && typeChildren.length) {
                            let arrayType = this.__getTypeName(this.program.getTypeChecker().getTypeAtLocation(typeChildren[0]));
                            return `JsArray<${arrayType}>`;
                        }
                        return 'JsArray<Object>';
                    }

                    console.error(`no JavaNode for symbol ${objectType.symbol.name}`);
                    return 'Object /* no JavaNode for symbol */';
                }

                let implementedInterface = javaNodes[options.requiresClass ? (javaNodes.length - 1) : 0];

                let token = implementedInterface.name;
                if (objectType.objectFlags & ts.ObjectFlags.Reference) {
                    let typeReference = objectType as ts.TypeReference;
                    let typeArguments = typeReference.typeArguments;
                    if (typeArguments) {
                        token += `<${typeArguments.map(a => {
                            return this.__getTypeName(a);
                        }).join(', ')}>`;
                    }
                }

                // maybe import the Java name
                this.imports[`${implementedInterface.packageName}.${implementedInterface.name}`] = true;

                // return the Java name for the type
                return token;
            }

            case ts.TypeFlags.Any:
            default:
                return 'Object';
        }
    }
}