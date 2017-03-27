package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name ProgressEvent
  * Typescript fqn ProgressEvent
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface ProgressEvent extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="lengthComputable")
    boolean getLengthComputable();

    @JsProperty(name="lengthComputable")
    void setLengthComputable(boolean value);

    @JsProperty(name="loaded")
    Number getLoaded();

    @JsProperty(name="loaded")
    void setLoaded(Number value);

    @JsProperty(name="total")
    Number getTotal();

    @JsProperty(name="total")
    void setTotal(Number value);

    void initProgressEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, boolean lengthComputableArg, Number loadedArg, Number totalArg);
}
