package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\expression_parser\ast.d.ts
  * Package ng.core
  * Name ParserError
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class ParserError  {
    public String input;
    public String errLocation;
    public Object ctxLocation;
    public String message;
    @JsConstructor
    public ParserError(String message,String input,String errLocation,Object /* optional */ ctxLocation) {}
}
