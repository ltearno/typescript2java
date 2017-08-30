import * as ts from "typescript"
import * as path from "path";
import { PreJavaType, TypeReplacer, ProcessContext } from './prejavatypes/PreJavaType'
import { guessName } from './tools'
import * as Visit from './prejavatypes/PreJavaTypeVisit'

import { PreJavaTypeFakeType } from './prejavatypes/PreJavaTypeFakeType'
import { PreJavaTypeBuiltinJavaType } from './prejavatypes/PreJavaTypeBuiltinJavaType'
import { PreJavaTypeReference, PreJavaTypeTPEnvironnement } from './prejavatypes/PreJavaTypeReference'
import { PreJavaTypeUnion } from './prejavatypes/PreJavaTypeUnion'
import { PreJavaTypeClassOrInterface, PreJavaTypeProperty } from './prejavatypes/PreJavaTypeClassOrInterface'
import { PreJavaTypeTuple } from './prejavatypes/PreJavaTypeTuple'
import { PreJavaTypeEnum } from './prejavatypes/PreJavaTypeEnum'
import { PreJavaTypeParameter } from './prejavatypes/PreJavaTypeParameter'
import { PreJavaTypeCallSignature, PreJavaTypeFormalParameter } from './prejavatypes/PreJavaTypeCallSignature'

export const BUILTIN_TYPE_OBJECT = new PreJavaTypeBuiltinJavaType('java.lang', 'Object')
export const BUILTIN_TYPE_STRING = new PreJavaTypeBuiltinJavaType('java.lang', 'String')
export const BUILTIN_TYPE_NUMBER = new PreJavaTypeBuiltinJavaType('java.lang', 'Number')
export const BUILTIN_TYPE_BOOLEAN = new PreJavaTypeBuiltinJavaType('java.lang', 'Boolean')
export const BUILTIN_TYPE_UNIT = new PreJavaTypeBuiltinJavaType(null, 'void')
export const BUILTIN_TYPE_VOID = new PreJavaTypeBuiltinJavaType('java.lang', 'Void')

export const FAKE_TYPE_INTERSECTION = new PreJavaTypeFakeType('gwt.ext', 'FakeIntersection')
export const FAKE_TYPE_ESSYMBOL = new PreJavaTypeFakeType('gwt.ext', 'FakeEsSymbol')
export const FAKE_TYPE_INDEXEDACCESS = new PreJavaTypeFakeType('gwt.ext', 'FakeIndexedAccess')

export class TsToPreJavaTypemap {
    private currentIdAnonymousTypes = 1

    typeMap = new Map<any, PreJavaType>()

    constructor(private program: ts.Program, private javaPackageGuesser: { (sourceFile: ts.SourceFile): string }) { }

    processContext: ProcessContext = {
        createAnonymousTypeName: () => `AnonymousType${this.currentIdAnonymousTypes++}`,
        getJavaPackage: this.javaPackageGuesser,
        getProgram: () => this.program,
        getTypeMap: () => this
    }

    ensureAllTypesHaveName(defaultPackageName: string) {
        for (let type of this.typeMap.values()) {
            if (type instanceof PreJavaTypeClassOrInterface) {
                if (type.getParametrizedSimpleName(null) == null)
                    type.setSimpleName(`AnonymousType_${this.currentIdAnonymousTypes++}`)
            }
            if (defaultPackageName && !type.getPackageName())
                type.setPackageName(defaultPackageName)
        }
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
        this.substituteType((type) => type.getSimpleName(null) == '?' ? BUILTIN_TYPE_OBJECT : type)
        this.substituteType((type) => type.getSimpleName(null) == '' ? null : type)
    }

