package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name Position
  * Typescript fqn Position
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface Position {
    @JsProperty(name="coords")
    Coordinates getCoords();

    @JsProperty(name="coords")
    void setCoords(Coordinates value);

    @JsProperty(name="timestamp")
    Number getTimestamp();

    @JsProperty(name="timestamp")
    void setTimestamp(Number value);
}
