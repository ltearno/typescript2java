package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MSDelay
  * Typescript fqn MSDelay
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MSDelay {
    /* optional property roundTrip*/    @JsProperty(name="roundTrip")
    Number getRoundTrip();

    @JsProperty(name="roundTrip")
    void setRoundTrip(Number value);

    /* optional property roundTripMax*/    @JsProperty(name="roundTripMax")
    Number getRoundTripMax();

    @JsProperty(name="roundTripMax")
    void setRoundTripMax(Number value);
}
