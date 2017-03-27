package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MediaStreamTrackEvent
  * Typescript fqn MediaStreamTrackEvent
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MediaStreamTrackEvent extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="track")
    MediaStreamTrack getTrack();

    @JsProperty(name="track")
    void setTrack(MediaStreamTrack value);
}
