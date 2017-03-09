package fr.lteconsulting.angular2gwt.client.interop.ng.http;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;

/**
  * Generated from tests\@angular\http\src\interfaces.d.ts
  * Package ng.http
  * Name Connection
  * Abstract class from which real connections are derived.
  **/
@JsType( isNative=true, namespace="ng.http" )
public interface Connection  {
    @JsProperty(name="readyState")
    /* ng.http.ReadyState */ int readyState();
    @JsProperty(name="readyState")
    void readyState(/* ng.http.ReadyState */ int value);
    @JsProperty(name="request")
    Request request();
    @JsProperty(name="request")
    void request(Request value);
    @JsProperty(name="response")
    Object response();
    @JsProperty(name="response")
    void response(Object value);
}
