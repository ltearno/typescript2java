package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name AudioProcessingEvent
  * Typescript fqn AudioProcessingEvent
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface AudioProcessingEvent extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="inputBuffer")
    AudioBuffer getInputBuffer();

    @JsProperty(name="inputBuffer")
    void setInputBuffer(AudioBuffer value);

    @JsProperty(name="outputBuffer")
    AudioBuffer getOutputBuffer();

    @JsProperty(name="outputBuffer")
    void setOutputBuffer(AudioBuffer value);

    @JsProperty(name="playbackTime")
    Number getPlaybackTime();

    @JsProperty(name="playbackTime")
    void setPlaybackTime(Number value);
}
