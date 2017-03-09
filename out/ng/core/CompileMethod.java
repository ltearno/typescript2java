package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\compiler\src\view_compiler\compile_method.d.ts
  * Package ng.core
  * Name CompileMethod
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class CompileMethod  {
    public Object _view;
    public Object _newState;
    public Object _currState;
    public Object _debugEnabled;
    public Object _bodyStatements;
    @JsConstructor
    public CompileMethod(CompileView _view) {}
    public native  void _updateDebugContextIfNeeded();
    public native  void _updateDebugContext();
    public native  Expression resetDebugInfoExpr(int nodeIndex,TemplateAst templateAst);
    public native  void resetDebugInfo(int nodeIndex,TemplateAst templateAst);
    public native  void push(JsArray<Statement> /* optional */ undefined);
    public native  void addStmt(Statement stmt);
    public native  void addStmts(JsArray<Statement> stmts);
    public native  JsArray<Statement> finish();
    public native  boolean isEmpty();
}
