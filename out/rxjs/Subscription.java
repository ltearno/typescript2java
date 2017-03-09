package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.JsFunction;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\Subscription.d.ts
  * Package rxjs
  * Name Subscription
  * Represents a disposable resource, such as the execution of an Observable. A
  * Subscription has one important method, `unsubscribe`, that takes no argument
  * and just disposes the resource held by the subscription.
  * 
  * Additionally, subscriptions may be grouped together through the `add()`
  * method, which will attach a child Subscription to the current Subscription.
  * When a Subscription is unsubscribed, all its children (and its grandchildren)
  * will be unsubscribed as well.
  **/
@JsType( isNative=true, namespace="rxjs" )
public class Subscription extends ISubscription {
    public static Subscription EMPTY;
    public boolean closed;
    public Subscription _parent;
    public JsArray<Subscription> _parents;
    public Object _subscriptions;
    @JsConstructor
    public Subscription(JsFunction<Void> /* optional */ unsubscribe) {}
    public native  void unsubscribe();
    public native  Subscription add(/* NO SYMBOL */TeardownLogic teardown);
    public native  void remove(Subscription subscription);
    public native  void _addParent();
}
