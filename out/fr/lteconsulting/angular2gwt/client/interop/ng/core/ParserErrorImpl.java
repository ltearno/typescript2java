package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\expression_parser\ast.d.ts
  * Package ng.core
  * Name ParserError
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="ParserError" )
public class ParserErrorImpl  {
    @JsProperty(name="input")
    String getInput();
    @JsProperty(name="input")
    void setInput(String value);
    @JsProperty(name="errLocation")
    String getErrLocation();
    @JsProperty(name="errLocation")
    void setErrLocation(String value);
    @JsProperty(name="ctxLocation")
    Object getCtxLocation();
    @JsProperty(name="ctxLocation")
    void setCtxLocation(Object value);
    @JsProperty(name="message")
    String getMessage();
    @JsProperty(name="message")
    void setMessage(String value);
    @JsConstructor
    public ParserErrorImpl(String message,String input,String errLocation,Object /* optional */ ctxLocation) {}
}
