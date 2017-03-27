package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name HTMLDirectoryElement
  * Typescript fqn HTMLDirectoryElement
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface HTMLDirectoryElement extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="compact")
    boolean getCompact();

    @JsProperty(name="compact")
    void setCompact(boolean value);

    <K> void addEventListener(K type, JsFunction2<HTMLDirectoryElement,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
