package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.JsFunction1;
import fr.lteconsulting.angular2gwt.client.JsFunction;

/**
  * Generated from tests\@angular\common\testing\location_mock.d.ts
  * Package ng.core
  * Name SpyLocation
  * A spy for {@link Location} that allows tests to fire simulated location events.
  **/
@JsType( isNative=true, namespace="ng.core" )
public class SpyLocation extends Location {
    public JsArray<String> urlChanges;
    public Object _history;
    public Object _historyIndex;
    public native  void setInitialPath(String url);
    public native  void setBaseHref(String url);
    public native  String path();
    public native  boolean isCurrentPathEqualTo(String path,String /* optional */ query);
    public native  void simulateUrlPop(String pathname);
    public native  void simulateHashChange(String pathname);
    public native  String prepareExternalUrl(String url);
    public native  void go(String path,String /* optional */ query);
    public native  void replaceState(String path,String /* optional */ query);
    public native  void forward();
    public native  void back();
    public native  Object subscribe(JsFunction1<Object,Void> onNext,JsFunction1<Object,Void> /* optional */ onThrow,JsFunction<Void> /* optional */ onReturn);
    public native  String normalize(String url);
}
