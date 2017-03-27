package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name GamepadEvent
  * Typescript fqn GamepadEvent
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface GamepadEvent extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="gamepad")
    Gamepad getGamepad();

    @JsProperty(name="gamepad")
    void setGamepad(Gamepad value);
}
