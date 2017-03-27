package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name SVGCircleElement
  * Typescript fqn SVGCircleElement
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface SVGCircleElement extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="cx")
    SVGAnimatedLength getCx();

    @JsProperty(name="cx")
    void setCx(SVGAnimatedLength value);

    @JsProperty(name="cy")
    SVGAnimatedLength getCy();

    @JsProperty(name="cy")
    void setCy(SVGAnimatedLength value);

    @JsProperty(name="r")
    SVGAnimatedLength getR();

    @JsProperty(name="r")
    void setR(SVGAnimatedLength value);

    <K> void addEventListener(K type, JsFunction2<SVGCircleElement,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
