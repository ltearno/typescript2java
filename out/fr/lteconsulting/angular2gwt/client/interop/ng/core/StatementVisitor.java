package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.DeclareVarStmt;
import ng.core.DeclareFunctionStmt;
import ng.core.ExpressionStatement;
import ng.core.ReturnStatement;
import ng.core.ClassStmt;
import ng.core.IfStmt;
import ng.core.TryCatchStmt;
import ng.core.ThrowStmt;
import ng.core.CommentStmt;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name StatementVisitor
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface StatementVisitor  {
     Object visitDeclareVarStmt(DeclareVarStmt stmt,Object context);
     Object visitDeclareFunctionStmt(DeclareFunctionStmt stmt,Object context);
     Object visitExpressionStmt(ExpressionStatement stmt,Object context);
     Object visitReturnStmt(ReturnStatement stmt,Object context);
     Object visitDeclareClassStmt(ClassStmt stmt,Object context);
     Object visitIfStmt(IfStmt stmt,Object context);
     Object visitTryCatchStmt(TryCatchStmt stmt,Object context);
     Object visitThrowStmt(ThrowStmt stmt,Object context);
     Object visitCommentStmt(CommentStmt stmt,Object context);
}
