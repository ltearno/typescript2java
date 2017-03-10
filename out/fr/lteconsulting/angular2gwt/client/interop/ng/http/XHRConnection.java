package fr.lteconsulting.angular2gwt.client.interop.ng.http;

import jsinterop.annotations.JsType;
import ng.http.Request;
import jsinterop.annotations.JsProperty;
import rxjs.Observable;
import ng.http.Response;
import ng.http.BrowserXhr;
import ng.http.ResponseOptions;
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
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface XHRConnection extends Connection {
    @JsProperty(name="request")
    Request getRequest();
    @JsProperty(name="request")
    void setRequest(Request value);
    @JsProperty(name="response")
    Observable<Response> getResponse();
    @JsProperty(name="response")
    void setResponse(Observable<Response> value);
    @JsProperty(name="readyState")
    /* ng.http.ReadyState */ int getReadyState();
    @JsProperty(name="readyState")
    void setReadyState(/* ng.http.ReadyState */ int value);
    @JsConstructor
    public XHRConnection(Request req,BrowserXhr browserXHR,ResponseOptions /* optional */ baseResponseOptions) {}
     void setDetectedContentType(Object req,Object _xhr);
}
