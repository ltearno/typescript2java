package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name HTMLTableHeaderCellElement
  * Typescript fqn HTMLTableHeaderCellElement
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface HTMLTableHeaderCellElement extends Object /* no JavaNode for symbol */ {
    /**
     * Sets or retrieves the group of cells in a table to which the object's information applies.
     */
    @JsProperty(name="scope")
    String getScope();

    /**
     * Sets or retrieves the group of cells in a table to which the object's information applies.
     */
    @JsProperty(name="scope")
    void setScope(String value);

    <K> void addEventListener(K type, JsFunction2<HTMLTableHeaderCellElement,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
