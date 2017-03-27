package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name Event
  * Typescript fqn Event
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface Event {
    @JsProperty(name="bubbles")
    boolean getBubbles();

    @JsProperty(name="bubbles")
    void setBubbles(boolean value);

    @JsProperty(name="cancelBubble")
    boolean getCancelBubble();

    @JsProperty(name="cancelBubble")
    void setCancelBubble(boolean value);

    @JsProperty(name="cancelable")
    boolean getCancelable();

    @JsProperty(name="cancelable")
    void setCancelable(boolean value);

    @JsProperty(name="currentTarget")
    EventTarget getCurrentTarget();

    @JsProperty(name="currentTarget")
    void setCurrentTarget(EventTarget value);

    @JsProperty(name="defaultPrevented")
    boolean getDefaultPrevented();

    @JsProperty(name="defaultPrevented")
    void setDefaultPrevented(boolean value);

    @JsProperty(name="eventPhase")
    Number getEventPhase();

    @JsProperty(name="eventPhase")
    void setEventPhase(Number value);

    @JsProperty(name="isTrusted")
    boolean getIsTrusted();

    @JsProperty(name="isTrusted")
    void setIsTrusted(boolean value);

    @JsProperty(name="returnValue")
    boolean getReturnValue();

    @JsProperty(name="returnValue")
    void setReturnValue(boolean value);

    @JsProperty(name="srcElement")
    Element getSrcElement();

    @JsProperty(name="srcElement")
    void setSrcElement(Element value);

    @JsProperty(name="target")
    EventTarget getTarget();

    @JsProperty(name="target")
    void setTarget(EventTarget value);

    @JsProperty(name="timeStamp")
    Number getTimeStamp();

    @JsProperty(name="timeStamp")
    void setTimeStamp(Number value);

    @JsProperty(name="type")
    String getType();

    @JsProperty(name="type")
    void setType(String value);

    @JsProperty(name="scoped")
    boolean getScoped();

    @JsProperty(name="scoped")
    void setScoped(boolean value);

    @JsProperty(name="AT_TARGET")
    Number getAT_TARGET();

    @JsProperty(name="AT_TARGET")
    void setAT_TARGET(Number value);

    @JsProperty(name="BUBBLING_PHASE")
    Number getBUBBLING_PHASE();

    @JsProperty(name="BUBBLING_PHASE")
    void setBUBBLING_PHASE(Number value);

    @JsProperty(name="CAPTURING_PHASE")
    Number getCAPTURING_PHASE();

    @JsProperty(name="CAPTURING_PHASE")
    void setCAPTURING_PHASE(Number value);

    void initEvent(String eventTypeArg, boolean canBubbleArg, boolean cancelableArg);

    void preventDefault();

    void stopImmediatePropagation();

    void stopPropagation();

    JsArray<EventTarget> deepPath();
}
