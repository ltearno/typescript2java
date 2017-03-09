package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name IfStmt
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class IfStmt extends Statement {
    public Expression condition;
    public JsArray<Statement> trueCase;
    public JsArray<Statement> falseCase;
    @JsConstructor
    public IfStmt(Expression condition,JsArray<Statement> trueCase,JsArray<Statement> /* optional */ falseCase) {}
    public native  Object visitStatement(StatementVisitor visitor,Object context);
}
