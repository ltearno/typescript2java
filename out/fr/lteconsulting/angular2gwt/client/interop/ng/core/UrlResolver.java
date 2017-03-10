package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
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
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface UrlResolver  {
    @JsProperty(name="_packagePrefix")
    Object get_packagePrefix();
    @JsProperty(name="_packagePrefix")
    void set_packagePrefix(Object value);
    @JsConstructor
    public UrlResolver(String /* optional */ _packagePrefix) {}
     String resolve(String baseUrl,String url);
}
