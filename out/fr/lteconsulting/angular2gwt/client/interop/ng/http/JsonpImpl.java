package fr.lteconsulting.angular2gwt.client.interop.ng.http;

import jsinterop.annotations.JsType;
import ng.http.ConnectionBackend;
import ng.http.RequestOptions;
import jsinterop.annotations.JsConstructor;
import ng.http.RequestOptionsArgs;
import rxjs.Observable;
import ng.http.Response;

/**
  * Generated from tests\@angular\http\src\http.d.ts
  * Package ng.http
  * Name Jsonp
  * 
  **/
@JsType( isNative=true, namespace="ng.http", name="Jsonp" )
public class JsonpImpl extends Http {
    @JsConstructor
    public JsonpImpl(ConnectionBackend backend,RequestOptions defaultOptions) {}
    public native  Observable<Response> request(Object /* UnionType */ url,RequestOptionsArgs /* optional */ options);
}
