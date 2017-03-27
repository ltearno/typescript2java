package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MSConnectivity
  * Typescript fqn MSConnectivity
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MSConnectivity {
    /* optional property iceType*/    @JsProperty(name="iceType")
    String getIceType();

    @JsProperty(name="iceType")
    void setIceType(String value);

    /* optional property iceWarningFlags*/    @JsProperty(name="iceWarningFlags")
    MSIceWarningFlags getIceWarningFlags();

    @JsProperty(name="iceWarningFlags")
    void setIceWarningFlags(MSIceWarningFlags value);

    /* optional property relayAddress*/    @JsProperty(name="relayAddress")
    MSRelayAddress getRelayAddress();

    @JsProperty(name="relayAddress")
    void setRelayAddress(MSRelayAddress value);
}
