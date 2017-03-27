package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name SpeechSynthesis
  * Typescript fqn SpeechSynthesis
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface SpeechSynthesis extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="onvoiceschanged")
    JsFunction2<SpeechSynthesis,Event,Object> getOnvoiceschanged();

    @JsProperty(name="onvoiceschanged")
    void setOnvoiceschanged(JsFunction2<SpeechSynthesis,Event,Object> value);

    @JsProperty(name="paused")
    boolean getPaused();

    @JsProperty(name="paused")
    void setPaused(boolean value);

    @JsProperty(name="pending")
    boolean getPending();

    @JsProperty(name="pending")
    void setPending(boolean value);

    @JsProperty(name="speaking")
    boolean getSpeaking();

    @JsProperty(name="speaking")
    void setSpeaking(boolean value);

    void cancel();

    JsArray<SpeechSynthesisVoice> getVoices();

    void pause();

    void resume();

    void speak(SpeechSynthesisUtterance utterance);

    <K> void addEventListener(K type, JsFunction2<SpeechSynthesis,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
