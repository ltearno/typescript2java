package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name GamepadButton
  * Typescript fqn GamepadButton
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface GamepadButton {
    @JsProperty(name="pressed")
    boolean getPressed();

    @JsProperty(name="pressed")
    void setPressed(boolean value);

    @JsProperty(name="value")
    Number getValue();

    @JsProperty(name="value")
    void setValue(Number value);
}
