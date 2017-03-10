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
@JsType( isNative=true, namespace="ng.core", name="CompileAnimationKeyframesSequenceMetadata" )
public class CompileAnimationKeyframesSequenceMetadataImpl extends CompileAnimationMetadata {
    @JsProperty(name="steps")
    JsArray<CompileAnimationStyleMetadata> getSteps();
    @JsProperty(name="steps")
    void setSteps(JsArray<CompileAnimationStyleMetadata> value);
    @JsConstructor
    public CompileAnimationKeyframesSequenceMetadataImpl(JsArray<CompileAnimationStyleMetadata> /* optional */ steps) {}
}
