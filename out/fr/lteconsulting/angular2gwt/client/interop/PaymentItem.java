package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name PaymentItem
  * Typescript fqn PaymentItem
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface PaymentItem {
    /* optional property label*/    @JsProperty(name="label")
    String getLabel();

    @JsProperty(name="label")
    void setLabel(String value);

    /* optional property amount*/    @JsProperty(name="amount")
    PaymentCurrencyAmount getAmount();

    @JsProperty(name="amount")
    void setAmount(PaymentCurrencyAmount value);

    /* optional property pending*/    @JsProperty(name="pending")
    boolean getPending();

    @JsProperty(name="pending")
    void setPending(boolean value);
}
