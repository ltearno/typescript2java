package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\expression_parser\ast.d.ts
  * Package ng.core
  * Name KeyedWrite
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class KeyedWrite extends AST {
    public AST obj;
    public AST key;
    public AST value;
    @JsConstructor
    public KeyedWrite(ParseSpan span,AST obj,AST key,AST value) {}
    public native  Object visit(AstVisitor visitor,Object /* optional */ context);
}
