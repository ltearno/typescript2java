package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name PointerEvent
  * Typescript fqn PointerEvent
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface PointerEvent extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="currentPoint")
    Object getCurrentPoint();

    @JsProperty(name="currentPoint")
    void setCurrentPoint(Object value);

    @JsProperty(name="height")
    Number getHeight();

    @JsProperty(name="height")
    void setHeight(Number value);

    @JsProperty(name="hwTimestamp")
    Number getHwTimestamp();

    @JsProperty(name="hwTimestamp")
    void setHwTimestamp(Number value);

    @JsProperty(name="intermediatePoints")
    Object getIntermediatePoints();

    @JsProperty(name="intermediatePoints")
    void setIntermediatePoints(Object value);

    @JsProperty(name="isPrimary")
    boolean getIsPrimary();

    @JsProperty(name="isPrimary")
    void setIsPrimary(boolean value);

    @JsProperty(name="pointerId")
    Number getPointerId();

    @JsProperty(name="pointerId")
    void setPointerId(Number value);

    @JsProperty(name="pointerType")
    Object getPointerType();

    @JsProperty(name="pointerType")
    void setPointerType(Object value);

    @JsProperty(name="pressure")
    Number getPressure();

    @JsProperty(name="pressure")
    void setPressure(Number value);

    @JsProperty(name="rotation")
    Number getRotation();

    @JsProperty(name="rotation")
    void setRotation(Number value);

    @JsProperty(name="tiltX")
    Number getTiltX();

    @JsProperty(name="tiltX")
    void setTiltX(Number value);

    @JsProperty(name="tiltY")
    Number getTiltY();

    @JsProperty(name="tiltY")
    void setTiltY(Number value);

    @JsProperty(name="width")
    Number getWidth();

    @JsProperty(name="width")
    void setWidth(Number value);

    void getCurrentPoint(Element element);

    void getIntermediatePoints(Element element);

    void initPointerEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, Window viewArg, Number detailArg, Number screenXArg, Number screenYArg, Number clientXArg, Number clientYArg, boolean ctrlKeyArg, boolean altKeyArg, boolean shiftKeyArg, boolean metaKeyArg, Number buttonArg, EventTarget relatedTargetArg, Number offsetXArg, Number offsetYArg, Number widthArg, Number heightArg, Number pressure, Number rotation, Number tiltX, Number tiltY, Number pointerIdArg, Object pointerType, Number hwTimestampArg, boolean isPrimary);
}
