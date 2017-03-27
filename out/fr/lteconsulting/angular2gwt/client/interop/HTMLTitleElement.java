package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name HTMLTitleElement
  * Typescript fqn HTMLTitleElement
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface HTMLTitleElement extends Object /* no JavaNode for symbol */ {
    /**
     * Retrieves or sets the text of the object as a string.
     */
    @JsProperty(name="text")
    String getText();

    /**
     * Retrieves or sets the text of the object as a string.
     */
    @JsProperty(name="text")
    void setText(String value);

    <K> void addEventListener(K type, JsFunction2<HTMLTitleElement,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
