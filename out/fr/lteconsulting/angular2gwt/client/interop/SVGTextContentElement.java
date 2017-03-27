package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name SVGTextContentElement
  * Typescript fqn SVGTextContentElement
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface SVGTextContentElement extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="lengthAdjust")
    SVGAnimatedEnumeration getLengthAdjust();

    @JsProperty(name="lengthAdjust")
    void setLengthAdjust(SVGAnimatedEnumeration value);

    @JsProperty(name="textLength")
    SVGAnimatedLength getTextLength();

    @JsProperty(name="textLength")
    void setTextLength(SVGAnimatedLength value);

    @JsProperty(name="LENGTHADJUST_SPACING")
    Number getLENGTHADJUST_SPACING();

    @JsProperty(name="LENGTHADJUST_SPACING")
    void setLENGTHADJUST_SPACING(Number value);

    @JsProperty(name="LENGTHADJUST_SPACINGANDGLYPHS")
    Number getLENGTHADJUST_SPACINGANDGLYPHS();

    @JsProperty(name="LENGTHADJUST_SPACINGANDGLYPHS")
    void setLENGTHADJUST_SPACINGANDGLYPHS(Number value);

    @JsProperty(name="LENGTHADJUST_UNKNOWN")
    Number getLENGTHADJUST_UNKNOWN();

    @JsProperty(name="LENGTHADJUST_UNKNOWN")
    void setLENGTHADJUST_UNKNOWN(Number value);

    Number getCharNumAtPosition(SVGPoint point);

    Number getComputedTextLength();

    SVGPoint getEndPositionOfChar(Number charnum);

    SVGRect getExtentOfChar(Number charnum);

    Number getNumberOfChars();

    Number getRotationOfChar(Number charnum);

    SVGPoint getStartPositionOfChar(Number charnum);

    Number getSubStringLength(Number charnum, Number nchars);

    void selectSubString(Number charnum, Number nchars);

    <K> void addEventListener(K type, JsFunction2<SVGTextContentElement,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
