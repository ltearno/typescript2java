package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.Expression;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.Type;
import jsinterop.annotations.JsConstructor;
import ng.core.ExpressionVisitor;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name InvokeMethodExpr
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="InvokeMethodExpr" )
public class InvokeMethodExprImpl extends Expression {
    @JsProperty(name="receiver")
    Expression getReceiver();
    @JsProperty(name="receiver")
    void setReceiver(Expression value);
    @JsProperty(name="args")
    JsArray<Expression> getArgs();
    @JsProperty(name="args")
    void setArgs(JsArray<Expression> value);
    @JsProperty(name="name")
    String getName();
    @JsProperty(name="name")
    void setName(String value);
    @JsProperty(name="builtin")
    /* ng.core.BuiltinMethod */ int getBuiltin();
    @JsProperty(name="builtin")
    void setBuiltin(/* ng.core.BuiltinMethod */ int value);
    @JsConstructor
    public InvokeMethodExprImpl(Expression receiver,Object /* UnionType */ method,JsArray<Expression> args,Type /* optional */ type) {}
    public native  Object visitExpression(ExpressionVisitor visitor,Object context);
}
