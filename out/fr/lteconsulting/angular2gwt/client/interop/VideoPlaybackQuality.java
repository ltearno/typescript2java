package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name VideoPlaybackQuality
  * Typescript fqn VideoPlaybackQuality
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface VideoPlaybackQuality {
    @JsProperty(name="corruptedVideoFrames")
    Number getCorruptedVideoFrames();

    @JsProperty(name="corruptedVideoFrames")
    void setCorruptedVideoFrames(Number value);

    @JsProperty(name="creationTime")
    Number getCreationTime();

    @JsProperty(name="creationTime")
    void setCreationTime(Number value);

    @JsProperty(name="droppedVideoFrames")
    Number getDroppedVideoFrames();

    @JsProperty(name="droppedVideoFrames")
    void setDroppedVideoFrames(Number value);

    @JsProperty(name="totalFrameDelay")
    Number getTotalFrameDelay();

    @JsProperty(name="totalFrameDelay")
    void setTotalFrameDelay(Number value);

    @JsProperty(name="totalVideoFrames")
    Number getTotalVideoFrames();

    @JsProperty(name="totalVideoFrames")
    void setTotalVideoFrames(Number value);
}
