package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name SVGForeignObjectElement
  * Typescript fqn SVGForeignObjectElement
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface SVGForeignObjectElement extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="height")
    SVGAnimatedLength getHeight();

    @JsProperty(name="height")
    void setHeight(SVGAnimatedLength value);

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

    <K> void addEventListener(K type, JsFunction2<SVGForeignObjectElement,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
