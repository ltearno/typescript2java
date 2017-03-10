package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import rxjs.AjaxRequest;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\observable\dom\AjaxObservable.d.ts
  * Package rxjs
  * Name AjaxError
  * A normalized AJAX error.
  **/
@JsType( isNative=true, namespace="rxjs", name="AjaxError" )
public class AjaxErrorImpl extends Error {
    @JsProperty(name="xhr")
    XMLHttpRequest getXhr();
    @JsProperty(name="xhr")
    void setXhr(XMLHttpRequest value);
    @JsProperty(name="request")
    AjaxRequest getRequest();
    @JsProperty(name="request")
    void setRequest(AjaxRequest value);
    @JsProperty(name="status")
    int getStatus();
    @JsProperty(name="status")
    void setStatus(int value);
    @JsConstructor
    public AjaxErrorImpl(String message,XMLHttpRequest xhr,AjaxRequest request) {}
}
