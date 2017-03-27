package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name CloseEvent
  * Typescript fqn CloseEvent
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface CloseEvent extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="code")
    Number getCode();

    @JsProperty(name="code")
    void setCode(Number value);

    @JsProperty(name="reason")
    String getReason();

    @JsProperty(name="reason")
    void setReason(String value);

    @JsProperty(name="wasClean")
    boolean getWasClean();

    @JsProperty(name="wasClean")
    void setWasClean(boolean value);

    void initCloseEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, boolean wasCleanArg, Number codeArg, String reasonArg);
}
