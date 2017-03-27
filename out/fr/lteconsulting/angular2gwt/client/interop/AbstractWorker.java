package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name AbstractWorker
  * Typescript fqn AbstractWorker
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface AbstractWorker {
    @JsProperty(name="onerror")
    JsFunction2<AbstractWorker,ErrorEvent,Object> getOnerror();

    @JsProperty(name="onerror")
    void setOnerror(JsFunction2<AbstractWorker,ErrorEvent,Object> value);

    <K> void addEventListener(K type, JsFunction2<AbstractWorker,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
