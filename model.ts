import * as ts from "typescript";

export type AcceptedTsNode = ts.EnumDeclaration
    | ts.InterfaceDeclaration
    | ts.ClassDeclaration
    | ts.TypeAliasDeclaration;

export enum JavaNodeKind {
    Interface,
    InterfaceForClass,
    Class,
    Enum
}

export interface Node {
    kind: JavaNodeKind;
    packageName: string;
    name: string;
    sourceFile: ts.SourceFile;
    jsNamespace: string;
    tsSymbol: ts.Symbol;
    tsType: ts.Type;
    tsNodes: Array<ts.InterfaceDeclaration | ts.ClassDeclaration | ts.EnumDeclaration>;
}

export interface InterfaceNode extends Node {
    kind: JavaNodeKind.Interface;
}

export interface InterfaceForClassNode extends Node {
    kind: JavaNodeKind.InterfaceForClass;
    classNode: ClassNode;
}

export interface ClassNode extends Node {
    kind: JavaNodeKind.Class;
    interfaceNode: InterfaceForClassNode;
}

export interface EnumNode extends Node {
    kind: JavaNodeKind.Enum;
}

export type JavaNode = InterfaceNode | InterfaceForClassNode | ClassNode | EnumNode;