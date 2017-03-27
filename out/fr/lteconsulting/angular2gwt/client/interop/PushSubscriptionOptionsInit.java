package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name PushSubscriptionOptionsInit
  * Typescript fqn PushSubscriptionOptionsInit
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface PushSubscriptionOptionsInit {
    /* optional property userVisibleOnly*/    @JsProperty(name="userVisibleOnly")
    boolean getUserVisibleOnly();

    @JsProperty(name="userVisibleOnly")
    void setUserVisibleOnly(boolean value);

    /* optional property applicationServerKey*/    @JsProperty(name="applicationServerKey")
    Object getApplicationServerKey();

    @JsProperty(name="applicationServerKey")
    void setApplicationServerKey(Object value);
}
