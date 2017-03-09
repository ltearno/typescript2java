package fr.lteconsulting.angular2gwt.client.interop.ng.http;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\http\src\backends\jsonp_backend.d.ts
  * Package ng.http
  * Name JSONPBackend_
  * 
  **/
@JsType( isNative=true, namespace="ng.http" )
public class JSONPBackend_ extends JSONPBackend {
    public Object _browserJSONP;
    public Object _baseResponseOptions;
    @JsConstructor
    public JSONPBackend_(BrowserJsonp _browserJSONP,ResponseOptions _baseResponseOptions) {}
    public native  JSONPConnection createConnection(Request request);
}
