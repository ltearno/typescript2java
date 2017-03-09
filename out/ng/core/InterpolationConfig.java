package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\ml_parser\interpolation_config.d.ts
  * Package ng.core
  * Name InterpolationConfig
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class InterpolationConfig  {
    public String start;
    public String end;
    public static native  InterpolationConfig fromArray(JsArray<String> /* Tuple [String, String] */ markers);
    @JsConstructor
    public InterpolationConfig(String start,String end) {}
}
