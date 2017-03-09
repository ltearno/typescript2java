package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;

/**
  * Generated from tests\rxjs\Subscription.d.ts
  * Package rxjs
  * Name ISubscription
  * 
  **/
@JsType( isNative=true, name="Object", namespace=JsPackage.GLOBAL )
public class ISubscription extends AnonymousSubscription {
    public native  void unsubscribe();
    public boolean closed;
}
