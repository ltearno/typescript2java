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
@JsType( isNative=true, namespace="ng.core", name="NotExpr" )
public class NotExprImpl extends Expression {
    @JsProperty(name="condition")
    Expression getCondition();
    @JsProperty(name="condition")
    void setCondition(Expression value);
    @JsConstructor
    public NotExprImpl(Expression condition) {}
    public native  Object visitExpression(ExpressionVisitor visitor,Object context);
}
