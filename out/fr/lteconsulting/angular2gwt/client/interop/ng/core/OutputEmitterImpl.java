package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.Statement;

/**
  * Generated from tests\@angular\compiler\src\output\abstract_emitter.d.ts
  * Package ng.core
  * Name OutputEmitter
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="OutputEmitter" )
public abstract class OutputEmitterImpl  {
    public native  String emitStatements(String moduleUrl,JsArray<Statement> stmts,JsArray<String> exportedVars);
}