    // TODO : for classes : add methods from interface hierarchy which are not in the method list
    addMethodsFromInterfaceHierarchy() {
        let recBrowseInterfaceHierarchy = (type: PreJavaType, visitor: { (visitedInterface: PreJavaTypeClassOrInterface, typeVariableEnv: { [key: string]: PreJavaType }) }, typeVariableEnv: { [key: string]: PreJavaType } = null) => {
            Visit.preJavaTypeVisit(type, {
                onVisitReferenceType: type => {
                    let env: { [key: string]: PreJavaType } = Object.create(typeVariableEnv)
                    let typeParameters = type.type.getTypeParameters(typeVariableEnv)
                    for (let tpi = 0; tpi < type.typeParameters.length; tpi++)
                        env[typeParameters[tpi].getSimpleName(typeVariableEnv)] = type.typeParameters[tpi]

                    recBrowseInterfaceHierarchy(type.type, visitor, env)
                },

                onVisitClassOrInterfaceType: type => {
                    if (!type.isClassLike())
                        visitor(type, typeVariableEnv)
                    type.baseTypes && type.baseTypes.forEach(baseType => recBrowseInterfaceHierarchy(baseType, visitor))
                }
            })
        }

        for (let pjt of this.typeMap.values()) {
            Visit.preJavaTypeVisit(pjt, {
                onVisitClassOrInterfaceType: type => {
                    if (type.isClassLike()) {
                        recBrowseInterfaceHierarchy(type, (visitedInterface, typeVariableEnv) => {
                            visitedInterface.methods && visitedInterface.methods.forEach(visitedMethod => {
                                if (!type.methods || !type.methods.some(m => {
                                    // vérifie que deux méthodes ne sont pas identiques du point de vue de leur noms et des type erasure de leurs paramètres.
                                    if (m.name != visitedMethod.name)
                                        return false
                                    if ((m.parameters && m.parameters.length) != (visitedMethod.parameters && visitedMethod.parameters.length))
                                        return false
                                    for (let i = 0; i < m.parameters.length; i++) {
                                        if (m.parameters[i].type.getFullyQualifiedName(null) != visitedMethod.parameters[i].type.getFullyQualifiedName(null))
                                            return false
                                    }
                                    return true
                                })) {
                                    let method = new PreJavaTypeCallSignature(visitedMethod.typeParameters, visitedMethod.returnType, visitedMethod.name, visitedMethod.parameters)
                                    method.returnType = new PreJavaTypeTPEnvironnement(visitedMethod.returnType, typeVariableEnv)
                                    type.addMethod(method) // TODO Take care of the concretized type parameters
                                }
                            })

                            visitedInterface.properties && visitedInterface.properties.forEach(visitedProperty => {
                                // TODO minimal management of property redefinitions : should allow the type to be tightened and not widened
                                // TODO For the moment, we just keep the super type class
                                let existingProperty = type.properties && type.properties.find(p => p.name == visitedProperty.name)
                                if (existingProperty) {
                                    existingProperty.type = new PreJavaTypeTPEnvironnement(visitedProperty.type, typeVariableEnv)
                                }
                                else {
                                    let newProperty: PreJavaTypeProperty = {
                                        name: visitedProperty.name,
                                        type: typeVariableEnv ? new PreJavaTypeTPEnvironnement(visitedProperty.type, typeVariableEnv) : visitedProperty.type,
                                        writable: visitedProperty.writable,
                                        comments: visitedProperty.comments
                                    }

                                    type.addProperty(newProperty)
                                }
                                //if (!type.properties || !type.properties.some(p => p.name == visitedProperty.name))
                                //    type.addProperty(visitedProperty) // TODO Take care of the concretized type parameters
                            })
                        })
                    }
                }
            })
        }
    }

    private groupBy<K, V>(items: V[], keySelector: { (value: V): K }) {
        let groups = new Map<K, V[]>()

        items.forEach(item => {
            let key = keySelector(item)
            let signatures = groups.get(key)
            if (signatures) {
                signatures.push(item)
            }
            else {
                signatures = [item]
                groups.set(key, signatures)
            }
        })

        return groups
    }

