package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\animation\animation_styles.d.ts
  * Package ng.core
  * Name AnimationStyles
  * `AnimationStyles` consists of a collection of key/value maps containing CSS-based style data
  * that can either be used as initial styling data or apart of a series of keyframes within an
  * animation.
  * This class is mostly internal, and it is designed to be used alongside
  * {@link AnimationKeyframe `AnimationKeyframe`} and {@link Renderer#animate-anchor
  * `Renderer.animate`}.
  **/
@JsType( isNative=true, namespace="ng.core", name="AnimationStyles" )
public class AnimationStylesImpl  {
    @JsProperty(name="styles")
    JsArray<JsTypedObject<String,Object /* UnionType */>> getStyles();
    @JsProperty(name="styles")
    void setStyles(JsArray<JsTypedObject<String,Object /* UnionType */>> value);
    @JsConstructor
    public AnimationStylesImpl(JsArray<JsTypedObject<String,Object /* UnionType */>> styles) {}
}
