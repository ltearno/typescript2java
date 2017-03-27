package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name WebGLActiveInfo
  * Typescript fqn WebGLActiveInfo
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface WebGLActiveInfo {
    @JsProperty(name="name")
    String getName();

    @JsProperty(name="name")
    void setName(String value);

    @JsProperty(name="size")
    Number getSize();

    @JsProperty(name="size")
    void setSize(Number value);

    @JsProperty(name="type")
    Number getType();

    @JsProperty(name="type")
    void setType(Number value);
}
