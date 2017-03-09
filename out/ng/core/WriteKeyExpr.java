package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name WriteKeyExpr
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class WriteKeyExpr extends Expression {
    public Expression receiver;
    public Expression index;
    public Expression value;
    @JsConstructor
    public WriteKeyExpr(Expression receiver,Expression index,Expression value,Type /* optional */ type) {}
    public native  Object visitExpression(ExpressionVisitor visitor,Object context);
}
