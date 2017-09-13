import * as ts from "typescript";
import { PreJavaType, ProcessContext, TypeReplacer } from './PreJavaType'
import { PreJavaTypeParameter } from './PreJavaTypeParameter'
import { PreJavaTypeTPEnvironnement, PreJavaTypeReference } from './PreJavaTypeReference'
import { PreJavaTypeCallSignature, PreJavaTypeFormalParameter } from './PreJavaTypeCallSignature'
import { guessName } from '../tools'
import * as Visit from './PreJavaTypeVisit'

let nextTypeId = 1

export interface PreJavaTypeProperty {
    name: string
    type: PreJavaType
    writable?: boolean
    comments?: string[]
}

export class PreJavaTypeClassOrInterface extends PreJavaType {
    sourceTypes: Set<ts.Type>

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

    isClass: boolean

    getSourceTypes(): Set<ts.Type> { return this.sourceTypes }

    isClassLike() { return this.isClass }

    addSourceType(type: ts.ObjectType, typeParametersToApplyToAnonymousTypes: PreJavaTypeParameter[], context: ProcessContext) {
        if (!this.sourceTypes)
            this.sourceTypes = new Set()
        this.sourceTypes.add(type)

        this.processSourceType(type, typeParametersToApplyToAnonymousTypes, context)
    }

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
        console.log(`remove method ${method.name} in type ${this.getSimpleName(null)}`)
        method && this.methods && this.methods.splice(index, 1)
    }

    private processSourceType(type: ts.Type, typeParametersToApplyToAnonymousTypes: PreJavaTypeParameter[], context: ProcessContext) {
        if (!type)
            return

        let symbol = type.getSymbol()
        if (symbol) {
            if ((symbol.flags & ts.SymbolFlags.Class) || (symbol.flags & ts.SymbolFlags.Interface))
                this.setSimpleName(symbol.getName())
            else if (symbol.flags & ts.SymbolFlags.TypeLiteral)
                this.setSimpleName(context.createAnonymousTypeName())

            if (symbol.getDeclarations()) {
                symbol.getDeclarations()
                    .filter(d => d.kind == ts.SyntaxKind.ClassDeclaration)
                    .forEach((declaration: ts.ClassDeclaration) => {
                        let jsNamespace = null
                        let jsName = guessName(declaration.name)

                        if (jsName) {
                            jsNamespace = context.getJavaPackage(declaration.getSourceFile())
                            this.addPrototypeName(jsNamespace, jsName)
                        }

                        if (jsNamespace)
                            this.setPackageName(jsNamespace)
                    })
            }

            if (symbol.valueDeclaration) {
                let constructorType = context.getProgram().getTypeChecker().getTypeOfSymbolAtLocation(symbol, symbol.valueDeclaration)

                // this comes from the typescript compiler itself
                function getSignaturesOfSymbol(symbol: ts.Symbol): ts.Signature[] {
                    if (!symbol)
                        return []
                    let result = []
                    for (let i = 0; i < symbol.declarations.length; i++) {
                        let node = symbol.declarations[i]
                        switch (node.kind) {
                            case ts.SyntaxKind.FunctionType:
                            case ts.SyntaxKind.ConstructorType:
                            case ts.SyntaxKind.FunctionDeclaration:
                            case ts.SyntaxKind.MethodDeclaration:
                            case ts.SyntaxKind.MethodSignature:
                            case ts.SyntaxKind.Constructor:
                            case ts.SyntaxKind.CallSignature:
                            case ts.SyntaxKind.ConstructSignature:
                            case ts.SyntaxKind.IndexSignature:
                            case ts.SyntaxKind.GetAccessor:
                            case ts.SyntaxKind.SetAccessor:
                            case ts.SyntaxKind.FunctionExpression:
                            case ts.SyntaxKind.ArrowFunction:
                            case ts.SyntaxKind.JSDocFunctionType:
                                if (i > 0 && node['body']) {
                                    let previous = symbol.declarations[i - 1];
                                    if (node.parent === previous.parent && node.kind === previous.kind && node.pos === previous.end)
                                        break
                                }
                                result.push(context.getProgram().getTypeChecker().getSignatureFromDeclaration(node as ts.SignatureDeclaration))
                        }
                    }
                    return result
                }

                /*type.symbol.getDeclarations().forEach(decl => {
                    let classLikeDeclaration = decl as ts.ClassLikeDeclaration
                    if (classLikeDeclaration.heritageClauses && classLikeDeclaration.heritageClauses.length) {
                        classLikeDeclaration.heritageClauses.forEach(heritageClause => {
                            if (heritageClause.token == ts.SyntaxKind.ImplementsKeyword) {
                                console.log(`sdfsdf`)
                            }
                        })
                    }
                })

                let tc: any = context.getProgram().getTypeChecker()
                let testConstructors = type.symbol.members.get("__constructor")
                //testConstructors = constructorType.symbol.members.get("__constructor")
                let testConstructorSignatures = getSignaturesOfSymbol(testConstructors)
                if (!testConstructorSignatures.length) {
                    let baseTypes = type.getBaseTypes()
                    for (let baseType of baseTypes)
                        console.log('yop')
                }*/

                function getConstructorSymbolOfType(type: ts.Type) {
                    let constructorSymbol = type.symbol.members.get("__constructor")
                    let signatures = getSignaturesOfSymbol(constructorSymbol)
                    if (signatures && signatures.length)
                        return signatures[0]
                    return null
                }

                // BE CAREFUL ABOUT THAT !
                let thisTypeParameters = this.typeParameters
                function findConstructorOfType(type: ts.Type, typeEnv: { [key: string]: PreJavaType }): PreJavaTypeCallSignature {
                    let constructorSymbol = getConstructorSymbolOfType(type)
                    if (constructorSymbol) {
                        let signature = context.getTypeMap().convertSignature(null, constructorSymbol, thisTypeParameters)

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
                            let preJavaType = context.getTypeMap().getOrCreatePreJavaTypeForTsType(baseType, false, thisTypeParameters)

                            Visit.preJavaTypeVisit(preJavaType, {
                                onVisitReferenceType: (refType) => {
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
                                onVisitOther: t => typeEnv = null
                            })

                            if (baseType.flags & ts.TypeFlags.Object) {
                                let objectType = baseType as ts.ObjectType
                                if (objectType.objectFlags & ts.ObjectFlags.Reference) {
                                    let referenceType = objectType as ts.TypeReference
                                    if (referenceType.target != baseType)
                                        baseType = referenceType.target
                                }
                            }

                            let baseTypeConstructor = findConstructorOfType(baseType, typeEnv)
                            if (baseTypeConstructor)
                                return baseTypeConstructor
                        }
                    }
                    return null
                }

                let constructor = findConstructorOfType(type, null)
                if (constructor) {
                    this.addConstructorSignature(constructor)
                }

                /*let constructors = constructorType.getConstructSignatures()
                if (constructors) {
                    constructors.forEach(constructorSignature => {
                        let signature = context.getTypeMap().convertSignature(null, constructorSignature, this.typeParameters)
                        this.addConstructorSignature(signature)
                    })
                }*/
            }

            let comments = this.getCommentFromSymbol(symbol)
            if (comments && comments.length > 0)
                this.addComments(comments)
        }

        if (type.flags & ts.TypeFlags.Object) {
            let objectType = type as ts.ObjectType

            if (objectType.objectFlags & ts.ObjectFlags.Anonymous) {
                this.setTypeParameters((typeParametersToApplyToAnonymousTypes && typeParametersToApplyToAnonymousTypes.length) ? typeParametersToApplyToAnonymousTypes.slice() : null)
            }
            else if (objectType.objectFlags & ts.ObjectFlags.Class || objectType.objectFlags & ts.ObjectFlags.Interface) {
                let interfaceType = objectType as ts.InterfaceType

                if (interfaceType.typeParameters && interfaceType.typeParameters.length) {
                    this.setTypeParameters(interfaceType.typeParameters.map(tp => (new PreJavaTypeParameter(tp.symbol.getName(), context.getTypeMap().getOrCreatePreJavaTypeForTsType(tp.constraint, false, null)))))
                }
            }
        }

        let nit = type.getNumberIndexType()
        if (nit) {
            this.setNumberIndexType(context.getTypeMap().getOrCreatePreJavaTypeForTsType(nit, false, this.typeParameters))
        }

        let sit = type.getStringIndexType()
        if (sit) {
            this.setStringIndexType(context.getTypeMap().getOrCreatePreJavaTypeForTsType(sit, false, this.typeParameters))
        }

        /* Typescript does not return 'implemented' types, only 'extended'. We merge them in the PreJava tree */
        type.symbol.getDeclarations().forEach(decl => {
            let classLikeDeclaration = decl as ts.ClassLikeDeclaration
            if (classLikeDeclaration.heritageClauses && classLikeDeclaration.heritageClauses.length) {
                classLikeDeclaration.heritageClauses.forEach(heritageClause => {
                    heritageClause.types.forEach(baseTypeNode => {
                        let baseType = context.getProgram().getTypeChecker().getTypeAtLocation(baseTypeNode)
                        this.addBaseType(context.getTypeMap().getOrCreatePreJavaTypeForTsType(baseType, false, null /*no need*/))
                    })
                })
            }
        })
        /*let baseTypes = type.getBaseTypes()
        if (baseTypes) {
            baseTypes.forEach(baseType => {
                this.addBaseType(context.getTypeMap().getOrCreatePreJavaTypeForTsType(baseType, false, null))
            })
        }*/

        let properties = (type as ts.InterfaceTypeWithDeclaredMembers).declaredProperties// type.getProperties()
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
                    //if (propertyPreJavaType instanceof PreJavaTypeClassOrInterface)
                    //    propertyPreJavaType.setSimpleName(`${propertyName.slice(0, 1).toUpperCase() + propertyName.slice(1)}Caller`)

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
        if (callSignatures && callSignatures.length) {
            // TODO : Check that the method is alone so that it is a correct functional type
            // TODO : check if it can be melted down with other similar types
            // TODO : try to get a name for it from where it has been created (callback of a function, ...)
            callSignatures.forEach(callSignature => {
                let signature = context.getTypeMap().convertSignature('execute', callSignature, this.typeParameters)
                if (signature)
                    this.addMethod(signature)
            })
        }
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

    getTypeParameters(typeParametersEnv: { [key: string]: PreJavaType }) { return this.typeParameters }

    setSimpleName(name: string) {
        if (name == '__type')
            return

        if (!this.name)
            this.name = name + '__' + (nextTypeId++)
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

    addMethod(method: PreJavaTypeCallSignature) {
        this.methods.push(method)
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