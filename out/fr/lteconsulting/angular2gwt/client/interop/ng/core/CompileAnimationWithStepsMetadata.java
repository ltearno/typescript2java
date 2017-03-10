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
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface CompileAnimationWithStepsMetadata extends CompileAnimationMetadata {
    @JsProperty(name="steps")
    JsArray<CompileAnimationMetadata> getSteps();
    @JsProperty(name="steps")
    void setSteps(JsArray<CompileAnimationMetadata> value);
    @JsConstructor
    public CompileAnimationWithStepsMetadata(JsArray<CompileAnimationMetadata> /* optional */ steps) {}
}
