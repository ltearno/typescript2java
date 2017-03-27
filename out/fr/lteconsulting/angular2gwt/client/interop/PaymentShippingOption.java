package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name PaymentShippingOption
  * Typescript fqn PaymentShippingOption
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface PaymentShippingOption {
    /* optional property id*/    @JsProperty(name="id")
    String getId();

    @JsProperty(name="id")
    void setId(String value);

    /* optional property label*/    @JsProperty(name="label")
    String getLabel();

    @JsProperty(name="label")
    void setLabel(String value);

    /* optional property amount*/    @JsProperty(name="amount")
    PaymentCurrencyAmount getAmount();

    @JsProperty(name="amount")
    void setAmount(PaymentCurrencyAmount value);

    /* optional property selected*/    @JsProperty(name="selected")
    boolean getSelected();

    @JsProperty(name="selected")
    void setSelected(boolean value);
}
