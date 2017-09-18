import * as ts from 'typescript'

export function guessName(identifier: ts.Identifier | ts.BindingPattern): string {
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
    let constructorSymbol = type.symbol.members.get("__constructor")
    let signatures = getSignaturesOfSymbol(constructorSymbol, typeChecker)
    if (signatures && signatures.length)
        return signatures[0]
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