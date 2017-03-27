package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name Date
  * Typescript fqn Date
  *
  * Enables basic storage and retrieval of dates and times. 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface Date {
    @JsProperty(name="getVarDate")
    JsFunction<VarDate> getGetVarDate();

    @JsProperty(name="getVarDate")
    void setGetVarDate(JsFunction<VarDate> value);
}
