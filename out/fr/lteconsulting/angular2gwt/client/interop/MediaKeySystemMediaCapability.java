package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MediaKeySystemMediaCapability
  * Typescript fqn MediaKeySystemMediaCapability
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MediaKeySystemMediaCapability {
    /* optional property contentType*/    @JsProperty(name="contentType")
    String getContentType();

    @JsProperty(name="contentType")
    void setContentType(String value);

    /* optional property robustness*/    @JsProperty(name="robustness")
    String getRobustness();

    @JsProperty(name="robustness")
    void setRobustness(String value);
}
