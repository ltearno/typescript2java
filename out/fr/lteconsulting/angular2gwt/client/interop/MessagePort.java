package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MessagePort
  * Typescript fqn MessagePort
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MessagePort extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="onmessage")
    JsFunction2<MessagePort,MessageEvent,Object> getOnmessage();

    @JsProperty(name="onmessage")
    void setOnmessage(JsFunction2<MessagePort,MessageEvent,Object> value);

    void close();

    void postMessage(Object /* optional */ message, JsArray<Object> /* optional */ transfer);

    void start();

    <K> void addEventListener(K type, JsFunction2<MessagePort,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
