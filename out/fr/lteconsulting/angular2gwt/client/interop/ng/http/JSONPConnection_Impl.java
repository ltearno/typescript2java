package fr.lteconsulting.angular2gwt.client.interop.ng.http;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.http.Request;
import ng.http.BrowserJsonp;
import ng.http.ResponseOptions;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\http\src\backends\jsonp_backend.d.ts
  * Package ng.http
  * Name JSONPConnection_
  * 
  **/
@JsType( isNative=true, namespace="ng.http", name="JSONPConnection_" )
public class JSONPConnection_Impl extends JSONPConnection {
    @JsProperty(name="_dom")
    Object get_dom();
    @JsProperty(name="_dom")
    void set_dom(Object value);
    @JsProperty(name="baseResponseOptions")
    Object getBaseResponseOptions();
    @JsProperty(name="baseResponseOptions")
    void setBaseResponseOptions(Object value);
    @JsProperty(name="_id")
    Object get_id();
    @JsProperty(name="_id")
    void set_id(Object value);
    @JsProperty(name="_script")
    Object get_script();
    @JsProperty(name="_script")
    void set_script(Object value);
    @JsProperty(name="_responseData")
    Object get_responseData();
    @JsProperty(name="_responseData")
    void set_responseData(Object value);
    @JsProperty(name="_finished")
    Object get_finished();
    @JsProperty(name="_finished")
    void set_finished(Object value);
    @JsConstructor
    public JSONPConnection_Impl(Request req,BrowserJsonp _dom,ResponseOptions /* optional */ baseResponseOptions) {}
    public native  void finished(Object /* optional */ data);
}
