package fr.lteconsulting.angular2gwt.client.interop.ng.platformBrowser;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import fr.lteconsulting.angular2gwt.client.JsFunction1;

/**
  * Generated from tests\@angular\platform-browser\src\dom\dom_animate_player.d.ts
  * Package ng.platformBrowser
  * Name DomAnimatePlayer
  * 
  **/
@JsType( isNative=true, name="Object", namespace=JsPackage.GLOBAL )
public class DomAnimatePlayer  {
    public native  void cancel();
    public native  void play();
    public native  void pause();
    public native  void finish();
    public Function onfinish;
    public int position;
    public int currentTime;
    public native  Object addEventListener(String eventName,JsFunction1<Object,Object> handler);
    public native  Object dispatchEvent(String eventName);
}
