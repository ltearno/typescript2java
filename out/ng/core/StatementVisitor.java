package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name StatementVisitor
  * 
  **/
@JsType( isNative=true, name="Object", namespace=JsPackage.GLOBAL )
public class StatementVisitor  {
    public native  Object visitDeclareVarStmt(DeclareVarStmt stmt,Object context);
    public native  Object visitDeclareFunctionStmt(DeclareFunctionStmt stmt,Object context);
    public native  Object visitExpressionStmt(ExpressionStatement stmt,Object context);
    public native  Object visitReturnStmt(ReturnStatement stmt,Object context);
    public native  Object visitDeclareClassStmt(ClassStmt stmt,Object context);
    public native  Object visitIfStmt(IfStmt stmt,Object context);
    public native  Object visitTryCatchStmt(TryCatchStmt stmt,Object context);
    public native  Object visitThrowStmt(ThrowStmt stmt,Object context);
    public native  Object visitCommentStmt(CommentStmt stmt,Object context);
}
