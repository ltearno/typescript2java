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
@JsType( isNative=true, namespace="ng.core", name="CompileAnimationStyleMetadata" )
public class CompileAnimationStyleMetadataImpl extends CompileAnimationMetadata {
    @JsProperty(name="offset")
    int getOffset();
    @JsProperty(name="offset")
    void setOffset(int value);
    @JsProperty(name="styles")
    Array<Object /* UnionType */> getStyles();
    @JsProperty(name="styles")
    void setStyles(Array<Object /* UnionType */> value);
    @JsConstructor
    public CompileAnimationStyleMetadataImpl(int offset,Array<Object /* UnionType */> /* optional */ styles) {}
}
