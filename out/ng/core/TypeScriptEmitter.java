package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\compiler\src\output\ts_emitter.d.ts
  * Package ng.core
  * Name TypeScriptEmitter
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class TypeScriptEmitter extends OutputEmitter {
    public Object _importGenerator;
    @JsConstructor
    public TypeScriptEmitter(ImportResolver _importGenerator) {}
    public native  String emitStatements(String moduleUrl,JsArray<Statement> stmts,JsArray<String> exportedVars);
}
