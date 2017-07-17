import * as ts from "typescript";
import * as path from "path";
import * as fs from "fs";

export function mkdirRec(p, opts = undefined, made = null) {
    if (!opts || typeof opts !== 'object') {
        opts = { mode: opts };
    }

    var mode = opts.mode;
    var xfs = opts.fs || fs;

    if (mode === undefined) {
        mode = 0x777 & (~process.umask());
    }
    if (!made) made = null;

    p = path.resolve(p);

    try {
        xfs.mkdirSync(p, mode);
        made = made || p;
    }
    catch (err0) {
        switch (err0.code) {
            case 'ENOENT':
                made = mkdirRec(path.dirname(p), opts, made);
                mkdirRec(p, opts, made);
                break;

            // In the case of any other error, just see if there's a dir
            // there already.  If so, then hooray!  If not, then something
            // is borked.
            default:
                var stat;
                try {
                    stat = xfs.statSync(p);
                }
                catch (err1) {
                    throw err0;
                }
                if (!stat.isDirectory()) throw err0;
                break;
        }
    }

    return made;
}

export function guessName(identifier: ts.Identifier | ts.BindingPattern): string {
    if (identifier.kind == ts.SyntaxKind.Identifier)
        return identifier.text
    return "[UNKNOWN]"
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