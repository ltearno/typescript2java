package fr.lteconsulting.angular2gwt.client.interop.ng.http;

import jsinterop.annotations.JsType;
import ng.http.Connection;

/**
  * Generated from tests\@angular\http\src\interfaces.d.ts
  * Package ng.http
  * Name ConnectionBackend
  * Abstract class from which real backends are derived.
  * 
  * The primary purpose of a `ConnectionBackend` is to create new connections to fulfill a given
  * {@link Request}.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ConnectionBackend  {
     Connection createConnection(Object request);
}
