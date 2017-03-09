package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name ReadPropExpr
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class ReadPropExpr extends Expression {
    public Expression receiver;
    public String name;
    @JsConstructor
    public ReadPropExpr(Expression receiver,String name,Type /* optional */ type) {}
    public native  Object visitExpression(ExpressionVisitor visitor,Object context);
    public native  WritePropExpr set(Expression value);
}
