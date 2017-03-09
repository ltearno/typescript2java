package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\view_compiler\compile_query.d.ts
  * Package ng.core
  * Name CompileQuery
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class CompileQuery  {
    public CompileQueryMetadata meta;
    public Expression queryList;
    public Expression ownerDirectiveExpression;
    public CompileView view;
    public Object _values;
    @JsConstructor
    public CompileQuery(CompileQueryMetadata meta,Expression queryList,Expression ownerDirectiveExpression,CompileView view) {}
    public native  void addValue(Expression value,CompileView view);
    public native  void _isStatic();
    public native  void generateStatements(CompileMethod targetStaticMethod,CompileMethod targetDynamicMethod);
}
