package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MSAppAsyncOperation
  * Typescript fqn MSAppAsyncOperation
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MSAppAsyncOperation extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="error")
    DOMError getError();

    @JsProperty(name="error")
    void setError(DOMError value);

    @JsProperty(name="oncomplete")
    JsFunction2<MSAppAsyncOperation,Event,Object> getOncomplete();

    @JsProperty(name="oncomplete")
    void setOncomplete(JsFunction2<MSAppAsyncOperation,Event,Object> value);

    @JsProperty(name="onerror")
    JsFunction2<MSAppAsyncOperation,Event,Object> getOnerror();

    @JsProperty(name="onerror")
    void setOnerror(JsFunction2<MSAppAsyncOperation,Event,Object> value);

    @JsProperty(name="readyState")
    Number getReadyState();

    @JsProperty(name="readyState")
    void setReadyState(Number value);

    @JsProperty(name="result")
    Object getResult();

    @JsProperty(name="result")
    void setResult(Object value);

    @JsProperty(name="COMPLETED")
    Number getCOMPLETED();

    @JsProperty(name="COMPLETED")
    void setCOMPLETED(Number value);

    @JsProperty(name="ERROR")
    Number getERROR();

    @JsProperty(name="ERROR")
    void setERROR(Number value);

    @JsProperty(name="STARTED")
    Number getSTARTED();

    @JsProperty(name="STARTED")
    void setSTARTED(Number value);

    void start();

    <K> void addEventListener(K type, JsFunction2<MSAppAsyncOperation,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
