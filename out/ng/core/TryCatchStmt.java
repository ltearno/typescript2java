package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name TryCatchStmt
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class TryCatchStmt extends Statement {
    public JsArray<Statement> bodyStmts;
    public JsArray<Statement> catchStmts;
    @JsConstructor
    public TryCatchStmt(JsArray<Statement> bodyStmts,JsArray<Statement> catchStmts) {}
    public native  Object visitStatement(StatementVisitor visitor,Object context);
}
