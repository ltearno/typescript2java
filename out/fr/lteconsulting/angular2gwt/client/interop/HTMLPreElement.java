package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name HTMLPreElement
  * Typescript fqn HTMLPreElement
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface HTMLPreElement extends Object /* no JavaNode for symbol */ {
    /**
     * Sets or gets a value that you can use to implement your own width functionality for the object.
     */
    @JsProperty(name="width")
    Number getWidth();

    /**
     * Sets or gets a value that you can use to implement your own width functionality for the object.
     */
    @JsProperty(name="width")
    void setWidth(Number value);

    <K> void addEventListener(K type, JsFunction2<HTMLPreElement,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
