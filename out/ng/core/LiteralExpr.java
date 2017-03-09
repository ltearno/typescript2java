package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name LiteralExpr
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class LiteralExpr extends Expression {
    public Object value;
    @JsConstructor
    public LiteralExpr(Object value,Type /* optional */ type) {}
    public native  Object visitExpression(ExpressionVisitor visitor,Object context);
}
