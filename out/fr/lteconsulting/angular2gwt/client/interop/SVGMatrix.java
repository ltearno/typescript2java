package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name SVGMatrix
  * Typescript fqn SVGMatrix
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface SVGMatrix {
    @JsProperty(name="a")
    Number getA();

    @JsProperty(name="a")
    void setA(Number value);

    @JsProperty(name="b")
    Number getB();

    @JsProperty(name="b")
    void setB(Number value);

    @JsProperty(name="c")
    Number getC();

    @JsProperty(name="c")
    void setC(Number value);

    @JsProperty(name="d")
    Number getD();

    @JsProperty(name="d")
    void setD(Number value);

    @JsProperty(name="e")
    Number getE();

    @JsProperty(name="e")
    void setE(Number value);

    @JsProperty(name="f")
    Number getF();

    @JsProperty(name="f")
    void setF(Number value);

    SVGMatrix flipX();

    SVGMatrix flipY();

    SVGMatrix inverse();

    SVGMatrix multiply(SVGMatrix secondMatrix);

    SVGMatrix rotate(Number angle);

    SVGMatrix rotateFromVector(Number x, Number y);

    SVGMatrix scale(Number scaleFactor);

    SVGMatrix scaleNonUniform(Number scaleFactorX, Number scaleFactorY);

    SVGMatrix skewX(Number angle);

    SVGMatrix skewY(Number angle);

    SVGMatrix translate(Number x, Number y);
}
