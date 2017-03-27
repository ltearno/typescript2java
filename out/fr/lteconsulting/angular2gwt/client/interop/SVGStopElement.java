package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name SVGStopElement
  * Typescript fqn SVGStopElement
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface SVGStopElement extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="offset")
    SVGAnimatedNumber getOffset();

    @JsProperty(name="offset")
    void setOffset(SVGAnimatedNumber value);

    <K> void addEventListener(K type, JsFunction2<SVGStopElement,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
