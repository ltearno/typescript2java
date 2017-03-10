package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.LocationChangeListener;
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
@JsType( isNative=true, namespace="ng.core", name="PlatformLocation" )
public abstract class PlatformLocationImpl  {
    public native  String getBaseHrefFromDOM();
    public native  void onPopState(LocationChangeListener fn);
    public native  void onHashChange(LocationChangeListener fn);
    @JsProperty(name="pathname")
    String getPathname();
    @JsProperty(name="pathname")
    void setPathname(String value);
    @JsProperty(name="search")
    String getSearch();
    @JsProperty(name="search")
    void setSearch(String value);
    @JsProperty(name="hash")
    String getHash();
    @JsProperty(name="hash")
    void setHash(String value);
    public native  void replaceState(Object state,String title,String url);
    public native  void pushState(Object state,String title,String url);
    public native  void forward();
    public native  void back();
}
