package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\operator\timestamp.d.ts
  * Package rxjs
  * Name Timestamp
  * 
  **/
@JsType( isNative=true, namespace="rxjs", name="Timestamp" )
public class TimestampImpl<T>  {
    @JsProperty(name="value")
    T getValue();
    @JsProperty(name="value")
    void setValue(T value);
    @JsProperty(name="timestamp")
    int getTimestamp();
    @JsProperty(name="timestamp")
    void setTimestamp(int value);
    @JsConstructor
    public TimestampImpl(T value,int timestamp) {}
}
