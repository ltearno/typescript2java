package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name HTMLMapElement
  * Typescript fqn HTMLMapElement
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface HTMLMapElement extends Object /* no JavaNode for symbol */ {
    /**
     * Retrieves a collection of the area objects defined for the given map object.
     */
    @JsProperty(name="areas")
    HTMLAreasCollection getAreas();

    /**
     * Retrieves a collection of the area objects defined for the given map object.
     */
    @JsProperty(name="areas")
    void setAreas(HTMLAreasCollection value);

    /**
     * Sets or retrieves the name of the object.
     */
    @JsProperty(name="name")
    String getName();

    /**
     * Sets or retrieves the name of the object.
     */
    @JsProperty(name="name")
    void setName(String value);

    <K> void addEventListener(K type, JsFunction2<HTMLMapElement,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
