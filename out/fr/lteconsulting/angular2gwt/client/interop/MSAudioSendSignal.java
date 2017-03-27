package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MSAudioSendSignal
  * Typescript fqn MSAudioSendSignal
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MSAudioSendSignal {
    /* optional property noiseLevel*/    @JsProperty(name="noiseLevel")
    Number getNoiseLevel();

    @JsProperty(name="noiseLevel")
    void setNoiseLevel(Number value);

    /* optional property sendSignalLevelCh1*/    @JsProperty(name="sendSignalLevelCh1")
    Number getSendSignalLevelCh1();

    @JsProperty(name="sendSignalLevelCh1")
    void setSendSignalLevelCh1(Number value);

    /* optional property sendNoiseLevelCh1*/    @JsProperty(name="sendNoiseLevelCh1")
    Number getSendNoiseLevelCh1();

    @JsProperty(name="sendNoiseLevelCh1")
    void setSendNoiseLevelCh1(Number value);
}
