package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name IDBTransaction
  * Typescript fqn IDBTransaction
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface IDBTransaction extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="db")
    IDBDatabase getDb();

    @JsProperty(name="db")
    void setDb(IDBDatabase value);

    @JsProperty(name="error")
    DOMError getError();

    @JsProperty(name="error")
    void setError(DOMError value);

    @JsProperty(name="mode")
    String getMode();

    @JsProperty(name="mode")
    void setMode(String value);

    @JsProperty(name="onabort")
    JsFunction2<IDBTransaction,Event,Object> getOnabort();

    @JsProperty(name="onabort")
    void setOnabort(JsFunction2<IDBTransaction,Event,Object> value);

    @JsProperty(name="oncomplete")
    JsFunction2<IDBTransaction,Event,Object> getOncomplete();

    @JsProperty(name="oncomplete")
    void setOncomplete(JsFunction2<IDBTransaction,Event,Object> value);

    @JsProperty(name="onerror")
    JsFunction2<IDBTransaction,Event,Object> getOnerror();

    @JsProperty(name="onerror")
    void setOnerror(JsFunction2<IDBTransaction,Event,Object> value);

    @JsProperty(name="READ_ONLY")
    String getREAD_ONLY();

    @JsProperty(name="READ_ONLY")
    void setREAD_ONLY(String value);

    @JsProperty(name="READ_WRITE")
    String getREAD_WRITE();

    @JsProperty(name="READ_WRITE")
    void setREAD_WRITE(String value);

    @JsProperty(name="VERSION_CHANGE")
    String getVERSION_CHANGE();

    @JsProperty(name="VERSION_CHANGE")
    void setVERSION_CHANGE(String value);

    void abort();

    IDBObjectStore objectStore(String name);

    <K> void addEventListener(K type, JsFunction2<IDBTransaction,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
