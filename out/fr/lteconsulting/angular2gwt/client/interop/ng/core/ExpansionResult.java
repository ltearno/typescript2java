package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.Node;
import jsinterop.annotations.JsProperty;
import ng.core.ParseError;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\ml_parser\icu_ast_expander.d.ts
  * Package ng.core
  * Name ExpansionResult
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ExpansionResult  {
    @JsProperty(name="nodes")
    JsArray<Node> getNodes();
    @JsProperty(name="nodes")
    void setNodes(JsArray<Node> value);
    @JsProperty(name="expanded")
    boolean getExpanded();
    @JsProperty(name="expanded")
    void setExpanded(boolean value);
    @JsProperty(name="errors")
    JsArray<ParseError> getErrors();
    @JsProperty(name="errors")
    void setErrors(JsArray<ParseError> value);
    @JsConstructor
    public ExpansionResult(JsArray<Node> nodes,boolean expanded,JsArray<ParseError> errors) {}
}
