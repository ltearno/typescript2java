package fr.lteconsulting.angular2gwt.client.interop.ng.http;

import jsinterop.annotations.JsType;

/**
  * Generated from tests\@angular\http\src\interfaces.d.ts
  * Package ng.http
  * Name XSRFStrategy
  * An XSRFStrategy configures XSRF protection (e.g. via headers) on an HTTP request.
  **/
@JsType( isNative=true, namespace="ng.http" )
public interface XSRFStrategy  {
     void configureRequest(Request req);
}
