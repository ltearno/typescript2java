package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name LongRunningScriptDetectedEvent
  * Typescript fqn LongRunningScriptDetectedEvent
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface LongRunningScriptDetectedEvent extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="executionTime")
    Number getExecutionTime();

    @JsProperty(name="executionTime")
    void setExecutionTime(Number value);

    @JsProperty(name="stopPageScriptExecution")
    boolean getStopPageScriptExecution();

    @JsProperty(name="stopPageScriptExecution")
    void setStopPageScriptExecution(boolean value);
}
