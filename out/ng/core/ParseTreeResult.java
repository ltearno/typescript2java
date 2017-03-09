package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\ml_parser\parser.d.ts
  * Package ng.core
  * Name ParseTreeResult
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class ParseTreeResult  {
    public JsArray<Node> rootNodes;
    public JsArray<ParseError> errors;
    @JsConstructor
    public ParseTreeResult(JsArray<Node> rootNodes,JsArray<ParseError> errors) {}
}
