package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MSFIDOSignature
  * Typescript fqn MSFIDOSignature
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MSFIDOSignature {
    @JsProperty(name="authnrData")
    String getAuthnrData();

    @JsProperty(name="authnrData")
    void setAuthnrData(String value);

    @JsProperty(name="clientData")
    String getClientData();

    @JsProperty(name="clientData")
    void setClientData(String value);

    @JsProperty(name="signature")
    String getSignature();

    @JsProperty(name="signature")
    void setSignature(String value);
}
