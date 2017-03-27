package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name DeviceOrientationEvent
  * Typescript fqn DeviceOrientationEvent
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface DeviceOrientationEvent extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="absolute")
    boolean getAbsolute();

    @JsProperty(name="absolute")
    void setAbsolute(boolean value);

    @JsProperty(name="alpha")
    Number getAlpha();

    @JsProperty(name="alpha")
    void setAlpha(Number value);

    @JsProperty(name="beta")
    Number getBeta();

    @JsProperty(name="beta")
    void setBeta(Number value);

    @JsProperty(name="gamma")
    Number getGamma();

    @JsProperty(name="gamma")
    void setGamma(Number value);

    void initDeviceOrientationEvent(String type, boolean bubbles, boolean cancelable, Object /* UnionType */ alpha, Object /* UnionType */ beta, Object /* UnionType */ gamma, boolean absolute);
}
