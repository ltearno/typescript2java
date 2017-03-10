package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsProperty;
import ng.core.ParseSpan;
import jsinterop.annotations.JsConstructor;
import ng.core.AstVisitor;

/**
  * Generated from tests\@angular\compiler\src\expression_parser\ast.d.ts
  * Package ng.core
  * Name LiteralArray
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="LiteralArray" )
public class LiteralArrayImpl extends AST {
    @JsProperty(name="expressions")
    JsArray<Object> getExpressions();
    @JsProperty(name="expressions")
    void setExpressions(JsArray<Object> value);
    @JsConstructor
    public LiteralArrayImpl(ParseSpan span,JsArray<Object> expressions) {}
    public native  Object visit(AstVisitor visitor,Object /* optional */ context);
}
