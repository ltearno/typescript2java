package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name CommentStmt
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class CommentStmt extends Statement {
    public String comment;
    @JsConstructor
    public CommentStmt(String comment) {}
    public native  Object visitStatement(StatementVisitor visitor,Object context);
}
