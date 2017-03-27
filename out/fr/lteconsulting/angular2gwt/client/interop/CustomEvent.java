package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name CustomEvent
  * Typescript fqn CustomEvent
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface CustomEvent extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="detail")
    Object getDetail();

    @JsProperty(name="detail")
    void setDetail(Object value);

    void initCustomEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, Object detailArg);
}
