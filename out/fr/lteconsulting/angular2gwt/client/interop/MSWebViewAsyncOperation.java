package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MSWebViewAsyncOperation
  * Typescript fqn MSWebViewAsyncOperation
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MSWebViewAsyncOperation extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="error")
    DOMError getError();

    @JsProperty(name="error")
    void setError(DOMError value);

    @JsProperty(name="oncomplete")
    JsFunction2<MSWebViewAsyncOperation,Event,Object> getOncomplete();

    @JsProperty(name="oncomplete")
    void setOncomplete(JsFunction2<MSWebViewAsyncOperation,Event,Object> value);

    @JsProperty(name="onerror")
    JsFunction2<MSWebViewAsyncOperation,Event,Object> getOnerror();

    @JsProperty(name="onerror")
    void setOnerror(JsFunction2<MSWebViewAsyncOperation,Event,Object> value);

    @JsProperty(name="readyState")
    Number getReadyState();

    @JsProperty(name="readyState")
    void setReadyState(Number value);

    @JsProperty(name="result")
    Object getResult();

    @JsProperty(name="result")
    void setResult(Object value);

    @JsProperty(name="target")
    MSHTMLWebViewElement getTarget();

    @JsProperty(name="target")
    void setTarget(MSHTMLWebViewElement value);

    @JsProperty(name="type")
    Number getType();

    @JsProperty(name="type")
    void setType(Number value);

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

    @JsProperty(name="TYPE_CAPTURE_PREVIEW_TO_RANDOM_ACCESS_STREAM")
    Number getTYPE_CAPTURE_PREVIEW_TO_RANDOM_ACCESS_STREAM();

    @JsProperty(name="TYPE_CAPTURE_PREVIEW_TO_RANDOM_ACCESS_STREAM")
    void setTYPE_CAPTURE_PREVIEW_TO_RANDOM_ACCESS_STREAM(Number value);

    @JsProperty(name="TYPE_CREATE_DATA_PACKAGE_FROM_SELECTION")
    Number getTYPE_CREATE_DATA_PACKAGE_FROM_SELECTION();

    @JsProperty(name="TYPE_CREATE_DATA_PACKAGE_FROM_SELECTION")
    void setTYPE_CREATE_DATA_PACKAGE_FROM_SELECTION(Number value);

    @JsProperty(name="TYPE_INVOKE_SCRIPT")
    Number getTYPE_INVOKE_SCRIPT();

    @JsProperty(name="TYPE_INVOKE_SCRIPT")
    void setTYPE_INVOKE_SCRIPT(Number value);

    void start();

    <K> void addEventListener(K type, JsFunction2<MSWebViewAsyncOperation,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
