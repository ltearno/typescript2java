package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.JsFunction;
import fr.lteconsulting.angular2gwt.client.JsFunction1;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\testing\HotObservable.d.ts
  * Package rxjs
  * Name HotObservable
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs" )
public class HotObservable<T> extends SubscriptionLoggable {
    public JsArray<TestMessage> messages;
    public JsArray<SubscriptionLog> subscriptions;
    public Scheduler scheduler;
    public JsFunction<Integer> logSubscribedFrame;
    public JsFunction1<Integer,Void> logUnsubscribedFrame;
    @JsConstructor
    public HotObservable(JsArray<TestMessage> messages,Scheduler scheduler) {}
    public native  Subscription _subscribe(Subscriber<Object> subscriber);
    public native  void setup();
}
