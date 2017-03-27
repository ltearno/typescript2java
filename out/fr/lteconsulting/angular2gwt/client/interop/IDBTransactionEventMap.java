package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name IDBTransactionEventMap
  * Typescript fqn IDBTransactionEventMap
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface IDBTransactionEventMap {
    @JsProperty(name="abort")
    Event getAbort();

    @JsProperty(name="abort")
    void setAbort(Event value);

    @JsProperty(name="complete")
    Event getComplete();

    @JsProperty(name="complete")
    void setComplete(Event value);

    @JsProperty(name="error")
    Event getError();

    @JsProperty(name="error")
    void setError(Event value);
}
