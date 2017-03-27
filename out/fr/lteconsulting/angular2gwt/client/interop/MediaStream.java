package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MediaStream
  * Typescript fqn MediaStream
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MediaStream extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="active")
    boolean getActive();

    @JsProperty(name="active")
    void setActive(boolean value);

    @JsProperty(name="id")
    String getId();

    @JsProperty(name="id")
    void setId(String value);

    @JsProperty(name="onactive")
    JsFunction2<MediaStream,Event,Object> getOnactive();

    @JsProperty(name="onactive")
    void setOnactive(JsFunction2<MediaStream,Event,Object> value);

    @JsProperty(name="onaddtrack")
    JsFunction2<MediaStream,MediaStreamTrackEvent,Object> getOnaddtrack();

    @JsProperty(name="onaddtrack")
    void setOnaddtrack(JsFunction2<MediaStream,MediaStreamTrackEvent,Object> value);

    @JsProperty(name="oninactive")
    JsFunction2<MediaStream,Event,Object> getOninactive();

    @JsProperty(name="oninactive")
    void setOninactive(JsFunction2<MediaStream,Event,Object> value);

    @JsProperty(name="onremovetrack")
    JsFunction2<MediaStream,MediaStreamTrackEvent,Object> getOnremovetrack();

    @JsProperty(name="onremovetrack")
    void setOnremovetrack(JsFunction2<MediaStream,MediaStreamTrackEvent,Object> value);

    void addTrack(MediaStreamTrack track);

    MediaStream clone();

    JsArray<MediaStreamTrack> getAudioTracks();

    Object /* UnionType */ getTrackById(String trackId);

    JsArray<MediaStreamTrack> getTracks();

    JsArray<MediaStreamTrack> getVideoTracks();

    void removeTrack(MediaStreamTrack track);

    void stop();

    <K> void addEventListener(K type, JsFunction2<MediaStream,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
