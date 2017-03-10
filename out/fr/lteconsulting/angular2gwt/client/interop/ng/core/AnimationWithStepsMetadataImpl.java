package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.AnimationMetadata;
import jsinterop.annotations.JsProperty;

/**
  * Generated from tests\@angular\core\src\animation\metadata.d.ts
  * Package ng.core
  * Name AnimationWithStepsMetadata
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="AnimationWithStepsMetadata" )
public abstract class AnimationWithStepsMetadataImpl extends AnimationMetadata {
    @JsConstructor
    public AnimationWithStepsMetadataImpl() {}
    @JsProperty(name="steps")
    JsArray<AnimationMetadata> getSteps();
    @JsProperty(name="steps")
    void setSteps(JsArray<AnimationMetadata> value);
}
