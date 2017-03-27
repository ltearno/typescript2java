package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name CSSImportRule
  * Typescript fqn CSSImportRule
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface CSSImportRule extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="href")
    String getHref();

    @JsProperty(name="href")
    void setHref(String value);

    @JsProperty(name="media")
    MediaList getMedia();

    @JsProperty(name="media")
    void setMedia(MediaList value);

    @JsProperty(name="styleSheet")
    CSSStyleSheet getStyleSheet();

    @JsProperty(name="styleSheet")
    void setStyleSheet(CSSStyleSheet value);
}
