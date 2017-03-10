package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import rxjs.AjaxRequest;
import jsinterop.annotations.JsProperty;
import rxjs.Subscriber;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\observable\dom\AjaxObservable.d.ts
  * Package rxjs
  * Name AjaxSubscriber
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs", name="AjaxSubscriber" )
public class AjaxSubscriberImpl<T> extends Subscriber<Event> {
    @JsProperty(name="request")
    AjaxRequest getRequest();
    @JsProperty(name="request")
    void setRequest(AjaxRequest value);
    @JsProperty(name="xhr")
    Object getXhr();
    @JsProperty(name="xhr")
    void setXhr(Object value);
    @JsProperty(name="done")
    Object getDone();
    @JsProperty(name="done")
    void setDone(Object value);
    @JsConstructor
    public AjaxSubscriberImpl(Subscriber<T> destination,AjaxRequest request) {}
    public native  void next(Event e);
    public native  void send();
    public native  void serializeBody(UNKNOWN_TYPE_NAME_QuestionToken contentType);
    public native  void setHeaders();
    public native  void setupEvents();
    public native  void unsubscribe();
}
