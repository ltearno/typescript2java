package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.Statement;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\directive_wrapper_compiler.d.ts
  * Package ng.core
  * Name DirectiveWrapperCompileResult
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface DirectiveWrapperCompileResult  {
    @JsProperty(name="statements")
    JsArray<Statement> getStatements();
    @JsProperty(name="statements")
    void setStatements(JsArray<Statement> value);
    @JsProperty(name="dirWrapperClassVar")
    String getDirWrapperClassVar();
    @JsProperty(name="dirWrapperClassVar")
    void setDirWrapperClassVar(String value);
    @JsConstructor
    public DirectiveWrapperCompileResult(JsArray<Statement> statements,String dirWrapperClassVar) {}
}
