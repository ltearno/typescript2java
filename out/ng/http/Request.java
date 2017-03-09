package fr.lteconsulting.angular2gwt.client.interop.ng.http;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\http\src\static_request.d.ts
  * Package ng.http
  * Name Request
  * Creates `Request` instances from provided values.
  * 
  * The Request's interface is inspired by the Request constructor defined in the [Fetch
  * Spec](https://fetch.spec.whatwg.org/#request-class),
  * but is considered a static value whose body can be accessed many times. There are other
  * differences in the implementation, but this is the most significant.
  * 
  * `Request` instances are typically created by higher-level classes, like {@link Http} and
  * {@link Jsonp}, but it may occasionally be useful to explicitly create `Request` instances.
  * One such example is when creating services that wrap higher-level services, like {@link Http},
  * where it may be useful to generate a `Request` with arbitrary headers and search params.
  * 
  * ```typescript
  * import {Injectable, Injector} from '@angular/core';
  * import {HTTP_PROVIDERS, Http, Request, RequestMethod} from '@angular/http';
  **/
@JsType( isNative=true, namespace="ng.http" )
public class Request extends Body {
    public /* ng.http.RequestMethod */ int method;
    public Headers headers;
    public String url;
    public Object contentType;
    public boolean withCredentials;
    public /* ng.http.ResponseContentType */ int responseType;
    @JsConstructor
    public Request(RequestArgs requestOptions) {}
    public native  /* ng.http.ContentType */ int detectContentType();
    public native  /* ng.http.ContentType */ int detectContentTypeFromBody();
    public native  Object getBody();
}
