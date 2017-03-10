package fr.lteconsulting.angular2gwt.client.interop.ng.http;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.http.Headers;
import ng.http.URLSearchParams;
import ng.http.RequestOptionsArgs;
import jsinterop.annotations.JsConstructor;
import ng.http.RequestOptions;

/**
  * Generated from tests\@angular\http\src\base_request_options.d.ts
  * Package ng.http
  * Name RequestOptions
  * Creates a request options object to be optionally provided when instantiating a
  * {@link Request}.
  * 
  * This class is based on the `RequestInit` description in the [Fetch
  * Spec](https://fetch.spec.whatwg.org/#requestinit).
  * 
  * All values are null by default. Typical defaults can be found in the {@link BaseRequestOptions}
  * class, which sub-classes `RequestOptions`.
  * 
  * ### Example ([live demo](http://plnkr.co/edit/7Wvi3lfLq41aQPKlxB4O?p=preview))
  * 
  * ```typescript
  * import {RequestOptions, Request, RequestMethod} from '@angular/http';
  * 
  * var options = new RequestOptions({
  *    method: RequestMethod.Post,
  *    url: 'https://google.com'
  * });
  * var req = new Request(options);
  * console.log('req.method:', RequestMethod[req.method]); // Post
  * console.log('options.url:', options.url); // https://google.com
  * ```
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface RequestOptions  {
    @JsProperty(name="method")
    Object /* UnionType */ getMethod();
    @JsProperty(name="method")
    void setMethod(Object /* UnionType */ value);
    @JsProperty(name="headers")
    Headers getHeaders();
    @JsProperty(name="headers")
    void setHeaders(Headers value);
    @JsProperty(name="body")
    Object getBody();
    @JsProperty(name="body")
    void setBody(Object value);
    @JsProperty(name="url")
    String getUrl();
    @JsProperty(name="url")
    void setUrl(String value);
    @JsProperty(name="search")
    URLSearchParams getSearch();
    @JsProperty(name="search")
    void setSearch(URLSearchParams value);
    @JsProperty(name="withCredentials")
    boolean getWithCredentials();
    @JsProperty(name="withCredentials")
    void setWithCredentials(boolean value);
    @JsProperty(name="responseType")
    /* ng.http.ResponseContentType */ int getResponseType();
    @JsProperty(name="responseType")
    void setResponseType(/* ng.http.ResponseContentType */ int value);
    @JsConstructor
    public RequestOptions(RequestOptionsArgs /* optional */ undefined) {}
     RequestOptions merge(RequestOptionsArgs /* optional */ options);
}
