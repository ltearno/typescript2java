package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name RsaOtherPrimesInfo
  * Typescript fqn RsaOtherPrimesInfo
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface RsaOtherPrimesInfo {
    @JsProperty(name="r")
    String getR();

    @JsProperty(name="r")
    void setR(String value);

    @JsProperty(name="d")
    String getD();

    @JsProperty(name="d")
    void setD(String value);

    @JsProperty(name="t")
    String getT();

    @JsProperty(name="t")
    void setT(String value);
}
