package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name CanvasPathMethods
  * Typescript fqn CanvasPathMethods
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface CanvasPathMethods {
    void arc(Number x, Number y, Number radius, Number startAngle, Number endAngle, boolean /* optional */ anticlockwise);

    void arcTo(Number x1, Number y1, Number x2, Number y2, Number radius);

    void bezierCurveTo(Number cp1x, Number cp1y, Number cp2x, Number cp2y, Number x, Number y);

    void closePath();

    void ellipse(Number x, Number y, Number radiusX, Number radiusY, Number rotation, Number startAngle, Number endAngle, boolean /* optional */ anticlockwise);

    void lineTo(Number x, Number y);

    void moveTo(Number x, Number y);

    void quadraticCurveTo(Number cpx, Number cpy, Number x, Number y);

    void rect(Number x, Number y, Number w, Number h);
}
