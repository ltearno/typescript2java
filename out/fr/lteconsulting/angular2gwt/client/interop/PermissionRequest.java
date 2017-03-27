package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name PermissionRequest
  * Typescript fqn PermissionRequest
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface PermissionRequest extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="state")
    String getState();

    @JsProperty(name="state")
    void setState(String value);

    void defer();
}
