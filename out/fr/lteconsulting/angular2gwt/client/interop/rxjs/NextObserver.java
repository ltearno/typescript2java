package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsFunction1;
import fr.lteconsulting.angular2gwt.client.JsFunction;

/**
  * Generated from tests\rxjs\Observer.d.ts
  * Package rxjs
  * Name NextObserver
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface NextObserver<T>  {
    /* optional property closed*/    @JsProperty(name="closed")
    boolean closed();
    @JsProperty(name="closed")
    void closed(boolean value);
    @JsProperty(name="next")
    JsFunction1<T,Void> next();
    @JsProperty(name="next")
    void next(JsFunction1<T,Void> value);
    /* optional property error*/    @JsProperty(name="error")
    JsFunction1<Object,Void> error();
    @JsProperty(name="error")
    void error(JsFunction1<Object,Void> value);
    /* optional property complete*/    @JsProperty(name="complete")
    JsFunction<Void> complete();
    @JsProperty(name="complete")
    void complete(JsFunction<Void> value);
}
