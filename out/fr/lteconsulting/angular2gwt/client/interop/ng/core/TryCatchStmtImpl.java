package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.Statement;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;
import ng.core.StatementVisitor;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name TryCatchStmt
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="TryCatchStmt" )
public class TryCatchStmtImpl extends Statement {
    @JsProperty(name="bodyStmts")
    JsArray<Statement> getBodyStmts();
    @JsProperty(name="bodyStmts")
    void setBodyStmts(JsArray<Statement> value);
    @JsProperty(name="catchStmts")
    JsArray<Statement> getCatchStmts();
    @JsProperty(name="catchStmts")
    void setCatchStmts(JsArray<Statement> value);
    @JsConstructor
    public TryCatchStmtImpl(JsArray<Statement> bodyStmts,JsArray<Statement> catchStmts) {}
    public native  Object visitStatement(StatementVisitor visitor,Object context);
}
