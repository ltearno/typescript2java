package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.Expression;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;
import ng.core.ExpressionVisitor;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name NotExpr
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface NotExpr extends Expression {
    @JsProperty(name="condition")
    Expression getCondition();
    @JsProperty(name="condition")
    void setCondition(Expression value);
    @JsConstructor
    public NotExpr(Expression condition) {}
     Object visitExpression(ExpressionVisitor visitor,Object context);
}
