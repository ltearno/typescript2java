package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\animation\metadata.d.ts
  * Package ng.core
  * Name AnimationStyleMetadata
  * Metadata representing the entry of animations.
  * Instances of this class are provided via the animation DSL when the {@link style style animation
  * function} is called.
  **/
@JsType( isNative=true, namespace="ng.core" )
public class AnimationStyleMetadata extends AnimationMetadata {
    public Array<Object /* UnionType */> styles;
    public int offset;
    @JsConstructor
    public AnimationStyleMetadata(Array<Object /* UnionType */> styles,int /* optional */ offset) {}
}
