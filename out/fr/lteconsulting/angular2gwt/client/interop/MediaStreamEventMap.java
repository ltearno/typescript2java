package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MediaStreamEventMap
  * Typescript fqn MediaStreamEventMap
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MediaStreamEventMap {
    @JsProperty(name="active")
    Event getActive();

    @JsProperty(name="active")
    void setActive(Event value);

    @JsProperty(name="addtrack")
    MediaStreamTrackEvent getAddtrack();

    @JsProperty(name="addtrack")
    void setAddtrack(MediaStreamTrackEvent value);

    @JsProperty(name="inactive")
    Event getInactive();

    @JsProperty(name="inactive")
    void setInactive(Event value);

    @JsProperty(name="removetrack")
    MediaStreamTrackEvent getRemovetrack();

    @JsProperty(name="removetrack")
    void setRemovetrack(MediaStreamTrackEvent value);
}
