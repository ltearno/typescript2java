package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.Node;
import jsinterop.annotations.JsProperty;
import ng.core.ParseError;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\ml_parser\parser.d.ts
  * Package ng.core
  * Name ParseTreeResult
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="ParseTreeResult" )
public class ParseTreeResultImpl  {
    @JsProperty(name="rootNodes")
    JsArray<Node> getRootNodes();
    @JsProperty(name="rootNodes")
    void setRootNodes(JsArray<Node> value);
    @JsProperty(name="errors")
    JsArray<ParseError> getErrors();
    @JsProperty(name="errors")
    void setErrors(JsArray<ParseError> value);
    @JsConstructor
    public ParseTreeResultImpl(JsArray<Node> rootNodes,JsArray<ParseError> errors) {}
}
