package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MouseEvent
  * Typescript fqn MouseEvent
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MouseEvent extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="altKey")
    boolean getAltKey();

    @JsProperty(name="altKey")
    void setAltKey(boolean value);

    @JsProperty(name="button")
    Number getButton();

    @JsProperty(name="button")
    void setButton(Number value);

    @JsProperty(name="buttons")
    Number getButtons();

    @JsProperty(name="buttons")
    void setButtons(Number value);

    @JsProperty(name="clientX")
    Number getClientX();

    @JsProperty(name="clientX")
    void setClientX(Number value);

    @JsProperty(name="clientY")
    Number getClientY();

    @JsProperty(name="clientY")
    void setClientY(Number value);

    @JsProperty(name="ctrlKey")
    boolean getCtrlKey();

    @JsProperty(name="ctrlKey")
    void setCtrlKey(boolean value);

    @JsProperty(name="fromElement")
    Element getFromElement();

    @JsProperty(name="fromElement")
    void setFromElement(Element value);

    @JsProperty(name="layerX")
    Number getLayerX();

    @JsProperty(name="layerX")
    void setLayerX(Number value);

    @JsProperty(name="layerY")
    Number getLayerY();

    @JsProperty(name="layerY")
    void setLayerY(Number value);

    @JsProperty(name="metaKey")
    boolean getMetaKey();

    @JsProperty(name="metaKey")
    void setMetaKey(boolean value);

    @JsProperty(name="movementX")
    Number getMovementX();

    @JsProperty(name="movementX")
    void setMovementX(Number value);

    @JsProperty(name="movementY")
    Number getMovementY();

    @JsProperty(name="movementY")
    void setMovementY(Number value);

    @JsProperty(name="offsetX")
    Number getOffsetX();

    @JsProperty(name="offsetX")
    void setOffsetX(Number value);

    @JsProperty(name="offsetY")
    Number getOffsetY();

    @JsProperty(name="offsetY")
    void setOffsetY(Number value);

    @JsProperty(name="pageX")
    Number getPageX();

    @JsProperty(name="pageX")
    void setPageX(Number value);

    @JsProperty(name="pageY")
    Number getPageY();

    @JsProperty(name="pageY")
    void setPageY(Number value);

    @JsProperty(name="relatedTarget")
    EventTarget getRelatedTarget();

    @JsProperty(name="relatedTarget")
    void setRelatedTarget(EventTarget value);

    @JsProperty(name="screenX")
    Number getScreenX();

    @JsProperty(name="screenX")
    void setScreenX(Number value);

    @JsProperty(name="screenY")
    Number getScreenY();

    @JsProperty(name="screenY")
    void setScreenY(Number value);

    @JsProperty(name="shiftKey")
    boolean getShiftKey();

    @JsProperty(name="shiftKey")
    void setShiftKey(boolean value);

    @JsProperty(name="toElement")
    Element getToElement();

    @JsProperty(name="toElement")
    void setToElement(Element value);

    @JsProperty(name="which")
    Number getWhich();

    @JsProperty(name="which")
    void setWhich(Number value);

    @JsProperty(name="x")
    Number getX();

    @JsProperty(name="x")
    void setX(Number value);

    @JsProperty(name="y")
    Number getY();

    @JsProperty(name="y")
    void setY(Number value);

    boolean getModifierState(String keyArg);

    void initMouseEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, Window viewArg, Number detailArg, Number screenXArg, Number screenYArg, Number clientXArg, Number clientYArg, boolean ctrlKeyArg, boolean altKeyArg, boolean shiftKeyArg, boolean metaKeyArg, Number buttonArg, Object /* UnionType */ relatedTargetArg);
}
