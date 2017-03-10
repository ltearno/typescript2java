package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.CompileAnimationMetadata;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\compile_metadata.d.ts
  * Package ng.core
  * Name CompileAnimationWithStepsMetadata
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="CompileAnimationWithStepsMetadata" )
public abstract class CompileAnimationWithStepsMetadataImpl extends CompileAnimationMetadata {
    @JsProperty(name="steps")
    JsArray<CompileAnimationMetadata> getSteps();
    @JsProperty(name="steps")
    void setSteps(JsArray<CompileAnimationMetadata> value);
    @JsConstructor
    public CompileAnimationWithStepsMetadataImpl(JsArray<CompileAnimationMetadata> /* optional */ steps) {}
}
