package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.AnimationMetadata;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\animation\metadata.d.ts
  * Package ng.core
  * Name AnimationSequenceMetadata
  * Metadata representing the entry of animations.
  * Instances of this class are provided via the animation DSL when the {@link sequence sequence
  * animation function} is called.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface AnimationSequenceMetadata extends AnimationWithStepsMetadata {
    @JsProperty(name="_steps")
    Object get_steps();
    @JsProperty(name="_steps")
    void set_steps(Object value);
    @JsConstructor
    public AnimationSequenceMetadata(JsArray<AnimationMetadata> _steps) {}
    @JsProperty(name="steps")
    JsArray<AnimationMetadata> getSteps();
    @JsProperty(name="steps")
    void setSteps(JsArray<AnimationMetadata> value);
}
