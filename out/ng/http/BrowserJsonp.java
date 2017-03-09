package fr.lteconsulting.angular2gwt.client.interop.ng.http;

import jsinterop.annotations.JsType;

/**
  * Generated from tests\@angular\http\src\backends\browser_jsonp.d.ts
  * Package ng.http
  * Name BrowserJsonp
  * 
  **/
@JsType( isNative=true, namespace="ng.http" )
public class BrowserJsonp  {
    public native  Object build(String url);
    public native  String nextRequestID();
    public native  String requestCallback(String id);
    public native  void exposeConnection(String id,Object connection);
    public native  void removeConnection(String id);
    public native  void send(Object node);
    public native  void cleanup(Object node);
}
