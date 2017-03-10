package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
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
@JsType( isNative=true, namespace="ng.core", name="MockLocationStrategy" )
public class MockLocationStrategyImpl extends LocationStrategy {
    @JsProperty(name="internalBaseHref")
    String getInternalBaseHref();
    @JsProperty(name="internalBaseHref")
    void setInternalBaseHref(String value);
    @JsProperty(name="internalPath")
    String getInternalPath();
    @JsProperty(name="internalPath")
    void setInternalPath(String value);
    @JsProperty(name="internalTitle")
    String getInternalTitle();
    @JsProperty(name="internalTitle")
    void setInternalTitle(String value);
    @JsProperty(name="urlChanges")
    JsArray<String> getUrlChanges();
    @JsProperty(name="urlChanges")
    void setUrlChanges(JsArray<String> value);
    @JsConstructor
    public MockLocationStrategyImpl() {}
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
