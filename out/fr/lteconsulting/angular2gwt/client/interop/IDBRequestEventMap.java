package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name IDBRequestEventMap
  * Typescript fqn IDBRequestEventMap
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface IDBRequestEventMap {
    @JsProperty(name="error")
    Event getError();

    @JsProperty(name="error")
    void setError(Event value);

    @JsProperty(name="success")
    Event getSuccess();

    @JsProperty(name="success")
    void setSuccess(Event value);
}
