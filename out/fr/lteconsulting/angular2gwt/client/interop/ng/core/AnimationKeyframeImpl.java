package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.AnimationStyles;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\animation\animation_keyframe.d.ts
  * Package ng.core
  * Name AnimationKeyframe
  * `AnimationKeyframe` consists of a series of styles (contained within {@link AnimationStyles
  * `AnimationStyles`})
  * and an offset value indicating when those styles are applied within the `duration/delay/easing`
  * timings.
  * `AnimationKeyframe` is mostly an internal class which is designed to be used alongside {@link
  * Renderer#animate-anchor `Renderer.animate`}.
  **/
@JsType( isNative=true, namespace="ng.core", name="AnimationKeyframe" )
public class AnimationKeyframeImpl  {
    @JsProperty(name="offset")
    int getOffset();
    @JsProperty(name="offset")
    void setOffset(int value);
    @JsProperty(name="styles")
    AnimationStyles getStyles();
    @JsProperty(name="styles")
    void setStyles(AnimationStyles value);
    @JsConstructor
    public AnimationKeyframeImpl(int offset,AnimationStyles styles) {}
}
