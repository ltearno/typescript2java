package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import rxjs.SubscriptionLog;
import jsinterop.annotations.JsProperty;
import rxjs.Scheduler;

/**
  * Generated from tests\rxjs\testing\SubscriptionLoggable.d.ts
  * Package rxjs
  * Name SubscriptionLoggable
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface SubscriptionLoggable  {
    @JsProperty(name="subscriptions")
    JsArray<SubscriptionLog> getSubscriptions();
    @JsProperty(name="subscriptions")
    void setSubscriptions(JsArray<SubscriptionLog> value);
    @JsProperty(name="scheduler")
    Scheduler getScheduler();
    @JsProperty(name="scheduler")
    void setScheduler(Scheduler value);
     int logSubscribedFrame();
     void logUnsubscribedFrame(int index);
}
