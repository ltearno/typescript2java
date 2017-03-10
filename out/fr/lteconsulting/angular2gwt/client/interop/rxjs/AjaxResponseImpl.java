package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import rxjs.AjaxRequest;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\observable\dom\AjaxObservable.d.ts
  * Package rxjs
  * Name AjaxResponse
  * A normalized AJAX response.
  **/
@JsType( isNative=true, namespace="rxjs", name="AjaxResponse" )
public class AjaxResponseImpl  {
    @JsProperty(name="originalEvent")
    Event getOriginalEvent();
    @JsProperty(name="originalEvent")
    void setOriginalEvent(Event value);
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
    @JsProperty(name="response")
    Object getResponse();
    @JsProperty(name="response")
    void setResponse(Object value);
    @JsProperty(name="responseText")
    String getResponseText();
    @JsProperty(name="responseText")
    void setResponseText(String value);
    @JsProperty(name="responseType")
    String getResponseType();
    @JsProperty(name="responseType")
    void setResponseType(String value);
    @JsConstructor
    public AjaxResponseImpl(Event originalEvent,XMLHttpRequest xhr,AjaxRequest request) {}
}
