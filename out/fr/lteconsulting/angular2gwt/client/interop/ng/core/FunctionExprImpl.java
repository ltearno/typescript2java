package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.FnParam;
import jsinterop.annotations.JsProperty;
import ng.core.Statement;
import ng.core.Type;
import jsinterop.annotations.JsConstructor;
import ng.core.ExpressionVisitor;
import ng.core.DeclareFunctionStmt;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name FunctionExpr
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="FunctionExpr" )
public class FunctionExprImpl extends Expression {
    @JsProperty(name="params")
    JsArray<FnParam> getParams();
    @JsProperty(name="params")
    void setParams(JsArray<FnParam> value);
    @JsProperty(name="statements")
    JsArray<Statement> getStatements();
    @JsProperty(name="statements")
    void setStatements(JsArray<Statement> value);
    @JsConstructor
    public FunctionExprImpl(JsArray<FnParam> params,JsArray<Statement> statements,Type /* optional */ type) {}
    public native  Object visitExpression(ExpressionVisitor visitor,Object context);
    public native  DeclareFunctionStmt toDeclStmt(String name,JsArray</* ng.core.StmtModifier */ int> /* optional */ modifiers);
}
