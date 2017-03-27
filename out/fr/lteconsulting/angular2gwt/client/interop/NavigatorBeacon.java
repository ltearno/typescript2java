package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name NavigatorBeacon
  * Typescript fqn NavigatorBeacon
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface NavigatorBeacon {
    boolean sendBeacon(String url, Object /* optional */ data);
}
