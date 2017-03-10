package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.ParseSourceSpan;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\parse_util.d.ts
  * Package ng.core
  * Name ParseError
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ParseError  {
    @JsProperty(name="span")
    ParseSourceSpan getSpan();
    @JsProperty(name="span")
    void setSpan(ParseSourceSpan value);
    @JsProperty(name="msg")
    String getMsg();
    @JsProperty(name="msg")
    void setMsg(String value);
    @JsProperty(name="level")
    /* ng.core.ParseErrorLevel */ int getLevel();
    @JsProperty(name="level")
    void setLevel(/* ng.core.ParseErrorLevel */ int value);
    @JsConstructor
    public ParseError(ParseSourceSpan span,String msg,/* ng.core.ParseErrorLevel */ int /* optional */ level) {}
     String toString();
}
