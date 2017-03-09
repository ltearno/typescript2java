package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import fr.lteconsulting.angular2gwt.client.JsFunction1;
import fr.lteconsulting.angular2gwt.client.JsFunction;

/**
  * Generated from tests\rxjs\Observer.d.ts
  * Package rxjs
  * Name CompletionObserver
  * 
  **/
@JsType( isNative=true, name="Object", namespace=JsPackage.GLOBAL )
public class CompletionObserver<T>  {
    public /* optional */ boolean closed;
    public /* optional */ JsFunction1<T,Void> next;
    public /* optional */ JsFunction1<Object,Void> error;
    public JsFunction<Void> complete;
}
