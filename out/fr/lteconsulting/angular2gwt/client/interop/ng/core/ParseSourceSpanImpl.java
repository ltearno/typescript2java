package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.ParseLocation;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\parse_util.d.ts
  * Package ng.core
  * Name ParseSourceSpan
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="ParseSourceSpan" )
public class ParseSourceSpanImpl  {
    @JsProperty(name="start")
    ParseLocation getStart();
    @JsProperty(name="start")
    void setStart(ParseLocation value);
    @JsProperty(name="end")
    ParseLocation getEnd();
    @JsProperty(name="end")
    void setEnd(ParseLocation value);
    @JsProperty(name="details")
    String getDetails();
    @JsProperty(name="details")
    void setDetails(String value);
    @JsConstructor
    public ParseSourceSpanImpl(ParseLocation start,ParseLocation end,String /* optional */ details) {}
    public native  String toString();
}
