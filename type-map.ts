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
    REFERENCE,
    UNION
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
    constraint: PreJavaType
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
    setTypeParameters(typeParameters: PreJavaTypeParameter[])

    addBaseType(baseType: PreJavaType)
    addConstructorSignature(signature: PreJavaTypeCallSignature)
    addProperty(property: PreJavaTypeProperty)
    addMethod(method: PreJavaTypeCallSignature)
    setNumberIndexType(type: PreJavaType)
    setStringIndexType(type: PreJavaType)
}

export interface PreJavaTypeUnion extends PreJavaType {
    kind: PreJavaTypeKind.UNION

    types: PreJavaType[]
}

export class ClassOrInterfacePreJavaType implements ClassOrInterfacePreJavaType {
    kind: PreJavaTypeKind.CLASS_OR_INTERFACE = PreJavaTypeKind.CLASS_OR_INTERFACE

    sourceTypes = new Set<ts.Type>()

    processed: boolean = false

    name: string = null

    typeParameters: PreJavaTypeParameter[] = null

    baseTypes = new Set<PreJavaType>()
    prototypeNames = new Set<string>()

    constructorSignatures: PreJavaTypeCallSignature[] = []
    properties: PreJavaTypeProperty[] = []
    methods: PreJavaTypeCallSignature[] = []

    numberIndexType: PreJavaType
    stringIndexType: PreJavaType

