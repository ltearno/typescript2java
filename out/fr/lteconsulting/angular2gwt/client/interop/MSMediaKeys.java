package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MSMediaKeys
  * Typescript fqn MSMediaKeys
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MSMediaKeys {
    @JsProperty(name="keySystem")
    String getKeySystem();

    @JsProperty(name="keySystem")
    void setKeySystem(String value);

    MSMediaKeySession createSession(String type, Uint8Array initData, Uint8Array /* optional */ cdmData);
}
