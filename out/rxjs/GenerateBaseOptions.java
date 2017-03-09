package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;

/**
  * Generated from tests\rxjs\observable\GenerateObservable.d.ts
  * Package rxjs
  * Name GenerateBaseOptions
  * 
  **/
@JsType( isNative=true, name="Object", namespace=JsPackage.GLOBAL )
public class GenerateBaseOptions<S>  {
    public S initialState;
    public /* optional */ ConditionFunc<S> condition;
    public IterateFunc<S> iterate;
    public /* optional */ IScheduler scheduler;
}
