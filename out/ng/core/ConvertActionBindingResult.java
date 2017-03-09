package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\compiler_util\expression_converter.d.ts
  * Package ng.core
  * Name ConvertActionBindingResult
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class ConvertActionBindingResult  {
    public JsArray<Statement> stmts;
    public ReadVarExpr preventDefault;
    @JsConstructor
    public ConvertActionBindingResult(JsArray<Statement> stmts,ReadVarExpr preventDefault) {}
}
