package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name SourceBuffer
  * Typescript fqn SourceBuffer
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface SourceBuffer extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="appendWindowEnd")
    Number getAppendWindowEnd();

    @JsProperty(name="appendWindowEnd")
    void setAppendWindowEnd(Number value);

    @JsProperty(name="appendWindowStart")
    Number getAppendWindowStart();

    @JsProperty(name="appendWindowStart")
    void setAppendWindowStart(Number value);

    @JsProperty(name="audioTracks")
    AudioTrackList getAudioTracks();

    @JsProperty(name="audioTracks")
    void setAudioTracks(AudioTrackList value);

    @JsProperty(name="buffered")
    TimeRanges getBuffered();

    @JsProperty(name="buffered")
    void setBuffered(TimeRanges value);

    @JsProperty(name="mode")
    String getMode();

    @JsProperty(name="mode")
    void setMode(String value);

    @JsProperty(name="timestampOffset")
    Number getTimestampOffset();

    @JsProperty(name="timestampOffset")
    void setTimestampOffset(Number value);

    @JsProperty(name="updating")
    boolean getUpdating();

    @JsProperty(name="updating")
    void setUpdating(boolean value);

    @JsProperty(name="videoTracks")
    VideoTrackList getVideoTracks();

    @JsProperty(name="videoTracks")
    void setVideoTracks(VideoTrackList value);

    void abort();

    void appendBuffer(Object /* UnionType */ data);

    void appendStream(MSStream stream, Number /* optional */ maxSize);

    void remove(Number start, Number end);
}
