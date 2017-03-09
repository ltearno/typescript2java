package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\animation\metadata.d.ts
  * Package ng.core
  * Name AnimationKeyframesSequenceMetadata
  * Metadata representing the entry of animations.
  * Instances of this class are provided via the animation DSL when the {@link keyframes keyframes
  * animation function} is called.
  **/
@JsType( isNative=true, namespace="ng.core" )
public class AnimationKeyframesSequenceMetadata extends AnimationMetadata {
    public JsArray<AnimationStyleMetadata> steps;
    @JsConstructor
    public AnimationKeyframesSequenceMetadata(JsArray<AnimationStyleMetadata> steps) {}
}
