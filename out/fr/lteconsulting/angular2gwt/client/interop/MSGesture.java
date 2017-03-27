package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MSGesture
  * Typescript fqn MSGesture
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MSGesture {
    @JsProperty(name="target")
    Element getTarget();

    @JsProperty(name="target")
    void setTarget(Element value);

    void addPointer(Number pointerId);

    void stop();
}
