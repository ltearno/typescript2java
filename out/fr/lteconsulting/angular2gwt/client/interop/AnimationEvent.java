package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name AnimationEvent
  * Typescript fqn AnimationEvent
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface AnimationEvent extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="animationName")
    String getAnimationName();

    @JsProperty(name="animationName")
    void setAnimationName(String value);

    @JsProperty(name="elapsedTime")
    Number getElapsedTime();

    @JsProperty(name="elapsedTime")
    void setElapsedTime(Number value);

    void initAnimationEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, String animationNameArg, Number elapsedTimeArg);
}
