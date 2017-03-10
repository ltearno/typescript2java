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
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface URLSearchParams  {
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
    public URLSearchParams(String /* optional */ rawParams,QueryEncoder /* optional */ queryEncoder) {}
     URLSearchParams clone();
     boolean has(String param);
     String get(String param);
     JsArray<String> getAll(String param);
     void set(String param,String val);
     void setAll(URLSearchParams searchParams);
     void append(String param,String val);
     void appendAll(URLSearchParams searchParams);
     void replaceAll(URLSearchParams searchParams);
     String toString();
     void delete(String param);
}
