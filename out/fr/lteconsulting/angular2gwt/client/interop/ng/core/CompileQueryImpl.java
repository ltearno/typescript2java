package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.CompileQueryMetadata;
import jsinterop.annotations.JsProperty;
import ng.core.Expression;
import ng.core.CompileView;
import jsinterop.annotations.JsConstructor;
import ng.core.CompileMethod;

/**
  * Generated from tests\@angular\compiler\src\view_compiler\compile_query.d.ts
  * Package ng.core
  * Name CompileQuery
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="CompileQuery" )
public class CompileQueryImpl  {
    @JsProperty(name="meta")
    CompileQueryMetadata getMeta();
    @JsProperty(name="meta")
    void setMeta(CompileQueryMetadata value);
    @JsProperty(name="queryList")
    Expression getQueryList();
    @JsProperty(name="queryList")
    void setQueryList(Expression value);
    @JsProperty(name="ownerDirectiveExpression")
    Expression getOwnerDirectiveExpression();
    @JsProperty(name="ownerDirectiveExpression")
    void setOwnerDirectiveExpression(Expression value);
    @JsProperty(name="view")
    CompileView getView();
    @JsProperty(name="view")
    void setView(CompileView value);
    @JsProperty(name="_values")
    Object get_values();
    @JsProperty(name="_values")
    void set_values(Object value);
    @JsConstructor
    public CompileQueryImpl(CompileQueryMetadata meta,Expression queryList,Expression ownerDirectiveExpression,CompileView view) {}
    public native  void addValue(Expression value,CompileView view);
    public native  void _isStatic();
    public native  void generateStatements(CompileMethod targetStaticMethod,CompileMethod targetDynamicMethod);
}
