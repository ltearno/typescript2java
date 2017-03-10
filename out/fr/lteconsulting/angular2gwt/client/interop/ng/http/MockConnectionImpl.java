package fr.lteconsulting.angular2gwt.client.interop.ng.http;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.http.Request;
import rxjs.ReplaySubject;
import ng.http.Response;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\http\testing\mock_backend.d.ts
  * Package ng.http
  * Name MockConnection
  * Mock Connection to represent a {@link Connection} for tests.
  **/
@JsType( isNative=true, namespace="ng.http", name="MockConnection" )
public class MockConnectionImpl extends Connection {
    @JsProperty(name="readyState")
    /* ng.http.ReadyState */ int getReadyState();
    @JsProperty(name="readyState")
    void setReadyState(/* ng.http.ReadyState */ int value);
    @JsProperty(name="request")
    Request getRequest();
    @JsProperty(name="request")
    void setRequest(Request value);
    @JsProperty(name="response")
    ReplaySubject<Response> getResponse();
    @JsProperty(name="response")
    void setResponse(ReplaySubject<Response> value);
    @JsConstructor
    public MockConnectionImpl(Request req) {}
    public native  void mockRespond(Response res);
    public native  void mockDownload(Response res);
    public native  void mockError(Error /* optional */ err);
}
