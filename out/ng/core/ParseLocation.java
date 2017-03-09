package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\parse_util.d.ts
  * Package ng.core
  * Name ParseLocation
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class ParseLocation  {
    public ParseSourceFile file;
    public int offset;
    public int line;
    public int col;
    @JsConstructor
    public ParseLocation(ParseSourceFile file,int offset,int line,int col) {}
    public native  String toString();
    public native  ParseLocation moveBy(int delta);
    public native  /* TypeLiteral */ Object getContext(int maxChars,int maxLines);
}
