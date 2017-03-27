package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name CryptoKeyPair
  * Typescript fqn CryptoKeyPair
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface CryptoKeyPair {
    @JsProperty(name="privateKey")
    CryptoKey getPrivateKey();

    @JsProperty(name="privateKey")
    void setPrivateKey(CryptoKey value);

    @JsProperty(name="publicKey")
    CryptoKey getPublicKey();

    @JsProperty(name="publicKey")
    void setPublicKey(CryptoKey value);
}
