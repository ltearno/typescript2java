package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name SVGFitToViewBox
  * Typescript fqn SVGFitToViewBox
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface SVGFitToViewBox {
    @JsProperty(name="preserveAspectRatio")
    SVGAnimatedPreserveAspectRatio getPreserveAspectRatio();

    @JsProperty(name="preserveAspectRatio")
    void setPreserveAspectRatio(SVGAnimatedPreserveAspectRatio value);

    @JsProperty(name="viewBox")
    SVGAnimatedRect getViewBox();

    @JsProperty(name="viewBox")
    void setViewBox(SVGAnimatedRect value);
}
