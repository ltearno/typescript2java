package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name PaymentOptions
  * Typescript fqn PaymentOptions
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface PaymentOptions {
    /* optional property requestPayerName*/    @JsProperty(name="requestPayerName")
    boolean getRequestPayerName();

    @JsProperty(name="requestPayerName")
    void setRequestPayerName(boolean value);

    /* optional property requestPayerEmail*/    @JsProperty(name="requestPayerEmail")
    boolean getRequestPayerEmail();

    @JsProperty(name="requestPayerEmail")
    void setRequestPayerEmail(boolean value);

    /* optional property requestPayerPhone*/    @JsProperty(name="requestPayerPhone")
    boolean getRequestPayerPhone();

    @JsProperty(name="requestPayerPhone")
    void setRequestPayerPhone(boolean value);

    /* optional property requestShipping*/    @JsProperty(name="requestShipping")
    boolean getRequestShipping();

    @JsProperty(name="requestShipping")
    void setRequestShipping(boolean value);

    /* optional property shippingType*/    @JsProperty(name="shippingType")
    String getShippingType();

    @JsProperty(name="shippingType")
    void setShippingType(String value);
}
