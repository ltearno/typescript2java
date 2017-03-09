package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name ReadKeyExpr
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class ReadKeyExpr extends Expression {
    public Expression receiver;
    public Expression index;
    @JsConstructor
    public ReadKeyExpr(Expression receiver,Expression index,Type /* optional */ type) {}
    public native  Object visitExpression(ExpressionVisitor visitor,Object context);
    public native  WriteKeyExpr set(Expression value);
}
