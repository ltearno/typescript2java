package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name DataCue
  * Typescript fqn DataCue
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface DataCue extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="data")
    ArrayBuffer getData();

    @JsProperty(name="data")
    void setData(ArrayBuffer value);

    <K> void addEventListener(K type, JsFunction2<DataCue,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
