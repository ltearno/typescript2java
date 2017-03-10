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
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface Jsonp extends Http {
    @JsConstructor
    public Jsonp(ConnectionBackend backend,RequestOptions defaultOptions) {}
     Observable<Response> request(Object /* UnionType */ url,RequestOptionsArgs /* optional */ options);
}
