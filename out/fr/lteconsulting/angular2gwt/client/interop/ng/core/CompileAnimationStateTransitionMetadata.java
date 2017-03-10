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
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface CompileAnimationStateTransitionMetadata extends CompileAnimationStateMetadata {
    @JsProperty(name="stateChangeExpr")
    String getStateChangeExpr();
    @JsProperty(name="stateChangeExpr")
    void setStateChangeExpr(String value);
    @JsProperty(name="steps")
    CompileAnimationMetadata getSteps();
    @JsProperty(name="steps")
    void setSteps(CompileAnimationMetadata value);
    @JsConstructor
    public CompileAnimationStateTransitionMetadata(String stateChangeExpr,CompileAnimationMetadata steps) {}
}
