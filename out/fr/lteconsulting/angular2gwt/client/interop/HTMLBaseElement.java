package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name HTMLBaseElement
  * Typescript fqn HTMLBaseElement
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface HTMLBaseElement extends Object /* no JavaNode for symbol */ {
    /**
     * Gets or sets the baseline URL on which relative links are based.
     */
    @JsProperty(name="href")
    String getHref();

    /**
     * Gets or sets the baseline URL on which relative links are based.
     */
    @JsProperty(name="href")
    void setHref(String value);

    /**
     * Sets or retrieves the window or frame at which to target content.
     */
    @JsProperty(name="target")
    String getTarget();

    /**
     * Sets or retrieves the window or frame at which to target content.
     */
    @JsProperty(name="target")
    void setTarget(String value);

    <K> void addEventListener(K type, JsFunction2<HTMLBaseElement,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
