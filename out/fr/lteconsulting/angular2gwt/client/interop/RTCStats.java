package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name RTCStats
  * Typescript fqn RTCStats
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface RTCStats {
    /* optional property timestamp*/    @JsProperty(name="timestamp")
    Number getTimestamp();

    @JsProperty(name="timestamp")
    void setTimestamp(Number value);

    /* optional property type*/    @JsProperty(name="type")
    String getType();

    @JsProperty(name="type")
    void setType(String value);

    /* optional property id*/    @JsProperty(name="id")
    String getId();

    @JsProperty(name="id")
    void setId(String value);

    /* optional property msType*/    @JsProperty(name="msType")
    String getMsType();

    @JsProperty(name="msType")
    void setMsType(String value);
}
