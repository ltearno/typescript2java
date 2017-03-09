package fr.lteconsulting.angular2gwt.client.interop.ng.http;

import jsinterop.annotations.JsType;

/**
  * Generated from tests\@angular\http\src\body.d.ts
  * Package ng.http
  * Name Body
  * HTTP request body used by both {@link Request} and {@link Response}
  * https://fetch.spec.whatwg.org/#body
  **/
@JsType( isNative=true, namespace="ng.http" )
public interface Body  {
     Object json();
     String text();
     ArrayBuffer arrayBuffer();
     Blob blob();
}
