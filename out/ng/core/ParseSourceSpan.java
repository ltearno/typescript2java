package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\parse_util.d.ts
  * Package ng.core
  * Name ParseSourceSpan
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class ParseSourceSpan  {
    public ParseLocation start;
    public ParseLocation end;
    public String details;
    @JsConstructor
    public ParseSourceSpan(ParseLocation start,ParseLocation end,String /* optional */ details) {}
    public native  String toString();
}
