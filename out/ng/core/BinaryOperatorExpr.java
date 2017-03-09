package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name BinaryOperatorExpr
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class BinaryOperatorExpr extends Expression {
    public /* ng.core.BinaryOperator */ int operator;
    public Expression rhs;
    public Expression lhs;
    @JsConstructor
    public BinaryOperatorExpr(/* ng.core.BinaryOperator */ int operator,Expression lhs,Expression rhs,Type /* optional */ type) {}
    public native  Object visitExpression(ExpressionVisitor visitor,Object context);
}
