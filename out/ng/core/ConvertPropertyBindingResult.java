package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\compiler_util\expression_converter.d.ts
  * Package ng.core
  * Name ConvertPropertyBindingResult
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class ConvertPropertyBindingResult  {
    public JsArray<Statement> stmts;
    public Expression currValExpr;
    public Expression forceUpdate;
    @JsConstructor
    public ConvertPropertyBindingResult(JsArray<Statement> stmts,Expression currValExpr,Expression forceUpdate) {}
}
