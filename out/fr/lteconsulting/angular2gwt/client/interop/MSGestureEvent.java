package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MSGestureEvent
  * Typescript fqn MSGestureEvent
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MSGestureEvent extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="clientX")
    Number getClientX();

    @JsProperty(name="clientX")
    void setClientX(Number value);

    @JsProperty(name="clientY")
    Number getClientY();

    @JsProperty(name="clientY")
    void setClientY(Number value);

    @JsProperty(name="expansion")
    Number getExpansion();

    @JsProperty(name="expansion")
    void setExpansion(Number value);

    @JsProperty(name="gestureObject")
    Object getGestureObject();

    @JsProperty(name="gestureObject")
    void setGestureObject(Object value);

    @JsProperty(name="hwTimestamp")
    Number getHwTimestamp();

    @JsProperty(name="hwTimestamp")
    void setHwTimestamp(Number value);

    @JsProperty(name="offsetX")
    Number getOffsetX();

    @JsProperty(name="offsetX")
    void setOffsetX(Number value);

    @JsProperty(name="offsetY")
    Number getOffsetY();

    @JsProperty(name="offsetY")
    void setOffsetY(Number value);

    @JsProperty(name="rotation")
    Number getRotation();

    @JsProperty(name="rotation")
    void setRotation(Number value);

    @JsProperty(name="scale")
    Number getScale();

    @JsProperty(name="scale")
    void setScale(Number value);

    @JsProperty(name="screenX")
    Number getScreenX();

    @JsProperty(name="screenX")
    void setScreenX(Number value);

    @JsProperty(name="screenY")
    Number getScreenY();

    @JsProperty(name="screenY")
    void setScreenY(Number value);

    @JsProperty(name="translationX")
    Number getTranslationX();

    @JsProperty(name="translationX")
    void setTranslationX(Number value);

    @JsProperty(name="translationY")
    Number getTranslationY();

    @JsProperty(name="translationY")
    void setTranslationY(Number value);

    @JsProperty(name="velocityAngular")
    Number getVelocityAngular();

    @JsProperty(name="velocityAngular")
    void setVelocityAngular(Number value);

    @JsProperty(name="velocityExpansion")
    Number getVelocityExpansion();

    @JsProperty(name="velocityExpansion")
    void setVelocityExpansion(Number value);

    @JsProperty(name="velocityX")
    Number getVelocityX();

    @JsProperty(name="velocityX")
    void setVelocityX(Number value);

    @JsProperty(name="velocityY")
    Number getVelocityY();

    @JsProperty(name="velocityY")
    void setVelocityY(Number value);

    @JsProperty(name="MSGESTURE_FLAG_BEGIN")
    Number getMSGESTURE_FLAG_BEGIN();

    @JsProperty(name="MSGESTURE_FLAG_BEGIN")
    void setMSGESTURE_FLAG_BEGIN(Number value);

    @JsProperty(name="MSGESTURE_FLAG_CANCEL")
    Number getMSGESTURE_FLAG_CANCEL();

    @JsProperty(name="MSGESTURE_FLAG_CANCEL")
    void setMSGESTURE_FLAG_CANCEL(Number value);

    @JsProperty(name="MSGESTURE_FLAG_END")
    Number getMSGESTURE_FLAG_END();

    @JsProperty(name="MSGESTURE_FLAG_END")
    void setMSGESTURE_FLAG_END(Number value);

    @JsProperty(name="MSGESTURE_FLAG_INERTIA")
    Number getMSGESTURE_FLAG_INERTIA();

    @JsProperty(name="MSGESTURE_FLAG_INERTIA")
    void setMSGESTURE_FLAG_INERTIA(Number value);

    @JsProperty(name="MSGESTURE_FLAG_NONE")
    Number getMSGESTURE_FLAG_NONE();

    @JsProperty(name="MSGESTURE_FLAG_NONE")
    void setMSGESTURE_FLAG_NONE(Number value);

    void initGestureEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, Window viewArg, Number detailArg, Number screenXArg, Number screenYArg, Number clientXArg, Number clientYArg, Number offsetXArg, Number offsetYArg, Number translationXArg, Number translationYArg, Number scaleArg, Number expansionArg, Number rotationArg, Number velocityXArg, Number velocityYArg, Number velocityExpansionArg, Number velocityAngularArg, Number hwTimestampArg);
}
