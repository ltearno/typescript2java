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
  * Name ConditionalExpr
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="ConditionalExpr" )
public class ConditionalExprImpl extends Expression {
    @JsProperty(name="condition")
    Expression getCondition();
    @JsProperty(name="condition")
    void setCondition(Expression value);
    @JsProperty(name="falseCase")
    Expression getFalseCase();
    @JsProperty(name="falseCase")
    void setFalseCase(Expression value);
    @JsProperty(name="trueCase")
    Expression getTrueCase();
    @JsProperty(name="trueCase")
    void setTrueCase(Expression value);
    @JsConstructor
    public ConditionalExprImpl(Expression condition,Expression trueCase,Expression /* optional */ falseCase,Type /* optional */ type) {}
    public native  Object visitExpression(ExpressionVisitor visitor,Object context);
}
