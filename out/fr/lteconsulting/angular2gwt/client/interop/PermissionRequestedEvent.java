package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name PermissionRequestedEvent
  * Typescript fqn PermissionRequestedEvent
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface PermissionRequestedEvent extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="permissionRequest")
    PermissionRequest getPermissionRequest();

    @JsProperty(name="permissionRequest")
    void setPermissionRequest(PermissionRequest value);
}
