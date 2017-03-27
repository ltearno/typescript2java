package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name TransitionEvent
  * Typescript fqn TransitionEvent
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface TransitionEvent extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="elapsedTime")
    Number getElapsedTime();

    @JsProperty(name="elapsedTime")
    void setElapsedTime(Number value);

    @JsProperty(name="propertyName")
    String getPropertyName();

    @JsProperty(name="propertyName")
    void setPropertyName(String value);

    void initTransitionEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, String propertyNameArg, Number elapsedTimeArg);
}
