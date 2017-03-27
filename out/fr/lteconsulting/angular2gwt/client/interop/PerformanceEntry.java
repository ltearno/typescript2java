package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name PerformanceEntry
  * Typescript fqn PerformanceEntry
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface PerformanceEntry {
    @JsProperty(name="duration")
    Number getDuration();

    @JsProperty(name="duration")
    void setDuration(Number value);

    @JsProperty(name="entryType")
    String getEntryType();

    @JsProperty(name="entryType")
    void setEntryType(String value);

    @JsProperty(name="name")
    String getName();

    @JsProperty(name="name")
    void setName(String value);

    @JsProperty(name="startTime")
    Number getStartTime();

    @JsProperty(name="startTime")
    void setStartTime(Number value);
}
