package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name PaymentRequestEventMap
  * Typescript fqn PaymentRequestEventMap
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface PaymentRequestEventMap {
    @JsProperty(name="shippingaddresschange")
    Event getShippingaddresschange();

    @JsProperty(name="shippingaddresschange")
    void setShippingaddresschange(Event value);

    @JsProperty(name="shippingoptionchange")
    Event getShippingoptionchange();

    @JsProperty(name="shippingoptionchange")
    void setShippingoptionchange(Event value);
}