    dump() {
        console.log(`name: ${this.name}`)

        if (this.typeParameters && this.typeParameters.length) {
            console.log(`type parameters : ${this.typeParameters.map(tp => tp.name).join(', ')}`)
        }

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

        if (this.numberIndexType) {
            console.log(`index by number : ${this.getTypeName(this.numberIndexType)}`)
        }
        if (this.stringIndexType) {
            console.log(`index by string : ${this.getTypeName(this.stringIndexType)}`)
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

        if (signature.typeParameters) {
            res += '<'
            res += signature.typeParameters.map(tp => {
                return tp.name + (tp.constraint ? ` extends ${this.getTypeName(tp.constraint)}` : '')
            }).join()
            res += '> '
        }

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
                return (type as ClassOrInterfacePreJavaType).name

            case PreJavaTypeKind.REFERENCE: {
                let reference = type as PreJavaTypeReference
                return this.getTypeName(reference.type) + `<${reference.typeParameters.map(tp => this.getTypeName(tp)).join(', ')}>`
            }

            case PreJavaTypeKind.UNION:
                return `UnionOf${(type as PreJavaTypeUnion).types.map(t => this.getTypeName(t)).join('And')}`
        }

        return 'UNNAMMABLE NAME'
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

    setTypeParameters(typeParameters: PreJavaTypeParameter[]) {
        if (typeParameters)
            this.typeParameters = typeParameters
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

const FAKE_TYPE_INTERSECTION = { kind: PreJavaTypeKind.BUILTIN, fqn: 'java.lang.Object' }
const FAKE_TYPE_ESSYMBOL = { kind: PreJavaTypeKind.BUILTIN, fqn: 'java.lang.EsSymbol' }
const FAKE_TYPE_INDEXEDACCESS = { kind: PreJavaTypeKind.BUILTIN, fqn: 'java.lang.IndexedAccess' }

export class TsToPreJavaTypemap {
    typeMap = new Map<ts.Type, PreJavaType>()

    ensureAllTypesHaveName(currentIdAnonymousTypes: number) {
        for (let type of this.typeMap.values())
            if (type.kind == PreJavaTypeKind.CLASS_OR_INTERFACE) {
                let t = type as ClassOrInterfacePreJavaType
                if (t.name == null)
                    t.name = `AnonymousType_${currentIdAnonymousTypes++}`
            }
        return currentIdAnonymousTypes
    }

    private removeTypeInTypes(typeToRemove: PreJavaType) {
        function signatureHasIndexedType(sig: PreJavaTypeCallSignature) {
            return (sig.returnType === typeToRemove)
                || (sig.typeParameters && sig.typeParameters.some(tp => tp.constraint === typeToRemove))
                || (sig.parameters && sig.parameters.some(p => p.type === typeToRemove))
        }

        let pruneType = (type: ClassOrInterfacePreJavaType) => {
            type.baseTypes.delete(typeToRemove)
            type.constructorSignatures = type.constructorSignatures.filter(s => !signatureHasIndexedType(s))
            type.methods = type.methods.filter(s => !signatureHasIndexedType(s))
            type.properties = type.properties.filter(p => p.type != typeToRemove)
        }

        for (let type of this.typeMap.values()) {
            if (type.kind == PreJavaTypeKind.CLASS_OR_INTERFACE)
                pruneType(type as ClassOrInterfacePreJavaType)
            else if (type.kind == PreJavaTypeKind.UNION) {
                let union = type as PreJavaTypeUnion
                union.types = union.types ? union.types.filter(t => t != typeToRemove) : null
            }
        }
    }

    removeIndexedAccessTypes() {
        this.removeTypeInTypes(FAKE_TYPE_INDEXEDACCESS)
    }

    removeSymbolType() {
        this.removeTypeInTypes(FAKE_TYPE_ESSYMBOL)
    }

    developMethodOverridesForUnionParameters() {
        let developMethods = (type: ClassOrInterfacePreJavaType) => {
            // constructors and methods with union type parameters or inside parameters...
        }

        for (let type of this.typeMap.values())
            if (type.kind == PreJavaTypeKind.CLASS_OR_INTERFACE)
                developMethods(type as ClassOrInterfacePreJavaType)
    }

    getNotProcessedTypes(): ClassOrInterfacePreJavaType[] {
        let res: ClassOrInterfacePreJavaType[] = []
        this.typeMap.forEach(preJavaType => {
            if (preJavaType.kind == PreJavaTypeKind.CLASS_OR_INTERFACE && !(preJavaType as ClassOrInterfacePreJavaType).processed)
                res.push(preJavaType as ClassOrInterfacePreJavaType)
        })
        return res
    }

    getOrCreatePreJavaTypeForTsType(tsType: ts.Type): PreJavaType {
        if (!tsType)
            return null

        if (tsType.flags & ts.TypeFlags.Any)
            return BUILTIN_TYPE_OBJECT
        if (tsType.flags & ts.TypeFlags.NonPrimitive)
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

        if (tsType.flags & ts.TypeFlags.ESSymbol)
            return FAKE_TYPE_ESSYMBOL

        if (tsType.flags & ts.TypeFlags.IndexedAccess)
            return FAKE_TYPE_INDEXEDACCESS

        if (tsType.flags & ts.TypeFlags.TypeParameter) {
            let symbol = (tsType as ts.TypeParameter).getSymbol()
            let res: PreJavaTypeParameter = {
                kind: PreJavaTypeKind.TYPE_PARAMETER,
                name: symbol ? symbol.getName() : '?',
                constraint: this.getOrCreatePreJavaTypeForTsType((tsType as ts.TypeParameter).constraint)
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

        if (tsType.flags & ts.TypeFlags.Union) {
            let unionType = tsType as ts.UnionType

            let res: PreJavaTypeUnion = {
                kind: PreJavaTypeKind.UNION,
                types: unionType.types.map(t => this.getOrCreatePreJavaTypeForTsType(t))
            }

            this.typeMap.set(tsType, res)

            return res
        }

        if (tsType.flags & ts.TypeFlags.Intersection) {
            // TODO : implement that
            return FAKE_TYPE_INTERSECTION
        }

        if (tsType.flags & ts.TypeFlags.Object) {
            let preJavaType = new ClassOrInterfacePreJavaType()
            preJavaType.addSourceType(tsType)

            this.typeMap.set(tsType, preJavaType)

            return preJavaType
        }

        console.warn(`no mapping for ts type ${tsType}`)
        return BUILTIN_TYPE_OBJECT
    }
}