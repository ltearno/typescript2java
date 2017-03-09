package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\expression_parser\ast.d.ts
  * Package ng.core
  * Name KeyedRead
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class KeyedRead extends AST {
    public AST obj;
    public AST key;
    @JsConstructor
    public KeyedRead(ParseSpan span,AST obj,AST key) {}
    public native  Object visit(AstVisitor visitor,Object /* optional */ context);
}
