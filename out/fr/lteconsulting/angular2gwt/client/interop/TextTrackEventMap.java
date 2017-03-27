package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name TextTrackEventMap
  * Typescript fqn TextTrackEventMap
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface TextTrackEventMap {
    @JsProperty(name="cuechange")
    Event getCuechange();

    @JsProperty(name="cuechange")
    void setCuechange(Event value);

    @JsProperty(name="error")
    Event getError();

    @JsProperty(name="error")
    void setError(Event value);

    @JsProperty(name="load")
    Event getLoad();

    @JsProperty(name="load")
    void setLoad(Event value);
}
