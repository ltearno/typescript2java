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
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface Subscriber<T> extends Observer<T> {
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
    public Subscriber(Object /* UnionType */ /* optional */ destinationOrNext,JsFunction1<Object,Void> /* optional */ error,JsFunction<Void> /* optional */ complete) {}
     void next(T /* optional */ value);
     void error(Object /* optional */ err);
     void complete();
     void unsubscribe();
     void _next(T value);
     void _error(Object err);
     void _complete();
     Subscriber<T> _unsubscribeAndRecycle();
}
