package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.Expression;
import jsinterop.annotations.JsProperty;
import ng.core.Type;
import jsinterop.annotations.JsConstructor;
import ng.core.ExpressionVisitor;
import ng.core.WriteKeyExpr;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name ReadKeyExpr
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="ReadKeyExpr" )
public class ReadKeyExprImpl extends Expression {
    @JsProperty(name="receiver")
    Expression getReceiver();
    @JsProperty(name="receiver")
    void setReceiver(Expression value);
    @JsProperty(name="index")
    Expression getIndex();
    @JsProperty(name="index")
    void setIndex(Expression value);
    @JsConstructor
    public ReadKeyExprImpl(Expression receiver,Expression index,Type /* optional */ type) {}
    public native  Object visitExpression(ExpressionVisitor visitor,Object context);
    public native  WriteKeyExpr set(Expression value);
}
