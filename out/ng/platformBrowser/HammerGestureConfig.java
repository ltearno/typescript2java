package fr.lteconsulting.angular2gwt.client.interop.ng.platformBrowser;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;

/**
  * Generated from tests\@angular\platform-browser\src\dom\events\hammer_gestures.d.ts
  * Package ng.platformBrowser
  * Name HammerGestureConfig
  * 
  **/
@JsType( isNative=true, namespace="ng.platformBrowser" )
public class HammerGestureConfig  {
    public JsArray<String> events;
    public JsTypedObject<String,Object> overrides;
    public native  HammerInstance buildHammer(HTMLElement element);
}
