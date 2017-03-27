package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name TextTrackCueEventMap
  * Typescript fqn TextTrackCueEventMap
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface TextTrackCueEventMap {
    @JsProperty(name="enter")
    Event getEnter();

    @JsProperty(name="enter")
    void setEnter(Event value);

    @JsProperty(name="exit")
    Event getExit();

    @JsProperty(name="exit")
    void setExit(Event value);
}
