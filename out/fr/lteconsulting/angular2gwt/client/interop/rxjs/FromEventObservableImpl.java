package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import rxjs.Observable;
import jsinterop.annotations.JsConstructor;
import rxjs.Subscriber;

/**
  * Generated from tests\rxjs\observable\FromEventObservable.d.ts
  * Package rxjs
  * Name FromEventObservable
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs", name="FromEventObservable" )
public class FromEventObservableImpl<T> extends Observable<T> {
    @JsProperty(name="sourceObj")
    Object getSourceObj();
    @JsProperty(name="sourceObj")
    void setSourceObj(Object value);
    @JsProperty(name="eventName")
    Object getEventName();
    @JsProperty(name="eventName")
    void setEventName(Object value);
    @JsProperty(name="selector")
    Object getSelector();
    @JsProperty(name="selector")
    void setSelector(Object value);
    @JsProperty(name="options")
    Object getOptions();
    @JsProperty(name="options")
    void setOptions(Object value);
    public static native <T> Observable<T> create(/* NO SYMBOL */EventTargetLike target,String eventName);
    public static native <T> Observable<T> create(/* NO SYMBOL */EventTargetLike target,String eventName,SelectorMethodSignature<T> selector);
    public static native <T> Observable<T> create(/* NO SYMBOL */EventTargetLike target,String eventName,/* NO SYMBOL */EventListenerOptions options);
    public static native <T> Observable<T> create(/* NO SYMBOL */EventTargetLike target,String eventName,/* NO SYMBOL */EventListenerOptions options,SelectorMethodSignature<T> selector);
    @JsConstructor
    public FromEventObservableImpl(/* NO SYMBOL */EventTargetLike sourceObj,String eventName,SelectorMethodSignature<T> /* optional */ selector,/* NO SYMBOL */EventListenerOptions /* optional */ options) {}
    public static native <T> void setupSubscription(UNKNOWN_TYPE_NAME_QuestionToken options);
    public native  void _subscribe(Subscriber<T> subscriber);
}
