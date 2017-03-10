package fr.lteconsulting.angular2gwt.client.interop.ng.http;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.http.Headers;

/**
  * Generated from tests\@angular\http\src\interfaces.d.ts
  * Package ng.http
  * Name ResponseOptionsArgs
  * Interface for options to construct a Response, based on
  * [ResponseInit](https://fetch.spec.whatwg.org/#responseinit) from the Fetch spec.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ResponseOptionsArgs  {
    /* optional property body*/    @JsProperty(name="body")
    Object /* UnionType */ body();
    @JsProperty(name="body")
    void body(Object /* UnionType */ value);
    /* optional property status*/    @JsProperty(name="status")
    int status();
    @JsProperty(name="status")
    void status(int value);
    /* optional property statusText*/    @JsProperty(name="statusText")
    String statusText();
    @JsProperty(name="statusText")
    void statusText(String value);
    /* optional property headers*/    @JsProperty(name="headers")
    Headers headers();
    @JsProperty(name="headers")
    void headers(Headers value);
    /* optional property type*/    @JsProperty(name="type")
    /* ng.http.ResponseType */ int type();
    @JsProperty(name="type")
    void type(/* ng.http.ResponseType */ int value);
    /* optional property url*/    @JsProperty(name="url")
    String url();
    @JsProperty(name="url")
    void url(String value);
}
