package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name AudioBufferSourceNode
  * Typescript fqn AudioBufferSourceNode
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface AudioBufferSourceNode extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="buffer")
    AudioBuffer getBuffer();

    @JsProperty(name="buffer")
    void setBuffer(AudioBuffer value);

    @JsProperty(name="detune")
    AudioParam getDetune();

    @JsProperty(name="detune")
    void setDetune(AudioParam value);

    @JsProperty(name="loop")
    boolean getLoop();

    @JsProperty(name="loop")
    void setLoop(boolean value);

    @JsProperty(name="loopEnd")
    Number getLoopEnd();

    @JsProperty(name="loopEnd")
    void setLoopEnd(Number value);

    @JsProperty(name="loopStart")
    Number getLoopStart();

    @JsProperty(name="loopStart")
    void setLoopStart(Number value);

    @JsProperty(name="onended")
    JsFunction2<AudioBufferSourceNode,MediaStreamErrorEvent,Object> getOnended();

    @JsProperty(name="onended")
    void setOnended(JsFunction2<AudioBufferSourceNode,MediaStreamErrorEvent,Object> value);

    @JsProperty(name="playbackRate")
    AudioParam getPlaybackRate();

    @JsProperty(name="playbackRate")
    void setPlaybackRate(AudioParam value);

    void start(Number /* optional */ when, Number /* optional */ offset, Number /* optional */ duration);

    void stop(Number /* optional */ when);

    <K> void addEventListener(K type, JsFunction2<AudioBufferSourceNode,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
