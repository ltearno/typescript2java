package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name ImageData
  * Typescript fqn ImageData
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface ImageData {
    @JsProperty(name="data")
    Uint8ClampedArray getData();

    @JsProperty(name="data")
    void setData(Uint8ClampedArray value);

    @JsProperty(name="height")
    Number getHeight();

    @JsProperty(name="height")
    void setHeight(Number value);

    @JsProperty(name="width")
    Number getWidth();

    @JsProperty(name="width")
    void setWidth(Number value);
}
