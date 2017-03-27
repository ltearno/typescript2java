package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name WheelEvent
  * Typescript fqn WheelEvent
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface WheelEvent extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="deltaMode")
    Number getDeltaMode();

    @JsProperty(name="deltaMode")
    void setDeltaMode(Number value);

    @JsProperty(name="deltaX")
    Number getDeltaX();

    @JsProperty(name="deltaX")
    void setDeltaX(Number value);

    @JsProperty(name="deltaY")
    Number getDeltaY();

    @JsProperty(name="deltaY")
    void setDeltaY(Number value);

    @JsProperty(name="deltaZ")
    Number getDeltaZ();

    @JsProperty(name="deltaZ")
    void setDeltaZ(Number value);

    @JsProperty(name="wheelDelta")
    Number getWheelDelta();

    @JsProperty(name="wheelDelta")
    void setWheelDelta(Number value);

    @JsProperty(name="wheelDeltaX")
    Number getWheelDeltaX();

    @JsProperty(name="wheelDeltaX")
    void setWheelDeltaX(Number value);

    @JsProperty(name="wheelDeltaY")
    Number getWheelDeltaY();

    @JsProperty(name="wheelDeltaY")
    void setWheelDeltaY(Number value);

    @JsProperty(name="DOM_DELTA_LINE")
    Number getDOM_DELTA_LINE();

    @JsProperty(name="DOM_DELTA_LINE")
    void setDOM_DELTA_LINE(Number value);

    @JsProperty(name="DOM_DELTA_PAGE")
    Number getDOM_DELTA_PAGE();

    @JsProperty(name="DOM_DELTA_PAGE")
    void setDOM_DELTA_PAGE(Number value);

    @JsProperty(name="DOM_DELTA_PIXEL")
    Number getDOM_DELTA_PIXEL();

    @JsProperty(name="DOM_DELTA_PIXEL")
    void setDOM_DELTA_PIXEL(Number value);

    void getCurrentPoint(Element element);

    void initWheelEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, Window viewArg, Number detailArg, Number screenXArg, Number screenYArg, Number clientXArg, Number clientYArg, Number buttonArg, EventTarget relatedTargetArg, String modifiersListArg, Number deltaXArg, Number deltaYArg, Number deltaZArg, Number deltaMode);
}
