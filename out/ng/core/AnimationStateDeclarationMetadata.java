package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\animation\metadata.d.ts
  * Package ng.core
  * Name AnimationStateDeclarationMetadata
  * Metadata representing the entry of animations.
  * Instances of this class are provided via the animation DSL when the {@link state state animation
  * function} is called.
  **/
@JsType( isNative=true, namespace="ng.core" )
public class AnimationStateDeclarationMetadata extends AnimationStateMetadata {
    public String stateNameExpr;
    public AnimationStyleMetadata styles;
    @JsConstructor
    public AnimationStateDeclarationMetadata(String stateNameExpr,AnimationStyleMetadata styles) {}
}
