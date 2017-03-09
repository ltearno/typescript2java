package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsFunction1;

/**
  * Generated from tests\@angular\common\testing\mock_location_strategy.d.ts
  * Package ng.core
  * Name MockLocationStrategy
  * A mock implementation of {@link LocationStrategy} that allows tests to fire simulated
  * location events.
  **/
@JsType( isNative=true, namespace="ng.core" )
public class MockLocationStrategy extends LocationStrategy {
    public String internalBaseHref;
    public String internalPath;
    public String internalTitle;
    public JsArray<String> urlChanges;
    @JsConstructor
    public MockLocationStrategy() {}
    public native  void simulatePopState(String url);
    public native  String path(boolean /* optional */ includeHash);
    public native  String prepareExternalUrl(String internal);
    public native  void pushState(Object ctx,String title,String path,String query);
    public native  void replaceState(Object ctx,String title,String path,String query);
    public native  void onPopState(JsFunction1<Object,Void> fn);
    public native  String getBaseHref();
    public native  void back();
    public native  void forward();
}
