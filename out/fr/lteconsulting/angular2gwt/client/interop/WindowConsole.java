package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name WindowConsole
  * Typescript fqn WindowConsole
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface WindowConsole {
    @JsProperty(name="console")
    Console getConsole();

    @JsProperty(name="console")
    void setConsole(Console value);
}
