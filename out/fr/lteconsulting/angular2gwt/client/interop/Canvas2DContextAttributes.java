package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name Canvas2DContextAttributes
  * Typescript fqn Canvas2DContextAttributes
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface Canvas2DContextAttributes {
    /* optional property alpha*/    @JsProperty(name="alpha")
    boolean getAlpha();

    @JsProperty(name="alpha")
    void setAlpha(boolean value);

    /* optional property willReadFrequently*/    @JsProperty(name="willReadFrequently")
    boolean getWillReadFrequently();

    @JsProperty(name="willReadFrequently")
    void setWillReadFrequently(boolean value);

    /* optional property storage*/    @JsProperty(name="storage")
    boolean getStorage();

    @JsProperty(name="storage")
    void setStorage(boolean value);
}
