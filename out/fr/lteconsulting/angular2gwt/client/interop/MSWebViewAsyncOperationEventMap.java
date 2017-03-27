package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MSWebViewAsyncOperationEventMap
  * Typescript fqn MSWebViewAsyncOperationEventMap
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MSWebViewAsyncOperationEventMap {
    @JsProperty(name="complete")
    Event getComplete();

    @JsProperty(name="complete")
    void setComplete(Event value);

    @JsProperty(name="error")
    Event getError();

    @JsProperty(name="error")
    void setError(Event value);
}
