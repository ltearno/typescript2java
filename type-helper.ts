import {SyncPhase} from './processor.sync-phase';
import * as ts from 'typescript';
import {childrenOf} from './tools';

export interface Options {
    boxedType?: boolean;
    requiresClass?: boolean;
}

export class TypeHelper {
    constructor(private syncPhase: SyncPhase,
                public imports: { [key: string]: boolean },
                public program: ts.Program) {
    }

    getTypeName(type: ts.Type, options: Options = null): string {
        options = options || {};

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
                        let returnType = this.getTypeName(this.program.getTypeChecker().getTypeAtLocation(functionType.type), {
                            requiresClass: true,
                            boxedType: true
                        });

                        let javaClassName = `JsFunction${parameters.length > 0 ? parameters.length : ''}`;

                        this.imports['fr.lteconsulting.angular2gwt.client.' + javaClassName] = true;

                        return `${javaClassName}<${parameters.map((p: ts.ParameterDeclaration) => this.getTypeName(this.program.getTypeChecker().getTypeAtLocation(p.type), {
                            requiresClass: true,
                            boxedType: true
                        }) + ',').join('')}${returnType}>`
                    }
                    if (declarationNode.kind == ts.SyntaxKind.ArrayType) {
                        this.imports['fr.lteconsulting.angular2gwt.client.JsArray'] = true;
                        let typeChildren = childrenOf(declarationNode);
                        if (typeChildren && typeChildren.length) {
                            let arrayType = this.getTypeName(this.program.getTypeChecker().getTypeAtLocation(typeChildren[0]));
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
                            return this.getTypeName(a);
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