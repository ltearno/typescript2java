package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name ConditionalExpr
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class ConditionalExpr extends Expression {
    public Expression condition;
    public Expression falseCase;
    public Expression trueCase;
    @JsConstructor
    public ConditionalExpr(Expression condition,Expression trueCase,Expression /* optional */ falseCase,Type /* optional */ type) {}
    public native  Object visitExpression(ExpressionVisitor visitor,Object context);
}
