package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\operator\timeInterval.d.ts
  * Package rxjs
  * Name TimeInterval
  * 
  **/
@JsType( isNative=true, namespace="rxjs", name="TimeInterval" )
public class TimeIntervalImpl<T>  {
    @JsProperty(name="value")
    T getValue();
    @JsProperty(name="value")
    void setValue(T value);
    @JsProperty(name="interval")
    int getInterval();
    @JsProperty(name="interval")
    void setInterval(int value);
    @JsConstructor
    public TimeIntervalImpl(T value,int interval) {}
}
