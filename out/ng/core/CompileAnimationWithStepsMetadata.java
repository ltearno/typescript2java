package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\compile_metadata.d.ts
  * Package ng.core
  * Name CompileAnimationWithStepsMetadata
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public interface CompileAnimationWithStepsMetadata extends CompileAnimationMetadata {
    @JsProperty(name="steps")
    JsArray<CompileAnimationMetadata> steps();
    @JsProperty(name="steps")
    void steps(JsArray<CompileAnimationMetadata> value);
    @JsConstructor
    public CompileAnimationWithStepsMetadata(JsArray<CompileAnimationMetadata> /* optional */ steps) {}
}
