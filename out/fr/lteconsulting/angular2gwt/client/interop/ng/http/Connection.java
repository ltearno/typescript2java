package fr.lteconsulting.angular2gwt.client.interop.ng.http;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.http.Request;

/**
  * Generated from tests\@angular\http\src\interfaces.d.ts
  * Package ng.http
  * Name Connection
  * Abstract class from which real connections are derived.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface Connection  {
    @JsProperty(name="readyState")
    /* ng.http.ReadyState */ int getReadyState();
    @JsProperty(name="readyState")
    void setReadyState(/* ng.http.ReadyState */ int value);
    @JsProperty(name="request")
    Request getRequest();
    @JsProperty(name="request")
    void setRequest(Request value);
    @JsProperty(name="response")
    Object getResponse();
    @JsProperty(name="response")
    void setResponse(Object value);
}
