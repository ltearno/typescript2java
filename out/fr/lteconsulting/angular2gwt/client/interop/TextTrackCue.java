package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name TextTrackCue
  * Typescript fqn TextTrackCue
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface TextTrackCue extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="endTime")
    Number getEndTime();

    @JsProperty(name="endTime")
    void setEndTime(Number value);

    @JsProperty(name="id")
    String getId();

    @JsProperty(name="id")
    void setId(String value);

    @JsProperty(name="onenter")
    JsFunction2<TextTrackCue,Event,Object> getOnenter();

    @JsProperty(name="onenter")
    void setOnenter(JsFunction2<TextTrackCue,Event,Object> value);

    @JsProperty(name="onexit")
    JsFunction2<TextTrackCue,Event,Object> getOnexit();

    @JsProperty(name="onexit")
    void setOnexit(JsFunction2<TextTrackCue,Event,Object> value);

    @JsProperty(name="pauseOnExit")
    boolean getPauseOnExit();

    @JsProperty(name="pauseOnExit")
    void setPauseOnExit(boolean value);

    @JsProperty(name="startTime")
    Number getStartTime();

    @JsProperty(name="startTime")
    void setStartTime(Number value);

    @JsProperty(name="text")
    String getText();

    @JsProperty(name="text")
    void setText(String value);

    @JsProperty(name="track")
    TextTrack getTrack();

    @JsProperty(name="track")
    void setTrack(TextTrack value);

    DocumentFragment getCueAsHTML();

    <K> void addEventListener(K type, JsFunction2<TextTrackCue,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
