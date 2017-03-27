package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name SVGAnimatedPoints
  * Typescript fqn SVGAnimatedPoints
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface SVGAnimatedPoints {
    @JsProperty(name="animatedPoints")
    SVGPointList getAnimatedPoints();

    @JsProperty(name="animatedPoints")
    void setAnimatedPoints(SVGPointList value);

    @JsProperty(name="points")
    SVGPointList getPoints();

    @JsProperty(name="points")
    void setPoints(SVGPointList value);
}
