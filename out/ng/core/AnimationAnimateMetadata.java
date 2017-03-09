package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\animation\metadata.d.ts
  * Package ng.core
  * Name AnimationAnimateMetadata
  * Metadata representing the entry of animations.
  * Instances of this class are provided via the animation DSL when the {@link animate animate
  * animation function} is called.
  **/
@JsType( isNative=true, namespace="ng.core" )
public class AnimationAnimateMetadata extends AnimationMetadata {
    public Object /* UnionType */ timings;
    public Object /* UnionType */ styles;
    @JsConstructor
    public AnimationAnimateMetadata(Object /* UnionType */ timings,Object /* UnionType */ styles) {}
}
