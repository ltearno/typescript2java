package fr.lteconsulting.angular2gwt.client.interop.ng.http;

import jsinterop.annotations.JsType;
import ng.http.Request;

/**
  * Generated from tests\@angular\http\src\interfaces.d.ts
  * Package ng.http
  * Name XSRFStrategy
  * An XSRFStrategy configures XSRF protection (e.g. via headers) on an HTTP request.
  **/
@JsType( isNative=true, namespace="ng.http", name="XSRFStrategy" )
public abstract class XSRFStrategyImpl  {
    public native  void configureRequest(Request req);
}
