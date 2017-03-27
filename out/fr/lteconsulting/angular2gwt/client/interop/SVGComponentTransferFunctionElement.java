package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name SVGComponentTransferFunctionElement
  * Typescript fqn SVGComponentTransferFunctionElement
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface SVGComponentTransferFunctionElement extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="amplitude")
    SVGAnimatedNumber getAmplitude();

    @JsProperty(name="amplitude")
    void setAmplitude(SVGAnimatedNumber value);

    @JsProperty(name="exponent")
    SVGAnimatedNumber getExponent();

    @JsProperty(name="exponent")
    void setExponent(SVGAnimatedNumber value);

    @JsProperty(name="intercept")
    SVGAnimatedNumber getIntercept();

    @JsProperty(name="intercept")
    void setIntercept(SVGAnimatedNumber value);

    @JsProperty(name="offset")
    SVGAnimatedNumber getOffset();

    @JsProperty(name="offset")
    void setOffset(SVGAnimatedNumber value);

    @JsProperty(name="slope")
    SVGAnimatedNumber getSlope();

    @JsProperty(name="slope")
    void setSlope(SVGAnimatedNumber value);

    @JsProperty(name="tableValues")
    SVGAnimatedNumberList getTableValues();

    @JsProperty(name="tableValues")
    void setTableValues(SVGAnimatedNumberList value);

    @JsProperty(name="type")
    SVGAnimatedEnumeration getType();

    @JsProperty(name="type")
    void setType(SVGAnimatedEnumeration value);

    @JsProperty(name="SVG_FECOMPONENTTRANSFER_TYPE_DISCRETE")
    Number getSVG_FECOMPONENTTRANSFER_TYPE_DISCRETE();

    @JsProperty(name="SVG_FECOMPONENTTRANSFER_TYPE_DISCRETE")
    void setSVG_FECOMPONENTTRANSFER_TYPE_DISCRETE(Number value);

    @JsProperty(name="SVG_FECOMPONENTTRANSFER_TYPE_GAMMA")
    Number getSVG_FECOMPONENTTRANSFER_TYPE_GAMMA();

    @JsProperty(name="SVG_FECOMPONENTTRANSFER_TYPE_GAMMA")
    void setSVG_FECOMPONENTTRANSFER_TYPE_GAMMA(Number value);

    @JsProperty(name="SVG_FECOMPONENTTRANSFER_TYPE_IDENTITY")
    Number getSVG_FECOMPONENTTRANSFER_TYPE_IDENTITY();

    @JsProperty(name="SVG_FECOMPONENTTRANSFER_TYPE_IDENTITY")
    void setSVG_FECOMPONENTTRANSFER_TYPE_IDENTITY(Number value);

    @JsProperty(name="SVG_FECOMPONENTTRANSFER_TYPE_LINEAR")
    Number getSVG_FECOMPONENTTRANSFER_TYPE_LINEAR();

    @JsProperty(name="SVG_FECOMPONENTTRANSFER_TYPE_LINEAR")
    void setSVG_FECOMPONENTTRANSFER_TYPE_LINEAR(Number value);

    @JsProperty(name="SVG_FECOMPONENTTRANSFER_TYPE_TABLE")
    Number getSVG_FECOMPONENTTRANSFER_TYPE_TABLE();

    @JsProperty(name="SVG_FECOMPONENTTRANSFER_TYPE_TABLE")
    void setSVG_FECOMPONENTTRANSFER_TYPE_TABLE(Number value);

    @JsProperty(name="SVG_FECOMPONENTTRANSFER_TYPE_UNKNOWN")
    Number getSVG_FECOMPONENTTRANSFER_TYPE_UNKNOWN();

    @JsProperty(name="SVG_FECOMPONENTTRANSFER_TYPE_UNKNOWN")
    void setSVG_FECOMPONENTTRANSFER_TYPE_UNKNOWN(Number value);

    <K> void addEventListener(K type, JsFunction2<SVGComponentTransferFunctionElement,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
