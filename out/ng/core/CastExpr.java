package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name CastExpr
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class CastExpr extends Expression {
    public Expression value;
    @JsConstructor
    public CastExpr(Expression value,Type type) {}
    public native  Object visitExpression(ExpressionVisitor visitor,Object context);
}
