import * as ts from 'typescript'

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

export function isTypeAliasDefinitionType(type: ts.Type, typeChecker: ts.TypeChecker) {
    if (!type.aliasSymbol)
        return false

    let aliasedSymbolType = typeChecker.getDeclaredTypeOfSymbol(type.aliasSymbol)

    return aliasedSymbolType == type
}