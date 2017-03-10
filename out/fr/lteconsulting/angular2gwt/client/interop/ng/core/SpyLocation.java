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
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface SpyLocation extends Location {
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
     void setInitialPath(String url);
     void setBaseHref(String url);
     String path();
     boolean isCurrentPathEqualTo(String path,String /* optional */ query);
     void simulateUrlPop(String pathname);
     void simulateHashChange(String pathname);
     String prepareExternalUrl(String url);
     void go(String path,String /* optional */ query);
     void replaceState(String path,String /* optional */ query);
     void forward();
     void back();
     Object subscribe(JsFunction1<Object,Void> onNext,JsFunction1<Object,Void> /* optional */ onThrow,JsFunction<Void> /* optional */ onReturn);
     String normalize(String url);
}
