package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.LocationStrategy;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsFunction1;
import ng.core.PopStateEvent;
import fr.lteconsulting.angular2gwt.client.JsFunction;

/**
  * Generated from tests\@angular\common\src\location\location.d.ts
  * Package ng.core
  * Name Location
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="Location" )
public class LocationImpl  {
    @JsConstructor
    public LocationImpl(LocationStrategy platformStrategy) {}
    public native  String path(boolean /* optional */ includeHash);
    public native  boolean isCurrentPathEqualTo(String path,String /* optional */ query);
    public native  String normalize(String url);
    public native  String prepareExternalUrl(String url);
    public native  void go(String path,String /* optional */ query);
    public native  void replaceState(String path,String /* optional */ query);
    public native  void forward();
    public native  void back();
    public native  Object subscribe(JsFunction1<PopStateEvent,Void> onNext,JsFunction1<Object,Void> /* optional */ onThrow,JsFunction<Void> /* optional */ onReturn);
    public static native  String normalizeQueryParams(String params);
    public static native  String joinWithSlash(String start,String end);
    public static native  String stripTrailingSlash(String url);
}
