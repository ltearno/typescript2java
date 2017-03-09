package fr.lteconsulting.angular2gwt.client.interop.ng.http;

import jsinterop.annotations.JsType;
import rxjs.ReplaySubject;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\http\testing\mock_backend.d.ts
  * Package ng.http
  * Name MockConnection
  * Mock Connection to represent a {@link Connection} for tests.
  **/
@JsType( isNative=true, namespace="ng.http" )
public class MockConnection extends Connection {
    public /* ng.http.ReadyState */ int readyState;
    public Request request;
    public ReplaySubject<Response> response;
    @JsConstructor
    public MockConnection(Request req) {}
    public native  void mockRespond(Response res);
    public native  void mockDownload(Response res);
    public native  void mockError(Error /* optional */ err);
}
