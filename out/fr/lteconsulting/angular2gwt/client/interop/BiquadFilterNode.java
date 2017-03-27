package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name BiquadFilterNode
  * Typescript fqn BiquadFilterNode
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface BiquadFilterNode extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="Q")
    AudioParam getQ();

    @JsProperty(name="Q")
    void setQ(AudioParam value);

    @JsProperty(name="detune")
    AudioParam getDetune();

    @JsProperty(name="detune")
    void setDetune(AudioParam value);

    @JsProperty(name="frequency")
    AudioParam getFrequency();

    @JsProperty(name="frequency")
    void setFrequency(AudioParam value);

    @JsProperty(name="gain")
    AudioParam getGain();

    @JsProperty(name="gain")
    void setGain(AudioParam value);

    @JsProperty(name="type")
    String getType();

    @JsProperty(name="type")
    void setType(String value);

    void getFrequencyResponse(Float32Array frequencyHz, Float32Array magResponse, Float32Array phaseResponse);
}
