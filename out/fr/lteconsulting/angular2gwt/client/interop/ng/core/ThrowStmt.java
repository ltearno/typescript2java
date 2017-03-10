package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.Expression;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;
import ng.core.StatementVisitor;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name ThrowStmt
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ThrowStmt extends Statement {
    @JsProperty(name="error")
    Expression getError();
    @JsProperty(name="error")
    void setError(Expression value);
    @JsConstructor
    public ThrowStmt(Expression error) {}
     Object visitStatement(StatementVisitor visitor,Object context);
}
