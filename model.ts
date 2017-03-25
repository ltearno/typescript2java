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
    tsNode: AcceptedTsNode;
    tsSymbol: ts.Symbol;
    tsType: ts.Type;
}

export interface InterfaceNode extends Node {
    kind: JavaNodeKind.Interface;
    tsNode: ts.InterfaceDeclaration;
}

export interface InterfaceForClassNode extends Node {
    kind: JavaNodeKind.InterfaceForClass;
    classNode: ClassNode;
    tsNode: ts.ClassDeclaration;
}

export interface ClassNode extends Node {
    kind: JavaNodeKind.Class;
    interfaceNode: InterfaceForClassNode;
    tsNode: ts.ClassDeclaration;
}

export interface EnumNode extends Node {
    kind: JavaNodeKind.Enum;
    tsNode: ts.EnumDeclaration;
}

export type JavaNode = InterfaceNode | InterfaceForClassNode | ClassNode | EnumNode;