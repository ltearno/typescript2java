package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name DeviceMotionEvent
  * Typescript fqn DeviceMotionEvent
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface DeviceMotionEvent extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="acceleration")
    DeviceAcceleration getAcceleration();

    @JsProperty(name="acceleration")
    void setAcceleration(DeviceAcceleration value);

    @JsProperty(name="accelerationIncludingGravity")
    DeviceAcceleration getAccelerationIncludingGravity();

    @JsProperty(name="accelerationIncludingGravity")
    void setAccelerationIncludingGravity(DeviceAcceleration value);

    @JsProperty(name="interval")
    Number getInterval();

    @JsProperty(name="interval")
    void setInterval(Number value);

    @JsProperty(name="rotationRate")
    DeviceRotationRate getRotationRate();

    @JsProperty(name="rotationRate")
    void setRotationRate(DeviceRotationRate value);

    void initDeviceMotionEvent(String type, boolean bubbles, boolean cancelable, Object /* UnionType */ acceleration, Object /* UnionType */ accelerationIncludingGravity, Object /* UnionType */ rotationRate, Object /* UnionType */ interval);
}
