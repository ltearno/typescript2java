package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name ShadowRootInit
  * Typescript fqn ShadowRootInit
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface ShadowRootInit {
    @JsProperty(name="mode")
    Object /* Union type */ getMode();

    @JsProperty(name="mode")
    void setMode(Object /* Union type */ value);

    /* optional property delegatesFocus*/    @JsProperty(name="delegatesFocus")
    boolean getDelegatesFocus();

    @JsProperty(name="delegatesFocus")
    void setDelegatesFocus(boolean value);
}
