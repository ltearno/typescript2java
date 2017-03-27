package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name Coordinates
  * Typescript fqn Coordinates
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface Coordinates {
    @JsProperty(name="accuracy")
    Number getAccuracy();

    @JsProperty(name="accuracy")
    void setAccuracy(Number value);

    @JsProperty(name="altitude")
    Number getAltitude();

    @JsProperty(name="altitude")
    void setAltitude(Number value);

    @JsProperty(name="altitudeAccuracy")
    Number getAltitudeAccuracy();

    @JsProperty(name="altitudeAccuracy")
    void setAltitudeAccuracy(Number value);

    @JsProperty(name="heading")
    Number getHeading();

    @JsProperty(name="heading")
    void setHeading(Number value);

    @JsProperty(name="latitude")
    Number getLatitude();

    @JsProperty(name="latitude")
    void setLatitude(Number value);

    @JsProperty(name="longitude")
    Number getLongitude();

    @JsProperty(name="longitude")
    void setLongitude(Number value);

    @JsProperty(name="speed")
    Number getSpeed();

    @JsProperty(name="speed")
    void setSpeed(Number value);
}
