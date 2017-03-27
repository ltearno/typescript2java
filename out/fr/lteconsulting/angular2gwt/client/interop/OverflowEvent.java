package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name OverflowEvent
  * Typescript fqn OverflowEvent
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface OverflowEvent extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="horizontalOverflow")
    boolean getHorizontalOverflow();

    @JsProperty(name="horizontalOverflow")
    void setHorizontalOverflow(boolean value);

    @JsProperty(name="orient")
    Number getOrient();

    @JsProperty(name="orient")
    void setOrient(Number value);

    @JsProperty(name="verticalOverflow")
    boolean getVerticalOverflow();

    @JsProperty(name="verticalOverflow")
    void setVerticalOverflow(boolean value);

    @JsProperty(name="BOTH")
    Number getBOTH();

    @JsProperty(name="BOTH")
    void setBOTH(Number value);

    @JsProperty(name="HORIZONTAL")
    Number getHORIZONTAL();

    @JsProperty(name="HORIZONTAL")
    void setHORIZONTAL(Number value);

    @JsProperty(name="VERTICAL")
    Number getVERTICAL();

    @JsProperty(name="VERTICAL")
    void setVERTICAL(Number value);
}
