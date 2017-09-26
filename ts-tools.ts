import * as ts from 'typescript'

export function guessName(identifier: ts.Identifier | ts.BindingPattern): string {
    if (!identifier)
        return null
    if (identifier.kind == ts.SyntaxKind.Identifier)
        return identifier.text
    return "[UNKNOWN]"
}

export function getSignaturesOfSymbol(symbol: ts.Symbol, typeChecker: ts.TypeChecker): ts.Signature[] {
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
                result.push(typeChecker.getSignatureFromDeclaration(node as ts.SignatureDeclaration))
        }
    }
    return result
}

export function getConstructorSymbolOfType(type: ts.Type, typeChecker: ts.TypeChecker) {
    if (!type || !type.symbol || !type.symbol.members)
        return null
    if (type.symbol.members) {
        let constructorSymbol = type.symbol.members.get("__constructor")
        let signatures = getSignaturesOfSymbol(constructorSymbol, typeChecker)
        if (signatures && signatures.length)
            return signatures[0]
    }

    if (type.symbol.valueDeclaration) {
        let valueDeclarationType = typeChecker.getTypeOfSymbolAtLocation(type.symbol, type.symbol.valueDeclaration)
        if (valueDeclarationType && valueDeclarationType.symbol && valueDeclarationType.symbol.members) {
            let constructorSymbol = valueDeclarationType.symbol.members.get("__new")
            let signatures = getSignaturesOfSymbol(constructorSymbol, typeChecker)
            if (signatures && signatures.length)
                return signatures[0]
        }
    }

    return null
}

export function debugNode(node: ts.Node, space: string, rec: boolean = true) {
    let text = '(unk name)'

    switch (node.kind) {
        case ts.SyntaxKind.SourceFile:
            let t = <ts.SourceFile>node
            text = `SOURCE ${t.fileName}`
            break

        case ts.SyntaxKind.InterfaceDeclaration:
            text = 'INTERFACE ' + (<ts.InterfaceDeclaration>node).name.text;

            (<ts.InterfaceDeclaration>node).members
            break

        case ts.SyntaxKind.ClassDeclaration:
            let classDeclaration = <ts.ClassDeclaration>node

            let modifiers: ts.Modifier[] = classDeclaration.modifiers
            let elements: ts.ClassElement[] = classDeclaration.members
            text = `CLASS ${classDeclaration.name.text} modifiers: ${modifiers && modifiers.map(e => ts.SyntaxKind[e.kind]).join()}`
            break

        case ts.SyntaxKind.MethodDeclaration: {
            let methodDeclaration = <ts.MethodDeclaration>node

            let modifiers: ts.Modifier[] = methodDeclaration.modifiers
            text = `METHOD ${methodDeclaration.name.toString()} modifiers: ${modifiers && modifiers.map(e => ts.SyntaxKind[e.kind]).join()}`
            break
        }

        case ts.SyntaxKind.PropertyDeclaration:
            let propertyDeclaration = <ts.PropertyDeclaration>node

            text = `PROPERTY ${propertyDeclaration.name.toString()}`
            break

        case ts.SyntaxKind.UnionType:
            let unionType = <ts.UnionTypeNode>node
            unionType.types
            break
    }

    console.log(`${space}${text} of kind ${ts.SyntaxKind[node.kind]}`)

    if (rec)
        ts.forEachChild(node, child => debugNode(child, ' ' + space));
}

export function fetchUsedFreeTypeParameters(type: ts.Type, typeChecker: ts.TypeChecker) {
    let usedTypeParameters = new Set<string>()
    fetchUsedFreeTypeParametersInternal(type, usedTypeParameters, typeChecker)
    let res = []
    usedTypeParameters.forEach(name => res.push(name))
    return res
}

function fetchUsedFreeTypeParametersInternal(type: ts.Type, usedTypeParameters: Set<string>, typeChecker: ts.TypeChecker) {
    if (!type) {
        return
    }
    else if (type.flags == ts.TypeFlags.TypeParameter) {
        let typeParameter = type as ts.TypeParameter
        /*if (typeParameter.constraint)
            fetchUsedFreeTypeParametersInternal(typeParameter.constraint, usedTypeParameters, typeChecker)
        else*/
        usedTypeParameters.add(type.symbol.name)
    }
    else if (type.flags == ts.TypeFlags.Object) {
        let objectType = type as ts.ObjectType
        if (objectType.objectFlags & ts.ObjectFlags.Reference) {
            let typeReference = type as ts.TypeReference
            if (typeReference.target != typeReference) {
                //fetchUsedFreeTypeParametersInternal(typeReference.target, usedTypeParameters, typeChecker)
                if (typeReference.typeArguments)
                    typeReference.typeArguments.forEach(typeArgument => fetchUsedFreeTypeParametersInternal(typeArgument, usedTypeParameters, typeChecker))
                return
            }
        }

        if (objectType.objectFlags & ts.ObjectFlags.Class || objectType.objectFlags & ts.ObjectFlags.Interface) {
            let interfaceType = objectType as ts.InterfaceType
            interfaceType.typeParameters && interfaceType.typeParameters.forEach(tp => usedTypeParameters.add(tp.symbol.getName()))
        }
        else if (objectType.objectFlags & ts.ObjectFlags.Anonymous) {
            // TODO visit constructor && indexers
            let interfaceType = objectType as ts.InterfaceTypeWithDeclaredMembers
            let properties = interfaceType.declaredProperties
            if (properties && properties.length) {
                properties.forEach(property => {
                    let propertyType = typeChecker.getTypeAtLocation(property.valueDeclaration)
                    fetchUsedFreeTypeParametersInternal(propertyType, usedTypeParameters, typeChecker)
                })
            }

            fetchUsedFreeTypeParametersInternal(type.getNumberIndexType(), usedTypeParameters, typeChecker)
            fetchUsedFreeTypeParametersInternal(type.getStringIndexType(), usedTypeParameters, typeChecker)

            let callSignatures = type.getCallSignatures()
            callSignatures && callSignatures.forEach(callSignature => {
                callSignature.typeParameters && callSignature.typeParameters

                let usedInSignature = new Set()
                fetchUsedFreeTypeParametersInternal(callSignature.getReturnType(), usedInSignature, typeChecker)
                callSignature.parameters && callSignature.parameters.forEach(param => {
                    let paramType = typeChecker.getTypeAtLocation(param.valueDeclaration)
                    fetchUsedFreeTypeParametersInternal(paramType, usedInSignature, typeChecker)
                })

                let signatureProvidedTypeParameters = new Set()
                if (callSignature.typeParameters)
                    callSignature.typeParameters.forEach(tp => signatureProvidedTypeParameters.add(tp.symbol.name))
                usedInSignature.forEach(t => {
                    if (!signatureProvidedTypeParameters.has(t))
                        usedTypeParameters.add(t)
                })
            })
        }
    }
    else if (type.flags & ts.TypeFlags.UnionOrIntersection) {
        (type as ts.UnionOrIntersectionType).types.forEach(t => fetchUsedFreeTypeParametersInternal(t, usedTypeParameters, typeChecker))
    }
    else {
        // TODO StructuredType IndexedAccess, maybe little more...
        //console.log(`IGNORED TYPE IN TYPEPARAMETER RESEARCH !`)
    }
}