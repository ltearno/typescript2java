package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name HTMLLIElement
  * Typescript fqn HTMLLIElement
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface HTMLLIElement extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="type")
    String getType();

    @JsProperty(name="type")
    void setType(String value);

    /**
     * Sets or retrieves the value of a list item.
     */
    @JsProperty(name="value")
    Number getValue();

    /**
     * Sets or retrieves the value of a list item.
     */
    @JsProperty(name="value")
    void setValue(Number value);

    <K> void addEventListener(K type, JsFunction2<HTMLLIElement,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
