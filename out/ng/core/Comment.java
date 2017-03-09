package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\ml_parser\ast.d.ts
  * Package ng.core
  * Name Comment
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class Comment extends Node {
    public String value;
    public ParseSourceSpan sourceSpan;
    @JsConstructor
    public Comment(String value,ParseSourceSpan sourceSpan) {}
    public native  Object visit(Visitor visitor,Object context);
}
