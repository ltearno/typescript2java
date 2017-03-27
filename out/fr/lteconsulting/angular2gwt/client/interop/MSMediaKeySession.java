package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MSMediaKeySession
  * Typescript fqn MSMediaKeySession
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MSMediaKeySession extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="error")
    MSMediaKeyError getError();

    @JsProperty(name="error")
    void setError(MSMediaKeyError value);

    @JsProperty(name="keySystem")
    String getKeySystem();

    @JsProperty(name="keySystem")
    void setKeySystem(String value);

    @JsProperty(name="sessionId")
    String getSessionId();

    @JsProperty(name="sessionId")
    void setSessionId(String value);

    void close();

    void update(Uint8Array key);
}
