package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name DeferredPermissionRequest
  * Typescript fqn DeferredPermissionRequest
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface DeferredPermissionRequest {
    @JsProperty(name="id")
    Number getId();

    @JsProperty(name="id")
    void setId(Number value);

    @JsProperty(name="type")
    String getType();

    @JsProperty(name="type")
    void setType(String value);

    @JsProperty(name="uri")
    String getUri();

    @JsProperty(name="uri")
    void setUri(String value);

    void allow();

    void deny();
}
