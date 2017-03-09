package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\animation\metadata.d.ts
  * Package ng.core
  * Name AnimationSequenceMetadata
  * Metadata representing the entry of animations.
  * Instances of this class are provided via the animation DSL when the {@link sequence sequence
  * animation function} is called.
  **/
@JsType( isNative=true, namespace="ng.core" )
public class AnimationSequenceMetadata extends AnimationWithStepsMetadata {
    public Object _steps;
    @JsConstructor
    public AnimationSequenceMetadata(JsArray<AnimationMetadata> _steps) {}
    public JsArray<AnimationMetadata> steps;
}
