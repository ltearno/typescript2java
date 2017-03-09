package fr.lteconsulting.angular2gwt.client.interop.ng.http;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

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
@JsType( isNative=true, namespace="ng.http" )
public class RequestOptions  {
    public Object /* UnionType */ method;
    public Headers headers;
    public Object body;
    public String url;
    public URLSearchParams search;
    public boolean withCredentials;
    public /* ng.http.ResponseContentType */ int responseType;
    @JsConstructor
    public RequestOptions(RequestOptionsArgs /* optional */ undefined) {}
    public native  RequestOptions merge(RequestOptionsArgs /* optional */ options);
}
