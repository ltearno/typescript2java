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
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface HammerGesturesPlugin extends EventManagerPlugin {
    @JsProperty(name="_config")
    Object get_config();
    @JsProperty(name="_config")
    void set_config(Object value);
    @JsConstructor
    public HammerGesturesPlugin(HammerGestureConfig _config) {}
     boolean supports(String eventName);
     Function addEventListener(HTMLElement element,String eventName,Function handler);
     boolean isCustomEvent(String eventName);
}
