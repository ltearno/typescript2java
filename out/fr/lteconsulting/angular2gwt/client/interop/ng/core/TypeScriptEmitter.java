package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.ImportResolver;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.Statement;

/**
  * Generated from tests\@angular\compiler\src\output\ts_emitter.d.ts
  * Package ng.core
  * Name TypeScriptEmitter
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface TypeScriptEmitter extends OutputEmitter {
    @JsProperty(name="_importGenerator")
    Object get_importGenerator();
    @JsProperty(name="_importGenerator")
    void set_importGenerator(Object value);
    @JsConstructor
    public TypeScriptEmitter(ImportResolver _importGenerator) {}
     String emitStatements(String moduleUrl,JsArray<Statement> stmts,JsArray<String> exportedVars);
}
