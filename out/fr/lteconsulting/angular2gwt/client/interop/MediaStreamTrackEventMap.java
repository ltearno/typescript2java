package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MediaStreamTrackEventMap
  * Typescript fqn MediaStreamTrackEventMap
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MediaStreamTrackEventMap {
    @JsProperty(name="ended")
    MediaStreamErrorEvent getEnded();

    @JsProperty(name="ended")
    void setEnded(MediaStreamErrorEvent value);

    @JsProperty(name="mute")
    Event getMute();

    @JsProperty(name="mute")
    void setMute(Event value);

    @JsProperty(name="overconstrained")
    MediaStreamErrorEvent getOverconstrained();

    @JsProperty(name="overconstrained")
    void setOverconstrained(MediaStreamErrorEvent value);

    @JsProperty(name="unmute")
    Event getUnmute();

    @JsProperty(name="unmute")
    void setUnmute(Event value);
}
