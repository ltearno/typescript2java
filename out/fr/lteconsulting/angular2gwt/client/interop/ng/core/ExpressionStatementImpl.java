package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.Expression;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;
import ng.core.StatementVisitor;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name ExpressionStatement
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="ExpressionStatement" )
public class ExpressionStatementImpl extends Statement {
    @JsProperty(name="expr")
    Expression getExpr();
    @JsProperty(name="expr")
    void setExpr(Expression value);
    @JsConstructor
    public ExpressionStatementImpl(Expression expr) {}
    public native  Object visitStatement(StatementVisitor visitor,Object context);
}
