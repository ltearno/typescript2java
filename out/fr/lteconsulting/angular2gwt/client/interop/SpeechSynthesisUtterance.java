package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name SpeechSynthesisUtterance
  * Typescript fqn SpeechSynthesisUtterance
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface SpeechSynthesisUtterance extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="lang")
    String getLang();

    @JsProperty(name="lang")
    void setLang(String value);

    @JsProperty(name="onboundary")
    JsFunction2<SpeechSynthesisUtterance,Event,Object> getOnboundary();

    @JsProperty(name="onboundary")
    void setOnboundary(JsFunction2<SpeechSynthesisUtterance,Event,Object> value);

    @JsProperty(name="onend")
    JsFunction2<SpeechSynthesisUtterance,Event,Object> getOnend();

    @JsProperty(name="onend")
    void setOnend(JsFunction2<SpeechSynthesisUtterance,Event,Object> value);

    @JsProperty(name="onerror")
    JsFunction2<SpeechSynthesisUtterance,Event,Object> getOnerror();

    @JsProperty(name="onerror")
    void setOnerror(JsFunction2<SpeechSynthesisUtterance,Event,Object> value);

    @JsProperty(name="onmark")
    JsFunction2<SpeechSynthesisUtterance,Event,Object> getOnmark();

    @JsProperty(name="onmark")
    void setOnmark(JsFunction2<SpeechSynthesisUtterance,Event,Object> value);

    @JsProperty(name="onpause")
    JsFunction2<SpeechSynthesisUtterance,Event,Object> getOnpause();

    @JsProperty(name="onpause")
    void setOnpause(JsFunction2<SpeechSynthesisUtterance,Event,Object> value);

    @JsProperty(name="onresume")
    JsFunction2<SpeechSynthesisUtterance,Event,Object> getOnresume();

    @JsProperty(name="onresume")
    void setOnresume(JsFunction2<SpeechSynthesisUtterance,Event,Object> value);

    @JsProperty(name="onstart")
    JsFunction2<SpeechSynthesisUtterance,Event,Object> getOnstart();

    @JsProperty(name="onstart")
    void setOnstart(JsFunction2<SpeechSynthesisUtterance,Event,Object> value);

    @JsProperty(name="pitch")
    Number getPitch();

    @JsProperty(name="pitch")
    void setPitch(Number value);

    @JsProperty(name="rate")
    Number getRate();

    @JsProperty(name="rate")
    void setRate(Number value);

    @JsProperty(name="text")
    String getText();

    @JsProperty(name="text")
    void setText(String value);

    @JsProperty(name="voice")
    SpeechSynthesisVoice getVoice();

    @JsProperty(name="voice")
    void setVoice(SpeechSynthesisVoice value);

    @JsProperty(name="volume")
    Number getVolume();

    @JsProperty(name="volume")
    void setVolume(Number value);

    <K> void addEventListener(K type, JsFunction2<SpeechSynthesisUtterance,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
