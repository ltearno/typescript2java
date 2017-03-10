package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.ParseSourceSpan;
import ng.core.TreeError;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\ml_parser\parser.d.ts
  * Package ng.core
  * Name TreeError
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface TreeError extends ParseError {
    @JsProperty(name="elementName")
    String getElementName();
    @JsProperty(name="elementName")
    void setElementName(String value);
    @JsConstructor
    public TreeError(String elementName,ParseSourceSpan span,String msg) {}
}
