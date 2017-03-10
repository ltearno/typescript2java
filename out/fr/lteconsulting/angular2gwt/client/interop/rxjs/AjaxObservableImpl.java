package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import rxjs.AjaxCreationMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;
import rxjs.Subscriber;

/**
  * Generated from tests\rxjs\observable\dom\AjaxObservable.d.ts
  * Package rxjs
  * Name AjaxObservable
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs", name="AjaxObservable" )
public class AjaxObservableImpl<T> extends Observable<T> {
    @JsProperty(name="create")
    static AjaxCreationMethod getCreate();
    @JsProperty(name="create")
    static void setCreate(AjaxCreationMethod value);
    @JsProperty(name="request")
    Object getRequest();
    @JsProperty(name="request")
    void setRequest(Object value);
    @JsConstructor
    public AjaxObservableImpl(Object /* UnionType */ urlOrRequest) {}
    public native  /* NO SYMBOL */TeardownLogic _subscribe(Subscriber<T> subscriber);
}
