package fr.lteconsulting.angular2gwt.client.interop.ng.platformBrowser;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\platform-browser\src\dom\events\hammer_gestures.d.ts
  * Package ng.platformBrowser
  * Name HammerGesturesPlugin
  * 
  **/
@JsType( isNative=true, namespace="ng.platformBrowser" )
public class HammerGesturesPlugin extends EventManagerPlugin {
    public Object _config;
    @JsConstructor
    public HammerGesturesPlugin(HammerGestureConfig _config) {}
    public native  boolean supports(String eventName);
    public native  Function addEventListener(HTMLElement element,String eventName,Function handler);
    public native  boolean isCustomEvent(String eventName);
}
