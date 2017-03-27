package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MSRelayAddress
  * Typescript fqn MSRelayAddress
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MSRelayAddress {
    /* optional property relayAddress*/    @JsProperty(name="relayAddress")
    String getRelayAddress();

    @JsProperty(name="relayAddress")
    void setRelayAddress(String value);

    /* optional property port*/    @JsProperty(name="port")
    Number getPort();

    @JsProperty(name="port")
    void setPort(Number value);
}
