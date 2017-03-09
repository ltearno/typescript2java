package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\common\src\location\path_location_strategy.d.ts
  * Package ng.core
  * Name PathLocationStrategy
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class PathLocationStrategy extends LocationStrategy {
    public Object _platformLocation;
    public Object _baseHref;
    @JsConstructor
    public PathLocationStrategy(PlatformLocation _platformLocation,String /* optional */ href) {}
    public native  void onPopState(LocationChangeListener fn);
    public native  String getBaseHref();
    public native  String prepareExternalUrl(String internal);
    public native  String path(boolean /* optional */ includeHash);
    public native  void pushState(Object state,String title,String url,String queryParams);
    public native  void replaceState(Object state,String title,String url,String queryParams);
    public native  void forward();
    public native  void back();
}
