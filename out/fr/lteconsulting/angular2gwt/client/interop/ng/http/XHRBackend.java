package fr.lteconsulting.angular2gwt.client.interop.ng.http;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.http.BrowserXhr;
import ng.http.ResponseOptions;
import ng.http.XSRFStrategy;
import jsinterop.annotations.JsConstructor;
import ng.http.Request;
import ng.http.XHRConnection;

/**
  * Generated from tests\@angular\http\src\backends\xhr_backend.d.ts
  * Package ng.http
  * Name XHRBackend
  * Creates {@link XHRConnection} instances.
  * 
  * This class would typically not be used by end users, but could be
  * overridden if a different backend implementation should be used,
  * such as in a node backend.
  * 
  * ### Example
  * 
  * ```
  * import {Http, MyNodeBackend, HTTP_PROVIDERS, BaseRequestOptions} from '@angular/http';
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface XHRBackend extends ConnectionBackend {
    @JsProperty(name="_browserXHR")
    Object get_browserXHR();
    @JsProperty(name="_browserXHR")
    void set_browserXHR(Object value);
    @JsProperty(name="_baseResponseOptions")
    Object get_baseResponseOptions();
    @JsProperty(name="_baseResponseOptions")
    void set_baseResponseOptions(Object value);
    @JsProperty(name="_xsrfStrategy")
    Object get_xsrfStrategy();
    @JsProperty(name="_xsrfStrategy")
    void set_xsrfStrategy(Object value);
    @JsConstructor
    public XHRBackend(BrowserXhr _browserXHR,ResponseOptions _baseResponseOptions,XSRFStrategy _xsrfStrategy) {}
     XHRConnection createConnection(Request request);
}
