import * as ts from "typescript";

export interface PreJavaTypeFormalParameter {
    name: string
    type: PreJavaType
}

export interface PreJavaTypeCallSignature {
    typeParameters: PreJavaTypeParameter[]
    returnType: PreJavaType
    name: string
    parameters: PreJavaTypeFormalParameter[]
}

export interface PreJavaTypeProperty {
    name: string
    type: PreJavaType
    writable?: boolean
}

export enum PreJavaTypeKind {
    BUILTIN,
    CLASS_OR_INTERFACE,
    TYPE_PARAMETER,
    REFERENCE
}

export interface PreJavaType {
    kind: PreJavaTypeKind
}

export interface PreJavaTypeReference extends PreJavaType {
    kind: PreJavaTypeKind.REFERENCE

    type: PreJavaType
    typeParameters: PreJavaType[]
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

    dump()

    addSourceType(type: ts.Type)
    addPrototypeName(namespace: string, name: string)
    maybeSetTypeName(name: string)

    addBaseType(baseType: PreJavaType)
    addConstructorSignature(signature: PreJavaTypeCallSignature)
    addProperty(property: PreJavaTypeProperty)
    addMethod(method: PreJavaTypeCallSignature)
    setNumberIndexType(type: PreJavaType)
    setStringIndexType(type: PreJavaType)
}

export class ClassOrInterfacePreJavaType implements ClassOrInterfacePreJavaType {
    kind: PreJavaTypeKind.CLASS_OR_INTERFACE = PreJavaTypeKind.CLASS_OR_INTERFACE

    sourceTypes = new Set<ts.Type>()

    processed: boolean = false

    name: string = null

    baseTypes = new Set<PreJavaType>()
    prototypeNames = new Set<string>()

    constructorSignatures: PreJavaTypeCallSignature[] = []
    properties: PreJavaTypeProperty[] = []
    methods: PreJavaTypeCallSignature[] = []

    numberIndexType: PreJavaType
    stringIndexType: PreJavaType

    dump() {
        console.log(`name: ${this.name}`)

        if (this.prototypeNames && this.prototypeNames.size) {
            console.log(`prototypes`)
            this.prototypeNames.forEach(name => console.log(name))
        }

        if (this.constructorSignatures && this.constructorSignatures.length) {
            console.log(`constructors`)
            for (let constructorSignature of this.constructorSignatures) {
                console.log(this.serializeSignature(constructorSignature, this.name))
            }
        }

        if (this.properties && this.properties.length) {
            console.log(`properties`)
            for (let property of this.properties)
                console.log(`${this.getTypeName(property.type)} ${property.name} ${property.writable ? '' : 'READ-ONLY'}`)
        }

        if (this.methods && this.methods.length) {
            console.log(`methods`)
            for (let method of this.methods) {
                console.log(this.serializeSignature(method))
            }
        }
    }

    private serializeSignature(signature: PreJavaTypeCallSignature, defaultName: string = null) {
        let res = ''
        if (signature.typeParameters)
            res += `<${signature.typeParameters.map(tp => tp.name).join()}> `
        if (signature.name)
            res += `${this.getTypeName(signature.returnType)} ${signature.name}`
        else if (defaultName)
            res += `${defaultName}`
        if (signature.parameters && signature.parameters.length)
            res += `(${signature.parameters.map(p => this.getTypeName(p.type) + ' ' + p.name).join()})`
        else
            res += '()'
        return res
    }

    private getTypeName(type: PreJavaType): string {
        switch (type.kind) {
            case PreJavaTypeKind.BUILTIN:
                return (type as BuiltinJavaType).fqn

            case PreJavaTypeKind.TYPE_PARAMETER:
                return (type as PreJavaTypeParameter).name

            case PreJavaTypeKind.CLASS_OR_INTERFACE:
                return (type as ClassOrInterfacePreJavaType).prototypeNames.values().next().value

            case PreJavaTypeKind.REFERENCE:
                return this.getTypeName((type as PreJavaTypeReference).type) + '<...>'
        }
    }

    addSourceType(type: ts.Type) {
        this.sourceTypes.add(type)
    }

    addPrototypeName(namespace: string, name: string) {
        name = namespace ? `${namespace}.${name}` : name

        if (this.prototypeNames.size && !this.prototypeNames.has(name))
            console.log(`MULTIPLE PROTOTYPES ${this.prototypeNames} + ${name}`)

        this.prototypeNames.add(name)
    }

    maybeSetTypeName(name: string) {
        if (name == '__type')
            return
        if (this.name == null)
            this.name = name
    }

    addBaseType(baseType: PreJavaType) {
        this.baseTypes.add(baseType)
    }

    addConstructorSignature(signature: PreJavaTypeCallSignature) {
        this.constructorSignatures.push(signature)
    }

    addProperty(property: PreJavaTypeProperty) {
        this.properties.push(property)
    }

    addMethod(method: PreJavaTypeCallSignature) {
        this.methods.push(method)
    }

    setNumberIndexType(type: PreJavaType) {
        this.numberIndexType = type
    }

    setStringIndexType(type: PreJavaType) {
        this.stringIndexType = type
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

    getNotProcessedTypes(): ClassOrInterfacePreJavaType[] {
        let res: ClassOrInterfacePreJavaType[] = []
        this.typeMap.forEach(preJavaType => {
            if (preJavaType.kind == PreJavaTypeKind.CLASS_OR_INTERFACE && !(preJavaType as ClassOrInterfacePreJavaType).processed)
                res.push(preJavaType as ClassOrInterfacePreJavaType)
        })
        return res
    }

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

        if ((tsType.flags & ts.TypeFlags.Object) && ((tsType as ts.ObjectType).objectFlags & ts.ObjectFlags.Reference)) {
            let reference = tsType as ts.TypeReference
            if (reference.target != tsType) {
                let res: PreJavaTypeReference = {
                    kind: PreJavaTypeKind.REFERENCE,
                    type: this.getOrCreatePreJavaTypeForTsType(reference.target),
                    typeParameters: reference.typeArguments ? reference.typeArguments.map(typeArgument => this.getOrCreatePreJavaTypeForTsType(typeArgument)) : null
                }
                return res
            }
        }

        if (this.typeMap.has(tsType))
            return this.typeMap.get(tsType)

        let preJavaType = new ClassOrInterfacePreJavaType()
        preJavaType.addSourceType(tsType)

        this.typeMap.set(tsType, preJavaType)

        return preJavaType
    }
}