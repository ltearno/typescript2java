package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name Screen
  * Typescript fqn Screen
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface Screen extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="availHeight")
    Number getAvailHeight();

    @JsProperty(name="availHeight")
    void setAvailHeight(Number value);

    @JsProperty(name="availWidth")
    Number getAvailWidth();

    @JsProperty(name="availWidth")
    void setAvailWidth(Number value);

    @JsProperty(name="bufferDepth")
    Number getBufferDepth();

    @JsProperty(name="bufferDepth")
    void setBufferDepth(Number value);

    @JsProperty(name="colorDepth")
    Number getColorDepth();

    @JsProperty(name="colorDepth")
    void setColorDepth(Number value);

    @JsProperty(name="deviceXDPI")
    Number getDeviceXDPI();

    @JsProperty(name="deviceXDPI")
    void setDeviceXDPI(Number value);

    @JsProperty(name="deviceYDPI")
    Number getDeviceYDPI();

    @JsProperty(name="deviceYDPI")
    void setDeviceYDPI(Number value);

    @JsProperty(name="fontSmoothingEnabled")
    boolean getFontSmoothingEnabled();

    @JsProperty(name="fontSmoothingEnabled")
    void setFontSmoothingEnabled(boolean value);

    @JsProperty(name="height")
    Number getHeight();

    @JsProperty(name="height")
    void setHeight(Number value);

    @JsProperty(name="logicalXDPI")
    Number getLogicalXDPI();

    @JsProperty(name="logicalXDPI")
    void setLogicalXDPI(Number value);

    @JsProperty(name="logicalYDPI")
    Number getLogicalYDPI();

    @JsProperty(name="logicalYDPI")
    void setLogicalYDPI(Number value);

    @JsProperty(name="msOrientation")
    String getMsOrientation();

    @JsProperty(name="msOrientation")
    void setMsOrientation(String value);

    @JsProperty(name="onmsorientationchange")
    JsFunction2<Screen,Event,Object> getOnmsorientationchange();

    @JsProperty(name="onmsorientationchange")
    void setOnmsorientationchange(JsFunction2<Screen,Event,Object> value);

    @JsProperty(name="pixelDepth")
    Number getPixelDepth();

    @JsProperty(name="pixelDepth")
    void setPixelDepth(Number value);

    @JsProperty(name="systemXDPI")
    Number getSystemXDPI();

    @JsProperty(name="systemXDPI")
    void setSystemXDPI(Number value);

    @JsProperty(name="systemYDPI")
    Number getSystemYDPI();

    @JsProperty(name="systemYDPI")
    void setSystemYDPI(Number value);

    @JsProperty(name="width")
    Number getWidth();

    @JsProperty(name="width")
    void setWidth(Number value);

    boolean msLockOrientation(Object /* UnionType */ orientations);

    void msUnlockOrientation();

    <K> void addEventListener(K type, JsFunction2<Screen,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
