package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name SpeechSynthesisVoice
  * Typescript fqn SpeechSynthesisVoice
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface SpeechSynthesisVoice {
    @JsProperty(name="default")
    boolean getDefault();

    @JsProperty(name="default")
    void setDefault(boolean value);

    @JsProperty(name="lang")
    String getLang();

    @JsProperty(name="lang")
    void setLang(String value);

    @JsProperty(name="localService")
    boolean getLocalService();

    @JsProperty(name="localService")
    void setLocalService(boolean value);

    @JsProperty(name="name")
    String getName();

    @JsProperty(name="name")
    void setName(String value);

    @JsProperty(name="voiceURI")
    String getVoiceURI();

    @JsProperty(name="voiceURI")
    void setVoiceURI(String value);
}
