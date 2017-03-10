package fr.lteconsulting.angular2gwt.client.interop.ng.platformBrowser;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import ng.platformBrowser.HammerInstance;

/**
  * Generated from tests\@angular\platform-browser\src\dom\events\hammer_gestures.d.ts
  * Package ng.platformBrowser
  * Name HammerGestureConfig
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface HammerGestureConfig  {
    @JsProperty(name="events")
    JsArray<String> getEvents();
    @JsProperty(name="events")
    void setEvents(JsArray<String> value);
    @JsProperty(name="overrides")
    JsTypedObject<String,Object> getOverrides();
    @JsProperty(name="overrides")
    void setOverrides(JsTypedObject<String,Object> value);
     HammerInstance buildHammer(HTMLElement element);
}
