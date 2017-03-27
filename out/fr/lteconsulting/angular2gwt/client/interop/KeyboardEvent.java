package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name KeyboardEvent
  * Typescript fqn KeyboardEvent
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface KeyboardEvent extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="altKey")
    boolean getAltKey();

    @JsProperty(name="altKey")
    void setAltKey(boolean value);

    @JsProperty(name="char")
    String getChar();

    @JsProperty(name="char")
    void setChar(String value);

    @JsProperty(name="charCode")
    Number getCharCode();

    @JsProperty(name="charCode")
    void setCharCode(Number value);

    @JsProperty(name="ctrlKey")
    boolean getCtrlKey();

    @JsProperty(name="ctrlKey")
    void setCtrlKey(boolean value);

    @JsProperty(name="key")
    String getKey();

    @JsProperty(name="key")
    void setKey(String value);

    @JsProperty(name="keyCode")
    Number getKeyCode();

    @JsProperty(name="keyCode")
    void setKeyCode(Number value);

    @JsProperty(name="locale")
    String getLocale();

    @JsProperty(name="locale")
    void setLocale(String value);

    @JsProperty(name="location")
    Number getLocation();

    @JsProperty(name="location")
    void setLocation(Number value);

    @JsProperty(name="metaKey")
    boolean getMetaKey();

    @JsProperty(name="metaKey")
    void setMetaKey(boolean value);

    @JsProperty(name="repeat")
    boolean getRepeat();

    @JsProperty(name="repeat")
    void setRepeat(boolean value);

    @JsProperty(name="shiftKey")
    boolean getShiftKey();

    @JsProperty(name="shiftKey")
    void setShiftKey(boolean value);

    @JsProperty(name="which")
    Number getWhich();

    @JsProperty(name="which")
    void setWhich(Number value);

    @JsProperty(name="code")
    String getCode();

    @JsProperty(name="code")
    void setCode(String value);

    @JsProperty(name="DOM_KEY_LOCATION_JOYSTICK")
    Number getDOM_KEY_LOCATION_JOYSTICK();

    @JsProperty(name="DOM_KEY_LOCATION_JOYSTICK")
    void setDOM_KEY_LOCATION_JOYSTICK(Number value);

    @JsProperty(name="DOM_KEY_LOCATION_LEFT")
    Number getDOM_KEY_LOCATION_LEFT();

    @JsProperty(name="DOM_KEY_LOCATION_LEFT")
    void setDOM_KEY_LOCATION_LEFT(Number value);

    @JsProperty(name="DOM_KEY_LOCATION_MOBILE")
    Number getDOM_KEY_LOCATION_MOBILE();

    @JsProperty(name="DOM_KEY_LOCATION_MOBILE")
    void setDOM_KEY_LOCATION_MOBILE(Number value);

    @JsProperty(name="DOM_KEY_LOCATION_NUMPAD")
    Number getDOM_KEY_LOCATION_NUMPAD();

    @JsProperty(name="DOM_KEY_LOCATION_NUMPAD")
    void setDOM_KEY_LOCATION_NUMPAD(Number value);

    @JsProperty(name="DOM_KEY_LOCATION_RIGHT")
    Number getDOM_KEY_LOCATION_RIGHT();

    @JsProperty(name="DOM_KEY_LOCATION_RIGHT")
    void setDOM_KEY_LOCATION_RIGHT(Number value);

    @JsProperty(name="DOM_KEY_LOCATION_STANDARD")
    Number getDOM_KEY_LOCATION_STANDARD();

    @JsProperty(name="DOM_KEY_LOCATION_STANDARD")
    void setDOM_KEY_LOCATION_STANDARD(Number value);

    boolean getModifierState(String keyArg);

    void initKeyboardEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, Window viewArg, String keyArg, Number locationArg, String modifiersListArg, boolean repeat, String locale);
}
