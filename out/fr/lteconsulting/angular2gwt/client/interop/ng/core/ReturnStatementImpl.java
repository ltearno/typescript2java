package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.Expression;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;
import ng.core.StatementVisitor;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name ReturnStatement
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="ReturnStatement" )
public class ReturnStatementImpl extends Statement {
    @JsProperty(name="value")
    Expression getValue();
    @JsProperty(name="value")
    void setValue(Expression value);
    @JsConstructor
    public ReturnStatementImpl(Expression value) {}
    public native  Object visitStatement(StatementVisitor visitor,Object context);
}
