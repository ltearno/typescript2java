package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name FocusEvent
  * Typescript fqn FocusEvent
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface FocusEvent extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="relatedTarget")
    EventTarget getRelatedTarget();

    @JsProperty(name="relatedTarget")
    void setRelatedTarget(EventTarget value);

    void initFocusEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, Window viewArg, Number detailArg, EventTarget relatedTargetArg);
}
