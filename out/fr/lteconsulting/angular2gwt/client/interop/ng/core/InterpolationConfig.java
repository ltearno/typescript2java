package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.InterpolationConfig;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\ml_parser\interpolation_config.d.ts
  * Package ng.core
  * Name InterpolationConfig
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface InterpolationConfig  {
    @JsProperty(name="start")
    String getStart();
    @JsProperty(name="start")
    void setStart(String value);
    @JsProperty(name="end")
    String getEnd();
    @JsProperty(name="end")
    void setEnd(String value);
    @JsConstructor
    public InterpolationConfig(String start,String end) {}
}
