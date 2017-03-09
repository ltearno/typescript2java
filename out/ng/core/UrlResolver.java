package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\url_resolver.d.ts
  * Package ng.core
  * Name UrlResolver
  * Used by the {@link Compiler} when resolving HTML and CSS template URLs.
  * 
  * This class can be overridden by the application developer to create custom behavior.
  * 
  * See {@link Compiler}
  * 
  * ## Example
  * 
  * {@example compiler/ts/url_resolver/url_resolver.ts region='url_resolver'}
  **/
@JsType( isNative=true, namespace="ng.core" )
public class UrlResolver  {
    public Object _packagePrefix;
    @JsConstructor
    public UrlResolver(String /* optional */ _packagePrefix) {}
    public native  String resolve(String baseUrl,String url);
}
