package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name XMLHttpRequestEventTarget
  * Typescript fqn XMLHttpRequestEventTarget
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface XMLHttpRequestEventTarget {
    @JsProperty(name="onabort")
    JsFunction2<XMLHttpRequestEventTarget,Event,Object> getOnabort();

    @JsProperty(name="onabort")
    void setOnabort(JsFunction2<XMLHttpRequestEventTarget,Event,Object> value);

    @JsProperty(name="onerror")
    JsFunction2<XMLHttpRequestEventTarget,ErrorEvent,Object> getOnerror();

    @JsProperty(name="onerror")
    void setOnerror(JsFunction2<XMLHttpRequestEventTarget,ErrorEvent,Object> value);

    @JsProperty(name="onload")
    JsFunction2<XMLHttpRequestEventTarget,Event,Object> getOnload();

    @JsProperty(name="onload")
    void setOnload(JsFunction2<XMLHttpRequestEventTarget,Event,Object> value);

    @JsProperty(name="onloadend")
    JsFunction2<XMLHttpRequestEventTarget,ProgressEvent,Object> getOnloadend();

    @JsProperty(name="onloadend")
    void setOnloadend(JsFunction2<XMLHttpRequestEventTarget,ProgressEvent,Object> value);

    @JsProperty(name="onloadstart")
    JsFunction2<XMLHttpRequestEventTarget,Event,Object> getOnloadstart();

    @JsProperty(name="onloadstart")
    void setOnloadstart(JsFunction2<XMLHttpRequestEventTarget,Event,Object> value);

    @JsProperty(name="onprogress")
    JsFunction2<XMLHttpRequestEventTarget,ProgressEvent,Object> getOnprogress();

    @JsProperty(name="onprogress")
    void setOnprogress(JsFunction2<XMLHttpRequestEventTarget,ProgressEvent,Object> value);

    @JsProperty(name="ontimeout")
    JsFunction2<XMLHttpRequestEventTarget,ProgressEvent,Object> getOntimeout();

    @JsProperty(name="ontimeout")
    void setOntimeout(JsFunction2<XMLHttpRequestEventTarget,ProgressEvent,Object> value);

    <K> void addEventListener(K type, JsFunction2<XMLHttpRequestEventTarget,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
