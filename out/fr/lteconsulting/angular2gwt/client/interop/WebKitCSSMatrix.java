package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name WebKitCSSMatrix
  * Typescript fqn WebKitCSSMatrix
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface WebKitCSSMatrix {
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

    @JsProperty(name="m11")
    Number getM11();

    @JsProperty(name="m11")
    void setM11(Number value);

    @JsProperty(name="m12")
    Number getM12();

    @JsProperty(name="m12")
    void setM12(Number value);

    @JsProperty(name="m13")
    Number getM13();

    @JsProperty(name="m13")
    void setM13(Number value);

    @JsProperty(name="m14")
    Number getM14();

    @JsProperty(name="m14")
    void setM14(Number value);

    @JsProperty(name="m21")
    Number getM21();

    @JsProperty(name="m21")
    void setM21(Number value);

    @JsProperty(name="m22")
    Number getM22();

    @JsProperty(name="m22")
    void setM22(Number value);

    @JsProperty(name="m23")
    Number getM23();

    @JsProperty(name="m23")
    void setM23(Number value);

    @JsProperty(name="m24")
    Number getM24();

    @JsProperty(name="m24")
    void setM24(Number value);

    @JsProperty(name="m31")
    Number getM31();

    @JsProperty(name="m31")
    void setM31(Number value);

    @JsProperty(name="m32")
    Number getM32();

    @JsProperty(name="m32")
    void setM32(Number value);

    @JsProperty(name="m33")
    Number getM33();

    @JsProperty(name="m33")
    void setM33(Number value);

    @JsProperty(name="m34")
    Number getM34();

    @JsProperty(name="m34")
    void setM34(Number value);

    @JsProperty(name="m41")
    Number getM41();

    @JsProperty(name="m41")
    void setM41(Number value);

    @JsProperty(name="m42")
    Number getM42();

    @JsProperty(name="m42")
    void setM42(Number value);

    @JsProperty(name="m43")
    Number getM43();

    @JsProperty(name="m43")
    void setM43(Number value);

    @JsProperty(name="m44")
    Number getM44();

    @JsProperty(name="m44")
    void setM44(Number value);

    WebKitCSSMatrix inverse();

    WebKitCSSMatrix multiply(WebKitCSSMatrix secondMatrix);

    WebKitCSSMatrix rotate(Number angleX, Number /* optional */ angleY, Number /* optional */ angleZ);

    WebKitCSSMatrix rotateAxisAngle(Number x, Number y, Number z, Number angle);

    WebKitCSSMatrix scale(Number scaleX, Number /* optional */ scaleY, Number /* optional */ scaleZ);

    void setMatrixValue(String value);

    WebKitCSSMatrix skewX(Number angle);

    WebKitCSSMatrix skewY(Number angle);

    String toString();

    WebKitCSSMatrix translate(Number x, Number y, Number /* optional */ z);
}
