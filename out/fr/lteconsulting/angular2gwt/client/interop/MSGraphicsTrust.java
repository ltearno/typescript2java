package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MSGraphicsTrust
  * Typescript fqn MSGraphicsTrust
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MSGraphicsTrust {
    @JsProperty(name="constrictionActive")
    boolean getConstrictionActive();

    @JsProperty(name="constrictionActive")
    void setConstrictionActive(boolean value);

    @JsProperty(name="status")
    String getStatus();

    @JsProperty(name="status")
    void setStatus(String value);
}
