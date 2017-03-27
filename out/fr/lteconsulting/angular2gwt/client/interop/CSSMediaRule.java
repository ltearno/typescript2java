package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name CSSMediaRule
  * Typescript fqn CSSMediaRule
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface CSSMediaRule extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="media")
    MediaList getMedia();

    @JsProperty(name="media")
    void setMedia(MediaList value);
}
