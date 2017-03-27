package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name VideoTrackListEventMap
  * Typescript fqn VideoTrackListEventMap
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface VideoTrackListEventMap {
    @JsProperty(name="addtrack")
    TrackEvent getAddtrack();

    @JsProperty(name="addtrack")
    void setAddtrack(TrackEvent value);

    @JsProperty(name="change")
    Event getChange();

    @JsProperty(name="change")
    void setChange(Event value);

    @JsProperty(name="removetrack")
    TrackEvent getRemovetrack();

    @JsProperty(name="removetrack")
    void setRemovetrack(TrackEvent value);
}
