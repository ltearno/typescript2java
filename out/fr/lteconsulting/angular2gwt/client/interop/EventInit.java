package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name EventInit
  * Typescript fqn EventInit
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface EventInit {
    /* optional property scoped*/    @JsProperty(name="scoped")
    boolean getScoped();

    @JsProperty(name="scoped")
    void setScoped(boolean value);

    /* optional property bubbles*/    @JsProperty(name="bubbles")
    boolean getBubbles();

    @JsProperty(name="bubbles")
    void setBubbles(boolean value);

    /* optional property cancelable*/    @JsProperty(name="cancelable")
    boolean getCancelable();

    @JsProperty(name="cancelable")
    void setCancelable(boolean value);
}
