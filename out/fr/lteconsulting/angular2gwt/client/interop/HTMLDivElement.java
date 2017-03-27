package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name HTMLDivElement
  * Typescript fqn HTMLDivElement
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface HTMLDivElement extends Object /* no JavaNode for symbol */ {
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

    /**
     * Sets or retrieves whether the browser automatically performs wordwrap.
     */
    @JsProperty(name="noWrap")
    boolean getNoWrap();

    /**
     * Sets or retrieves whether the browser automatically performs wordwrap.
     */
    @JsProperty(name="noWrap")
    void setNoWrap(boolean value);

    <K> void addEventListener(K type, JsFunction2<HTMLDivElement,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
