package fr.lteconsulting.angular2gwt.client.interop.ng.http;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\http\src\backends\jsonp_backend.d.ts
  * Package ng.http
  * Name JSONPConnection_
  * 
  **/
@JsType( isNative=true, namespace="ng.http" )
public class JSONPConnection_ extends JSONPConnection {
    public Object _dom;
    public Object baseResponseOptions;
    public Object _id;
    public Object _script;
    public Object _responseData;
    public Object _finished;
    @JsConstructor
    public JSONPConnection_(Request req,BrowserJsonp _dom,ResponseOptions /* optional */ baseResponseOptions) {}
    public native  void finished(Object /* optional */ data);
}
