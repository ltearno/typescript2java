package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name IDBRequest
  * Typescript fqn IDBRequest
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface IDBRequest extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="error")
    DOMError getError();

    @JsProperty(name="error")
    void setError(DOMError value);

    @JsProperty(name="onerror")
    JsFunction2<IDBRequest,Event,Object> getOnerror();

    @JsProperty(name="onerror")
    void setOnerror(JsFunction2<IDBRequest,Event,Object> value);

    @JsProperty(name="onsuccess")
    JsFunction2<IDBRequest,Event,Object> getOnsuccess();

    @JsProperty(name="onsuccess")
    void setOnsuccess(JsFunction2<IDBRequest,Event,Object> value);

    @JsProperty(name="readyState")
    String getReadyState();

    @JsProperty(name="readyState")
    void setReadyState(String value);

    @JsProperty(name="result")
    Object getResult();

    @JsProperty(name="result")
    void setResult(Object value);

    @JsProperty(name="source")
    Object /* Union type */ getSource();

    @JsProperty(name="source")
    void setSource(Object /* Union type */ value);

    @JsProperty(name="transaction")
    IDBTransaction getTransaction();

    @JsProperty(name="transaction")
    void setTransaction(IDBTransaction value);

    <K> void addEventListener(K type, JsFunction2<IDBRequest,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
