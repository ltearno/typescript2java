package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name ExpressionStatement
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class ExpressionStatement extends Statement {
    public Expression expr;
    @JsConstructor
    public ExpressionStatement(Expression expr) {}
    public native  Object visitStatement(StatementVisitor visitor,Object context);
}
