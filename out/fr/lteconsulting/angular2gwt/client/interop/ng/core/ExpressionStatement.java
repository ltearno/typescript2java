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
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ExpressionStatement extends Statement {
    @JsProperty(name="expr")
    Expression getExpr();
    @JsProperty(name="expr")
    void setExpr(Expression value);
    @JsConstructor
    public ExpressionStatement(Expression expr) {}
     Object visitStatement(StatementVisitor visitor,Object context);
}
