import * as ts from "typescript";

export interface PreJavaTypeFormalParameter {
    name: string
    type: PreJavaType
}

export class PreJavaTypeCallSignature {
    typeParameters: PreJavaTypeParameter[]
    returnType: PreJavaType
    name: string
    parameters: PreJavaTypeFormalParameter[]
    comments: string[]

    constructor(typeParameters: PreJavaTypeParameter[], returnType: PreJavaType, name: string, parameters: PreJavaTypeFormalParameter[]) {
        this.typeParameters = typeParameters
        this.returnType = returnType
        this.name = name,
            this.parameters = parameters
    }

    addComments(comments: string[]) {
        if (!this.comments)
            this.comments = []
        comments && comments.forEach(c => this.comments.push(c))
    }

    serializeSignature(defaultName: string = null) {
        let res = ''

        if (this.comments && this.comments.length)
            res += this.comments.map(c => `/* ${c} */`).join('\n') + '\n'

        if (this.typeParameters) {
            res += '<'
            res += this.typeParameters.map(tp => {
                return tp.name + (tp.constraint ? ` extends ${tp.constraint.getName()}` : '')
            }).join()
            res += '> '
        }

        if (this.name)
            res += `${this.returnType.getName()} ${this.name}`
        else if (defaultName)
            res += `${defaultName}`

        if (this.parameters && this.parameters.length)
            res += `(${this.parameters.map(p => p.type.getName() + ' ' + p.name).join()})`
        else
            res += '()'
        return res
    }
}

export interface PreJavaTypeProperty {
    name: string
    type: PreJavaType
    writable?: boolean
    comments?: string[]
}

export interface CompletablePreJavaType {
    isProcessed(): boolean
    setProcessed()
}

export abstract class PreJavaType {
    sourceTypes: Set<ts.Type>

    abstract getName(): string
    abstract setName(name: string)

    abstract setPackageName(name: string)
    abstract getPackageName(): string

    abstract dump()

    abstract isCompletablePreJavaType(): CompletablePreJavaType

    addSourceType(type: ts.Type) {
        if (!this.sourceTypes)
            this.sourceTypes = new Set()
        this.sourceTypes.add(type)
    }
}

export class PreJavaTypeReference extends PreJavaType implements CompletablePreJavaType {
    type: PreJavaType
    typeParameters: PreJavaType[]

    private processed = false

    constructor(type: PreJavaType, typeParameters: PreJavaType[]) {
        super()
        this.type = type
        this.typeParameters = typeParameters
    }

    dump() { console.log(`TypeReference to ${this.type.getName()}`) }

    getName(): string {
        let referencedTypeName = this.type.getName()
        if (!referencedTypeName)
            return null
        return `${referencedTypeName}<${this.typeParameters.map(tp => tp.getName()).join(', ')}>`
    }

    setName(name: string) { }

    getPackageName(): string { return this.type.getPackageName() }

    setPackageName(name: string) { }

    isCompletablePreJavaType() { return this }

    isProcessed() { return this.processed }
    setProcessed() { this.processed = true }
}

export class PreJavaTypeEnum extends PreJavaType implements CompletablePreJavaType {
    packageName: string
    name: string
    members: {
        name: string
        value: number
    }[] = []

    private processed = false

    constructor(name: string) {
        super()
        this.name = name
    }

    dump() {
        console.log(`enum ${this.getName()}`)
        if (this.members && this.members.length)
            this.members.forEach(m => console.log(`enum member ${m.name} = ${m.value}`))
    }

    getName(): string { return this.name }

    setName(name: string) {
        if (!this.name)
            this.name = name
    }

    getPackageName(): string { return this.packageName }

    setPackageName(name: string) {
        if (!this.packageName)
            this.packageName = name
    }

    isCompletablePreJavaType() { return this }

    isProcessed() { return this.processed }
    setProcessed() { this.processed = true }
}

export class PreJavaTypeParameter extends PreJavaType {
    name: string
    constraint: PreJavaType

    constructor(name: string, constraint: PreJavaType) {
        super()
        this.name = name
        this.constraint = constraint
    }

    dump() { console.log(`TypeParameter ${this.name}`) }

    getName(): string {
        return this.name
    }

    setName(name: string) {
        if (this.name != null)
            this.name = name
    }

    getPackageName(): string { return null }

    setPackageName(name: string) { }

    isCompletablePreJavaType() { return null }
}

