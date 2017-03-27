package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name XMLHttpRequestEventTargetEventMap
  * Typescript fqn XMLHttpRequestEventTargetEventMap
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface XMLHttpRequestEventTargetEventMap {
    @JsProperty(name="abort")
    Event getAbort();

    @JsProperty(name="abort")
    void setAbort(Event value);

    @JsProperty(name="error")
    ErrorEvent getError();

    @JsProperty(name="error")
    void setError(ErrorEvent value);

    @JsProperty(name="load")
    Event getLoad();

    @JsProperty(name="load")
    void setLoad(Event value);

    @JsProperty(name="loadend")
    ProgressEvent getLoadend();

    @JsProperty(name="loadend")
    void setLoadend(ProgressEvent value);

    @JsProperty(name="loadstart")
    Event getLoadstart();

    @JsProperty(name="loadstart")
    void setLoadstart(Event value);

    @JsProperty(name="progress")
    ProgressEvent getProgress();

    @JsProperty(name="progress")
    void setProgress(ProgressEvent value);

    @JsProperty(name="timeout")
    ProgressEvent getTimeout();

    @JsProperty(name="timeout")
    void setTimeout(ProgressEvent value);
}
