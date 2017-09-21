import * as ts from "typescript";
import { PreJavaType, ProcessContext, TypeReplacer } from './PreJavaType'
import { PreJavaTypeParameter } from './PreJavaTypeParameter'
import { PreJavaTypeTPEnvironnement, PreJavaTypeReference } from './PreJavaTypeReference'
import { PreJavaTypeCallSignature, PreJavaTypeFormalParameter } from './PreJavaTypeCallSignature'
import * as Visit from './PreJavaTypeVisit'
import * as Signature from '../signature'
import * as tsTools from '../ts-tools'
import * as typeTools from '../type-tools'

let nextTypeId = 1

export interface PreJavaTypeProperty {
    name: string
    type: PreJavaType
    writable?: boolean
    comments?: string[]
}

export class PreJavaTypeClassOrInterface extends PreJavaType {
    sourceTypes: Set<ts.Type> = new Set()
    isAnonymousSourceType = true

    name: string = null
    packageName: string

    typeParameters: PreJavaTypeParameter[] = null

    baseTypes = new Set<PreJavaType>()
    prototypeNames = new Set<string>()

    constructorSignatures: PreJavaTypeCallSignature[] = []
    callSignatures: PreJavaTypeCallSignature[] = []
    properties: PreJavaTypeProperty[] = []
    methods: PreJavaTypeCallSignature[] = []
    staticProperties: PreJavaTypeProperty[] = []
    staticMethods: PreJavaTypeCallSignature[] = []

    numberIndexType: PreJavaType
    stringIndexType: PreJavaType

    comments: string[]

    isClass: boolean

    getSourceTypes(): Set<ts.Type> { return this.sourceTypes }

    isClassLike() { return this.isClass }

    getHierachyDepth() {
        let level = 1
        if (this.baseTypes) {
            this.baseTypes.forEach(baseType => {
                let maybeLevel = 1 + baseType.getHierachyDepth()
                if (maybeLevel > level)
                    level = maybeLevel
            })
        }
        return level
    }

    removeMethod(method: PreJavaTypeCallSignature) {
        let index = this.methods.indexOf(method)
        if (index >= 0)
            this.methods.splice(index, 1)
    }

    processSourceType(type: ts.Type, typeParametersToApplyToAnonymousTypes: PreJavaTypeParameter[], context: ProcessContext) {
        if (!type || this.sourceTypes.has(type))
            return

        this.sourceTypes.add(type)

        this.extractTypeParameters(type as ts.ObjectType, typeParametersToApplyToAnonymousTypes, context)
        this.extractBaseTypes(type, typeParametersToApplyToAnonymousTypes, context)
        this.extractName(type, context)
        this.extractPrototypeAndNamespace(type, context)
        this.extractConstructor(type, context)
        this.extractComments(type)
        this.extractIndexTypes(type, context)
        this.extractPropertiesAndMethods(type as ts.InterfaceTypeWithDeclaredMembers, context)
    }

    private extractTypeParameters(type: ts.Type, typeParametersToApplyToAnonymousTypes: PreJavaTypeParameter[], context: ProcessContext) {
        if (!(type.flags & ts.TypeFlags.Object))
            return

        let objectType = type as ts.ObjectType

        if (objectType.objectFlags & ts.ObjectFlags.Anonymous) {
            this.setTypeParameters((typeParametersToApplyToAnonymousTypes && typeParametersToApplyToAnonymousTypes.length) ? typeParametersToApplyToAnonymousTypes.slice() : null)
        }
        else if (objectType.objectFlags & ts.ObjectFlags.Class || objectType.objectFlags & ts.ObjectFlags.Interface) {
            let interfaceType = objectType as ts.InterfaceType

            if (interfaceType.typeParameters && interfaceType.typeParameters.length) {
                this.setTypeParameters(interfaceType.typeParameters.map(tp => {
                    let constraint: PreJavaType = null
                    if (tp.symbol && tp.symbol.declarations && tp.symbol.declarations[0] && tp.symbol.declarations[0].kind == ts.SyntaxKind.TypeParameter) {
                        let ss = tp.symbol.declarations[0] as ts.TypeParameterDeclaration
                        if (ss && ss.constraint)
                            constraint = context.getTypeMap().getOrCreatePreJavaTypeForTsType(context.getProgram().getTypeChecker().getTypeAtLocation(ss.constraint), false, null)
                    }

                    return new PreJavaTypeParameter(tp.symbol.getName(), constraint)
                }))
            }
        }
    }

