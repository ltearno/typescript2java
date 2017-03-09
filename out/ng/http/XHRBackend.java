package fr.lteconsulting.angular2gwt.client.interop.ng.http;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

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
@JsType( isNative=true, namespace="ng.http" )
public class XHRBackend extends ConnectionBackend {
    public Object _browserXHR;
    public Object _baseResponseOptions;
    public Object _xsrfStrategy;
    @JsConstructor
    public XHRBackend(BrowserXhr _browserXHR,ResponseOptions _baseResponseOptions,XSRFStrategy _xsrfStrategy) {}
    public native  XHRConnection createConnection(Request request);
}
