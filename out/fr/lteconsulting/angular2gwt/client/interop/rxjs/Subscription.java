package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import rxjs.Subscription;
import jsinterop.annotations.JsProperty;
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
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface Subscription extends ISubscription {
    @JsProperty(name="closed")
    boolean getClosed();
    @JsProperty(name="closed")
    void setClosed(boolean value);
    @JsProperty(name="_parent")
    Subscription get_parent();
    @JsProperty(name="_parent")
    void set_parent(Subscription value);
    @JsProperty(name="_parents")
    JsArray<Subscription> get_parents();
    @JsProperty(name="_parents")
    void set_parents(JsArray<Subscription> value);
    @JsProperty(name="_subscriptions")
    Object get_subscriptions();
    @JsProperty(name="_subscriptions")
    void set_subscriptions(Object value);
    @JsConstructor
    public Subscription(JsFunction<Void> /* optional */ unsubscribe) {}
     void unsubscribe();
     Subscription add(/* NO SYMBOL */TeardownLogic teardown);
     void remove(Subscription subscription);
     void _addParent();
}
