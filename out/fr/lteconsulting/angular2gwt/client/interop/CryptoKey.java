package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name CryptoKey
  * Typescript fqn CryptoKey
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface CryptoKey {
    @JsProperty(name="algorithm")
    KeyAlgorithm getAlgorithm();

    @JsProperty(name="algorithm")
    void setAlgorithm(KeyAlgorithm value);

    @JsProperty(name="extractable")
    boolean getExtractable();

    @JsProperty(name="extractable")
    void setExtractable(boolean value);

    @JsProperty(name="type")
    String getType();

    @JsProperty(name="type")
    void setType(String value);

    @JsProperty(name="usages")
    Array<String> getUsages();

    @JsProperty(name="usages")
    void setUsages(Array<String> value);
}
