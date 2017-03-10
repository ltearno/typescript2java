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
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface KeyEventsPlugin extends EventManagerPlugin {
    @JsConstructor
    public KeyEventsPlugin() {}
     boolean supports(String eventName);
     Function addEventListener(HTMLElement element,String eventName,Function handler);
}