    private extractBaseTypes(type: ts.Type, typeParametersToApplyToAnonymousTypes: PreJavaTypeParameter[], context: ProcessContext) {
        /* ts.Type.getBaseTypes() does not return 'implemented' types, only 'extended'. We merge them in the PreJava tree */
        if (type.symbol && type.symbol.getDeclarations()) {
            type.symbol.getDeclarations().forEach(decl => {
                let classLikeDeclaration = decl as ts.ClassLikeDeclaration
                if (classLikeDeclaration.heritageClauses && classLikeDeclaration.heritageClauses.length) {
                    classLikeDeclaration.heritageClauses.forEach(heritageClause => {
                        heritageClause.types.forEach(baseTypeNode => {
                            let baseType = context.getProgram().getTypeChecker().getTypeAtLocation(baseTypeNode)
                            this.addBaseType(context.getTypeMap().getOrCreatePreJavaTypeForTsType(baseType, false, this.typeParameters))
                        })
                    })
                }
            })
        }
        else {
            let baseTypes = type.getBaseTypes()
            if (baseTypes) {
                baseTypes.forEach(baseType => {
                    this.addBaseType(context.getTypeMap().getOrCreatePreJavaTypeForTsType(baseType, false, this.typeParameters))
                })
            }
        }
    }

    private extractName(type: ts.Type, context: ProcessContext) {
        let symbol = type.getSymbol()

        if (symbol && ((symbol.flags & ts.SymbolFlags.Class) || (symbol.flags & ts.SymbolFlags.Interface))) {
            this.setSimpleName(symbol.getName())
            this.isAnonymousSourceType = false
        }
        else {
            this.setSimpleName(context.createAnonymousTypeName())
            this.isAnonymousSourceType = true
        }
    }

    private findConstructorOfType(type: ts.Type, typeEnv: { [key: string]: PreJavaType }, context: ProcessContext): PreJavaTypeCallSignature {
        let constructorSymbol = tsTools.getConstructorSymbolOfType(type, context.getProgram().getTypeChecker())
        if (constructorSymbol) {
            let signature = context.getTypeMap().convertSignature(null, constructorSymbol, this.typeParameters)

            if (typeEnv) {
                signature.parameters = signature.parameters.map(parameter => {
                    return {
                        name: parameter.name,
                        dotdotdot: parameter.dotdotdot,
                        optional: parameter.optional,
                        type: new PreJavaTypeTPEnvironnement(parameter.type, typeEnv)
                    }
                })
                signature.returnType = new PreJavaTypeTPEnvironnement(signature.returnType, typeEnv)
            }

            return signature
        }

        let baseTypes = type.getBaseTypes()
        if (baseTypes) {
            for (let baseType of baseTypes) {
                let preJavaType = context.getTypeMap().getOrCreatePreJavaTypeForTsType(baseType, false, this.typeParameters)

                Visit.visitPreJavaType(preJavaType, {
                    caseReferenceType: (refType) => {
                        let oldTypeEnv = typeEnv
                        typeEnv = {}
                        let referencedType = refType.type as PreJavaTypeClassOrInterface
                        for (let i = 0; i < referencedType.typeParameters.length; i++) {
                            // take into account previous environment
                            let value = refType.typeParameters[i]
                            if (value instanceof PreJavaTypeParameter && oldTypeEnv && value.name in oldTypeEnv) {
                                value = oldTypeEnv[value.name]
                            }
                            typeEnv[referencedType.typeParameters[i].name] = value
                        }
                    },
                    onOther: t => typeEnv = null
                })

                if (baseType.flags & ts.TypeFlags.Object) {
                    let objectType = baseType as ts.ObjectType
                    if (objectType.objectFlags & ts.ObjectFlags.Reference) {
                        let referenceType = objectType as ts.TypeReference
                        if (referenceType.target != baseType)
                            baseType = referenceType.target
                    }
                }

                let baseTypeConstructor = this.findConstructorOfType(baseType, typeEnv, context)
                if (baseTypeConstructor)
                    return baseTypeConstructor
            }
        }
        return null
    }

