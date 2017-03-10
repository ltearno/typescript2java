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
@JsType( isNative=true, namespace="ng.core", name="TreeError" )
public class TreeErrorImpl extends ParseError {
    @JsProperty(name="elementName")
    String getElementName();
    @JsProperty(name="elementName")
    void setElementName(String value);
    public static native  TreeError create(String elementName,ParseSourceSpan span,String msg);
    @JsConstructor
    public TreeErrorImpl(String elementName,ParseSourceSpan span,String msg) {}
}
