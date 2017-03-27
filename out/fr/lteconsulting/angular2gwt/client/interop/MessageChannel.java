package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MessageChannel
  * Typescript fqn MessageChannel
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MessageChannel {
    @JsProperty(name="port1")
    MessagePort getPort1();

    @JsProperty(name="port1")
    void setPort1(MessagePort value);

    @JsProperty(name="port2")
    MessagePort getPort2();

    @JsProperty(name="port2")
    void setPort2(MessagePort value);
}
