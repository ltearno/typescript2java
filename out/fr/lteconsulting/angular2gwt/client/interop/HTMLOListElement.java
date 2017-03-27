package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name HTMLOListElement
  * Typescript fqn HTMLOListElement
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface HTMLOListElement extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="compact")
    boolean getCompact();

    @JsProperty(name="compact")
    void setCompact(boolean value);

    /**
     * The starting number.
     */
    @JsProperty(name="start")
    Number getStart();

    /**
     * The starting number.
     */
    @JsProperty(name="start")
    void setStart(Number value);

    @JsProperty(name="type")
    String getType();

    @JsProperty(name="type")
    void setType(String value);

    <K> void addEventListener(K type, JsFunction2<HTMLOListElement,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
