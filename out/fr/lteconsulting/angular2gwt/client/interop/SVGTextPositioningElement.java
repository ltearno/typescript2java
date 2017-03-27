package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name SVGTextPositioningElement
  * Typescript fqn SVGTextPositioningElement
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface SVGTextPositioningElement extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="dx")
    SVGAnimatedLengthList getDx();

    @JsProperty(name="dx")
    void setDx(SVGAnimatedLengthList value);

    @JsProperty(name="dy")
    SVGAnimatedLengthList getDy();

    @JsProperty(name="dy")
    void setDy(SVGAnimatedLengthList value);

    @JsProperty(name="rotate")
    SVGAnimatedNumberList getRotate();

    @JsProperty(name="rotate")
    void setRotate(SVGAnimatedNumberList value);

    @JsProperty(name="x")
    SVGAnimatedLengthList getX();

    @JsProperty(name="x")
    void setX(SVGAnimatedLengthList value);

    @JsProperty(name="y")
    SVGAnimatedLengthList getY();

    @JsProperty(name="y")
    void setY(SVGAnimatedLengthList value);

    <K> void addEventListener(K type, JsFunction2<SVGTextPositioningElement,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
