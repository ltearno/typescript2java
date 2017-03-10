package fr.lteconsulting.angular2gwt.client.interop.ng.http;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.http.Request;
import rxjs.Observable;
import ng.http.Response;

/**
  * Generated from tests\@angular\http\src\backends\jsonp_backend.d.ts
  * Package ng.http
  * Name JSONPConnection
  * Abstract base class for an in-flight JSONP request.
  **/
@JsType( isNative=true, namespace="ng.http", name="JSONPConnection" )
public abstract class JSONPConnectionImpl extends Connection {
    @JsProperty(name="readyState")
    /* ng.http.ReadyState */ int getReadyState();
    @JsProperty(name="readyState")
    void setReadyState(/* ng.http.ReadyState */ int value);
    @JsProperty(name="request")
    Request getRequest();
    @JsProperty(name="request")
    void setRequest(Request value);
    @JsProperty(name="response")
    Observable<Response> getResponse();
    @JsProperty(name="response")
    void setResponse(Observable<Response> value);
    public native  void finished(Object /* optional */ data);
}
