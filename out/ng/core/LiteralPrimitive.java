package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\expression_parser\ast.d.ts
  * Package ng.core
  * Name LiteralPrimitive
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class LiteralPrimitive extends AST {
    public Object value;
    @JsConstructor
    public LiteralPrimitive(ParseSpan span,Object value) {}
    public native  Object visit(AstVisitor visitor,Object /* optional */ context);
}
