package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name PushSubscriptionOptions
  * Typescript fqn PushSubscriptionOptions
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface PushSubscriptionOptions {
    @JsProperty(name="applicationServerKey")
    ArrayBuffer getApplicationServerKey();

    @JsProperty(name="applicationServerKey")
    void setApplicationServerKey(ArrayBuffer value);

    @JsProperty(name="userVisibleOnly")
    boolean getUserVisibleOnly();

    @JsProperty(name="userVisibleOnly")
    void setUserVisibleOnly(boolean value);
}
