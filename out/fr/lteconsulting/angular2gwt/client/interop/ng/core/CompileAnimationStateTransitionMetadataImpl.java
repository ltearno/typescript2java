package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.CompileAnimationMetadata;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\compile_metadata.d.ts
  * Package ng.core
  * Name CompileAnimationStateTransitionMetadata
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="CompileAnimationStateTransitionMetadata" )
public class CompileAnimationStateTransitionMetadataImpl extends CompileAnimationStateMetadata {
    @JsProperty(name="stateChangeExpr")
    String getStateChangeExpr();
    @JsProperty(name="stateChangeExpr")
    void setStateChangeExpr(String value);
    @JsProperty(name="steps")
    CompileAnimationMetadata getSteps();
    @JsProperty(name="steps")
    void setSteps(CompileAnimationMetadata value);
    @JsConstructor
    public CompileAnimationStateTransitionMetadataImpl(String stateChangeExpr,CompileAnimationMetadata steps) {}
}
