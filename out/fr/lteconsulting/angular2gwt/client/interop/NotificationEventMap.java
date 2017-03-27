package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name NotificationEventMap
  * Typescript fqn NotificationEventMap
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface NotificationEventMap {
    @JsProperty(name="click")
    Event getClick();

    @JsProperty(name="click")
    void setClick(Event value);

    @JsProperty(name="close")
    Event getClose();

    @JsProperty(name="close")
    void setClose(Event value);

    @JsProperty(name="error")
    Event getError();

    @JsProperty(name="error")
    void setError(Event value);

    @JsProperty(name="show")
    Event getShow();

    @JsProperty(name="show")
    void setShow(Event value);
}
