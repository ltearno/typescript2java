package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name SVGFEPointLightElement
  * Typescript fqn SVGFEPointLightElement
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface SVGFEPointLightElement extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="x")
    SVGAnimatedNumber getX();

    @JsProperty(name="x")
    void setX(SVGAnimatedNumber value);

    @JsProperty(name="y")
    SVGAnimatedNumber getY();

    @JsProperty(name="y")
    void setY(SVGAnimatedNumber value);

    @JsProperty(name="z")
    SVGAnimatedNumber getZ();

    @JsProperty(name="z")
    void setZ(SVGAnimatedNumber value);

    <K> void addEventListener(K type, JsFunction2<SVGFEPointLightElement,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
