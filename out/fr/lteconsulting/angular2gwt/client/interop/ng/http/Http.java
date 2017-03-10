package fr.lteconsulting.angular2gwt.client.interop.ng.http;

import jsinterop.annotations.JsType;
import ng.http.ConnectionBackend;
import jsinterop.annotations.JsProperty;
import ng.http.RequestOptions;
import jsinterop.annotations.JsConstructor;
import ng.http.RequestOptionsArgs;
import rxjs.Observable;
import ng.http.Response;

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
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface Http  {
    @JsProperty(name="_backend")
    ConnectionBackend get_backend();
    @JsProperty(name="_backend")
    void set_backend(ConnectionBackend value);
    @JsProperty(name="_defaultOptions")
    RequestOptions get_defaultOptions();
    @JsProperty(name="_defaultOptions")
    void set_defaultOptions(RequestOptions value);
    @JsConstructor
    public Http(ConnectionBackend _backend,RequestOptions _defaultOptions) {}
     Observable<Response> request(Object /* UnionType */ url,RequestOptionsArgs /* optional */ options);
     Observable<Response> get(String url,RequestOptionsArgs /* optional */ options);
     Observable<Response> post(String url,Object body,RequestOptionsArgs /* optional */ options);
     Observable<Response> put(String url,Object body,RequestOptionsArgs /* optional */ options);
     Observable<Response> delete(String url,RequestOptionsArgs /* optional */ options);
     Observable<Response> patch(String url,Object body,RequestOptionsArgs /* optional */ options);
     Observable<Response> head(String url,RequestOptionsArgs /* optional */ options);
     Observable<Response> options(String url,RequestOptionsArgs /* optional */ options);
}
