package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name WebSocketEventMap
  * Typescript fqn WebSocketEventMap
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface WebSocketEventMap {
    @JsProperty(name="close")
    CloseEvent getClose();

    @JsProperty(name="close")
    void setClose(CloseEvent value);

    @JsProperty(name="error")
    Event getError();

    @JsProperty(name="error")
    void setError(Event value);

    @JsProperty(name="message")
    MessageEvent getMessage();

    @JsProperty(name="message")
    void setMessage(MessageEvent value);

    @JsProperty(name="open")
    Event getOpen();

    @JsProperty(name="open")
    void setOpen(Event value);
}
