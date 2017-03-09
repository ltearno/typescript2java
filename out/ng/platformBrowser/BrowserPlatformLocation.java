package fr.lteconsulting.angular2gwt.client.interop.ng.platformBrowser;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;
import ng.core.LocationChangeListener;

/**
  * Generated from tests\@angular\platform-browser\src\browser\location\browser_platform_location.d.ts
  * Package ng.platformBrowser
  * Name BrowserPlatformLocation
  * `PlatformLocation` encapsulates all of the direct calls to platform APIs.
  * This class should not be used directly by an application developer. Instead, use
  * {@link Location}.
  **/
@JsType( isNative=true, namespace="ng.platformBrowser" )
public class BrowserPlatformLocation extends PlatformLocation {
    public Object _location;
    public Object _history;
    @JsConstructor
    public BrowserPlatformLocation() {}
    public Location location;
    public native  String getBaseHrefFromDOM();
    public native  void onPopState(LocationChangeListener fn);
    public native  void onHashChange(LocationChangeListener fn);
    public String pathname;
    public String search;
    public String hash;
    public native  void pushState(Object state,String title,String url);
    public native  void replaceState(Object state,String title,String url);
    public native  void forward();
    public native  void back();
}
