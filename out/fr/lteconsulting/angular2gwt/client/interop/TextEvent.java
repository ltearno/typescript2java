package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name TextEvent
  * Typescript fqn TextEvent
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface TextEvent extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="data")
    String getData();

    @JsProperty(name="data")
    void setData(String value);

    @JsProperty(name="inputMethod")
    Number getInputMethod();

    @JsProperty(name="inputMethod")
    void setInputMethod(Number value);

    @JsProperty(name="locale")
    String getLocale();

    @JsProperty(name="locale")
    void setLocale(String value);

    @JsProperty(name="DOM_INPUT_METHOD_DROP")
    Number getDOM_INPUT_METHOD_DROP();

    @JsProperty(name="DOM_INPUT_METHOD_DROP")
    void setDOM_INPUT_METHOD_DROP(Number value);

    @JsProperty(name="DOM_INPUT_METHOD_HANDWRITING")
    Number getDOM_INPUT_METHOD_HANDWRITING();

    @JsProperty(name="DOM_INPUT_METHOD_HANDWRITING")
    void setDOM_INPUT_METHOD_HANDWRITING(Number value);

    @JsProperty(name="DOM_INPUT_METHOD_IME")
    Number getDOM_INPUT_METHOD_IME();

    @JsProperty(name="DOM_INPUT_METHOD_IME")
    void setDOM_INPUT_METHOD_IME(Number value);

    @JsProperty(name="DOM_INPUT_METHOD_KEYBOARD")
    Number getDOM_INPUT_METHOD_KEYBOARD();

    @JsProperty(name="DOM_INPUT_METHOD_KEYBOARD")
    void setDOM_INPUT_METHOD_KEYBOARD(Number value);

    @JsProperty(name="DOM_INPUT_METHOD_MULTIMODAL")
    Number getDOM_INPUT_METHOD_MULTIMODAL();

    @JsProperty(name="DOM_INPUT_METHOD_MULTIMODAL")
    void setDOM_INPUT_METHOD_MULTIMODAL(Number value);

    @JsProperty(name="DOM_INPUT_METHOD_OPTION")
    Number getDOM_INPUT_METHOD_OPTION();

    @JsProperty(name="DOM_INPUT_METHOD_OPTION")
    void setDOM_INPUT_METHOD_OPTION(Number value);

    @JsProperty(name="DOM_INPUT_METHOD_PASTE")
    Number getDOM_INPUT_METHOD_PASTE();

    @JsProperty(name="DOM_INPUT_METHOD_PASTE")
    void setDOM_INPUT_METHOD_PASTE(Number value);

    @JsProperty(name="DOM_INPUT_METHOD_SCRIPT")
    Number getDOM_INPUT_METHOD_SCRIPT();

    @JsProperty(name="DOM_INPUT_METHOD_SCRIPT")
    void setDOM_INPUT_METHOD_SCRIPT(Number value);

    @JsProperty(name="DOM_INPUT_METHOD_UNKNOWN")
    Number getDOM_INPUT_METHOD_UNKNOWN();

    @JsProperty(name="DOM_INPUT_METHOD_UNKNOWN")
    void setDOM_INPUT_METHOD_UNKNOWN(Number value);

    @JsProperty(name="DOM_INPUT_METHOD_VOICE")
    Number getDOM_INPUT_METHOD_VOICE();

    @JsProperty(name="DOM_INPUT_METHOD_VOICE")
    void setDOM_INPUT_METHOD_VOICE(Number value);

    void initTextEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, Window viewArg, String dataArg, Number inputMethod, String locale);
}
