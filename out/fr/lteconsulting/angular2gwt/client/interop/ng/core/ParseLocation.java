package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.ParseSourceFile;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;
import ng.core.ParseLocation;

/**
  * Generated from tests\@angular\compiler\src\parse_util.d.ts
  * Package ng.core
  * Name ParseLocation
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ParseLocation  {
    @JsProperty(name="file")
    ParseSourceFile getFile();
    @JsProperty(name="file")
    void setFile(ParseSourceFile value);
    @JsProperty(name="offset")
    int getOffset();
    @JsProperty(name="offset")
    void setOffset(int value);
    @JsProperty(name="line")
    int getLine();
    @JsProperty(name="line")
    void setLine(int value);
    @JsProperty(name="col")
    int getCol();
    @JsProperty(name="col")
    void setCol(int value);
    @JsConstructor
    public ParseLocation(ParseSourceFile file,int offset,int line,int col) {}
     String toString();
     ParseLocation moveBy(int delta);
     /* TypeLiteral */ Object getContext(int maxChars,int maxLines);
}
