package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.CompileAnimationStyleMetadata;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\compile_metadata.d.ts
  * Package ng.core
  * Name CompileAnimationKeyframesSequenceMetadata
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface CompileAnimationKeyframesSequenceMetadata extends CompileAnimationMetadata {
    @JsProperty(name="steps")
    JsArray<CompileAnimationStyleMetadata> getSteps();
    @JsProperty(name="steps")
    void setSteps(JsArray<CompileAnimationStyleMetadata> value);
    @JsConstructor
    public CompileAnimationKeyframesSequenceMetadata(JsArray<CompileAnimationStyleMetadata> /* optional */ steps) {}
}
