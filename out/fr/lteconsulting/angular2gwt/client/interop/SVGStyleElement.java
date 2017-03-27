package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name SVGStyleElement
  * Typescript fqn SVGStyleElement
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface SVGStyleElement extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="disabled")
    boolean getDisabled();

    @JsProperty(name="disabled")
    void setDisabled(boolean value);

    @JsProperty(name="media")
    String getMedia();

    @JsProperty(name="media")
    void setMedia(String value);

    @JsProperty(name="title")
    String getTitle();

    @JsProperty(name="title")
    void setTitle(String value);

    @JsProperty(name="type")
    String getType();

    @JsProperty(name="type")
    void setType(String value);

    <K> void addEventListener(K type, JsFunction2<SVGStyleElement,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
