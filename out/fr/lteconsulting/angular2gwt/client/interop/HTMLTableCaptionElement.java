package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name HTMLTableCaptionElement
  * Typescript fqn HTMLTableCaptionElement
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface HTMLTableCaptionElement extends Object /* no JavaNode for symbol */ {
    /**
     * Sets or retrieves the alignment of the caption or legend.
     */
    @JsProperty(name="align")
    String getAlign();

    /**
     * Sets or retrieves the alignment of the caption or legend.
     */
    @JsProperty(name="align")
    void setAlign(String value);

    /**
     * Sets or retrieves whether the caption appears at the top or bottom of the table.
     */
    @JsProperty(name="vAlign")
    String getVAlign();

    /**
     * Sets or retrieves whether the caption appears at the top or bottom of the table.
     */
    @JsProperty(name="vAlign")
    void setVAlign(String value);

    <K> void addEventListener(K type, JsFunction2<HTMLTableCaptionElement,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
