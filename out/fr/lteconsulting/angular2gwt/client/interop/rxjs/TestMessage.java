package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import rxjs.Notification;

/**
  * Generated from tests\rxjs\testing\TestMessage.d.ts
  * Package rxjs
  * Name TestMessage
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface TestMessage  {
    @JsProperty(name="frame")
    int frame();
    @JsProperty(name="frame")
    void frame(int value);
    @JsProperty(name="notification")
    Notification<Object> notification();
    @JsProperty(name="notification")
    void notification(Notification<Object> value);
}
