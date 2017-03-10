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
@JsType( isNative=true, namespace="ng.platformBrowser", name="HammerGestureConfig" )
public class HammerGestureConfigImpl  {
    @JsProperty(name="events")
    JsArray<String> getEvents();
    @JsProperty(name="events")
    void setEvents(JsArray<String> value);
    @JsProperty(name="overrides")
    JsTypedObject<String,Object> getOverrides();
    @JsProperty(name="overrides")
    void setOverrides(JsTypedObject<String,Object> value);
    public native  HammerInstance buildHammer(HTMLElement element);
}
