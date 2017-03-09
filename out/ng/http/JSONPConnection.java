package fr.lteconsulting.angular2gwt.client.interop.ng.http;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import rxjs.Observable;

/**
  * Generated from tests\@angular\http\src\backends\jsonp_backend.d.ts
  * Package ng.http
  * Name JSONPConnection
  * Abstract base class for an in-flight JSONP request.
  **/
@JsType( isNative=true, namespace="ng.http" )
public interface JSONPConnection extends Connection {
    @JsProperty(name="readyState")
    /* ng.http.ReadyState */ int readyState();
    @JsProperty(name="readyState")
    void readyState(/* ng.http.ReadyState */ int value);
    @JsProperty(name="request")
    Request request();
    @JsProperty(name="request")
    void request(Request value);
    @JsProperty(name="response")
    Observable<Response> response();
    @JsProperty(name="response")
    void response(Observable<Response> value);
     void finished(Object /* optional */ data);
}
