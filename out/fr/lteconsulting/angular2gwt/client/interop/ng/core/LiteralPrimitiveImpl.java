package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.ParseSpan;
import jsinterop.annotations.JsConstructor;
import ng.core.AstVisitor;

/**
  * Generated from tests\@angular\compiler\src\expression_parser\ast.d.ts
  * Package ng.core
  * Name LiteralPrimitive
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="LiteralPrimitive" )
public class LiteralPrimitiveImpl extends AST {
    @JsProperty(name="value")
    Object getValue();
    @JsProperty(name="value")
    void setValue(Object value);
    @JsConstructor
    public LiteralPrimitiveImpl(ParseSpan span,Object value) {}
    public native  Object visit(AstVisitor visitor,Object /* optional */ context);
}
