package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name AudioParam
  * Typescript fqn AudioParam
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface AudioParam {
    @JsProperty(name="defaultValue")
    Number getDefaultValue();

    @JsProperty(name="defaultValue")
    void setDefaultValue(Number value);

    @JsProperty(name="value")
    Number getValue();

    @JsProperty(name="value")
    void setValue(Number value);

    AudioParam cancelScheduledValues(Number startTime);

    AudioParam exponentialRampToValueAtTime(Number value, Number endTime);

    AudioParam linearRampToValueAtTime(Number value, Number endTime);

    AudioParam setTargetAtTime(Number target, Number startTime, Number timeConstant);

    AudioParam setValueAtTime(Number value, Number startTime);

    AudioParam setValueCurveAtTime(Float32Array values, Number startTime, Number duration);
}
