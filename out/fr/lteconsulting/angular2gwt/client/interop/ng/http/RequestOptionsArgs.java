package fr.lteconsulting.angular2gwt.client.interop.ng.http;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.http.Headers;

/**
  * Generated from tests\@angular\http\src\interfaces.d.ts
  * Package ng.http
  * Name RequestOptionsArgs
  * Interface for options to construct a RequestOptions, based on
  * [RequestInit](https://fetch.spec.whatwg.org/#requestinit) from the Fetch spec.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface RequestOptionsArgs  {
    /* optional property url*/    @JsProperty(name="url")
    String url();
    @JsProperty(name="url")
    void url(String value);
    /* optional property method*/    @JsProperty(name="method")
    Object /* UnionType */ method();
    @JsProperty(name="method")
    void method(Object /* UnionType */ value);
    /* optional property search*/    @JsProperty(name="search")
    Object /* UnionType */ search();
    @JsProperty(name="search")
    void search(Object /* UnionType */ value);
    /* optional property headers*/    @JsProperty(name="headers")
    Headers headers();
    @JsProperty(name="headers")
    void headers(Headers value);
    /* optional property body*/    @JsProperty(name="body")
    Object body();
    @JsProperty(name="body")
    void body(Object value);
    /* optional property withCredentials*/    @JsProperty(name="withCredentials")
    boolean withCredentials();
    @JsProperty(name="withCredentials")
    void withCredentials(boolean value);
    /* optional property responseType*/    @JsProperty(name="responseType")
    /* ng.http.ResponseContentType */ int responseType();
    @JsProperty(name="responseType")
    void responseType(/* ng.http.ResponseContentType */ int value);
}
