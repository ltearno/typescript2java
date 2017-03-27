package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MSWebViewSettings
  * Typescript fqn MSWebViewSettings
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MSWebViewSettings {
    @JsProperty(name="isIndexedDBEnabled")
    boolean getIsIndexedDBEnabled();

    @JsProperty(name="isIndexedDBEnabled")
    void setIsIndexedDBEnabled(boolean value);

    @JsProperty(name="isJavaScriptEnabled")
    boolean getIsJavaScriptEnabled();

    @JsProperty(name="isJavaScriptEnabled")
    void setIsJavaScriptEnabled(boolean value);
}
