package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name PopStateEvent
  * Typescript fqn PopStateEvent
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface PopStateEvent extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="state")
    Object getState();

    @JsProperty(name="state")
    void setState(Object value);

    void initPopStateEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, Object stateArg);
}
