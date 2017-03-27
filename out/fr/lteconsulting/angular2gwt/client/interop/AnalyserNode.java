package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name AnalyserNode
  * Typescript fqn AnalyserNode
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface AnalyserNode extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="fftSize")
    Number getFftSize();

    @JsProperty(name="fftSize")
    void setFftSize(Number value);

    @JsProperty(name="frequencyBinCount")
    Number getFrequencyBinCount();

    @JsProperty(name="frequencyBinCount")
    void setFrequencyBinCount(Number value);

    @JsProperty(name="maxDecibels")
    Number getMaxDecibels();

    @JsProperty(name="maxDecibels")
    void setMaxDecibels(Number value);

    @JsProperty(name="minDecibels")
    Number getMinDecibels();

    @JsProperty(name="minDecibels")
    void setMinDecibels(Number value);

    @JsProperty(name="smoothingTimeConstant")
    Number getSmoothingTimeConstant();

    @JsProperty(name="smoothingTimeConstant")
    void setSmoothingTimeConstant(Number value);

    void getByteFrequencyData(Uint8Array array);

    void getByteTimeDomainData(Uint8Array array);

    void getFloatFrequencyData(Float32Array array);

    void getFloatTimeDomainData(Float32Array array);
}
