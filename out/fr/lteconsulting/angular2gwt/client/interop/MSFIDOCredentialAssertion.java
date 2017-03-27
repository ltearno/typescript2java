package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MSFIDOCredentialAssertion
  * Typescript fqn MSFIDOCredentialAssertion
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MSFIDOCredentialAssertion extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="algorithm")
    Object /* Union type */ getAlgorithm();

    @JsProperty(name="algorithm")
    void setAlgorithm(Object /* Union type */ value);

    @JsProperty(name="attestation")
    Object getAttestation();

    @JsProperty(name="attestation")
    void setAttestation(Object value);

    @JsProperty(name="publicKey")
    String getPublicKey();

    @JsProperty(name="publicKey")
    void setPublicKey(String value);

    @JsProperty(name="transportHints")
    Array<String> getTransportHints();

    @JsProperty(name="transportHints")
    void setTransportHints(Array<String> value);
}
