package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\compile_metadata.d.ts
  * Package ng.core
  * Name CompileAnimationStyleMetadata
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface CompileAnimationStyleMetadata extends CompileAnimationMetadata {
    @JsProperty(name="offset")
    int getOffset();
    @JsProperty(name="offset")
    void setOffset(int value);
    @JsProperty(name="styles")
    Array<Object /* UnionType */> getStyles();
    @JsProperty(name="styles")
    void setStyles(Array<Object /* UnionType */> value);
    @JsConstructor
    public CompileAnimationStyleMetadata(int offset,Array<Object /* UnionType */> /* optional */ styles) {}
}
