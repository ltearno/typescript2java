package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name HTMLDListElement
  * Typescript fqn HTMLDListElement
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface HTMLDListElement extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="compact")
    boolean getCompact();

    @JsProperty(name="compact")
    void setCompact(boolean value);

    <K> void addEventListener(K type, JsFunction2<HTMLDListElement,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
