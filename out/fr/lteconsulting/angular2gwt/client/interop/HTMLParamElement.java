package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name HTMLParamElement
  * Typescript fqn HTMLParamElement
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface HTMLParamElement extends Object /* no JavaNode for symbol */ {
    /**
     * Sets or retrieves the name of an input parameter for an element.
     */
    @JsProperty(name="name")
    String getName();

    /**
     * Sets or retrieves the name of an input parameter for an element.
     */
    @JsProperty(name="name")
    void setName(String value);

    /**
     * Sets or retrieves the content type of the resource designated by the value attribute.
     */
    @JsProperty(name="type")
    String getType();

    /**
     * Sets or retrieves the content type of the resource designated by the value attribute.
     */
    @JsProperty(name="type")
    void setType(String value);

    /**
     * Sets or retrieves the value of an input parameter for an element.
     */
    @JsProperty(name="value")
    String getValue();

    /**
     * Sets or retrieves the value of an input parameter for an element.
     */
    @JsProperty(name="value")
    void setValue(String value);

    /**
     * Sets or retrieves the data type of the value attribute.
     */
    @JsProperty(name="valueType")
    String getValueType();

    /**
     * Sets or retrieves the data type of the value attribute.
     */
    @JsProperty(name="valueType")
    void setValueType(String value);

    <K> void addEventListener(K type, JsFunction2<HTMLParamElement,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
