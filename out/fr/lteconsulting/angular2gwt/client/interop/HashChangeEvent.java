package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name HashChangeEvent
  * Typescript fqn HashChangeEvent
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface HashChangeEvent extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="newURL")
    String getNewURL();

    @JsProperty(name="newURL")
    void setNewURL(String value);

    @JsProperty(name="oldURL")
    String getOldURL();

    @JsProperty(name="oldURL")
    void setOldURL(String value);
}
