package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name HTMLQuoteElement
  * Typescript fqn HTMLQuoteElement
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface HTMLQuoteElement extends Object /* no JavaNode for symbol */ {
    /**
     * Sets or retrieves reference information about the object.
     */
    @JsProperty(name="cite")
    String getCite();

    /**
     * Sets or retrieves reference information about the object.
     */
    @JsProperty(name="cite")
    void setCite(String value);

    <K> void addEventListener(K type, JsFunction2<HTMLQuoteElement,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
