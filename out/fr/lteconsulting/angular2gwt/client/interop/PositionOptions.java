package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name PositionOptions
  * Typescript fqn PositionOptions
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface PositionOptions {
    /* optional property enableHighAccuracy*/    @JsProperty(name="enableHighAccuracy")
    boolean getEnableHighAccuracy();

    @JsProperty(name="enableHighAccuracy")
    void setEnableHighAccuracy(boolean value);

    /* optional property timeout*/    @JsProperty(name="timeout")
    Number getTimeout();

    @JsProperty(name="timeout")
    void setTimeout(Number value);

    /* optional property maximumAge*/    @JsProperty(name="maximumAge")
    Number getMaximumAge();

    @JsProperty(name="maximumAge")
    void setMaximumAge(Number value);
}
