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
  * Name InvokeFunctionExpr
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface InvokeFunctionExpr extends Expression {
    @JsProperty(name="fn")
    Expression getFn();
    @JsProperty(name="fn")
    void setFn(Expression value);
    @JsProperty(name="args")
    JsArray<Expression> getArgs();
    @JsProperty(name="args")
    void setArgs(JsArray<Expression> value);
    @JsConstructor
    public InvokeFunctionExpr(Expression fn,JsArray<Expression> args,Type /* optional */ type) {}
     Object visitExpression(ExpressionVisitor visitor,Object context);
}
