package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\expression_parser\ast.d.ts
  * Package ng.core
  * Name AST
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class AST  {
    public ParseSpan span;
    @JsConstructor
    public AST(ParseSpan span) {}
    public native  Object visit(AstVisitor visitor,Object /* optional */ context);
    public native  String toString();
}
