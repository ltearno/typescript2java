package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name HTMLHtmlElement
  * Typescript fqn HTMLHtmlElement
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface HTMLHtmlElement extends Object /* no JavaNode for symbol */ {
    /**
     * Sets or retrieves the DTD version that governs the current document.
     */
    @JsProperty(name="version")
    String getVersion();

    /**
     * Sets or retrieves the DTD version that governs the current document.
     */
    @JsProperty(name="version")
    void setVersion(String value);

    <K> void addEventListener(K type, JsFunction2<HTMLHtmlElement,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
