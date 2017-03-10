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
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ParseSourceSpan  {
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
    public ParseSourceSpan(ParseLocation start,ParseLocation end,String /* optional */ details) {}
     String toString();
}
