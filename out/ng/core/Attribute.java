package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\ml_parser\ast.d.ts
  * Package ng.core
  * Name Attribute
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class Attribute extends Node {
    public String name;
    public String value;
    public ParseSourceSpan sourceSpan;
    public ParseSourceSpan valueSpan;
    @JsConstructor
    public Attribute(String name,String value,ParseSourceSpan sourceSpan,ParseSourceSpan /* optional */ valueSpan) {}
    public native  Object visit(Visitor visitor,Object context);
}