    private extractComments(type: ts.Type) {
        let symbol = type.getSymbol()
        if (!symbol)
            return

        let comments = this.getCommentFromSymbol(symbol)
        if (comments && comments.length > 0)
            this.addComments(comments)
    }

    private extractPrototypeAndNamespace(type: ts.Type, context: ProcessContext) {
        let symbol = type.getSymbol()
        if (!symbol)
            return

        let declaration = symbol.valueDeclaration || (symbol.declarations && symbol.declarations.length && symbol.declarations[0])
        if (declaration) {
            let jsName = null
            if (declaration.kind & ts.SyntaxKind.ClassDeclaration)
                jsName = tsTools.guessName((declaration as ts.ClassDeclaration).name)

            let jsNamespace = context.getJavaPackage(declaration.getSourceFile())
            if (jsNamespace)
                this.setPackageName(jsNamespace)

            if (jsName)
                this.addPrototypeName(jsNamespace, jsName)
        }
    }

    private extractConstructor(type: ts.Type, context: ProcessContext) {
        let constructor = this.findConstructorOfType(type, null, context)
        if (constructor)
            this.addConstructorSignature(constructor)
    }

    private extractIndexTypes(type: ts.Type, context: ProcessContext) {
        let nit = type.getNumberIndexType()
        if (nit) {
            this.setNumberIndexType(context.getTypeMap().getOrCreatePreJavaTypeForTsType(nit, false, this.typeParameters))
        }

        let sit = type.getStringIndexType()
        if (sit) {
            this.setStringIndexType(context.getTypeMap().getOrCreatePreJavaTypeForTsType(sit, false, this.typeParameters))
        }
    }

    private extractPropertiesAndMethods(type: ts.InterfaceTypeWithDeclaredMembers, context: ProcessContext) {
        // static properties and methods
        if (type.symbol && type.symbol.valueDeclaration) {
            let declaredType = context.getProgram().getTypeChecker().getTypeOfSymbolAtLocation(type.symbol, type.symbol.valueDeclaration)
            if (declaredType) {
                let staticTypeProperties = declaredType.getProperties()
                staticTypeProperties && staticTypeProperties.forEach(property => {
                    if (property['parent'] == declaredType.symbol && property.name != 'prototype') {
                        let comments = this.getCommentFromSymbol(property)
                        let propertyType = context.getProgram().getTypeChecker().getTypeAtLocation(property.valueDeclaration)
                        let callSignatures = propertyType.getCallSignatures()
                        if (callSignatures && callSignatures.length && !(property.name.startsWith('on'))) {
                            for (let callSignature of callSignatures) {
                                let method = context.getTypeMap().convertSignature(property.name, callSignature, this.typeParameters)
                                if (method) {
                                    if (this.typeParameters && this.typeParameters.length) {
                                        let toAdd = []
                                        for (let tp of this.typeParameters)
                                            if (toAdd.indexOf(tp.name) < 0)
                                                toAdd.push(tp.name)
                                        method.typeParameters = toAdd.map(name => new PreJavaTypeParameter(name)).concat(method.typeParameters ? method.typeParameters : [])
                                    }

                                    method.addComments(comments)
                                    this.addStaticMethod(method)
                                }
                            }
                        }
                        else {
                            let propertyPreJavaType = context.getTypeMap().getOrCreatePreJavaTypeForTsType(propertyType, false, this.typeParameters)
                            this.addStaticProperty({
                                name: property.name,
                                type: propertyPreJavaType,
                                writable: true,
                                comments
                            })
                        }
                    }
                })
            }
        }

        let properties = type.declaredProperties// type.getProperties()
        if (properties && properties.length) {
            properties.forEach(property => {
                let propertyName = property.getName()
                if (!property.valueDeclaration)
                    return

                let comments = this.getCommentFromSymbol(property)

                let propertyType = context.getProgram().getTypeChecker().getTypeAtLocation(property.valueDeclaration)

                // TODO : generating property accessors for callable types should be configurable
                let callSignatures = propertyType.getCallSignatures()
                if (callSignatures && callSignatures.length && !(propertyName.startsWith('on'))) {
                    for (let callSignature of callSignatures) {
                        let method = context.getTypeMap().convertSignature(propertyName, callSignature, this.typeParameters)
                        if (method) {
                            method.addComments(comments)
                            this.addMethod(method)
                        }
                    }
                }
                else {
                    let propertyPreJavaType = context.getTypeMap().getOrCreatePreJavaTypeForTsType(propertyType, false, this.typeParameters)
                    this.addProperty({
                        name: propertyName,
                        type: propertyPreJavaType,
                        writable: true,
                        comments
                    })
                }
            })
        }

        let callSignatures = type.getCallSignatures()
        callSignatures && callSignatures.forEach(callSignature => {
            let signature = context.getTypeMap().convertSignature(null, callSignature, this.typeParameters)
            if (signature)
                this.callSignatures.push(signature)
        })
    }

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

