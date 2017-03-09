package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\parse_util.d.ts
  * Package ng.core
  * Name ParseError
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class ParseError  {
    public ParseSourceSpan span;
    public String msg;
    public /* ng.core.ParseErrorLevel */ int level;
    @JsConstructor
    public ParseError(ParseSourceSpan span,String msg,/* ng.core.ParseErrorLevel */ int /* optional */ level) {}
    public native  String toString();
}
