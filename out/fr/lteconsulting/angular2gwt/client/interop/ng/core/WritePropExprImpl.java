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
  * Name WritePropExpr
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="WritePropExpr" )
public class WritePropExprImpl extends Expression {
    @JsProperty(name="receiver")
    Expression getReceiver();
    @JsProperty(name="receiver")
    void setReceiver(Expression value);
    @JsProperty(name="name")
    String getName();
    @JsProperty(name="name")
    void setName(String value);
    @JsProperty(name="value")
    Expression getValue();
    @JsProperty(name="value")
    void setValue(Expression value);
    @JsConstructor
    public WritePropExprImpl(Expression receiver,String name,Expression value,Type /* optional */ type) {}
    public native  Object visitExpression(ExpressionVisitor visitor,Object context);
}