    checkNoDuplicateTypeNames() {
        /*let typeFqnCache: Set<string> = new Set()
        for (let type of this.typeMap.values()) {
            let typeFqn = type.getFullyQualifiedName(null)
            while (true) {
                if (typeFqnCache.has(typeFqn)) {
                    console.log(`RENAMED TYPE ${typeFqn}`)
                    typeFqn = typeFqn + 'bis'
                    type.setPackageName(typeFqn)
                }
                else {
                    typeFqnCache.add(typeFqn)
                    break
                }
            }
        }*/
        console.log('FQN list')
        let names: string[] = []
        for (let type of this.typeMap.values()) {
            let tok = type.getFullyQualifiedName(null)
            if (type.getSourceTypes()) {
                tok += ' '
                for (let st of type.getSourceTypes().values()) {
                    tok += st + ' ' + st['id'] + ' '
                    if (st.getSymbol() && st.getSymbol().getDeclarations())
                        tok += st.getSymbol().getDeclarations().map(sf => sf.getSourceFile().fileName + ':' + sf.getStart()).join()
                }
            }
            names.push(tok)
        }
        names.sort().forEach(name => console.log(name))
    }

    removeDuplicateOverloads() {
        for (let type of this.typeMap.values()) {
            if (type instanceof PreJavaTypeClassOrInterface && type.methods && type.methods.length) {
                let classOrInterface = type as PreJavaTypeClassOrInterface
                // TODO in the process we loose type parameters information.
                // TODO so when sometimes instead of removing a method, we should arrange type parameters according to the removed method
                let methodsByNameAndParameters = this.groupBy(type.methods, method => method.name + '-' + (method.parameters ? method.parameters.map(p => p.type.getFullyQualifiedName(null)).join('-') : ''))
                for (let methodGroup of methodsByNameAndParameters.values()) {
                    if (methodGroup.length < 2)
                        continue

                    // only keep one, the most general return type
                    let minHierarchyDepth = 1000
                    for (let method of methodGroup) {
                        let depth = method.returnType.getHierachyDepth()
                        if (depth < minHierarchyDepth)
                            minHierarchyDepth = depth
                    }

                    let minReturnTypeHierarchyDepthMethods: PreJavaTypeCallSignature[] = []
                    for (let method of methodGroup) {
                        let returnType = method.returnType
                        if (returnType.getHierachyDepth() == minHierarchyDepth)
                            minReturnTypeHierarchyDepthMethods.push(method)
                        else
                            classOrInterface.removeMethod(method)
                    }

                    if (minReturnTypeHierarchyDepthMethods.length > 1) {
                        // TODO let's keep the first one but we could fins something else, use Object, create a Union type, ...
                        for (let i = 1; i < minReturnTypeHierarchyDepthMethods.length; i++)
                            classOrInterface.removeMethod(minReturnTypeHierarchyDepthMethods[i])
                    }
                }
            }
        }
    }

    changeDtoInterfacesIntoClasses() {
        let nb = 0
        for (let type of this.typeMap.values()) {
            if (type instanceof PreJavaTypeClassOrInterface && type.hasOnlyProperties() && !this.hasSubType(type)) {
                type.isClass = true
                nb++
            }
        }
        console.log(`${nb} DTO types converted to classes`)
    }

    arrangeMultipleImplementationInheritance(): boolean {
        let somethingDone = false
        for (let type of this.typeMap.values()) {
            if (type instanceof PreJavaTypeClassOrInterface && type.baseTypes && type.baseTypes.size) {
                let implementationSuperTypes: PreJavaTypeClassOrInterface[] = []
                for (let superType of type.baseTypes.values()) {
                    while (superType && superType instanceof PreJavaTypeReference)
                        superType = superType.type
                    if (superType instanceof PreJavaTypeClassOrInterface && superType.isClassLike()) {
                        implementationSuperTypes.push(superType)
                    }
                }

                console.log(`maybe arrange ${type.getSimpleName(null)}`)

                if ((type.isClassLike() && implementationSuperTypes.length <= 1) || (!type.isClassLike() && implementationSuperTypes.length == 0))
                    continue

                somethingDone = true

                console.log(`arrange from ${type.getSimpleName(null)} with ${implementationSuperTypes.length} super implementations`)

                let nbConstructors = type.constructorSignatures && type.constructorSignatures.length

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
                    newType.properties = superType.properties && superType.properties.slice()
                    newType.prototypeNames = superType.prototypeNames
                    newType.isClass = true
                    newType.typeParameters = superType.typeParameters && superType.typeParameters.slice()
                    newType.sourceTypes = superType.sourceTypes

                    superType.isClass = false
                    superType.constructorSignatures = null
                    superType.prototypeNames = null

                    this.typeMap.set({} as ts.Type, newType)
                }
            }
        }

