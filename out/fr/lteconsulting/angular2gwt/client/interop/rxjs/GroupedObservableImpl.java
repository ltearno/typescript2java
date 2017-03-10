package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import rxjs.Subject;
import rxjs.RefCountSubscription;
import jsinterop.annotations.JsConstructor;
import rxjs.Subscriber;
import rxjs.Subscription;

/**
  * Generated from tests\rxjs\operator\groupBy.d.ts
  * Package rxjs
  * Name GroupedObservable
  * An Observable representing values belonging to the same group represented by
  * a common key. The values emitted by a GroupedObservable come from the source
  * Observable. The common key is available as the field `key` on a
  * GroupedObservable instance.
  **/
@JsType( isNative=true, namespace="rxjs", name="GroupedObservable" )
public class GroupedObservableImpl<K,T> extends Observable<T> {
    @JsProperty(name="key")
    K getKey();
    @JsProperty(name="key")
    void setKey(K value);
    @JsProperty(name="groupSubject")
    Object getGroupSubject();
    @JsProperty(name="groupSubject")
    void setGroupSubject(Object value);
    @JsProperty(name="refCountSubscription")
    Object getRefCountSubscription();
    @JsProperty(name="refCountSubscription")
    void setRefCountSubscription(Object value);
    @JsConstructor
    public GroupedObservableImpl(K key,Subject<T> groupSubject,RefCountSubscription /* optional */ refCountSubscription) {}
    public native  Subscription _subscribe(Subscriber<T> subscriber);
}
