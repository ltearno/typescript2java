package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name NavigationEventWithReferrer
  * Typescript fqn NavigationEventWithReferrer
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface NavigationEventWithReferrer extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="referer")
    String getReferer();

    @JsProperty(name="referer")
    void setReferer(String value);
}
