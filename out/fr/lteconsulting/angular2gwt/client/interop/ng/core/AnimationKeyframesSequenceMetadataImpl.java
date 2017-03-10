package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.AnimationStyleMetadata;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\animation\metadata.d.ts
  * Package ng.core
  * Name AnimationKeyframesSequenceMetadata
  * Metadata representing the entry of animations.
  * Instances of this class are provided via the animation DSL when the {@link keyframes keyframes
  * animation function} is called.
  **/
@JsType( isNative=true, namespace="ng.core", name="AnimationKeyframesSequenceMetadata" )
public class AnimationKeyframesSequenceMetadataImpl extends AnimationMetadata {
    @JsProperty(name="steps")
    JsArray<AnimationStyleMetadata> getSteps();
    @JsProperty(name="steps")
    void setSteps(JsArray<AnimationStyleMetadata> value);
    @JsConstructor
    public AnimationKeyframesSequenceMetadataImpl(JsArray<AnimationStyleMetadata> steps) {}
}
