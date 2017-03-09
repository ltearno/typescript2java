package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\observable\dom\AjaxObservable.d.ts
  * Package rxjs
  * Name AjaxSubscriber
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs" )
public class AjaxSubscriber<T> extends Subscriber<Event> {
    public AjaxRequest request;
    public Object xhr;
    public Object done;
    @JsConstructor
    public AjaxSubscriber(Subscriber<T> destination,AjaxRequest request) {}
    public native  void next(Event e);
    public native  void send();
    public native  void serializeBody(UNKNOWN_TYPE_NAME_QuestionToken contentType);
    public native  void setHeaders();
    public native  void setupEvents();
    public native  void unsubscribe();
}
