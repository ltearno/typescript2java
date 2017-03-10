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
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ReadKeyExpr extends Expression {
    @JsProperty(name="receiver")
    Expression getReceiver();
    @JsProperty(name="receiver")
    void setReceiver(Expression value);
    @JsProperty(name="index")
    Expression getIndex();
    @JsProperty(name="index")
    void setIndex(Expression value);
    @JsConstructor
    public ReadKeyExpr(Expression receiver,Expression index,Type /* optional */ type) {}
     Object visitExpression(ExpressionVisitor visitor,Object context);
     WriteKeyExpr set(Expression value);
}
