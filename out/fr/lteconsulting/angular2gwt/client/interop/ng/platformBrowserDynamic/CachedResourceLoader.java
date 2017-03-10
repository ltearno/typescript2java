package fr.lteconsulting.angular2gwt.client.interop.ng.platformBrowserDynamic;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\platform-browser-dynamic\src\resource_loader\resource_loader_cache.d.ts
  * Package ng.platformBrowserDynamic
  * Name CachedResourceLoader
  * An implementation of ResourceLoader that uses a template cache to avoid doing an actual
  * ResourceLoader.
  * 
  * The template cache needs to be built and loaded into window.$templateCache
  * via a separate mechanism.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface CachedResourceLoader extends ResourceLoader {
    @JsProperty(name="_cache")
    Object get_cache();
    @JsProperty(name="_cache")
    void set_cache(Object value);
    @JsConstructor
    public CachedResourceLoader() {}
     Promise<String> get(String url);
}
