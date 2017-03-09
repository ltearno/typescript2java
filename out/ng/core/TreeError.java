package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\ml_parser\parser.d.ts
  * Package ng.core
  * Name TreeError
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class TreeError extends ParseError {
    public String elementName;
    public static native  TreeError create(String elementName,ParseSourceSpan span,String msg);
    @JsConstructor
    public TreeError(String elementName,ParseSourceSpan span,String msg) {}
}
