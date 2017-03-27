package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction1;
import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name IDBDatabase
  * Typescript fqn IDBDatabase
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface IDBDatabase extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="name")
    String getName();

    @JsProperty(name="name")
    void setName(String value);

    @JsProperty(name="objectStoreNames")
    DOMStringList getObjectStoreNames();

    @JsProperty(name="objectStoreNames")
    void setObjectStoreNames(DOMStringList value);

    @JsProperty(name="onabort")
    JsFunction2<IDBDatabase,Event,Object> getOnabort();

    @JsProperty(name="onabort")
    void setOnabort(JsFunction2<IDBDatabase,Event,Object> value);

    @JsProperty(name="onerror")
    JsFunction2<IDBDatabase,Event,Object> getOnerror();

    @JsProperty(name="onerror")
    void setOnerror(JsFunction2<IDBDatabase,Event,Object> value);

    @JsProperty(name="version")
    Number getVersion();

    @JsProperty(name="version")
    void setVersion(Number value);

    @JsProperty(name="onversionchange")
    JsFunction1<IDBVersionChangeEvent,Object> getOnversionchange();

    @JsProperty(name="onversionchange")
    void setOnversionchange(JsFunction1<IDBVersionChangeEvent,Object> value);

    void close();

    IDBObjectStore createObjectStore(String name, IDBObjectStoreParameters /* optional */ optionalParameters);

    void deleteObjectStore(String name);

    IDBTransaction transaction(Object /* UnionType */ storeNames, String /* optional */ mode);

    void addEventListener(Object type, JsFunction1<IDBVersionChangeEvent,Object> listener, boolean /* optional */ useCapture);

    <K> void addEventListener(K type, JsFunction2<IDBDatabase,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
