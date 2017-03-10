package fr.lteconsulting.angular2gwt.client.interop.ng.http;

import jsinterop.annotations.JsType;

/**
  * Generated from tests\@angular\http\src\backends\browser_jsonp.d.ts
  * Package ng.http
  * Name BrowserJsonp
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface BrowserJsonp  {
     Object build(String url);
     String nextRequestID();
     String requestCallback(String id);
     void exposeConnection(String id,Object connection);
     void removeConnection(String id);
     void send(Object node);
     void cleanup(Object node);
}