export class PreJavaTypeBuiltinJavaType extends PreJavaType {
    packageName: string
    name: string

    constructor(packageName: string, name: string) {
        super()
        this.packageName = packageName
        this.name = name
    }

    dump() { console.log(`Builtin type ${this.name}`) }

    getName(): string {
        return this.name
    }

    setName(name: string) { }

    getPackageName(): string { return this.packageName }

    setPackageName(name: string) { }

    isCompletablePreJavaType() { return null }
}

export class PreJavaTypeFakeType extends PreJavaTypeBuiltinJavaType {
    constructor(packageName: string, name: string) {
        super(packageName, name)
    }
}

export class PreJavaTypeUnion extends PreJavaType implements CompletablePreJavaType {
    packageName: string
    types: PreJavaType[]

    private processed = false

    constructor(types: PreJavaType[]) {
        super()
        this.types = []
        types.forEach(type => {
            if (this.types.indexOf(type) < 0)
                this.types.push(type)
        })
    }

    dump() {
        console.log(`UnionType ${this.getName()}`)
        if (this.types && this.types.length)
            this.types.forEach(t => console.log(`- ${t.getName()}`))
    }

    getName(): string {
        if ((!this.types) || this.types.length == 0)
            return 'EmptyUnion'

        return this.transformTypeName(this)
    }

    setName(name: string) { }

    getPackageName(): string { return this.packageName }

    setPackageName(name: string) {
        if (!this.packageName)
            this.packageName = name
    }

    isCompletablePreJavaType() { return this }

    isProcessed() { return this.processed }
    setProcessed() { this.processed = true }

    private transformTypeName(type: PreJavaType) {
        if (type instanceof PreJavaTypeClassOrInterface) {
            let res = type.name
            return res
        }

        if (type instanceof PreJavaTypeReference) {
            let res = this.transformTypeName(type.type)
            if (type.typeParameters && type.typeParameters.length)
                res += `Of${type.typeParameters.map(t => this.transformTypeName(t)).join('And')}`
            return res
        }

        if (type instanceof PreJavaTypeUnion) {
            return `UnionOf${type.types.map(t => this.transformTypeName(t)).join('And')}`
        }

        return type.getName()
    }

}

export class PreJavaTypeClassOrInterface extends PreJavaType implements CompletablePreJavaType {
    processed: boolean = false

    name: string = null
    packageName: string

    typeParameters: PreJavaTypeParameter[] = null

    baseTypes = new Set<PreJavaType>()
    prototypeNames = new Set<string>()

    constructorSignatures: PreJavaTypeCallSignature[] = []
    properties: PreJavaTypeProperty[] = []
    methods: PreJavaTypeCallSignature[] = []

    numberIndexType: PreJavaType
    stringIndexType: PreJavaType

    comments: string[]

    getPackageName() {
        return this.packageName
    }

    setPackageName(packageName: string) {
        if (!this.packageName)
            this.packageName = packageName
    }

    getName(): string {
        return this.name
    }

    setName(name: string) {
        if (name == '__type')
            return

        if (!this.name)
            this.name = name
    }

    isCompletablePreJavaType() { return this }

    isProcessed() { return this.processed }
    setProcessed() { this.processed = true }

    addComments(lines: string[]) {
        if (!this.comments)
            this.comments = []
        lines && lines.forEach(l => this.comments.push(l))
    }

    dump() {
        console.log(`name: ${this.name}`)

        if (this.packageName)
            console.log(`package: ${this.packageName}`)

        if (this.typeParameters && this.typeParameters.length) {
            console.log(`type parameters: ${this.typeParameters.map(tp => tp.name).join(', ')}`)
        }

        if (this.baseTypes && this.baseTypes.size) {
            console.log('base types:')
            this.baseTypes.forEach(type => console.log(`- ${type.getName()}`))
        }

        if (this.comments && this.comments.length) {
            console.log(`comments:`)
            this.comments.map(c => `/* ${c} */`).forEach(c => console.log(c))
        }

        if (this.prototypeNames && this.prototypeNames.size) {
            console.log(`prototypes:`)
            this.prototypeNames.forEach(name => console.log(name))
        }

        if (this.constructorSignatures && this.constructorSignatures.length) {
            console.log(`constructors:`)
            for (let constructorSignature of this.constructorSignatures) {
                console.log(constructorSignature.serializeSignature(this.name))
            }
        }

        if (this.properties && this.properties.length) {
            console.log(`properties:`)
            for (let property of this.properties) {
                if (property.comments && property.comments.length)
                    console.log(property.comments.map(c => `/* ${c} */`).join('\n'))
                console.log(`${property.type.getName()} ${property.name} ${property.writable ? '' : 'READ-ONLY'}`)
            }
        }

        if (this.numberIndexType) {
            console.log(`index by number: ${this.numberIndexType.getName()}`)
        }
        if (this.stringIndexType) {
            console.log(`index by string: ${this.stringIndexType.getName()}`)
        }

        if (this.methods && this.methods.length) {
            console.log(`methods:`)
            for (let method of this.methods) {
                console.log(method.serializeSignature())
            }
        }
    }

