package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name IDBOpenDBRequest
  * Typescript fqn IDBOpenDBRequest
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface IDBOpenDBRequest extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="onblocked")
    JsFunction2<IDBOpenDBRequest,Event,Object> getOnblocked();

    @JsProperty(name="onblocked")
    void setOnblocked(JsFunction2<IDBOpenDBRequest,Event,Object> value);

    @JsProperty(name="onupgradeneeded")
    JsFunction2<IDBOpenDBRequest,IDBVersionChangeEvent,Object> getOnupgradeneeded();

    @JsProperty(name="onupgradeneeded")
    void setOnupgradeneeded(JsFunction2<IDBOpenDBRequest,IDBVersionChangeEvent,Object> value);

    <K> void addEventListener(K type, JsFunction2<IDBOpenDBRequest,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
