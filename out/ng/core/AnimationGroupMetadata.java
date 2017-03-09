package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\animation\metadata.d.ts
  * Package ng.core
  * Name AnimationGroupMetadata
  * Metadata representing the entry of animations.
  * Instances of this class are provided via the animation DSL when the {@link group group animation
  * function} is called.
  **/
@JsType( isNative=true, namespace="ng.core" )
public class AnimationGroupMetadata extends AnimationWithStepsMetadata {
    public Object _steps;
    @JsConstructor
    public AnimationGroupMetadata(JsArray<AnimationMetadata> _steps) {}
    public JsArray<AnimationMetadata> steps;
}
