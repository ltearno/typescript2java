package fr.lteconsulting.angular2gwt.client.interop.ng.http;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;

/**
  * Generated from tests\@angular\http\src\interfaces.d.ts
  * Package ng.http
  * Name RequestOptionsArgs
  * Interface for options to construct a RequestOptions, based on
  * [RequestInit](https://fetch.spec.whatwg.org/#requestinit) from the Fetch spec.
  **/
@JsType( isNative=true, name="Object", namespace=JsPackage.GLOBAL )
public class RequestOptionsArgs  {
    public /* optional */ String url;
    public /* optional */ Object /* UnionType */ method;
    public /* optional */ Object /* UnionType */ search;
    public /* optional */ Headers headers;
    public /* optional */ Object body;
    public /* optional */ boolean withCredentials;
    public /* optional */ /* ng.http.ResponseContentType */ int responseType;
}
