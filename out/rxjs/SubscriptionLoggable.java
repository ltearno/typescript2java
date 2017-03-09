package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\rxjs\testing\SubscriptionLoggable.d.ts
  * Package rxjs
  * Name SubscriptionLoggable
  * 
  **/
@JsType( isNative=true, namespace="rxjs" )
public class SubscriptionLoggable  {
    public JsArray<SubscriptionLog> subscriptions;
    public Scheduler scheduler;
    public native  int logSubscribedFrame();
    public native  void logUnsubscribedFrame(int index);
}
