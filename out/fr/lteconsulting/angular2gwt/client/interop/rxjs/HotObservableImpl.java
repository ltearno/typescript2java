package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import rxjs.TestMessage;
import jsinterop.annotations.JsProperty;
import rxjs.SubscriptionLog;
import rxjs.Scheduler;
import fr.lteconsulting.angular2gwt.client.JsFunction;
import fr.lteconsulting.angular2gwt.client.JsFunction1;
import jsinterop.annotations.JsConstructor;
import rxjs.Subscriber;
import rxjs.Subscription;

/**
  * Generated from tests\rxjs\testing\HotObservable.d.ts
  * Package rxjs
  * Name HotObservable
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs", name="HotObservable" )
public class HotObservableImpl<T> extends SubscriptionLoggable {
    @JsProperty(name="messages")
    JsArray<TestMessage> getMessages();
    @JsProperty(name="messages")
    void setMessages(JsArray<TestMessage> value);
    @JsProperty(name="subscriptions")
    JsArray<SubscriptionLog> getSubscriptions();
    @JsProperty(name="subscriptions")
    void setSubscriptions(JsArray<SubscriptionLog> value);
    @JsProperty(name="scheduler")
    Scheduler getScheduler();
    @JsProperty(name="scheduler")
    void setScheduler(Scheduler value);
    @JsProperty(name="logSubscribedFrame")
    JsFunction<Integer> getLogSubscribedFrame();
    @JsProperty(name="logSubscribedFrame")
    void setLogSubscribedFrame(JsFunction<Integer> value);
    @JsProperty(name="logUnsubscribedFrame")
    JsFunction1<Integer,Void> getLogUnsubscribedFrame();
    @JsProperty(name="logUnsubscribedFrame")
    void setLogUnsubscribedFrame(JsFunction1<Integer,Void> value);
    @JsConstructor
    public HotObservableImpl(JsArray<TestMessage> messages,Scheduler scheduler) {}
    public native  Subscription _subscribe(Subscriber<Object> subscriber);
    public native  void setup();
}
