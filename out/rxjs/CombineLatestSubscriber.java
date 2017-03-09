package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsFunction1;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\operator\combineLatest.d.ts
  * Package rxjs
  * Name CombineLatestSubscriber
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs" )
public class CombineLatestSubscriber<T,R> extends OuterSubscriber<T,R> {
    public Object project;
    public Object active;
    public Object values;
    public Object observables;
    public Object toRespond;
    @JsConstructor
    public CombineLatestSubscriber(Subscriber<R> destination,JsFunction1<Array<Object>,R> /* optional */ project) {}
    public native  void _next(Object observable);
    public native  void _complete();
    public native  void notifyComplete(Subscriber<R> unused);
    public native  void notifyNext(T outerValue,R innerValue,int outerIndex,int innerIndex,InnerSubscriber<T,R> innerSub);
    public native  void _tryProject();
}
