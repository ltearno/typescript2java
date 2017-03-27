package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name OscillatorNode
  * Typescript fqn OscillatorNode
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface OscillatorNode extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="detune")
    AudioParam getDetune();

    @JsProperty(name="detune")
    void setDetune(AudioParam value);

    @JsProperty(name="frequency")
    AudioParam getFrequency();

    @JsProperty(name="frequency")
    void setFrequency(AudioParam value);

    @JsProperty(name="onended")
    JsFunction2<OscillatorNode,MediaStreamErrorEvent,Object> getOnended();

    @JsProperty(name="onended")
    void setOnended(JsFunction2<OscillatorNode,MediaStreamErrorEvent,Object> value);

    @JsProperty(name="type")
    String getType();

    @JsProperty(name="type")
    void setType(String value);

    void setPeriodicWave(PeriodicWave periodicWave);

    void start(Number /* optional */ when);

    void stop(Number /* optional */ when);

    <K> void addEventListener(K type, JsFunction2<OscillatorNode,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
