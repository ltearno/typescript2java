package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;

/**
  * Generated from tests\rxjs\observable\GenerateObservable.d.ts
  * Package rxjs
  * Name GenerateOptions
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface GenerateOptions<T,S> extends GenerateBaseOptions<S> {
    @JsProperty(name="resultSelector")
    ResultFunc<S,T> resultSelector();
    @JsProperty(name="resultSelector")
    void resultSelector(ResultFunc<S,T> value);
}
