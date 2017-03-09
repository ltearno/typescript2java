package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name WritePropExpr
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class WritePropExpr extends Expression {
    public Expression receiver;
    public String name;
    public Expression value;
    @JsConstructor
    public WritePropExpr(Expression receiver,String name,Expression value,Type /* optional */ type) {}
    public native  Object visitExpression(ExpressionVisitor visitor,Object context);
}
