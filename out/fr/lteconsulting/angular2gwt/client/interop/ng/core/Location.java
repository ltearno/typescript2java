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
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface Location  {
    @JsConstructor
    public Location(LocationStrategy platformStrategy) {}
     String path(boolean /* optional */ includeHash);
     boolean isCurrentPathEqualTo(String path,String /* optional */ query);
     String normalize(String url);
     String prepareExternalUrl(String url);
     void go(String path,String /* optional */ query);
     void replaceState(String path,String /* optional */ query);
     void forward();
     void back();
     Object subscribe(JsFunction1<PopStateEvent,Void> onNext,JsFunction1<Object,Void> /* optional */ onThrow,JsFunction<Void> /* optional */ onReturn);
}
