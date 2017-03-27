package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name SVGAnimatedLength
  * Typescript fqn SVGAnimatedLength
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface SVGAnimatedLength {
    @JsProperty(name="animVal")
    SVGLength getAnimVal();

    @JsProperty(name="animVal")
    void setAnimVal(SVGLength value);

    @JsProperty(name="baseVal")
    SVGLength getBaseVal();

    @JsProperty(name="baseVal")
    void setBaseVal(SVGLength value);
}
