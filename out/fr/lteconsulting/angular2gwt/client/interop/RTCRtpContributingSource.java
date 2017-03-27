package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name RTCRtpContributingSource
  * Typescript fqn RTCRtpContributingSource
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface RTCRtpContributingSource {
    /* optional property timestamp*/    @JsProperty(name="timestamp")
    Number getTimestamp();

    @JsProperty(name="timestamp")
    void setTimestamp(Number value);

    /* optional property csrc*/    @JsProperty(name="csrc")
    Number getCsrc();

    @JsProperty(name="csrc")
    void setCsrc(Number value);

    /* optional property audioLevel*/    @JsProperty(name="audioLevel")
    Number getAudioLevel();

    @JsProperty(name="audioLevel")
    void setAudioLevel(Number value);
}
