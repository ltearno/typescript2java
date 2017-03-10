package fr.lteconsulting.angular2gwt.client.interop.ng.http;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.http.BrowserJsonp;
import ng.http.ResponseOptions;
import jsinterop.annotations.JsConstructor;
import ng.http.Request;
import ng.http.JSONPConnection;

/**
  * Generated from tests\@angular\http\src\backends\jsonp_backend.d.ts
  * Package ng.http
  * Name JSONPBackend_
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface JSONPBackend_ extends JSONPBackend {
    @JsProperty(name="_browserJSONP")
    Object get_browserJSONP();
    @JsProperty(name="_browserJSONP")
    void set_browserJSONP(Object value);
    @JsProperty(name="_baseResponseOptions")
    Object get_baseResponseOptions();
    @JsProperty(name="_baseResponseOptions")
    void set_baseResponseOptions(Object value);
    @JsConstructor
    public JSONPBackend_(BrowserJsonp _browserJSONP,ResponseOptions _baseResponseOptions) {}
     JSONPConnection createConnection(Request request);
}
