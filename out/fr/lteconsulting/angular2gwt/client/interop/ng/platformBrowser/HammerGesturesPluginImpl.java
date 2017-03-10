package fr.lteconsulting.angular2gwt.client.interop.ng.platformBrowser;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.platformBrowser.HammerGestureConfig;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\platform-browser\src\dom\events\hammer_gestures.d.ts
  * Package ng.platformBrowser
  * Name HammerGesturesPlugin
  * 
  **/
@JsType( isNative=true, namespace="ng.platformBrowser", name="HammerGesturesPlugin" )
public class HammerGesturesPluginImpl extends EventManagerPlugin {
    @JsProperty(name="_config")
    Object get_config();
    @JsProperty(name="_config")
    void set_config(Object value);
    @JsConstructor
    public HammerGesturesPluginImpl(HammerGestureConfig _config) {}
    public native  boolean supports(String eventName);
    public native  Function addEventListener(HTMLElement element,String eventName,Function handler);
    public native  boolean isCustomEvent(String eventName);
}
