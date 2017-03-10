package fr.lteconsulting.angular2gwt.client.interop.ng.platformBrowser;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
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
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface BrowserPlatformLocation extends PlatformLocation {
    @JsProperty(name="_location")
    Object get_location();
    @JsProperty(name="_location")
    void set_location(Object value);
    @JsProperty(name="_history")
    Object get_history();
    @JsProperty(name="_history")
    void set_history(Object value);
    @JsConstructor
    public BrowserPlatformLocation() {}
    @JsProperty(name="location")
    Location getLocation();
    @JsProperty(name="location")
    void setLocation(Location value);
     String getBaseHrefFromDOM();
     void onPopState(LocationChangeListener fn);
     void onHashChange(LocationChangeListener fn);
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
     void pushState(Object state,String title,String url);
     void replaceState(Object state,String title,String url);
     void forward();
     void back();
}
