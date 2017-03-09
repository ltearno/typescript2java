package fr.lteconsulting.angular2gwt.client.interop.ng.http;

import jsinterop.annotations.JsType;
import rxjs.Observable;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\http\src\backends\xhr_backend.d.ts
  * Package ng.http
  * Name XHRConnection
  * Creates connections using `XMLHttpRequest`. Given a fully-qualified
  * request, an `XHRConnection` will immediately create an `XMLHttpRequest` object and send the
  * request.
  * 
  * This class would typically not be created or interacted with directly inside applications, though
  * the {@link MockConnection} may be interacted with in tests.
  **/
@JsType( isNative=true, namespace="ng.http" )
public class XHRConnection extends Connection {
    public Request request;
    public Observable<Response> response;
    public /* ng.http.ReadyState */ int readyState;
    @JsConstructor
    public XHRConnection(Request req,BrowserXhr browserXHR,ResponseOptions /* optional */ baseResponseOptions) {}
    public native  void setDetectedContentType(Object req,Object _xhr);
}
