package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;

/**
  * Generated from tests\@angular\common\src\location\platform_location.d.ts
  * Package ng.core
  * Name PlatformLocation
  * This class should not be used directly by an application developer. Instead, use
  * {@link Location}.
  * 
  * `PlatformLocation` encapsulates all calls to DOM apis, which allows the Router to be platform
  * agnostic.
  * This means that we can have different implementation of `PlatformLocation` for the different
  * platforms
  * that angular supports. For example, the default `PlatformLocation` is {@link
  * BrowserPlatformLocation},
  * however when you run your app in a WebWorker you use {@link WebWorkerPlatformLocation}.
  * 
  * The `PlatformLocation` class is used directly by all implementations of {@link LocationStrategy}
  * when
  * they need to interact with the DOM apis like pushState, popState, etc...
  * 
  * {@link LocationStrategy} in turn is used by the {@link Location} service which is used directly
  * by
  * the {@link Router} in order to navigate between routes. Since all interactions between {@link
  * Router} /
  * {@link Location} / {@link LocationStrategy} and DOM apis flow through the `PlatformLocation`
  * class
  * they are all platform independent.
  **/
@JsType( isNative=true, namespace="ng.core" )
public interface PlatformLocation  {
     String getBaseHrefFromDOM();
     void onPopState(LocationChangeListener fn);
     void onHashChange(LocationChangeListener fn);
    @JsProperty(name="pathname")
    String pathname();
    @JsProperty(name="pathname")
    void pathname(String value);
    @JsProperty(name="search")
    String search();
    @JsProperty(name="search")
    void search(String value);
    @JsProperty(name="hash")
    String hash();
    @JsProperty(name="hash")
    void hash(String value);
     void replaceState(Object state,String title,String url);
     void pushState(Object state,String title,String url);
     void forward();
     void back();
}
