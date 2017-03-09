package fr.lteconsulting.angular2gwt.client.interop.ng.http;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;

/**
  * Generated from tests\@angular\http\src\interfaces.d.ts
  * Package ng.http
  * Name ResponseOptionsArgs
  * Interface for options to construct a Response, based on
  * [ResponseInit](https://fetch.spec.whatwg.org/#responseinit) from the Fetch spec.
  **/
@JsType( isNative=true, name="Object", namespace=JsPackage.GLOBAL )
public class ResponseOptionsArgs  {
    public /* optional */ Object /* UnionType */ body;
    public /* optional */ int status;
    public /* optional */ String statusText;
    public /* optional */ Headers headers;
    public /* optional */ /* ng.http.ResponseType */ int type;
    public /* optional */ String url;
}
