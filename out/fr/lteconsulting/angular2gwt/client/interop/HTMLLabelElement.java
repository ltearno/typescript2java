package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name HTMLLabelElement
  * Typescript fqn HTMLLabelElement
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface HTMLLabelElement extends Object /* no JavaNode for symbol */ {
    /**
     * Retrieves a reference to the form that the object is embedded in.
     */
    @JsProperty(name="form")
    HTMLFormElement getForm();

    /**
     * Retrieves a reference to the form that the object is embedded in.
     */
    @JsProperty(name="form")
    void setForm(HTMLFormElement value);

    /**
     * Sets or retrieves the object to which the given label object is assigned.
     */
    @JsProperty(name="htmlFor")
    String getHtmlFor();

    /**
     * Sets or retrieves the object to which the given label object is assigned.
     */
    @JsProperty(name="htmlFor")
    void setHtmlFor(String value);

    <K> void addEventListener(K type, JsFunction2<HTMLLabelElement,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
