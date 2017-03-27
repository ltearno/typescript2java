package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name CompositionEvent
  * Typescript fqn CompositionEvent
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface CompositionEvent extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="data")
    String getData();

    @JsProperty(name="data")
    void setData(String value);

    @JsProperty(name="locale")
    String getLocale();

    @JsProperty(name="locale")
    void setLocale(String value);

    void initCompositionEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, Window viewArg, String dataArg, String locale);
}
