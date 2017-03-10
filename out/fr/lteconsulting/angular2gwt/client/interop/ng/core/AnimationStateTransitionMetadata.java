package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.AnimationMetadata;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\animation\metadata.d.ts
  * Package ng.core
  * Name AnimationStateTransitionMetadata
  * Metadata representing the entry of animations.
  * Instances of this class are provided via the animation DSL when the
  * {@link transition transition animation function} is called.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface AnimationStateTransitionMetadata extends AnimationStateMetadata {
    @JsProperty(name="stateChangeExpr")
    String getStateChangeExpr();
    @JsProperty(name="stateChangeExpr")
    void setStateChangeExpr(String value);
    @JsProperty(name="steps")
    AnimationMetadata getSteps();
    @JsProperty(name="steps")
    void setSteps(AnimationMetadata value);
    @JsConstructor
    public AnimationStateTransitionMetadata(String stateChangeExpr,AnimationMetadata steps) {}
}
