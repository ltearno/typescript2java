package fr.lteconsulting.angular2gwt.client.interop.ng.http;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;
import rxjs.Observable;

/**
  * Generated from tests\@angular\http\src\http.d.ts
  * Package ng.http
  * Name Http
  * Performs http requests using `XMLHttpRequest` as the default backend.
  * 
  * `Http` is available as an injectable class, with methods to perform http requests. Calling
  * `request` returns an `Observable` which will emit a single {@link Response} when a
  * response is received.
  * 
  * ### Example
  * 
  * ```typescript
  * import {Http, HTTP_PROVIDERS} from '@angular/http';
  * import 'rxjs/add/operator/map'
  **/
@JsType( isNative=true, namespace="ng.http" )
public class Http  {
    public ConnectionBackend _backend;
    public RequestOptions _defaultOptions;
    @JsConstructor
    public Http(ConnectionBackend _backend,RequestOptions _defaultOptions) {}
    public native  Observable<Response> request(Object /* UnionType */ url,RequestOptionsArgs /* optional */ options);
    public native  Observable<Response> get(String url,RequestOptionsArgs /* optional */ options);
    public native  Observable<Response> post(String url,Object body,RequestOptionsArgs /* optional */ options);
    public native  Observable<Response> put(String url,Object body,RequestOptionsArgs /* optional */ options);
    public native  Observable<Response> delete(String url,RequestOptionsArgs /* optional */ options);
    public native  Observable<Response> patch(String url,Object body,RequestOptionsArgs /* optional */ options);
    public native  Observable<Response> head(String url,RequestOptionsArgs /* optional */ options);
    public native  Observable<Response> options(String url,RequestOptionsArgs /* optional */ options);
}
