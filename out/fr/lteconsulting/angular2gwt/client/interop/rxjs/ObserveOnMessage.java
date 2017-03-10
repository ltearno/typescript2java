package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import rxjs.Notification;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\operator\observeOn.d.ts
  * Package rxjs
  * Name ObserveOnMessage
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ObserveOnMessage  {
    @JsProperty(name="notification")
    Notification<Object> getNotification();
    @JsProperty(name="notification")
    void setNotification(Notification<Object> value);
    @JsProperty(name="destination")
    /* NO SYMBOL */PartialObserver<Object> getDestination();
    @JsProperty(name="destination")
    void setDestination(/* NO SYMBOL */PartialObserver<Object> value);
    @JsConstructor
    public ObserveOnMessage(Notification<Object> notification,/* NO SYMBOL */PartialObserver<Object> destination) {}
}
