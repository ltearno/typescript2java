package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.Expression;
import jsinterop.annotations.JsProperty;
import ng.core.Type;
import jsinterop.annotations.JsConstructor;
import ng.core.ExpressionVisitor;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name CastExpr
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface CastExpr extends Expression {
    @JsProperty(name="value")
    Expression getValue();
    @JsProperty(name="value")
    void setValue(Expression value);
    @JsConstructor
    public CastExpr(Expression value,Type type) {}
     Object visitExpression(ExpressionVisitor visitor,Object context);
}
