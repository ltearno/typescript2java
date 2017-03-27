package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name NavigationCompletedEvent
  * Typescript fqn NavigationCompletedEvent
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface NavigationCompletedEvent extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="isSuccess")
    boolean getIsSuccess();

    @JsProperty(name="isSuccess")
    void setIsSuccess(boolean value);

    @JsProperty(name="webErrorStatus")
    Number getWebErrorStatus();

    @JsProperty(name="webErrorStatus")
    void setWebErrorStatus(Number value);
}
