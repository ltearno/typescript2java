package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name SVGLineElement
  * Typescript fqn SVGLineElement
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface SVGLineElement extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="x1")
    SVGAnimatedLength getX1();

    @JsProperty(name="x1")
    void setX1(SVGAnimatedLength value);

    @JsProperty(name="x2")
    SVGAnimatedLength getX2();

    @JsProperty(name="x2")
    void setX2(SVGAnimatedLength value);

    @JsProperty(name="y1")
    SVGAnimatedLength getY1();

    @JsProperty(name="y1")
    void setY1(SVGAnimatedLength value);

    @JsProperty(name="y2")
    SVGAnimatedLength getY2();

    @JsProperty(name="y2")
    void setY2(SVGAnimatedLength value);

    <K> void addEventListener(K type, JsFunction2<SVGLineElement,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
