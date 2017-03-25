import {SyncPhase} from './processor.sync-phase';
import * as Model from './model';
import * as ts from 'typescript';

export interface Options {
    boxedType?: boolean;
    requiresClass?: boolean;
}

export class TypeHelper {
    constructor(private syncPhase: SyncPhase,
                public imports: { [key: string]: boolean }) {
    }

    getTypeName(type: ts.Type, options: Options = null): string {
        options = options || {};

        switch (type.flags) {
            case ts.TypeFlags.Boolean:
            case ts.TypeFlags.BooleanLike:
                return options.boxedType ? 'Boolean' : 'boolean';

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