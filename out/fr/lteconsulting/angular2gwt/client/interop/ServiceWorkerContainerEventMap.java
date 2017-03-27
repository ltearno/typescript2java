package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name ServiceWorkerContainerEventMap
  * Typescript fqn ServiceWorkerContainerEventMap
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface ServiceWorkerContainerEventMap {
    @JsProperty(name="controllerchange")
    Event getControllerchange();

    @JsProperty(name="controllerchange")
    void setControllerchange(Event value);

    @JsProperty(name="message")
    ServiceWorkerMessageEvent getMessage();

    @JsProperty(name="message")
    void setMessage(ServiceWorkerMessageEvent value);
}
