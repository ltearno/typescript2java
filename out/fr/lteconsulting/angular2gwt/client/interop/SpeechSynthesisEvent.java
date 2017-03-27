package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name SpeechSynthesisEvent
  * Typescript fqn SpeechSynthesisEvent
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface SpeechSynthesisEvent extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="charIndex")
    Number getCharIndex();

    @JsProperty(name="charIndex")
    void setCharIndex(Number value);

    @JsProperty(name="elapsedTime")
    Number getElapsedTime();

    @JsProperty(name="elapsedTime")
    void setElapsedTime(Number value);

    @JsProperty(name="name")
    String getName();

    @JsProperty(name="name")
    void setName(String value);

    @JsProperty(name="utterance")
    SpeechSynthesisUtterance getUtterance();

    @JsProperty(name="utterance")
    void setUtterance(SpeechSynthesisUtterance value);
}
