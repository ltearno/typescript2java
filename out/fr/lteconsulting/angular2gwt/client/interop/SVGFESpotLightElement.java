package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name SVGFESpotLightElement
  * Typescript fqn SVGFESpotLightElement
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface SVGFESpotLightElement extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="limitingConeAngle")
    SVGAnimatedNumber getLimitingConeAngle();

    @JsProperty(name="limitingConeAngle")
    void setLimitingConeAngle(SVGAnimatedNumber value);

    @JsProperty(name="pointsAtX")
    SVGAnimatedNumber getPointsAtX();

    @JsProperty(name="pointsAtX")
    void setPointsAtX(SVGAnimatedNumber value);

    @JsProperty(name="pointsAtY")
    SVGAnimatedNumber getPointsAtY();

    @JsProperty(name="pointsAtY")
    void setPointsAtY(SVGAnimatedNumber value);

    @JsProperty(name="pointsAtZ")
    SVGAnimatedNumber getPointsAtZ();

    @JsProperty(name="pointsAtZ")
    void setPointsAtZ(SVGAnimatedNumber value);

    @JsProperty(name="specularExponent")
    SVGAnimatedNumber getSpecularExponent();

    @JsProperty(name="specularExponent")
    void setSpecularExponent(SVGAnimatedNumber value);

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

    <K> void addEventListener(K type, JsFunction2<SVGFESpotLightElement,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
