package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\animation\metadata.d.ts
  * Package ng.core
  * Name AnimationAnimateMetadata
  * Metadata representing the entry of animations.
  * Instances of this class are provided via the animation DSL when the {@link animate animate
  * animation function} is called.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface AnimationAnimateMetadata extends AnimationMetadata {
    @JsProperty(name="timings")
    Object /* UnionType */ getTimings();
    @JsProperty(name="timings")
    void setTimings(Object /* UnionType */ value);
    @JsProperty(name="styles")
    Object /* UnionType */ getStyles();
    @JsProperty(name="styles")
    void setStyles(Object /* UnionType */ value);
    @JsConstructor
    public AnimationAnimateMetadata(Object /* UnionType */ timings,Object /* UnionType */ styles) {}
}
