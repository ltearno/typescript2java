package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name InvokeMethodExpr
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class InvokeMethodExpr extends Expression {
    public Expression receiver;
    public JsArray<Expression> args;
    public String name;
    public /* ng.core.BuiltinMethod */ int builtin;
    @JsConstructor
    public InvokeMethodExpr(Expression receiver,Object /* UnionType */ method,JsArray<Expression> args,Type /* optional */ type) {}
    public native  Object visitExpression(ExpressionVisitor visitor,Object context);
}
