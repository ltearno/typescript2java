package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\animation\metadata.d.ts
  * Package ng.core
  * Name AnimationStateTransitionMetadata
  * Metadata representing the entry of animations.
  * Instances of this class are provided via the animation DSL when the
  * {@link transition transition animation function} is called.
  **/
@JsType( isNative=true, namespace="ng.core" )
public class AnimationStateTransitionMetadata extends AnimationStateMetadata {
    public String stateChangeExpr;
    public AnimationMetadata steps;
    @JsConstructor
    public AnimationStateTransitionMetadata(String stateChangeExpr,AnimationMetadata steps) {}
}
