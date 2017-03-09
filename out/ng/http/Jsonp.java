package fr.lteconsulting.angular2gwt.client.interop.ng.http;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;
import rxjs.Observable;

/**
  * Generated from tests\@angular\http\src\http.d.ts
  * Package ng.http
  * Name Jsonp
  * 
  **/
@JsType( isNative=true, namespace="ng.http" )
public class Jsonp extends Http {
    @JsConstructor
    public Jsonp(ConnectionBackend backend,RequestOptions defaultOptions) {}
    public native  Observable<Response> request(Object /* UnionType */ url,RequestOptionsArgs /* optional */ options);
}
