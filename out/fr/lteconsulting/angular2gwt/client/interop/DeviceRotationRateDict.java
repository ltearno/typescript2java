package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name DeviceRotationRateDict
  * Typescript fqn DeviceRotationRateDict
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface DeviceRotationRateDict {
    /* optional property alpha*/    @JsProperty(name="alpha")
    Number getAlpha();

    @JsProperty(name="alpha")
    void setAlpha(Number value);

    /* optional property beta*/    @JsProperty(name="beta")
    Number getBeta();

    @JsProperty(name="beta")
    void setBeta(Number value);

    /* optional property gamma*/    @JsProperty(name="gamma")
    Number getGamma();

    @JsProperty(name="gamma")
    void setGamma(Number value);
}
