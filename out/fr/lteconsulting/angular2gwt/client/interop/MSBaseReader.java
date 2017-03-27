package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MSBaseReader
  * Typescript fqn MSBaseReader
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MSBaseReader {
    @JsProperty(name="onabort")
    JsFunction2<MSBaseReader,Event,Object> getOnabort();

    @JsProperty(name="onabort")
    void setOnabort(JsFunction2<MSBaseReader,Event,Object> value);

    @JsProperty(name="onerror")
    JsFunction2<MSBaseReader,ErrorEvent,Object> getOnerror();

    @JsProperty(name="onerror")
    void setOnerror(JsFunction2<MSBaseReader,ErrorEvent,Object> value);

    @JsProperty(name="onload")
    JsFunction2<MSBaseReader,Event,Object> getOnload();

    @JsProperty(name="onload")
    void setOnload(JsFunction2<MSBaseReader,Event,Object> value);

    @JsProperty(name="onloadend")
    JsFunction2<MSBaseReader,ProgressEvent,Object> getOnloadend();

    @JsProperty(name="onloadend")
    void setOnloadend(JsFunction2<MSBaseReader,ProgressEvent,Object> value);

    @JsProperty(name="onloadstart")
    JsFunction2<MSBaseReader,Event,Object> getOnloadstart();

    @JsProperty(name="onloadstart")
    void setOnloadstart(JsFunction2<MSBaseReader,Event,Object> value);

    @JsProperty(name="onprogress")
    JsFunction2<MSBaseReader,ProgressEvent,Object> getOnprogress();

    @JsProperty(name="onprogress")
    void setOnprogress(JsFunction2<MSBaseReader,ProgressEvent,Object> value);

    @JsProperty(name="readyState")
    Number getReadyState();

    @JsProperty(name="readyState")
    void setReadyState(Number value);

    @JsProperty(name="result")
    Object getResult();

    @JsProperty(name="result")
    void setResult(Object value);

    @JsProperty(name="DONE")
    Number getDONE();

    @JsProperty(name="DONE")
    void setDONE(Number value);

    @JsProperty(name="EMPTY")
    Number getEMPTY();

    @JsProperty(name="EMPTY")
    void setEMPTY(Number value);

    @JsProperty(name="LOADING")
    Number getLOADING();

    @JsProperty(name="LOADING")
    void setLOADING(Number value);

    void abort();

    <K> void addEventListener(K type, JsFunction2<MSBaseReader,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
