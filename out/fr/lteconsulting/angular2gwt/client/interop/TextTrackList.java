package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name TextTrackList
  * Typescript fqn TextTrackList
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface TextTrackList extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="length")
    Number getLength();

    @JsProperty(name="length")
    void setLength(Number value);

    @JsProperty(name="onaddtrack")
    JsFunction2<TextTrackList,TrackEvent,Object> getOnaddtrack();

    @JsProperty(name="onaddtrack")
    void setOnaddtrack(JsFunction2<TextTrackList,TrackEvent,Object> value);

    TextTrack item(Number index);

    <K> void addEventListener(K type, JsFunction2<TextTrackList,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
