package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.Type;
import jsinterop.annotations.JsConstructor;
import ng.core.ExpressionVisitor;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name LiteralExpr
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface LiteralExpr extends Expression {
    @JsProperty(name="value")
    Object getValue();
    @JsProperty(name="value")
    void setValue(Object value);
    @JsConstructor
    public LiteralExpr(Object value,Type /* optional */ type) {}
     Object visitExpression(ExpressionVisitor visitor,Object context);
}
