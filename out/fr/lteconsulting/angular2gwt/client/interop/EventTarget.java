package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name EventTarget
  * Typescript fqn EventTarget
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface EventTarget {
    void addEventListener(String type, Object /* Union type */ /* optional */ listener, boolean /* optional */ useCapture);

    boolean dispatchEvent(Event evt);

    void removeEventListener(String type, Object /* Union type */ /* optional */ listener, boolean /* optional */ useCapture);
}
