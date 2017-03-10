package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.AnimationQueue;
import ng.core.Sanitizer;
import ng.core.RootRenderer;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\linker\view_utils.d.ts
  * Package ng.core
  * Name ViewUtils
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ViewUtils  {
    @JsProperty(name="_renderer")
    Object get_renderer();
    @JsProperty(name="_renderer")
    void set_renderer(Object value);
    @JsProperty(name="animationQueue")
    AnimationQueue getAnimationQueue();
    @JsProperty(name="animationQueue")
    void setAnimationQueue(AnimationQueue value);
    @JsProperty(name="sanitizer")
    Sanitizer getSanitizer();
    @JsProperty(name="sanitizer")
    void setSanitizer(Sanitizer value);
    @JsConstructor
    public ViewUtils(RootRenderer _renderer,Sanitizer sanitizer,AnimationQueue animationQueue) {}
}
