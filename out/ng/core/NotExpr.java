package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name NotExpr
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class NotExpr extends Expression {
    public Expression condition;
    @JsConstructor
    public NotExpr(Expression condition) {}
    public native  Object visitExpression(ExpressionVisitor visitor,Object context);
}
