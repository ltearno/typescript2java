package fr.lteconsulting.angular2gwt.client.interop.ng.http;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;

/**
  * Generated from tests\@angular\http\src\interfaces.d.ts
  * Package ng.http
  * Name RequestArgs
  * Required structure when constructing new Request();
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface RequestArgs extends RequestOptionsArgs {
    @JsProperty(name="url")
    String url();
    @JsProperty(name="url")
    void url(String value);
}
