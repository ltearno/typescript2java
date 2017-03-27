package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name SVGRectElement
  * Typescript fqn SVGRectElement
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface SVGRectElement extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="height")
    SVGAnimatedLength getHeight();

    @JsProperty(name="height")
    void setHeight(SVGAnimatedLength value);

    @JsProperty(name="rx")
    SVGAnimatedLength getRx();

    @JsProperty(name="rx")
    void setRx(SVGAnimatedLength value);

    @JsProperty(name="ry")
    SVGAnimatedLength getRy();

    @JsProperty(name="ry")
    void setRy(SVGAnimatedLength value);

    @JsProperty(name="width")
    SVGAnimatedLength getWidth();

    @JsProperty(name="width")
    void setWidth(SVGAnimatedLength value);

    @JsProperty(name="x")
    SVGAnimatedLength getX();

    @JsProperty(name="x")
    void setX(SVGAnimatedLength value);

    @JsProperty(name="y")
    SVGAnimatedLength getY();

    @JsProperty(name="y")
    void setY(SVGAnimatedLength value);

    <K> void addEventListener(K type, JsFunction2<SVGRectElement,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
