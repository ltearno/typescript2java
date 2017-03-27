package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name HTMLParagraphElement
  * Typescript fqn HTMLParagraphElement
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface HTMLParagraphElement extends Object /* no JavaNode for symbol */ {
    /**
     * Sets or retrieves how the object is aligned with adjacent text.
     */
    @JsProperty(name="align")
    String getAlign();

    /**
     * Sets or retrieves how the object is aligned with adjacent text.
     */
    @JsProperty(name="align")
    void setAlign(String value);

    @JsProperty(name="clear")
    String getClear();

    @JsProperty(name="clear")
    void setClear(String value);

    <K> void addEventListener(K type, JsFunction2<HTMLParagraphElement,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
