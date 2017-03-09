package fr.lteconsulting.angular2gwt.client.interop.ng.platformBrowser;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import ng.core.NgZone;

/**
  * Generated from tests\@angular\platform-browser\src\dom\events\key_events.d.ts
  * Package ng.platformBrowser
  * Name KeyEventsPlugin
  * 
  **/
@JsType( isNative=true, namespace="ng.platformBrowser" )
public class KeyEventsPlugin extends EventManagerPlugin {
    @JsConstructor
    public KeyEventsPlugin() {}
    public native  boolean supports(String eventName);
    public native  Function addEventListener(HTMLElement element,String eventName,Function handler);
    public static native  JsTypedObject<String,String> parseEventName(String eventName);
    public static native  String getEventFullKey(KeyboardEvent event);
    public static native  Function eventCallback(Object fullKey,Function handler,NgZone zone);
}
