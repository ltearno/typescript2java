package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name RTCDtmfSender
  * Typescript fqn RTCDtmfSender
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface RTCDtmfSender extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="canInsertDTMF")
    boolean getCanInsertDTMF();

    @JsProperty(name="canInsertDTMF")
    void setCanInsertDTMF(boolean value);

    @JsProperty(name="duration")
    Number getDuration();

    @JsProperty(name="duration")
    void setDuration(Number value);

    @JsProperty(name="interToneGap")
    Number getInterToneGap();

    @JsProperty(name="interToneGap")
    void setInterToneGap(Number value);

    @JsProperty(name="ontonechange")
    JsFunction2<RTCDtmfSender,RTCDTMFToneChangeEvent,Object> getOntonechange();

    @JsProperty(name="ontonechange")
    void setOntonechange(JsFunction2<RTCDtmfSender,RTCDTMFToneChangeEvent,Object> value);

    @JsProperty(name="sender")
    RTCRtpSender getSender();

    @JsProperty(name="sender")
    void setSender(RTCRtpSender value);

    @JsProperty(name="toneBuffer")
    String getToneBuffer();

    @JsProperty(name="toneBuffer")
    void setToneBuffer(String value);

    void insertDTMF(String tones, Number /* optional */ duration, Number /* optional */ interToneGap);

    <K> void addEventListener(K type, JsFunction2<RTCDtmfSender,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
