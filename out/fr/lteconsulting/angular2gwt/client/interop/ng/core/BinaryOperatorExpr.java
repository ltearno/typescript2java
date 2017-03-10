package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.Expression;
import ng.core.Type;
import jsinterop.annotations.JsConstructor;
import ng.core.ExpressionVisitor;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name BinaryOperatorExpr
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface BinaryOperatorExpr extends Expression {
    @JsProperty(name="operator")
    /* ng.core.BinaryOperator */ int getOperator();
    @JsProperty(name="operator")
    void setOperator(/* ng.core.BinaryOperator */ int value);
    @JsProperty(name="rhs")
    Expression getRhs();
    @JsProperty(name="rhs")
    void setRhs(Expression value);
    @JsProperty(name="lhs")
    Expression getLhs();
    @JsProperty(name="lhs")
    void setLhs(Expression value);
    @JsConstructor
    public BinaryOperatorExpr(/* ng.core.BinaryOperator */ int operator,Expression lhs,Expression rhs,Type /* optional */ type) {}
     Object visitExpression(ExpressionVisitor visitor,Object context);
}
