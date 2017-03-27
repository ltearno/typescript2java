package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name HTMLHeadingElement
  * Typescript fqn HTMLHeadingElement
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface HTMLHeadingElement extends Object /* no JavaNode for symbol */ {
    /**
     * Sets or retrieves a value that indicates the table alignment.
     */
    @JsProperty(name="align")
    String getAlign();

    /**
     * Sets or retrieves a value that indicates the table alignment.
     */
    @JsProperty(name="align")
    void setAlign(String value);

    <K> void addEventListener(K type, JsFunction2<HTMLHeadingElement,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
