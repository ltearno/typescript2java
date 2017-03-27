package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name CacheQueryOptions
  * Typescript fqn CacheQueryOptions
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface CacheQueryOptions {
    /* optional property ignoreSearch*/    @JsProperty(name="ignoreSearch")
    boolean getIgnoreSearch();

    @JsProperty(name="ignoreSearch")
    void setIgnoreSearch(boolean value);

    /* optional property ignoreMethod*/    @JsProperty(name="ignoreMethod")
    boolean getIgnoreMethod();

    @JsProperty(name="ignoreMethod")
    void setIgnoreMethod(boolean value);

    /* optional property ignoreVary*/    @JsProperty(name="ignoreVary")
    boolean getIgnoreVary();

    @JsProperty(name="ignoreVary")
    void setIgnoreVary(boolean value);

    /* optional property cacheName*/    @JsProperty(name="cacheName")
    String getCacheName();

    @JsProperty(name="cacheName")
    void setCacheName(String value);
}
