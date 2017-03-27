package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name SVGTransform
  * Typescript fqn SVGTransform
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface SVGTransform {
    @JsProperty(name="angle")
    Number getAngle();

    @JsProperty(name="angle")
    void setAngle(Number value);

    @JsProperty(name="matrix")
    SVGMatrix getMatrix();

    @JsProperty(name="matrix")
    void setMatrix(SVGMatrix value);

    @JsProperty(name="type")
    Number getType();

    @JsProperty(name="type")
    void setType(Number value);

    @JsProperty(name="SVG_TRANSFORM_MATRIX")
    Number getSVG_TRANSFORM_MATRIX();

    @JsProperty(name="SVG_TRANSFORM_MATRIX")
    void setSVG_TRANSFORM_MATRIX(Number value);

    @JsProperty(name="SVG_TRANSFORM_ROTATE")
    Number getSVG_TRANSFORM_ROTATE();

    @JsProperty(name="SVG_TRANSFORM_ROTATE")
    void setSVG_TRANSFORM_ROTATE(Number value);

    @JsProperty(name="SVG_TRANSFORM_SCALE")
    Number getSVG_TRANSFORM_SCALE();

    @JsProperty(name="SVG_TRANSFORM_SCALE")
    void setSVG_TRANSFORM_SCALE(Number value);

    @JsProperty(name="SVG_TRANSFORM_SKEWX")
    Number getSVG_TRANSFORM_SKEWX();

    @JsProperty(name="SVG_TRANSFORM_SKEWX")
    void setSVG_TRANSFORM_SKEWX(Number value);

    @JsProperty(name="SVG_TRANSFORM_SKEWY")
    Number getSVG_TRANSFORM_SKEWY();

    @JsProperty(name="SVG_TRANSFORM_SKEWY")
    void setSVG_TRANSFORM_SKEWY(Number value);

    @JsProperty(name="SVG_TRANSFORM_TRANSLATE")
    Number getSVG_TRANSFORM_TRANSLATE();

    @JsProperty(name="SVG_TRANSFORM_TRANSLATE")
    void setSVG_TRANSFORM_TRANSLATE(Number value);

    @JsProperty(name="SVG_TRANSFORM_UNKNOWN")
    Number getSVG_TRANSFORM_UNKNOWN();

    @JsProperty(name="SVG_TRANSFORM_UNKNOWN")
    void setSVG_TRANSFORM_UNKNOWN(Number value);

    void setMatrix(SVGMatrix matrix);

    void setRotate(Number angle, Number cx, Number cy);

    void setScale(Number sx, Number sy);

    void setSkewX(Number angle);

    void setSkewY(Number angle);

    void setTranslate(Number tx, Number ty);
}
