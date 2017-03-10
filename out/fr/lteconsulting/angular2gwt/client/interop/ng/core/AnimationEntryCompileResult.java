package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.Statement;
import ng.core.Expression;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\animation\animation_compiler.d.ts
  * Package ng.core
  * Name AnimationEntryCompileResult
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface AnimationEntryCompileResult  {
    @JsProperty(name="name")
    String getName();
    @JsProperty(name="name")
    void setName(String value);
    @JsProperty(name="statements")
    JsArray<Statement> getStatements();
    @JsProperty(name="statements")
    void setStatements(JsArray<Statement> value);
    @JsProperty(name="fnExp")
    Expression getFnExp();
    @JsProperty(name="fnExp")
    void setFnExp(Expression value);
    @JsConstructor
    public AnimationEntryCompileResult(String name,JsArray<Statement> statements,Expression fnExp) {}
}
