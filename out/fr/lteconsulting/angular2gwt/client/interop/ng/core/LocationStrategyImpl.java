package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.LocationChangeListener;

/**
  * Generated from tests\@angular\common\src\location\location_strategy.d.ts
  * Package ng.core
  * Name LocationStrategy
  * `LocationStrategy` is responsible for representing and reading route state
  * from the browser's URL. Angular provides two strategies:
  * {@link HashLocationStrategy} and {@link PathLocationStrategy}.
  * 
  * This is used under the hood of the {@link Location} service.
  * 
  * Applications should use the {@link Router} or {@link Location} services to
  * interact with application route state.
  * 
  * For instance, {@link HashLocationStrategy} produces URLs like
  * `http://example.com#/foo`, and {@link PathLocationStrategy} produces
  * `http://example.com/foo` as an equivalent URL.
  * 
  * See these two classes for more.
  **/
@JsType( isNative=true, namespace="ng.core", name="LocationStrategy" )
public abstract class LocationStrategyImpl  {
    public native  String path(boolean /* optional */ includeHash);
    public native  String prepareExternalUrl(String internal);
    public native  void pushState(Object state,String title,String url,String queryParams);
    public native  void replaceState(Object state,String title,String url,String queryParams);
    public native  void forward();
    public native  void back();
    public native  void onPopState(LocationChangeListener fn);
    public native  String getBaseHref();
}
