package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name FunctionExpr
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class FunctionExpr extends Expression {
    public JsArray<FnParam> params;
    public JsArray<Statement> statements;
    @JsConstructor
    public FunctionExpr(JsArray<FnParam> params,JsArray<Statement> statements,Type /* optional */ type) {}
    public native  Object visitExpression(ExpressionVisitor visitor,Object context);
    public native  DeclareFunctionStmt toDeclStmt(String name,JsArray</* ng.core.StmtModifier */ int> /* optional */ modifiers);
}
