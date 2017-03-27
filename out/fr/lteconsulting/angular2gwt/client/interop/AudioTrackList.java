package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name AudioTrackList
  * Typescript fqn AudioTrackList
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface AudioTrackList extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="length")
    Number getLength();

    @JsProperty(name="length")
    void setLength(Number value);

    @JsProperty(name="onaddtrack")
    JsFunction2<AudioTrackList,TrackEvent,Object> getOnaddtrack();

    @JsProperty(name="onaddtrack")
    void setOnaddtrack(JsFunction2<AudioTrackList,TrackEvent,Object> value);

    @JsProperty(name="onchange")
    JsFunction2<AudioTrackList,Event,Object> getOnchange();

    @JsProperty(name="onchange")
    void setOnchange(JsFunction2<AudioTrackList,Event,Object> value);

    @JsProperty(name="onremovetrack")
    JsFunction2<AudioTrackList,TrackEvent,Object> getOnremovetrack();

    @JsProperty(name="onremovetrack")
    void setOnremovetrack(JsFunction2<AudioTrackList,TrackEvent,Object> value);

    Object /* UnionType */ getTrackById(String id);

    AudioTrack item(Number index);

    <K> void addEventListener(K type, JsFunction2<AudioTrackList,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