        if (stay != this && this.getSimpleName(null) == 'GlobalScope')
            replacer(this)

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

        if (this.callSignatures)
            this.callSignatures = this.callSignatures.map(s => s.substituteType(replacer, cache, passThroughTypes)).filter(s => s != null)

        if (this.staticProperties) {
            this.staticProperties = this.staticProperties.map(p => {
                p.type = p.type.substituteType(replacer, cache, passThroughTypes)
                if (!p.type)
                    return null
                return p
            }).filter(p => p != null)
        }

        if (this.staticMethods)
            this.staticMethods = this.staticMethods.map(s => s.substituteType(replacer, cache, passThroughTypes)).filter(s => s != null)

        if (this.properties) {
            this.properties = this.properties.map(p => {
                p.type = p.type.substituteType(replacer, cache, passThroughTypes)
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

    getTypeParameters(typeParametersEnv: { [key: string]: PreJavaType }) {
        if (!this.typeParameters || !typeParametersEnv)
            return this.typeParameters

        let res = []
        this.typeParameters.forEach(p => {
            if (typeParametersEnv && p.name in typeParametersEnv)
                res.push(typeParametersEnv[p.name])
            else
                res.push(p)
        })
        return res
    }

    setSimpleName(name: string) {
        if (name == '__type')
            return

        if (!this.name)
            this.name = name// + '__' + (nextTypeId++)
    }

    getSimpleName(typeParametersEnv: { [key: string]: PreJavaType }): string { return this.name }

    private addComments(lines: string[]) {
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
            this.baseTypes.forEach(type => console.log(`- ${type.getParametrizedSimpleName(null)}`))
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
                console.log(`${property.type.getParametrizedSimpleName(null)} ${property.name} ${property.writable ? '' : 'READ-ONLY'}`)
            }
        }

        if (this.numberIndexType) {
            console.log(`index by number: ${this.numberIndexType.getParametrizedSimpleName(null)}`)
        }
        if (this.stringIndexType) {
            console.log(`index by string: ${this.stringIndexType.getParametrizedSimpleName(null)}`)
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

        this.isClass = true

        this.prototypeNames.add(name)
    }

    setTypeParameters(typeParameters: PreJavaTypeParameter[]) {
        if (!this.typeParameters)
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

    private methodSignatures = new Set<string>()

    cleanAndCheckMethods() {
        this.methodSignatures.clear()
        this.methods.forEach(m => this.methodSignatures.add(Signature.getCallSignatureSignature(m)))
    }

    addMethod(method: PreJavaTypeCallSignature) {
        if (!method)
            return

        if (this.methodSignatures.size != this.methods.length)
            this.cleanAndCheckMethods()

        let sig = Signature.getCallSignatureSignature(method)

        if (this.methodSignatures.has(sig))
            return
        this.methodSignatures.add(sig)

        this.methods.push(method)
    }

    addStaticProperty(property: PreJavaTypeProperty) {
        if (this.staticProperties && this.staticProperties.some(p => p.name == property.name))
            return // bug where static methods are duplicated
        this.staticProperties.push(property)
    }

    addStaticMethod(method: PreJavaTypeCallSignature) {
        if (this.staticMethods && this.staticMethods.some(m => m.name == method.name))
            return // bug where static methods are duplicated
        this.staticMethods.push(method)
    }

    setNumberIndexType(type: PreJavaType) {
        this.numberIndexType = type
    }

    setStringIndexType(type: PreJavaType) {
        this.stringIndexType = type
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