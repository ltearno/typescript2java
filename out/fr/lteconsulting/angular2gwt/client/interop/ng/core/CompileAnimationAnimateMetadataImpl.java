package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\compile_metadata.d.ts
  * Package ng.core
  * Name CompileAnimationAnimateMetadata
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="CompileAnimationAnimateMetadata" )
public class CompileAnimationAnimateMetadataImpl extends CompileAnimationMetadata {
    @JsProperty(name="timings")
    Object /* UnionType */ getTimings();
    @JsProperty(name="timings")
    void setTimings(Object /* UnionType */ value);
    @JsProperty(name="styles")
    Object /* UnionType */ getStyles();
    @JsProperty(name="styles")
    void setStyles(Object /* UnionType */ value);
    @JsConstructor
    public CompileAnimationAnimateMetadataImpl(Object /* UnionType */ /* optional */ timings,Object /* UnionType */ /* optional */ styles) {}
}
