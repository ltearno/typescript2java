package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsFunction1;
import fr.lteconsulting.angular2gwt.client.JsFunction;
import rxjs.Subscriber;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\Subscriber.d.ts
  * Package rxjs
  * Name Subscriber
  * Implements the {@link Observer} interface and extends the
  * {@link Subscription} class. While the {@link Observer} is the public API for
  * consuming the values of an {@link Observable}, all Observers get converted to
  * a Subscriber, in order to provide Subscription-like capabilities such as
  * `unsubscribe`. Subscriber is a common type in RxJS, and crucial for
  * implementing operators, but it is rarely used as a public API.
  **/
@JsType( isNative=true, namespace="rxjs", name="Subscriber" )
public class SubscriberImpl<T> extends Observer<T> {
    public static native <T> Subscriber<T> create(JsFunction1<T,Void> /* optional */ next,JsFunction1<Object,Void> /* optional */ error,JsFunction<Void> /* optional */ complete);
    @JsProperty(name="syncErrorValue")
    Object getSyncErrorValue();
    @JsProperty(name="syncErrorValue")
    void setSyncErrorValue(Object value);
    @JsProperty(name="syncErrorThrown")
    boolean getSyncErrorThrown();
    @JsProperty(name="syncErrorThrown")
    void setSyncErrorThrown(boolean value);
    @JsProperty(name="syncErrorThrowable")
    boolean getSyncErrorThrowable();
    @JsProperty(name="syncErrorThrowable")
    void setSyncErrorThrowable(boolean value);
    @JsProperty(name="isStopped")
    boolean getIsStopped();
    @JsProperty(name="isStopped")
    void setIsStopped(boolean value);
    @JsProperty(name="destination")
    /* NO SYMBOL */PartialObserver<Object> getDestination();
    @JsProperty(name="destination")
    void setDestination(/* NO SYMBOL */PartialObserver<Object> value);
    @JsConstructor
    public SubscriberImpl(Object /* UnionType */ /* optional */ destinationOrNext,JsFunction1<Object,Void> /* optional */ error,JsFunction<Void> /* optional */ complete) {}
    public native  void next(T /* optional */ value);
    public native  void error(Object /* optional */ err);
    public native  void complete();
    public native  void unsubscribe();
    public native  void _next(T value);
    public native  void _error(Object err);
    public native  void _complete();
    public native  Subscriber<T> _unsubscribeAndRecycle();
}
