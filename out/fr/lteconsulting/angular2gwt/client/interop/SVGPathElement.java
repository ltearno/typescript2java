package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name SVGPathElement
  * Typescript fqn SVGPathElement
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface SVGPathElement extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="pathSegList")
    SVGPathSegList getPathSegList();

    @JsProperty(name="pathSegList")
    void setPathSegList(SVGPathSegList value);

    SVGPathSegArcAbs createSVGPathSegArcAbs(Number x, Number y, Number r1, Number r2, Number angle, boolean largeArcFlag, boolean sweepFlag);

    SVGPathSegArcRel createSVGPathSegArcRel(Number x, Number y, Number r1, Number r2, Number angle, boolean largeArcFlag, boolean sweepFlag);

    SVGPathSegClosePath createSVGPathSegClosePath();

    SVGPathSegCurvetoCubicAbs createSVGPathSegCurvetoCubicAbs(Number x, Number y, Number x1, Number y1, Number x2, Number y2);

    SVGPathSegCurvetoCubicRel createSVGPathSegCurvetoCubicRel(Number x, Number y, Number x1, Number y1, Number x2, Number y2);

    SVGPathSegCurvetoCubicSmoothAbs createSVGPathSegCurvetoCubicSmoothAbs(Number x, Number y, Number x2, Number y2);

    SVGPathSegCurvetoCubicSmoothRel createSVGPathSegCurvetoCubicSmoothRel(Number x, Number y, Number x2, Number y2);

    SVGPathSegCurvetoQuadraticAbs createSVGPathSegCurvetoQuadraticAbs(Number x, Number y, Number x1, Number y1);

    SVGPathSegCurvetoQuadraticRel createSVGPathSegCurvetoQuadraticRel(Number x, Number y, Number x1, Number y1);

    SVGPathSegCurvetoQuadraticSmoothAbs createSVGPathSegCurvetoQuadraticSmoothAbs(Number x, Number y);

    SVGPathSegCurvetoQuadraticSmoothRel createSVGPathSegCurvetoQuadraticSmoothRel(Number x, Number y);

    SVGPathSegLinetoAbs createSVGPathSegLinetoAbs(Number x, Number y);

    SVGPathSegLinetoHorizontalAbs createSVGPathSegLinetoHorizontalAbs(Number x);

    SVGPathSegLinetoHorizontalRel createSVGPathSegLinetoHorizontalRel(Number x);

    SVGPathSegLinetoRel createSVGPathSegLinetoRel(Number x, Number y);

    SVGPathSegLinetoVerticalAbs createSVGPathSegLinetoVerticalAbs(Number y);

    SVGPathSegLinetoVerticalRel createSVGPathSegLinetoVerticalRel(Number y);

    SVGPathSegMovetoAbs createSVGPathSegMovetoAbs(Number x, Number y);

    SVGPathSegMovetoRel createSVGPathSegMovetoRel(Number x, Number y);

    Number getPathSegAtLength(Number distance);

    SVGPoint getPointAtLength(Number distance);

    Number getTotalLength();

    <K> void addEventListener(K type, JsFunction2<SVGPathElement,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
