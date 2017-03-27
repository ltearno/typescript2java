package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name SVGAnimatedLengthList
  * Typescript fqn SVGAnimatedLengthList
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface SVGAnimatedLengthList {
    @JsProperty(name="animVal")
    SVGLengthList getAnimVal();

    @JsProperty(name="animVal")
    void setAnimVal(SVGLengthList value);

    @JsProperty(name="baseVal")
    SVGLengthList getBaseVal();

    @JsProperty(name="baseVal")
    void setBaseVal(SVGLengthList value);
}
