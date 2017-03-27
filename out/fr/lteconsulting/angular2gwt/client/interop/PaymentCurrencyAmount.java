package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name PaymentCurrencyAmount
  * Typescript fqn PaymentCurrencyAmount
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface PaymentCurrencyAmount {
    /* optional property currency*/    @JsProperty(name="currency")
    String getCurrency();

    @JsProperty(name="currency")
    void setCurrency(String value);

    /* optional property value*/    @JsProperty(name="value")
    String getValue();

    @JsProperty(name="value")
    void setValue(String value);

    /* optional property currencySystem*/    @JsProperty(name="currencySystem")
    String getCurrencySystem();

    @JsProperty(name="currencySystem")
    void setCurrencySystem(String value);
}
