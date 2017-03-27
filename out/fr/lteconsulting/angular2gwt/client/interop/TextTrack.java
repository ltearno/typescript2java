package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name TextTrack
  * Typescript fqn TextTrack
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface TextTrack extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="activeCues")
    TextTrackCueList getActiveCues();

    @JsProperty(name="activeCues")
    void setActiveCues(TextTrackCueList value);

    @JsProperty(name="cues")
    TextTrackCueList getCues();

    @JsProperty(name="cues")
    void setCues(TextTrackCueList value);

    @JsProperty(name="inBandMetadataTrackDispatchType")
    String getInBandMetadataTrackDispatchType();

    @JsProperty(name="inBandMetadataTrackDispatchType")
    void setInBandMetadataTrackDispatchType(String value);

    @JsProperty(name="kind")
    String getKind();

    @JsProperty(name="kind")
    void setKind(String value);

    @JsProperty(name="label")
    String getLabel();

    @JsProperty(name="label")
    void setLabel(String value);

    @JsProperty(name="language")
    String getLanguage();

    @JsProperty(name="language")
    void setLanguage(String value);

    @JsProperty(name="mode")
    Object getMode();

    @JsProperty(name="mode")
    void setMode(Object value);

    @JsProperty(name="oncuechange")
    JsFunction2<TextTrack,Event,Object> getOncuechange();

    @JsProperty(name="oncuechange")
    void setOncuechange(JsFunction2<TextTrack,Event,Object> value);

    @JsProperty(name="onerror")
    JsFunction2<TextTrack,Event,Object> getOnerror();

    @JsProperty(name="onerror")
    void setOnerror(JsFunction2<TextTrack,Event,Object> value);

    @JsProperty(name="onload")
    JsFunction2<TextTrack,Event,Object> getOnload();

    @JsProperty(name="onload")
    void setOnload(JsFunction2<TextTrack,Event,Object> value);

    @JsProperty(name="readyState")
    Number getReadyState();

    @JsProperty(name="readyState")
    void setReadyState(Number value);

    @JsProperty(name="DISABLED")
    Number getDISABLED();

    @JsProperty(name="DISABLED")
    void setDISABLED(Number value);

    @JsProperty(name="ERROR")
    Number getERROR();

    @JsProperty(name="ERROR")
    void setERROR(Number value);

    @JsProperty(name="HIDDEN")
    Number getHIDDEN();

    @JsProperty(name="HIDDEN")
    void setHIDDEN(Number value);

    @JsProperty(name="LOADED")
    Number getLOADED();

    @JsProperty(name="LOADED")
    void setLOADED(Number value);

    @JsProperty(name="LOADING")
    Number getLOADING();

    @JsProperty(name="LOADING")
    void setLOADING(Number value);

    @JsProperty(name="NONE")
    Number getNONE();

    @JsProperty(name="NONE")
    void setNONE(Number value);

    @JsProperty(name="SHOWING")
    Number getSHOWING();

    @JsProperty(name="SHOWING")
    void setSHOWING(Number value);

    void addCue(TextTrackCue cue);

    void removeCue(TextTrackCue cue);

    <K> void addEventListener(K type, JsFunction2<TextTrack,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
