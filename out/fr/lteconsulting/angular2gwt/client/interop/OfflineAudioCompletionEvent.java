package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name OfflineAudioCompletionEvent
  * Typescript fqn OfflineAudioCompletionEvent
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface OfflineAudioCompletionEvent extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="renderedBuffer")
    AudioBuffer getRenderedBuffer();

    @JsProperty(name="renderedBuffer")
    void setRenderedBuffer(AudioBuffer value);
}
