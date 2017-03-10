package fr.lteconsulting.angular2gwt.client.interop.ng.http;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.http.QueryEncoder;
import jsinterop.annotations.JsConstructor;
import ng.http.URLSearchParams;

/**
  * Generated from tests\@angular\http\src\url_search_params.d.ts
  * Package ng.http
  * Name URLSearchParams
  * Map-like representation of url search parameters, based on
  * [URLSearchParams](https://url.spec.whatwg.org/#urlsearchparams) in the url living standard,
  * with several extensions for merging URLSearchParams objects:
  *    - setAll()
  *    - appendAll()
  *    - replaceAll()
  * 
  * This class accepts an optional second parameter of ${@link QueryEncoder},
  * which is used to serialize parameters before making a request. By default,
  * `QueryEncoder` encodes keys and values of parameters using `encodeURIComponent`,
  * and then un-encodes certain characters that are allowed to be part of the query
  * according to IETF RFC 3986: https://tools.ietf.org/html/rfc3986.
  * 
  * These are the characters that are not encoded: `! $ \' ( ) * + , ; A 9 - . _ ~ ? /`
  * 
  * If the set of allowed query characters is not acceptable for a particular backend,
  * `QueryEncoder` can be subclassed and provided as the 2nd argument to URLSearchParams.
  * 
  * ```
  * import {URLSearchParams, QueryEncoder} from '@angular/http';
  * class MyQueryEncoder extends QueryEncoder {
  *    encodeKey(k: string): string {
  *      return myEncodingFunction(k);
  *    }
  * 
  *    encodeValue(v: string): string {
  *      return myEncodingFunction(v);
  *    }
  * }
  * 
  * let params = new URLSearchParams('', new MyQueryEncoder());
  * ```
  **/
@JsType( isNative=true, namespace="ng.http", name="URLSearchParams" )
public class URLSearchParamsImpl  {
    @JsProperty(name="rawParams")
    String getRawParams();
    @JsProperty(name="rawParams")
    void setRawParams(String value);
    @JsProperty(name="queryEncoder")
    Object getQueryEncoder();
    @JsProperty(name="queryEncoder")
    void setQueryEncoder(Object value);
    @JsProperty(name="paramsMap")
    Map<String,JsArray<String>> getParamsMap();
    @JsProperty(name="paramsMap")
    void setParamsMap(Map<String,JsArray<String>> value);
    @JsConstructor
    public URLSearchParamsImpl(String /* optional */ rawParams,QueryEncoder /* optional */ queryEncoder) {}
    public native  URLSearchParams clone();
    public native  boolean has(String param);
    public native  String get(String param);
    public native  JsArray<String> getAll(String param);
    public native  void set(String param,String val);
    public native  void setAll(URLSearchParams searchParams);
    public native  void append(String param,String val);
    public native  void appendAll(URLSearchParams searchParams);
    public native  void replaceAll(URLSearchParams searchParams);
    public native  String toString();
    public native  void delete(String param);
}
