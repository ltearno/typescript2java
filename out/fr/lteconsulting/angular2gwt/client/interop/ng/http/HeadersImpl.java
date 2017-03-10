package fr.lteconsulting.angular2gwt.client.interop.ng.http;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;
import ng.http.Headers;
import fr.lteconsulting.angular2gwt.client.JsFunction3;
import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;

/**
  * Generated from tests\@angular\http\src\headers.d.ts
  * Package ng.http
  * Name Headers
  * Polyfill for [Headers](https://developer.mozilla.org/en-US/docs/Web/API/Headers/Headers), as
  * specified in the [Fetch Spec](https://fetch.spec.whatwg.org/#headers-class).
  * 
  * The only known difference between this `Headers` implementation and the spec is the
  * lack of an `entries` method.
  * 
  * ### Example
  * 
  * ```
  * import {Headers} from '@angular/http';
  * 
  * var firstHeaders = new Headers();
  * firstHeaders.append('Content-Type', 'image/jpeg');
  * console.log(firstHeaders.get('Content-Type')) //'image/jpeg'
  * 
  * // Create headers from Plain Old JavaScript Object
  * var secondHeaders = new Headers({
  *    'X-My-Custom-Header': 'Angular'
  * });
  * console.log(secondHeaders.get('X-My-Custom-Header')); //'Angular'
  * 
  * var thirdHeaders = new Headers(secondHeaders);
  * console.log(thirdHeaders.get('X-My-Custom-Header')); //'Angular'
  * ```
  **/
@JsType( isNative=true, namespace="ng.http", name="Headers" )
public class HeadersImpl  {
    @JsConstructor
    public HeadersImpl(Object /* UnionType */ /* optional */ headers) {}
    public static native  Headers fromResponseHeaderString(String headersString);
    public native  void append(String name,String value);
    public native  void delete(String name);
    public native  void forEach(JsFunction3<JsArray<String>,String,Map<String,JsArray<String>>,Void> fn);
    public native  String get(String name);
    public native  boolean has(String name);
    public native  JsArray<String> keys();
    public native  void set(String name,Object /* UnionType */ value);
    public native  JsArray<JsArray<String>> values();
    public native  JsTypedObject<String,Object> toJSON();
    public native  JsArray<String> getAll(String name);
    public native  void entries();
    public native  void mayBeSetNormalizedName();
}
