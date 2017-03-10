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
  * Name WriteKeyExpr
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="WriteKeyExpr" )
public class WriteKeyExprImpl extends Expression {
    @JsProperty(name="receiver")
    Expression getReceiver();
    @JsProperty(name="receiver")
    void setReceiver(Expression value);
    @JsProperty(name="index")
    Expression getIndex();
    @JsProperty(name="index")
    void setIndex(Expression value);
    @JsProperty(name="value")
    Expression getValue();
    @JsProperty(name="value")
    void setValue(Expression value);
    @JsConstructor
    public WriteKeyExprImpl(Expression receiver,Expression index,Expression value,Type /* optional */ type) {}
    public native  Object visitExpression(ExpressionVisitor visitor,Object context);
}
