package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name WebAuthnAssertion
  * Typescript fqn WebAuthnAssertion
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface WebAuthnAssertion {
    @JsProperty(name="authenticatorData")
    ArrayBuffer getAuthenticatorData();

    @JsProperty(name="authenticatorData")
    void setAuthenticatorData(ArrayBuffer value);

    @JsProperty(name="clientData")
    ArrayBuffer getClientData();

    @JsProperty(name="clientData")
    void setClientData(ArrayBuffer value);

    @JsProperty(name="credential")
    ScopedCredential getCredential();

    @JsProperty(name="credential")
    void setCredential(ScopedCredential value);

    @JsProperty(name="signature")
    ArrayBuffer getSignature();

    @JsProperty(name="signature")
    void setSignature(ArrayBuffer value);
}
