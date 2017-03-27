package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name SVGFEDistantLightElement
  * Typescript fqn SVGFEDistantLightElement
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface SVGFEDistantLightElement extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="azimuth")
    SVGAnimatedNumber getAzimuth();

    @JsProperty(name="azimuth")
    void setAzimuth(SVGAnimatedNumber value);

    @JsProperty(name="elevation")
    SVGAnimatedNumber getElevation();

    @JsProperty(name="elevation")
    void setElevation(SVGAnimatedNumber value);

    <K> void addEventListener(K type, JsFunction2<SVGFEDistantLightElement,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
