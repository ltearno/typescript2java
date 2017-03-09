package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\ml_parser\icu_ast_expander.d.ts
  * Package ng.core
  * Name ExpansionResult
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class ExpansionResult  {
    public JsArray<Node> nodes;
    public boolean expanded;
    public JsArray<ParseError> errors;
    @JsConstructor
    public ExpansionResult(JsArray<Node> nodes,boolean expanded,JsArray<ParseError> errors) {}
}
