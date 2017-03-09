package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\testing\SubscriptionLog.d.ts
  * Package rxjs
  * Name SubscriptionLog
  * 
  **/
@JsType( isNative=true, namespace="rxjs" )
public class SubscriptionLog  {
    public int subscribedFrame;
    public int unsubscribedFrame;
    @JsConstructor
    public SubscriptionLog(int subscribedFrame,int /* optional */ unsubscribedFrame) {}
}
