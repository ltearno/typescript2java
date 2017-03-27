package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name UIEvent
  * Typescript fqn UIEvent
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface UIEvent extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="detail")
    Number getDetail();

    @JsProperty(name="detail")
    void setDetail(Number value);

    @JsProperty(name="view")
    Window getView();

    @JsProperty(name="view")
    void setView(Window value);

    void initUIEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, Window viewArg, Number detailArg);
}
