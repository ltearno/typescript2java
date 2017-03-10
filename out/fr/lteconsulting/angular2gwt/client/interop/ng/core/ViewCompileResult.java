package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.Statement;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\view_compiler\view_compiler.d.ts
  * Package ng.core
  * Name ViewCompileResult
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ViewCompileResult  {
    @JsProperty(name="statements")
    JsArray<Statement> getStatements();
    @JsProperty(name="statements")
    void setStatements(JsArray<Statement> value);
    @JsProperty(name="viewClassVar")
    String getViewClassVar();
    @JsProperty(name="viewClassVar")
    void setViewClassVar(String value);
    @JsProperty(name="dependencies")
    Array<Object /* UnionType */> getDependencies();
    @JsProperty(name="dependencies")
    void setDependencies(Array<Object /* UnionType */> value);
    @JsConstructor
    public ViewCompileResult(JsArray<Statement> statements,String viewClassVar,Array<Object /* UnionType */> dependencies) {}
}
