package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;

/**
  * Generated from tests\rxjs\Subscription.d.ts
  * Package rxjs
  * Name ISubscription
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ISubscription extends AnonymousSubscription {
     void unsubscribe();
    @JsProperty(name="closed")
    boolean closed();
    @JsProperty(name="closed")
    void closed(boolean value);
}
