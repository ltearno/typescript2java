package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\compile_metadata.d.ts
  * Package ng.core
  * Name CompileAnimationStateTransitionMetadata
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class CompileAnimationStateTransitionMetadata extends CompileAnimationStateMetadata {
    public String stateChangeExpr;
    public CompileAnimationMetadata steps;
    @JsConstructor
    public CompileAnimationStateTransitionMetadata(String stateChangeExpr,CompileAnimationMetadata steps) {}
}
