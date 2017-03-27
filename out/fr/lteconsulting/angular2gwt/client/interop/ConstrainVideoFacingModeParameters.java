package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name ConstrainVideoFacingModeParameters
  * Typescript fqn ConstrainVideoFacingModeParameters
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface ConstrainVideoFacingModeParameters {
    /* optional property exact*/    @JsProperty(name="exact")
    Object /* Union type */ getExact();

    @JsProperty(name="exact")
    void setExact(Object /* Union type */ value);

    /* optional property ideal*/    @JsProperty(name="ideal")
    Object /* Union type */ getIdeal();

    @JsProperty(name="ideal")
    void setIdeal(Object /* Union type */ value);
}
