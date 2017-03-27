package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MediaList
  * Typescript fqn MediaList
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MediaList {
    @JsProperty(name="length")
    Number getLength();

    @JsProperty(name="length")
    void setLength(Number value);

    @JsProperty(name="mediaText")
    String getMediaText();

    @JsProperty(name="mediaText")
    void setMediaText(String value);

    void appendMedium(String newMedium);

    void deleteMedium(String oldMedium);

    String item(Number index);

    String toString();
}
