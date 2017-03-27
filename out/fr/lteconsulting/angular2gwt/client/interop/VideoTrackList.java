package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name VideoTrackList
  * Typescript fqn VideoTrackList
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface VideoTrackList extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="length")
    Number getLength();

    @JsProperty(name="length")
    void setLength(Number value);

    @JsProperty(name="onaddtrack")
    JsFunction2<VideoTrackList,TrackEvent,Object> getOnaddtrack();

    @JsProperty(name="onaddtrack")
    void setOnaddtrack(JsFunction2<VideoTrackList,TrackEvent,Object> value);

    @JsProperty(name="onchange")
    JsFunction2<VideoTrackList,Event,Object> getOnchange();

    @JsProperty(name="onchange")
    void setOnchange(JsFunction2<VideoTrackList,Event,Object> value);

    @JsProperty(name="onremovetrack")
    JsFunction2<VideoTrackList,TrackEvent,Object> getOnremovetrack();

    @JsProperty(name="onremovetrack")
    void setOnremovetrack(JsFunction2<VideoTrackList,TrackEvent,Object> value);

    @JsProperty(name="selectedIndex")
    Number getSelectedIndex();

    @JsProperty(name="selectedIndex")
    void setSelectedIndex(Number value);

    Object /* UnionType */ getTrackById(String id);

    VideoTrack item(Number index);

    <K> void addEventListener(K type, JsFunction2<VideoTrackList,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
