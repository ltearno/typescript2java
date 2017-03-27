package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name RTCIceParameters
  * Typescript fqn RTCIceParameters
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface RTCIceParameters {
    /* optional property usernameFragment*/    @JsProperty(name="usernameFragment")
    String getUsernameFragment();

    @JsProperty(name="usernameFragment")
    void setUsernameFragment(String value);

    /* optional property password*/    @JsProperty(name="password")
    String getPassword();

    @JsProperty(name="password")
    void setPassword(String value);

    /* optional property iceLite*/    @JsProperty(name="iceLite")
    boolean getIceLite();

    @JsProperty(name="iceLite")
    void setIceLite(boolean value);
}
