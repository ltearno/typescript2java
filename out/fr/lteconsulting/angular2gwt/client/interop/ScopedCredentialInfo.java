package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name ScopedCredentialInfo
  * Typescript fqn ScopedCredentialInfo
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface ScopedCredentialInfo {
    @JsProperty(name="credential")
    ScopedCredential getCredential();

    @JsProperty(name="credential")
    void setCredential(ScopedCredential value);

    @JsProperty(name="publicKey")
    CryptoKey getPublicKey();

    @JsProperty(name="publicKey")
    void setPublicKey(CryptoKey value);
}
