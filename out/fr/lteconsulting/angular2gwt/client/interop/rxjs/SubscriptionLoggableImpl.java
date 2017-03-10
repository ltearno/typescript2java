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
@JsType( isNative=true, namespace="rxjs", name="SubscriptionLoggable" )
public class SubscriptionLoggableImpl  {
    @JsProperty(name="subscriptions")
    JsArray<SubscriptionLog> getSubscriptions();
    @JsProperty(name="subscriptions")
    void setSubscriptions(JsArray<SubscriptionLog> value);
    @JsProperty(name="scheduler")
    Scheduler getScheduler();
    @JsProperty(name="scheduler")
    void setScheduler(Scheduler value);
    public native  int logSubscribedFrame();
    public native  void logUnsubscribedFrame(int index);
}
