package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\operator\groupBy.d.ts
  * Package rxjs
  * Name GroupedObservable
  * An Observable representing values belonging to the same group represented by
  * a common key. The values emitted by a GroupedObservable come from the source
  * Observable. The common key is available as the field `key` on a
  * GroupedObservable instance.
  **/
@JsType( isNative=true, namespace="rxjs" )
public class GroupedObservable<K,T> extends Observable<T> {
    public K key;
    public Object groupSubject;
    public Object refCountSubscription;
    @JsConstructor
    public GroupedObservable(K key,Subject<T> groupSubject,RefCountSubscription /* optional */ refCountSubscription) {}
    public native  Subscription _subscribe(Subscriber<T> subscriber);
}
