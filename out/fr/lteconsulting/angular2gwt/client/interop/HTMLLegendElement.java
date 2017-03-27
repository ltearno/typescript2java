package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name HTMLLegendElement
  * Typescript fqn HTMLLegendElement
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface HTMLLegendElement extends Object /* no JavaNode for symbol */ {
    /**
     * Retrieves a reference to the form that the object is embedded in.
     */
    @JsProperty(name="align")
    String getAlign();

    /**
     * Retrieves a reference to the form that the object is embedded in.
     */
    @JsProperty(name="align")
    void setAlign(String value);

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

    <K> void addEventListener(K type, JsFunction2<HTMLLegendElement,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
