package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.CompileView;
import jsinterop.annotations.JsConstructor;
import ng.core.TemplateAst;
import ng.core.Expression;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.Statement;

/**
  * Generated from tests\@angular\compiler\src\view_compiler\compile_method.d.ts
  * Package ng.core
  * Name CompileMethod
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="CompileMethod" )
public class CompileMethodImpl  {
    @JsProperty(name="_view")
    Object get_view();
    @JsProperty(name="_view")
    void set_view(Object value);
    @JsProperty(name="_newState")
    Object get_newState();
    @JsProperty(name="_newState")
    void set_newState(Object value);
    @JsProperty(name="_currState")
    Object get_currState();
    @JsProperty(name="_currState")
    void set_currState(Object value);
    @JsProperty(name="_debugEnabled")
    Object get_debugEnabled();
    @JsProperty(name="_debugEnabled")
    void set_debugEnabled(Object value);
    @JsProperty(name="_bodyStatements")
    Object get_bodyStatements();
    @JsProperty(name="_bodyStatements")
    void set_bodyStatements(Object value);
    @JsConstructor
    public CompileMethodImpl(CompileView _view) {}
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
