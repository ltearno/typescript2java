package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name ListeningStateChangedEvent
  * Typescript fqn ListeningStateChangedEvent
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface ListeningStateChangedEvent extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="label")
    String getLabel();

    @JsProperty(name="label")
    void setLabel(String value);

    @JsProperty(name="state")
    String getState();

    @JsProperty(name="state")
    void setState(String value);
}
