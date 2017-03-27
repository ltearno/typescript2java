package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name RTCOfferOptions
  * Typescript fqn RTCOfferOptions
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface RTCOfferOptions {
    /* optional property offerToReceiveVideo*/    @JsProperty(name="offerToReceiveVideo")
    Number getOfferToReceiveVideo();

    @JsProperty(name="offerToReceiveVideo")
    void setOfferToReceiveVideo(Number value);

    /* optional property offerToReceiveAudio*/    @JsProperty(name="offerToReceiveAudio")
    Number getOfferToReceiveAudio();

    @JsProperty(name="offerToReceiveAudio")
    void setOfferToReceiveAudio(Number value);

    /* optional property voiceActivityDetection*/    @JsProperty(name="voiceActivityDetection")
    boolean getVoiceActivityDetection();

    @JsProperty(name="voiceActivityDetection")
    void setVoiceActivityDetection(boolean value);

    /* optional property iceRestart*/    @JsProperty(name="iceRestart")
    boolean getIceRestart();

    @JsProperty(name="iceRestart")
    void setIceRestart(boolean value);
}
