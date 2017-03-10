package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\testing\SubscriptionLog.d.ts
  * Package rxjs
  * Name SubscriptionLog
  * 
  **/
@JsType( isNative=true, namespace="rxjs", name="SubscriptionLog" )
public class SubscriptionLogImpl  {
    @JsProperty(name="subscribedFrame")
    int getSubscribedFrame();
    @JsProperty(name="subscribedFrame")
    void setSubscribedFrame(int value);
    @JsProperty(name="unsubscribedFrame")
    int getUnsubscribedFrame();
    @JsProperty(name="unsubscribedFrame")
    void setUnsubscribedFrame(int value);
    @JsConstructor
    public SubscriptionLogImpl(int subscribedFrame,int /* optional */ unsubscribedFrame) {}
}
