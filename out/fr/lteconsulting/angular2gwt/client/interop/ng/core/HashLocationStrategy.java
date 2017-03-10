package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.PlatformLocation;
import jsinterop.annotations.JsConstructor;
import ng.core.LocationChangeListener;

/**
  * Generated from tests\@angular\common\src\location\hash_location_strategy.d.ts
  * Package ng.core
  * Name HashLocationStrategy
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface HashLocationStrategy extends LocationStrategy {
    @JsProperty(name="_platformLocation")
    Object get_platformLocation();
    @JsProperty(name="_platformLocation")
    void set_platformLocation(Object value);
    @JsProperty(name="_baseHref")
    Object get_baseHref();
    @JsProperty(name="_baseHref")
    void set_baseHref(Object value);
    @JsConstructor
    public HashLocationStrategy(PlatformLocation _platformLocation,String /* optional */ _baseHref) {}
     void onPopState(LocationChangeListener fn);
     String getBaseHref();
     String path(boolean /* optional */ includeHash);
     String prepareExternalUrl(String internal);
     void pushState(Object state,String title,String path,String queryParams);
     void replaceState(Object state,String title,String path,String queryParams);
     void forward();
     void back();
}
