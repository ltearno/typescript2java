package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsFunction1;
import fr.lteconsulting.angular2gwt.client.JsFunction;
import rxjs.Observable;
import rxjs.Notification;

/**
  * Generated from tests\rxjs\Notification.d.ts
  * Package rxjs
  * Name Notification
  * Represents a push-based event or value that an {@link Observable} can emit.
  * This class is particularly useful for operators that manage notifications,
  * like {@link materialize}, {@link dematerialize}, {@link observeOn}, and
  * others. Besides wrapping the actual delivered value, it also annotates it
  * with metadata of, for instance, what type of push message it is (`next`,
  * `error`, or `complete`).
  **/
@JsType( isNative=true, namespace="rxjs", name="Notification" )
public class NotificationImpl<T>  {
    @JsProperty(name="kind")
    String getKind();
    @JsProperty(name="kind")
    void setKind(String value);
    @JsProperty(name="value")
    T getValue();
    @JsProperty(name="value")
    void setValue(T value);
    @JsProperty(name="error")
    Object getError();
    @JsProperty(name="error")
    void setError(Object value);
    @JsProperty(name="hasValue")
    boolean getHasValue();
    @JsProperty(name="hasValue")
    void setHasValue(boolean value);
    @JsConstructor
    public NotificationImpl(String kind,T /* optional */ value,Object /* optional */ error) {}
    public native  Object observe(/* NO SYMBOL */PartialObserver<T> observer);
    public native  Object do(JsFunction1<T,Void> next,JsFunction1<Object,Void> /* optional */ error,JsFunction<Void> /* optional */ complete);
    public native  Object accept(Object /* UnionType */ nextOrObserver,JsFunction1<Object,Void> /* optional */ error,JsFunction<Void> /* optional */ complete);
    public native  Observable<T> toObservable();
    @JsProperty(name="completeNotification")
    static Object getCompleteNotification();
    @JsProperty(name="completeNotification")
    static void setCompleteNotification(Object value);
    @JsProperty(name="undefinedValueNotification")
    static Object getUndefinedValueNotification();
    @JsProperty(name="undefinedValueNotification")
    static void setUndefinedValueNotification(Object value);
    public static native <T> Notification<T> createNext(T value);
    public static native <T> Notification<T> createError(Object /* optional */ err);
    public static native  Notification<Object> createComplete();
}
