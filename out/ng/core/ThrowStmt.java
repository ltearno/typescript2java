package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name ThrowStmt
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class ThrowStmt extends Statement {
    public Expression error;
    @JsConstructor
    public ThrowStmt(Expression error) {}
    public native  Object visitStatement(StatementVisitor visitor,Object context);
}
