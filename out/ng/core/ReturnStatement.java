package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name ReturnStatement
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class ReturnStatement extends Statement {
    public Expression value;
    @JsConstructor
    public ReturnStatement(Expression value) {}
    public native  Object visitStatement(StatementVisitor visitor,Object context);
}