        return somethingDone
    }

    developMethodOverridesForUnionParameters() {
        let developMethods = (type: PreJavaTypeClassOrInterface) => {
            // constructors and methods with union type parameters or inside parameters...
        }

        for (let type of this.typeMap.values())
            if (type instanceof PreJavaTypeClassOrInterface)
                developMethods(type)
    }

    convertSignature(name: string, tsSignature: ts.Signature, typeParametersToApplyToAnonymousTypes: PreJavaTypeParameter[]): PreJavaTypeCallSignature {
        //if (('thisParameter' in tsSignature) && tsSignature['thisParameter'])
        //    return null

        let hasKeyOfInTypeParameters = tsSignature.getTypeParameters() && tsSignature.getTypeParameters().some(typeParameter => {
            let symbol = typeParameter.getSymbol()
            let declarations = symbol && symbol.declarations

            return declarations && declarations.some(declaration => {
                if (declaration.kind == ts.SyntaxKind.TypeParameter) {
                    let constraint = declaration && (declaration as ts.TypeParameterDeclaration).constraint
                    return constraint && constraint.kind == ts.SyntaxKind.TypeOperator && (constraint as ts.TypeOperatorNode).operator == ts.SyntaxKind.KeyOfKeyword
                }
            })
        })

        if (hasKeyOfInTypeParameters)
            return null

        let signatureTypeParameters = tsSignature.getTypeParameters() ? tsSignature.getTypeParameters().map(t => {
            let res = this.getOrCreatePreJavaTypeForTsType(t, false, typeParametersToApplyToAnonymousTypes) as PreJavaTypeParameter
            if (!(res instanceof PreJavaTypeParameter))
                console.error(`BLABLABLA`)
            return res
        }) : null

        typeParametersToApplyToAnonymousTypes = (typeParametersToApplyToAnonymousTypes && typeParametersToApplyToAnonymousTypes.slice()) || []
        signatureTypeParameters && signatureTypeParameters
            .filter(tp => !typeParametersToApplyToAnonymousTypes.some(tpIn => tpIn.name == tp.name))
            .forEach(tp => typeParametersToApplyToAnonymousTypes.push(tp))

        let signatureReturnType = tsSignature.getReturnType()
        let returnType = this.getOrCreatePreJavaTypeForTsType(signatureReturnType, true, typeParametersToApplyToAnonymousTypes)

        return new PreJavaTypeCallSignature(
            signatureTypeParameters,
            returnType,
            name,
            tsSignature.getParameters()
                ? tsSignature.getParameters()
                    .map(p => {
                        let parameteryType = this.program.getTypeChecker().getTypeAtLocation(p.valueDeclaration)
                        if (parameteryType
                            && parameteryType.symbol
                            && parameteryType.symbol.declarations
                            && parameteryType.symbol.declarations.length
                            && parameteryType.symbol.declarations.some((d: any) => {
                                return d && d.locals && d.locals.length && d.locals.get && d.locals.get('this')
                            }))
                            return null

                        let objectType = (parameteryType.flags & ts.TypeFlags.Object) && parameteryType as ts.ObjectType
                        let referenceType = objectType && (objectType.objectFlags & ts.ObjectFlags.Reference) && parameteryType as ts.TypeReference
                        let dotdotdot = false

                        let de = p.valueDeclaration as ts.ParameterDeclaration
                        if (de.dotDotDotToken) {
                            if (referenceType && referenceType.typeArguments && referenceType.typeArguments.length == 1) {
                                parameteryType = referenceType.typeArguments[0]
                                dotdotdot = true
                            }
                            else {
                                console.error(`... token in parameters but expected type is not good`)
                            }
                        }

                        let result: PreJavaTypeFormalParameter = null

                        // This is to handle the case of "p: typeof SomeClass" where p is not of type SomeClass but of the type of the type of the class...
                        // TODO for now we use Object, but should be able to do better!
                        let freeP: any = p
                        if (freeP.valueDeclaration && freeP.valueDeclaration.type && freeP.valueDeclaration.type.kind == ts.SyntaxKind.TypeQuery) {
                            result = {
                                name: p.name,
                                type: BUILTIN_TYPE_OBJECT,
                                optional: (de.questionToken) != null || (de.initializer != null),
                                dotdotdot
                            }
                        }
                        else {
                            let preJavaParameterType = this.getOrCreatePreJavaTypeForTsType(parameteryType, false, typeParametersToApplyToAnonymousTypes)

                            result = {
                                name: p.name,
                                type: preJavaParameterType,
                                optional: (de.questionToken) != null || (de.initializer != null),
                                dotdotdot
                            }
                        }

                        return result
                    })
                    .filter(p => p != null)
                : null
        )
    }

    getOrCreatePreJavaTypeForTsType(tsType: ts.Type, preferNothingVoid: boolean = false, typeParametersToApplyToAnonymousTypes: PreJavaTypeParameter[] = null): PreJavaType {
        if (!tsType)
            return null

        let objectType = (tsType.flags & ts.TypeFlags.Object) && tsType as ts.ObjectType
        let interfaceType = (objectType.objectFlags & ts.ObjectFlags.ClassOrInterface) && tsType as ts.InterfaceType
        let referenceType = (objectType.objectFlags & ts.ObjectFlags.Reference) && tsType as ts.TypeReference

        let typeKey: any = tsType
        if (tsType.flags & ts.TypeFlags.Void)
            typeKey = 'void-' + preferNothingVoid
        if (objectType && objectType.objectFlags & ts.ObjectFlags.Tuple)
            typeKey = 'tuple-' + referenceType.typeArguments.length
        else if (objectType && objectType.objectFlags & ts.ObjectFlags.Anonymous)
            typeKey = tsType['id'] + ((typeParametersToApplyToAnonymousTypes && typeParametersToApplyToAnonymousTypes.length) ? (typeParametersToApplyToAnonymousTypes.map(tp => '-' + tp.name)) : (''))

        if (this.typeMap.has(typeKey))
            return this.typeMap.get(typeKey)

        if (tsType['id'] == 15834 || tsType['id'] == 15839)
            console.log('yop')

        let preJavaType = this.createPreJavaType(typeKey, tsType, preferNothingVoid, typeParametersToApplyToAnonymousTypes)

        /*Visit.preJavaTypeVisit(preJavaType, {
            onVisitBuiltinType: type => this.typeMap.set(typeKey, preJavaType),
            onVisitClassOrInterfaceType: type => this.typeMap.set(typeKey, preJavaType),
            onVisitEnumType: type => this.typeMap.set(typeKey, preJavaType),
            onVisitFakeType: type => this.typeMap.set(typeKey, preJavaType),
            onVisitTuple: type => this.typeMap.set(typeKey, preJavaType),
            onVisitUnion: type => this.typeMap.set(typeKey, preJavaType)
        })*/
        if (!(preJavaType instanceof PreJavaTypeReference)) {
            this.typeMap.set(typeKey, preJavaType)
        }


        return preJavaType
    }

    private createPreJavaType(typeKey: any, tsType: ts.Type, preferNothingVoid: boolean, typeParametersToApplyToAnonymousTypes: PreJavaTypeParameter[]) {
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
        if (tsType.getSymbol() && tsType.getSymbol().getName() == 'Boolean')
            return BUILTIN_TYPE_BOOLEAN
        if (tsType.flags & ts.TypeFlags.Void)
            return preferNothingVoid ? BUILTIN_TYPE_UNIT : BUILTIN_TYPE_VOID
        if (tsType.flags & ts.TypeFlags.Undefined)
            return BUILTIN_TYPE_UNIT
        if (tsType.flags & ts.TypeFlags.Null)
            return BUILTIN_TYPE_VOID
        if (tsType.flags & ts.TypeFlags.Never)
            return BUILTIN_TYPE_VOID

        if (tsType.getSymbol() && tsType.getSymbol().getName() == 'String')
            return BUILTIN_TYPE_STRING

        if (tsType.getSymbol() && tsType.getSymbol().getName() == 'Object')
            return BUILTIN_TYPE_OBJECT

        if (tsType.getSymbol() && tsType.getSymbol().getName() == 'Number')
            return BUILTIN_TYPE_NUMBER

        if (tsType.flags & ts.TypeFlags.ESSymbol)
            return FAKE_TYPE_ESSYMBOL

        if (tsType.flags & ts.TypeFlags.IndexedAccess)
            return FAKE_TYPE_INDEXEDACCESS

        if (tsType.flags & ts.TypeFlags.Intersection)
            return FAKE_TYPE_INTERSECTION

        if (tsType.flags & ts.TypeFlags.TypeParameter) {
            if (tsType['isThisType'])
                return this.getOrCreatePreJavaTypeForTsType((tsType as ts.TypeParameter).constraint, false, typeParametersToApplyToAnonymousTypes)

            let symbol = (tsType as ts.TypeParameter).getSymbol()
            let preJavaType = new PreJavaTypeParameter(symbol ? symbol.getName() : '?')
            preJavaType.constraint = this.getOrCreatePreJavaTypeForTsType((tsType as ts.TypeParameter).constraint, false, typeParametersToApplyToAnonymousTypes)
            return preJavaType
        }

        let objectType = (tsType.flags & ts.TypeFlags.Object) && tsType as ts.ObjectType

        if (objectType && objectType.objectFlags & ts.ObjectFlags.Reference) {
            let reference = tsType as ts.TypeReference
            if (reference.target != tsType) {
                let preJavaType = new PreJavaTypeReference()
                preJavaType.type = this.getOrCreatePreJavaTypeForTsType(reference.target, false, typeParametersToApplyToAnonymousTypes)
                preJavaType.typeParameters = reference.typeArguments ? reference.typeArguments.map(typeArgument => this.getOrCreatePreJavaTypeForTsType(typeArgument, false, typeParametersToApplyToAnonymousTypes)) : null
                return preJavaType
            }
        }

        if (tsType.flags & ts.TypeFlags.Union) {
            let unionType = tsType as ts.UnionType

            let res = new PreJavaTypeUnion()
            this.typeMap.set(typeKey, res)
            res.typeParameters = typeParametersToApplyToAnonymousTypes
            res.setTypes(unionType.types.map(t => this.getOrCreatePreJavaTypeForTsType(t, false, typeParametersToApplyToAnonymousTypes)))

            return res
        }

        if (objectType) {
            if (objectType.objectFlags & ts.ObjectFlags.Tuple) {
                let preJavaType = new PreJavaTypeTuple(objectType as ts.TypeReference)
                this.typeMap.set(typeKey, preJavaType)

                return preJavaType
            }
            else {
                let preJavaType = new PreJavaTypeClassOrInterface()
                this.typeMap.set(typeKey, preJavaType)

                preJavaType.addSourceType(objectType, typeParametersToApplyToAnonymousTypes, this.processContext)

                return preJavaType
            }
        }

        if (tsType.flags & ts.TypeFlags.Enum && tsType.getSymbol()) {
            let preJavaEnum = new PreJavaTypeEnum(tsType.getSymbol().getName())
            this.typeMap.set(typeKey, preJavaEnum)
            preJavaEnum.addSourceType(tsType as ts.EnumType)

            return preJavaEnum
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