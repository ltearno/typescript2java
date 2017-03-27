package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name ScriptNotifyEvent
  * Typescript fqn ScriptNotifyEvent
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface ScriptNotifyEvent extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="callingUri")
    String getCallingUri();

    @JsProperty(name="callingUri")
    void setCallingUri(String value);

    @JsProperty(name="value")
    String getValue();

    @JsProperty(name="value")
    void setValue(String value);
}
