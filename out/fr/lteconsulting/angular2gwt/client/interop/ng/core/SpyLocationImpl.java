package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsFunction1;
import fr.lteconsulting.angular2gwt.client.JsFunction;

/**
  * Generated from tests\@angular\common\testing\location_mock.d.ts
  * Package ng.core
  * Name SpyLocation
  * A spy for {@link Location} that allows tests to fire simulated location events.
  **/
@JsType( isNative=true, namespace="ng.core", name="SpyLocation" )
public class SpyLocationImpl extends Location {
    @JsProperty(name="urlChanges")
    JsArray<String> getUrlChanges();
    @JsProperty(name="urlChanges")
    void setUrlChanges(JsArray<String> value);
    @JsProperty(name="_history")
    Object get_history();
    @JsProperty(name="_history")
    void set_history(Object value);
    @JsProperty(name="_historyIndex")
    Object get_historyIndex();
    @JsProperty(name="_historyIndex")
    void set_historyIndex(Object value);
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
