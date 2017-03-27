package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name SVGAnimatedTransformList
  * Typescript fqn SVGAnimatedTransformList
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface SVGAnimatedTransformList {
    @JsProperty(name="animVal")
    SVGTransformList getAnimVal();

    @JsProperty(name="animVal")
    void setAnimVal(SVGTransformList value);

    @JsProperty(name="baseVal")
    SVGTransformList getBaseVal();

    @JsProperty(name="baseVal")
    void setBaseVal(SVGTransformList value);
}
