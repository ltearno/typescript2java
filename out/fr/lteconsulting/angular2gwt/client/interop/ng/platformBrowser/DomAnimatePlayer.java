package fr.lteconsulting.angular2gwt.client.interop.ng.platformBrowser;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsFunction1;

/**
  * Generated from tests\@angular\platform-browser\src\dom\dom_animate_player.d.ts
  * Package ng.platformBrowser
  * Name DomAnimatePlayer
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface DomAnimatePlayer  {
     void cancel();
     void play();
     void pause();
     void finish();
    @JsProperty(name="onfinish")
    Function onfinish();
    @JsProperty(name="onfinish")
    void onfinish(Function value);
    @JsProperty(name="position")
    int position();
    @JsProperty(name="position")
    void position(int value);
    @JsProperty(name="currentTime")
    int currentTime();
    @JsProperty(name="currentTime")
    void currentTime(int value);
     Object addEventListener(String eventName,JsFunction1<Object,Object> handler);
     Object dispatchEvent(String eventName);
}
