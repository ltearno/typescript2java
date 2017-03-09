package fr.lteconsulting.angular2gwt.client.interop.ng.platformBrowser;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;

/**
  * Generated from tests\@angular\platform-browser\src\dom\events\hammer_gestures.d.ts
  * Package ng.platformBrowser
  * Name HammerInstance
  * 
  **/
@JsType( isNative=true, name="Object", namespace=JsPackage.GLOBAL )
public class HammerInstance  {
    public native  void on(String eventName,Function callback);
    public native  void off(String eventName,Function callback);
}
