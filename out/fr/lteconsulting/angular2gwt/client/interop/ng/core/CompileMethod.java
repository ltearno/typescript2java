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
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface CompileMethod  {
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
    public CompileMethod(CompileView _view) {}
     void _updateDebugContextIfNeeded();
     void _updateDebugContext();
     Expression resetDebugInfoExpr(int nodeIndex,TemplateAst templateAst);
     void resetDebugInfo(int nodeIndex,TemplateAst templateAst);
     void push(JsArray<Statement> /* optional */ undefined);
     void addStmt(Statement stmt);
     void addStmts(JsArray<Statement> stmts);
     JsArray<Statement> finish();
     boolean isEmpty();
}
