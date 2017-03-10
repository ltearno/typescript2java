package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.AnimationStyleMetadata;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\animation\metadata.d.ts
  * Package ng.core
  * Name AnimationStateDeclarationMetadata
  * Metadata representing the entry of animations.
  * Instances of this class are provided via the animation DSL when the {@link state state animation
  * function} is called.
  **/
@JsType( isNative=true, namespace="ng.core", name="AnimationStateDeclarationMetadata" )
public class AnimationStateDeclarationMetadataImpl extends AnimationStateMetadata {
    @JsProperty(name="stateNameExpr")
    String getStateNameExpr();
    @JsProperty(name="stateNameExpr")
    void setStateNameExpr(String value);
    @JsProperty(name="styles")
    AnimationStyleMetadata getStyles();
    @JsProperty(name="styles")
    void setStyles(AnimationStyleMetadata value);
    @JsConstructor
    public AnimationStateDeclarationMetadataImpl(String stateNameExpr,AnimationStyleMetadata styles) {}
}
