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
                return tp.name + (tp.constraint ? ` extends ${tp.constraint.getParametrizedSimpleName()}` : '')
            }).join()
            res += '> '
        }

        if (this.name)
            res += `${this.returnType.getParametrizedSimpleName()} ${this.name}`
        else if (defaultName)
            res += `${defaultName}`

        if (this.parameters && this.parameters.length)
            res += `(${this.parameters.map(p => p.type.getParametrizedSimpleName() + ' ' + p.name).join()})`
        else
            res += '()'
        return res
    }

    substituteType(replacer: TypeReplacer, cache: Map<PreJavaType, PreJavaType>, passThroughTypes: Set<PreJavaType>): PreJavaTypeCallSignature {
        let noCache = cache as Map<any, any>
        if (noCache.has(this))
            return noCache.get(this)

        let res = (() => {
            if (this.returnType) {
                this.returnType = this.returnType.substituteType(replacer, cache, passThroughTypes)
                if (!this.returnType)
                    return null
            }

            if (this.typeParameters)
                this.typeParameters = this.typeParameters.map(tp => tp.substituteType(replacer, cache, passThroughTypes)).filter(tp => tp != null) as PreJavaTypeParameter[]

            if (this.parameters) {
                this.parameters = this.parameters.map(p => {
                    p.type = p.type.substituteType(replacer, cache, passThroughTypes)
                    if (!p.type)
                        return null
                    return p
                })

                if (this.parameters.some(p => p == null))
                    return null
            }

            return this
        })()

        noCache.set(this, res)

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

export type TypeReplacer = { (type: PreJavaType): PreJavaType }

export abstract class PreJavaType {
    sourceTypes: Set<ts.Type>

    abstract getSimpleName(): string
    abstract setSimpleName(name: string)

    abstract setPackageName(name: string)
    abstract getPackageName(): string

    abstract getParametrization(): string

    getParametrizedSimpleName(): string {
        let simpleName = this.getSimpleName()
        if (!simpleName)
            return null
        let parametrization = this.getParametrization()
        return simpleName + (parametrization ? parametrization : '')
    }

    getFullyQualifiedName(): string {
        return `${this.getPackageName()}.${this.getSimpleName()}`
    }

    getParametrizedFullyQualifiedName(): string {
        return `${this.getPackageName()}.${this.getParametrizedSimpleName()}`
    }

    abstract isClassLike(): boolean

    abstract dump()

    abstract isCompletablePreJavaType(): CompletablePreJavaType

    /** returns the type by which it should be substituted */
    abstract substituteTypeReal(replacer: TypeReplacer, cache: Map<PreJavaType, PreJavaType>, passThroughTypes: Set<PreJavaType>): PreJavaType
    substituteType(replacer: TypeReplacer, cache: Map<PreJavaType, PreJavaType>, passThroughTypes: Set<PreJavaType>): PreJavaType {
        if (cache.has(this))
            return cache.get(this)

        if (passThroughTypes == null)
            passThroughTypes = new Set()
        else if (passThroughTypes.has(this))
            return this
        passThroughTypes.add(this)

        let res = this.substituteTypeReal(replacer, cache, passThroughTypes)
        cache.set(this, res)
        return res
    }

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

    dump() { console.log(`TypeReference to ${this.type.getParametrizedSimpleName()}`) }

    getParametrization(): string {
        if (this.typeParameters && this.typeParameters.length)
            return `<${this.typeParameters.map(tp => tp.getParametrizedSimpleName()).join(', ')}>`
        return ''
    }

    setSimpleName(name: string) { }

    getSimpleName(): string { return this.type.getSimpleName() }

    getPackageName(): string { return this.type.getPackageName() }

    setPackageName(name: string) { }

    isClassLike() { return this.type.isClassLike() }

    isCompletablePreJavaType() { return this }

    isProcessed() { return this.processed }
    setProcessed() { this.processed = true }

    substituteTypeReal(replacer: TypeReplacer, cache: Map<PreJavaType, PreJavaType>, passThroughTypes: Set<PreJavaType>): PreJavaType {
        let stay = replacer(this)
        if (!stay || stay != this)
            return null

        this.type = replacer(this.type)
        if (!this.type)
            return null

        if (this.typeParameters)
            this.typeParameters = this.typeParameters.map(p => p.substituteType(replacer, cache, passThroughTypes)).filter(p => p != null)

        return this
    }
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
        console.log(`enum ${this.getParametrizedSimpleName()}`)
        if (this.members && this.members.length)
            this.members.forEach(m => console.log(`enum member ${m.name} = ${m.value}`))
    }

    getParametrization(): string { return '' }

    setSimpleName(name: string) {
        if (!this.name)
            this.name = name
    }

    getSimpleName(): string { return this.name }

    getPackageName(): string { return this.packageName }

    setPackageName(name: string) {
        if (!this.packageName)
            this.packageName = name
    }

    isClassLike() { return true }

    isCompletablePreJavaType() { return this }

    isProcessed() { return this.processed }
    setProcessed() { this.processed = true }

    substituteTypeReal(replacer: TypeReplacer, cache: Map<PreJavaType, PreJavaType>): PreJavaType { return replacer(this) }
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

    getParametrization(): string { return '' }

    setSimpleName(name: string) {
        if (this.name != null)
            this.name = name
    }

    getSimpleName(): string { return this.name }

    getPackageName(): string { return null }

    setPackageName(name: string) { }

    isClassLike() { return false }

    isCompletablePreJavaType() { return null }

    substituteTypeReal(replacer: TypeReplacer, cache: Map<PreJavaType, PreJavaType>, passThroughTypes: Set<PreJavaType>): PreJavaType {
        let stay = replacer(this)
        if (!stay || stay != this)
            return null

        if (this.constraint)
            this.constraint = this.constraint.substituteType(replacer, cache, passThroughTypes)

        return this
    }
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

    getParametrization(): string { return '' }

    setSimpleName(name: string) { }

    getSimpleName(): string { return this.name }

    getPackageName(): string { return this.packageName }

    setPackageName(name: string) { }

    isClassLike() { return true }

    isCompletablePreJavaType() { return null }

    substituteTypeReal(replacer: TypeReplacer, cache: Map<PreJavaType, PreJavaType>): PreJavaType { return replacer(this) }
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
        console.log(`UnionType ${this.getParametrizedSimpleName()}`)
        if (this.types && this.types.length)
            this.types.forEach(t => console.log(`- ${t.getParametrizedSimpleName()}`))
    }


    // TODO : ADD TYPE PARAMETERS IF ANY, BUT FOR NOW THE DATA DOES NOT EXISTS IN THE UNION PJT STRUCTURE
    getParametrization(): string { return '' }

    setSimpleName(name: string) { }

    getSimpleName(): string {
        if ((!this.types) || this.types.length == 0)
            return 'EmptyUnion'

        return this.transformTypeName(this).replace(new RegExp('\\?', 'g'), 'UNKOWNTYPE')
    }

    getPackageName(): string { return this.packageName }

    setPackageName(name: string) {
        if (!this.packageName)
            this.packageName = name
    }

    isClassLike() { return false }

    isCompletablePreJavaType() { return this }

    isProcessed() { return this.processed }
    setProcessed() { this.processed = true }

    substituteTypeReal(replacer: TypeReplacer, cache: Map<PreJavaType, PreJavaType>, passThroughTypes: Set<PreJavaType>): PreJavaType {
        let stay = replacer(this)
        if (!stay || stay != this)
            return stay

        if (this.types)
            this.types = this.types.map(t => t.substituteType(replacer, cache, passThroughTypes)).filter(t => t != null)

        return this
    }

    private transformTypeName(type: PreJavaType): string {
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

        return type.getSimpleName()
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

    /** sometimes interfaces are better presented as classes so that DTO instantiation is easier in Java */
    shouldOutputClass: boolean

    isClassLike() { return this.shouldOutputClass || (this.prototypeNames && this.prototypeNames.size > 0) }

    hasOnlyProperties() {
        if (this.baseTypes && this.baseTypes.size)
            return false

        if (this.constructorSignatures && this.constructorSignatures.length)
            return false

        if (this.methods && this.methods.length)
            return false

        return true
    }

    substituteTypeReal(replacer: TypeReplacer, cache: Map<PreJavaType, PreJavaType>, passThroughTypes: Set<PreJavaType>): PreJavaType {
        let stay = replacer(this)
        if (!stay || stay != this)
            return stay

        if (this.typeParameters)
            this.typeParameters = this.typeParameters.map(tp => tp.substituteType(replacer, cache, passThroughTypes)).filter(tp => tp != null) as PreJavaTypeParameter[]

        let baseTypes = this.baseTypes
        if (baseTypes) {
            this.baseTypes = new Set()
            baseTypes.forEach(type => {
                let sub = type.substituteType(replacer, cache, passThroughTypes)
                if (sub)
                    this.baseTypes.add(sub)
            })
        }

        if (this.constructorSignatures)
            this.constructorSignatures = this.constructorSignatures.map(s => s.substituteType(replacer, cache, passThroughTypes)).filter(s => s != null)

        if (this.properties) {
            this.properties = this.properties.map(p => {
                p.type = replacer(p.type)
                if (!p.type)
                    return null
                return p
            }).filter(p => p != null)
        }

        if (this.methods)
            this.methods = this.methods.map(s => s.substituteType(replacer, cache, passThroughTypes)).filter(s => s != null)

        if (this.numberIndexType)
            this.numberIndexType = this.numberIndexType.substituteType(replacer, cache, passThroughTypes)

        if (this.stringIndexType)
            this.stringIndexType = this.stringIndexType.substituteType(replacer, cache, passThroughTypes)

        return this
    }

    getPackageName() {
        return this.packageName
    }

    setPackageName(packageName: string) {
        if (!this.packageName)
            this.packageName = packageName
    }

    getParametrization(): string {
        if (this.typeParameters && this.typeParameters.length)
            return `<${this.typeParameters.map(tp => tp.name).join(', ')}>`
        else
            return ''
    }

    setSimpleName(name: string) {
        if (name == '__type')
            return

        if (!this.name)
            this.name = name
    }

    getSimpleName(): string { return this.name }

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
            this.baseTypes.forEach(type => console.log(`- ${type.getParametrizedSimpleName()}`))
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
                console.log(`${property.type.getParametrizedSimpleName()} ${property.name} ${property.writable ? '' : 'READ-ONLY'}`)
            }
        }

        if (this.numberIndexType) {
            console.log(`index by number: ${this.numberIndexType.getParametrizedSimpleName()}`)
        }
        if (this.stringIndexType) {
            console.log(`index by string: ${this.stringIndexType.getParametrizedSimpleName()}`)
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

    ensureAllTypesHaveName(currentIdAnonymousTypes: number, defaultPackageName: string) {
        for (let type of this.typeMap.values()) {
            if (type.getParametrizedSimpleName() == null)
                type.setSimpleName(`AnonymousType_${currentIdAnonymousTypes++}`)
            if (defaultPackageName && !type.getPackageName())
                type.setPackageName(defaultPackageName)
        }
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

    private substituteType(replacer: TypeReplacer) {
        let cache = new Map<PreJavaType, PreJavaType>()

        for (let [tsType, type] of this.typeMap.entries()) {
            let substitute = type.substituteType(replacer, cache, new Set())
            if (!substitute)
                this.typeMap.delete(tsType)
            else if (substitute != type)
                this.typeMap.set(tsType, substitute)
        }
    }

    hasSubType(type: PreJavaType) {
        for (let type of this.typeMap.values()) {
            if (type instanceof PreJavaTypeClassOrInterface && type.baseTypes && type.baseTypes.has(type))
                return true
        }

        return false
    }

    simplifyUnions() {
        let typesToSimplifyToObject: PreJavaType[] = []
        let typesToSimplifyToOnlyType: PreJavaType[] = []

        for (let type of this.typeMap.values()) {
            if (type instanceof PreJavaTypeUnion) {
                if (!type.types || !type.types.length)
                    typesToSimplifyToObject.push(type)
                else if (type.types.length == 1)
                    typesToSimplifyToOnlyType.push(type)
            }
        }

        typesToSimplifyToObject.forEach(type => this.substituteType(t => t != type ? t : BUILTIN_TYPE_OBJECT))
        typesToSimplifyToOnlyType.forEach(type => this.substituteType(t => {
            if (t != type)
                return t
            else
                return (type as PreJavaTypeUnion).types[0]
        }))
    }

    removeNotSupportedTypes() {
        this.substituteType((type) => type instanceof PreJavaTypeFakeType ? null : type)
        this.substituteType((type) => type.getSimpleName() == '?' ? BUILTIN_TYPE_OBJECT : type)
        this.substituteType((type) => type.getSimpleName() == '' ? null : type)
    }

    changeDtoInterfacesIntoClasses() {
        let nb = 0
        for (let type of this.typeMap.values()) {
            if (type instanceof PreJavaTypeClassOrInterface && type.hasOnlyProperties() && !this.hasSubType(type)) {
                type.shouldOutputClass = true
                nb++
            }
        }
        console.log(`${nb} DTO types converted to classes`)
    }

    arrangeMultipleImplementationInheritance() {
        for (let type of this.typeMap.values()) {
            if (type instanceof PreJavaTypeClassOrInterface && type.baseTypes && type.baseTypes.size > 1) {
                let implementationSuperTypes: PreJavaTypeClassOrInterface[] = []
                for (let superType of type.baseTypes.values()) {
                    if (superType instanceof PreJavaTypeClassOrInterface && superType.isClassLike()) {
                        implementationSuperTypes.push(superType)
                    }
                }
                if (implementationSuperTypes.length < 2)
                    continue

                let nbConstructors = type.constructorSignatures && type.constructorSignatures.length

                console.log(`MULTIPLE TYPE ${type.getParametrizedFullyQualifiedName()} with ${nbConstructors} constructors`)

                for (let superType of implementationSuperTypes) {
                    // super_type doit maintenant être une interface => on le transforme comme ca tout le monde pointe vers l'interface
                    let newType = new PreJavaTypeClassOrInterface()
                    newType.baseTypes = new Set()
                    newType.baseTypes.add(superType)
                    newType.comments = superType.comments && superType.comments.slice()
                    newType.constructorSignatures = superType.constructorSignatures
                    newType.methods = superType.methods && superType.methods.slice()
                    newType.name = superType.name + '_'
                    newType.numberIndexType = superType.numberIndexType
                    newType.stringIndexType = superType.stringIndexType
                    newType.packageName = superType.packageName
                    newType.processed = false
                    newType.properties = superType.properties && superType.properties.slice()
                    newType.prototypeNames = superType.prototypeNames
                    newType.shouldOutputClass = true
                    newType.typeParameters = superType.typeParameters && superType.typeParameters.slice()
                    newType.sourceTypes = superType.sourceTypes

                    superType.shouldOutputClass = false
                    superType.constructorSignatures = null
                    superType.prototypeNames = null

                    this.typeMap.set({} as ts.Type, newType)
                }
            }
        }
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