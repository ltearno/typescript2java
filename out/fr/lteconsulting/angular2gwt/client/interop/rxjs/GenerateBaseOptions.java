package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import rxjs.IScheduler;

/**
  * Generated from tests\rxjs\observable\GenerateObservable.d.ts
  * Package rxjs
  * Name GenerateBaseOptions
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface GenerateBaseOptions<S>  {
    @JsProperty(name="initialState")
    S initialState();
    @JsProperty(name="initialState")
    void initialState(S value);
    /* optional property condition*/    @JsProperty(name="condition")
    ConditionFunc<S> condition();
    @JsProperty(name="condition")
    void condition(ConditionFunc<S> value);
    @JsProperty(name="iterate")
    IterateFunc<S> iterate();
    @JsProperty(name="iterate")
    void iterate(IterateFunc<S> value);
    /* optional property scheduler*/    @JsProperty(name="scheduler")
    IScheduler scheduler();
    @JsProperty(name="scheduler")
    void scheduler(IScheduler value);
}
