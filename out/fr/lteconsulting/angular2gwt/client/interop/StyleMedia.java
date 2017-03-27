package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name StyleMedia
  * Typescript fqn StyleMedia
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface StyleMedia {
    @JsProperty(name="type")
    String getType();

    @JsProperty(name="type")
    void setType(String value);

    boolean matchMedium(String mediaquery);
}
