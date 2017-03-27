package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name TouchEvent
  * Typescript fqn TouchEvent
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface TouchEvent extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="altKey")
    boolean getAltKey();

    @JsProperty(name="altKey")
    void setAltKey(boolean value);

    @JsProperty(name="changedTouches")
    TouchList getChangedTouches();

    @JsProperty(name="changedTouches")
    void setChangedTouches(TouchList value);

    @JsProperty(name="charCode")
    Number getCharCode();

    @JsProperty(name="charCode")
    void setCharCode(Number value);

    @JsProperty(name="ctrlKey")
    boolean getCtrlKey();

    @JsProperty(name="ctrlKey")
    void setCtrlKey(boolean value);

    @JsProperty(name="keyCode")
    Number getKeyCode();

    @JsProperty(name="keyCode")
    void setKeyCode(Number value);

    @JsProperty(name="metaKey")
    boolean getMetaKey();

    @JsProperty(name="metaKey")
    void setMetaKey(boolean value);

    @JsProperty(name="shiftKey")
    boolean getShiftKey();

    @JsProperty(name="shiftKey")
    void setShiftKey(boolean value);

    @JsProperty(name="targetTouches")
    TouchList getTargetTouches();

    @JsProperty(name="targetTouches")
    void setTargetTouches(TouchList value);

    @JsProperty(name="touches")
    TouchList getTouches();

    @JsProperty(name="touches")
    void setTouches(TouchList value);

    @JsProperty(name="which")
    Number getWhich();

    @JsProperty(name="which")
    void setWhich(Number value);
}
