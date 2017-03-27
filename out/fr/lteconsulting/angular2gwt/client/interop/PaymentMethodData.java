package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name PaymentMethodData
  * Typescript fqn PaymentMethodData
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface PaymentMethodData {
    /* optional property supportedMethods*/    @JsProperty(name="supportedMethods")
    Array<String> getSupportedMethods();

    @JsProperty(name="supportedMethods")
    void setSupportedMethods(Array<String> value);

    /* optional property data*/    @JsProperty(name="data")
    Object getData();

    @JsProperty(name="data")
    void setData(Object value);
}
