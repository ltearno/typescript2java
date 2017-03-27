package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name AudioNode
  * Typescript fqn AudioNode
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface AudioNode extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="channelCount")
    Number getChannelCount();

    @JsProperty(name="channelCount")
    void setChannelCount(Number value);

    @JsProperty(name="channelCountMode")
    String getChannelCountMode();

    @JsProperty(name="channelCountMode")
    void setChannelCountMode(String value);

    @JsProperty(name="channelInterpretation")
    String getChannelInterpretation();

    @JsProperty(name="channelInterpretation")
    void setChannelInterpretation(String value);

    @JsProperty(name="context")
    AudioContext getContext();

    @JsProperty(name="context")
    void setContext(AudioContext value);

    @JsProperty(name="numberOfInputs")
    Number getNumberOfInputs();

    @JsProperty(name="numberOfInputs")
    void setNumberOfInputs(Number value);

    @JsProperty(name="numberOfOutputs")
    Number getNumberOfOutputs();

    @JsProperty(name="numberOfOutputs")
    void setNumberOfOutputs(Number value);

    AudioNode connect(AudioNode destination, Number /* optional */ output, Number /* optional */ input);

    void disconnect(Number /* optional */ output);

    void disconnect(AudioNode destination, Number /* optional */ output, Number /* optional */ input);

    void disconnect(AudioParam destination, Number /* optional */ output);
}
