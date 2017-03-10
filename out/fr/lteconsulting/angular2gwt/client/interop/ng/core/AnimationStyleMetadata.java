package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\animation\metadata.d.ts
  * Package ng.core
  * Name AnimationStyleMetadata
  * Metadata representing the entry of animations.
  * Instances of this class are provided via the animation DSL when the {@link style style animation
  * function} is called.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface AnimationStyleMetadata extends AnimationMetadata {
    @JsProperty(name="styles")
    Array<Object /* UnionType */> getStyles();
    @JsProperty(name="styles")
    void setStyles(Array<Object /* UnionType */> value);
    @JsProperty(name="offset")
    int getOffset();
    @JsProperty(name="offset")
    void setOffset(int value);
    @JsConstructor
    public AnimationStyleMetadata(Array<Object /* UnionType */> styles,int /* optional */ offset) {}
}
