package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MSAudioRecvSignal
  * Typescript fqn MSAudioRecvSignal
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MSAudioRecvSignal {
    /* optional property initialSignalLevelRMS*/    @JsProperty(name="initialSignalLevelRMS")
    Number getInitialSignalLevelRMS();

    @JsProperty(name="initialSignalLevelRMS")
    void setInitialSignalLevelRMS(Number value);

    /* optional property recvSignalLevelCh1*/    @JsProperty(name="recvSignalLevelCh1")
    Number getRecvSignalLevelCh1();

    @JsProperty(name="recvSignalLevelCh1")
    void setRecvSignalLevelCh1(Number value);

    /* optional property recvNoiseLevelCh1*/    @JsProperty(name="recvNoiseLevelCh1")
    Number getRecvNoiseLevelCh1();

    @JsProperty(name="recvNoiseLevelCh1")
    void setRecvNoiseLevelCh1(Number value);

    /* optional property renderSignalLevel*/    @JsProperty(name="renderSignalLevel")
    Number getRenderSignalLevel();

    @JsProperty(name="renderSignalLevel")
    void setRenderSignalLevel(Number value);

    /* optional property renderNoiseLevel*/    @JsProperty(name="renderNoiseLevel")
    Number getRenderNoiseLevel();

    @JsProperty(name="renderNoiseLevel")
    void setRenderNoiseLevel(Number value);

    /* optional property renderLoopbackSignalLevel*/    @JsProperty(name="renderLoopbackSignalLevel")
    Number getRenderLoopbackSignalLevel();

    @JsProperty(name="renderLoopbackSignalLevel")
    void setRenderLoopbackSignalLevel(Number value);
}