    addPrototypeName(namespace: string, name: string) {
        name = namespace ? `${namespace}.${name}` : name

        if (this.prototypeNames.size && !this.prototypeNames.has(name)) {
            console.log(`MULTIPLE PROTOTYPES when adding ${name}`)
            this.prototypeNames.forEach(p => console.log(`- ${p}`))
        }

        this.prototypeNames.add(name)
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

const BUILTIN_TYPE_OBJECT = new PreJavaTypeBuiltinJavaType('java.lang', 'Object')
const BUILTIN_TYPE_STRING = new PreJavaTypeBuiltinJavaType('java.lang', 'String')
const BUILTIN_TYPE_NUMBER = new PreJavaTypeBuiltinJavaType('java.lang', 'Number')
const BUILTIN_TYPE_BOOLEAN = new PreJavaTypeBuiltinJavaType('java.lang', 'Boolean')
const BUILTIN_TYPE_UNIT = new PreJavaTypeBuiltinJavaType(null, 'void')
const BUILTIN_TYPE_VOID = new PreJavaTypeBuiltinJavaType('java.lang', 'Void')

const FAKE_TYPE_INTERSECTION = new PreJavaTypeFakeType('gwt.ext', 'FakeIntersection')
const FAKE_TYPE_ESSYMBOL = new PreJavaTypeFakeType('gwt.ext', 'FakeEsSymbol')
const FAKE_TYPE_INDEXEDACCESS = new PreJavaTypeFakeType('gwt.ext', 'FakeIndexedAccess')

export class TsToPreJavaTypemap {
    typeMap = new Map<ts.Type, PreJavaType>()

    ensureAllTypesHaveName(currentIdAnonymousTypes: number) {
        for (let type of this.typeMap.values())
            if (type.getName() == null)
                type.setName(`AnonymousType_${currentIdAnonymousTypes++} `)
        return currentIdAnonymousTypes
    }

    private doesTypeUsesType(type: PreJavaType, usedType: PreJavaType) {
        if (type === usedType)
            return true

        if (type instanceof PreJavaTypeReference) {
            if (this.doesTypeUsesType(type.type, usedType))
                return true
            if (type.typeParameters && type.typeParameters.some(t => this.doesTypeUsesType(t, usedType)))
                return true
            return false
        }

        if (type instanceof PreJavaTypeUnion) {
            return type.types && type.types.some(t => this.doesTypeUsesType(t, usedType))
        }

        if (type instanceof PreJavaTypeClassOrInterface) {
            if (type.baseTypes && type.baseTypes.has(usedType))
                return true
        }

        return false
    }

    private removeTypeInTypes(typeToRemove: PreJavaType) {
        let signatureHasIndexedType = (sig: PreJavaTypeCallSignature) => {
            return (this.doesTypeUsesType(sig.returnType, typeToRemove))
                || (sig.typeParameters && sig.typeParameters.some(tp => this.doesTypeUsesType(tp.constraint, typeToRemove)))
                || (sig.parameters && sig.parameters.some(p => this.doesTypeUsesType(p.type, typeToRemove)))
        }

        let pruneType = (type: PreJavaTypeClassOrInterface) => {
            type.baseTypes.delete(typeToRemove)
            type.constructorSignatures = type.constructorSignatures.filter(s => !signatureHasIndexedType(s))
            type.methods = type.methods.filter(s => !signatureHasIndexedType(s))
            type.properties = type.properties.filter(p => !this.doesTypeUsesType(p.type, typeToRemove))
        }

        for (let type of this.typeMap.values()) {
            if (type instanceof PreJavaTypeClassOrInterface)
                pruneType(type)
            else if (type instanceof PreJavaTypeUnion) {
                type.types = type.types ? type.types.filter(t => t != typeToRemove) : null
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
        let developMethods = (type: PreJavaTypeClassOrInterface) => {
            // constructors and methods with union type parameters or inside parameters...
        }

        for (let type of this.typeMap.values())
            if (type instanceof PreJavaTypeClassOrInterface)
                developMethods(type)
    }

    getNotProcessedTypes(): (PreJavaType & CompletablePreJavaType)[] {
        let res: (PreJavaType & CompletablePreJavaType)[] = []
        this.typeMap.forEach(preJavaType => {
            let completablePreJavaType = preJavaType.isCompletablePreJavaType()
            if (completablePreJavaType && !completablePreJavaType.isProcessed())
                res.push(completablePreJavaType as (PreJavaType & CompletablePreJavaType))
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
        if (tsType.flags & ts.TypeFlags.StringLiteral)
            return BUILTIN_TYPE_STRING
        if (tsType.flags & ts.TypeFlags.Number)
            return BUILTIN_TYPE_NUMBER
        if (tsType.flags & ts.TypeFlags.NumberLiteral)
            return BUILTIN_TYPE_NUMBER
        if (tsType.flags & ts.TypeFlags.Boolean)
            return BUILTIN_TYPE_BOOLEAN
        if (tsType.flags & ts.TypeFlags.BooleanLiteral)
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
            return new PreJavaTypeParameter(symbol ? symbol.getName() : '?', this.getOrCreatePreJavaTypeForTsType((tsType as ts.TypeParameter).constraint))
        }

        if ((tsType.flags & ts.TypeFlags.Object) && ((tsType as ts.ObjectType).objectFlags & ts.ObjectFlags.Reference)) {
            let reference = tsType as ts.TypeReference
            if (reference.target != tsType) {
                return new PreJavaTypeReference(this.getOrCreatePreJavaTypeForTsType(reference.target), reference.typeArguments ? reference.typeArguments.map(typeArgument => this.getOrCreatePreJavaTypeForTsType(typeArgument)) : null)
            }
        }

        if (this.typeMap.has(tsType))
            return this.typeMap.get(tsType)

        if (tsType.flags & ts.TypeFlags.Union) {
            let unionType = tsType as ts.UnionType

            let res = new PreJavaTypeUnion(unionType.types.map(t => this.getOrCreatePreJavaTypeForTsType(t)))

            this.typeMap.set(tsType, res)

            return res
        }

        if (tsType.flags & ts.TypeFlags.Intersection) {
            // TODO : implement that
            return FAKE_TYPE_INTERSECTION
        }

        if (tsType.flags & ts.TypeFlags.Object) {
            let preJavaType = new PreJavaTypeClassOrInterface()
            preJavaType.addSourceType(tsType)

            this.typeMap.set(tsType, preJavaType)

            return preJavaType
        }

        if (tsType.flags & ts.TypeFlags.Enum) {
            if (tsType.getSymbol()) {
                let preJavaEnum = new PreJavaTypeEnum(tsType.getSymbol().getName())

                let enumType = tsType as ts.EnumType
                let enumDeclaration = tsType.getSymbol().valueDeclaration as ts.EnumDeclaration
                if (enumDeclaration.members && enumDeclaration.members.length) {
                    let memberValue = 0
                    for (let enumMember of enumDeclaration.members) {
                        let propertyName = enumMember.name
                        if (propertyName.kind == ts.SyntaxKind.Identifier) {
                            let memberName = (propertyName as ts.Identifier).text
                            if (enumMember.initializer) {
                                if (enumMember.initializer['text']) {
                                    let initializer = parseInt(enumMember.initializer['text'])
                                    if (initializer)
                                        memberValue = initializer
                                }
                            }

                            preJavaEnum.members.push({
                                name: memberName,
                                value: memberValue
                            })
                        }
                        else {
                            console.warn(`unsupported enum member`)
                        }

                        memberValue++
                    }
                }

                this.typeMap.set(tsType, preJavaEnum)
            }
        }

        if (tsType.flags & ts.TypeFlags.StringLike)
            return BUILTIN_TYPE_STRING
        if (tsType.flags & ts.TypeFlags.NumberLike)
            return BUILTIN_TYPE_NUMBER
        if (tsType.flags & ts.TypeFlags.BooleanLike)
            return BUILTIN_TYPE_BOOLEAN

        console.warn(`no mapping for ts type ${tsType} `)
        return BUILTIN_TYPE_OBJECT
    }
}