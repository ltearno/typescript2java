package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.PlatformLocation;
import jsinterop.annotations.JsConstructor;
import ng.core.LocationChangeListener;

/**
  * Generated from tests\@angular\common\src\location\path_location_strategy.d.ts
  * Package ng.core
  * Name PathLocationStrategy
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface PathLocationStrategy extends LocationStrategy {
    @JsProperty(name="_platformLocation")
    Object get_platformLocation();
    @JsProperty(name="_platformLocation")
    void set_platformLocation(Object value);
    @JsProperty(name="_baseHref")
    Object get_baseHref();
    @JsProperty(name="_baseHref")
    void set_baseHref(Object value);
    @JsConstructor
    public PathLocationStrategy(PlatformLocation _platformLocation,String /* optional */ href) {}
     void onPopState(LocationChangeListener fn);
     String getBaseHref();
     String prepareExternalUrl(String internal);
     String path(boolean /* optional */ includeHash);
     void pushState(Object state,String title,String url,String queryParams);
     void replaceState(Object state,String title,String url,String queryParams);
     void forward();
     void back();
}
