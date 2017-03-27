package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name AudioBuffer
  * Typescript fqn AudioBuffer
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface AudioBuffer {
    @JsProperty(name="duration")
    Number getDuration();

    @JsProperty(name="duration")
    void setDuration(Number value);

    @JsProperty(name="length")
    Number getLength();

    @JsProperty(name="length")
    void setLength(Number value);

    @JsProperty(name="numberOfChannels")
    Number getNumberOfChannels();

    @JsProperty(name="numberOfChannels")
    void setNumberOfChannels(Number value);

    @JsProperty(name="sampleRate")
    Number getSampleRate();

    @JsProperty(name="sampleRate")
    void setSampleRate(Number value);

    void copyFromChannel(Float32Array destination, Number channelNumber, Number /* optional */ startInChannel);

    void copyToChannel(Float32Array source, Number channelNumber, Number /* optional */ startInChannel);

    Float32Array getChannelData(Number channel);
}
