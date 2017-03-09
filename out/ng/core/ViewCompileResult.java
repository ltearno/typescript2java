package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\view_compiler\view_compiler.d.ts
  * Package ng.core
  * Name ViewCompileResult
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class ViewCompileResult  {
    public JsArray<Statement> statements;
    public String viewClassVar;
    public Array<Object /* UnionType */> dependencies;
    @JsConstructor
    public ViewCompileResult(JsArray<Statement> statements,String viewClassVar,Array<Object /* UnionType */> dependencies) {}
}
