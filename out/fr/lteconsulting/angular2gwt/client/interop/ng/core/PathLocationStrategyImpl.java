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
@JsType( isNative=true, namespace="ng.core", name="PathLocationStrategy" )
public class PathLocationStrategyImpl extends LocationStrategy {
    @JsProperty(name="_platformLocation")
    Object get_platformLocation();
    @JsProperty(name="_platformLocation")
    void set_platformLocation(Object value);
    @JsProperty(name="_baseHref")
    Object get_baseHref();
    @JsProperty(name="_baseHref")
    void set_baseHref(Object value);
    @JsConstructor
    public PathLocationStrategyImpl(PlatformLocation _platformLocation,String /* optional */ href) {}
    public native  void onPopState(LocationChangeListener fn);
    public native  String getBaseHref();
    public native  String prepareExternalUrl(String internal);
    public native  String path(boolean /* optional */ includeHash);
    public native  void pushState(Object state,String title,String url,String queryParams);
    public native  void replaceState(Object state,String title,String url,String queryParams);
    public native  void forward();
    public native  void back();
}
