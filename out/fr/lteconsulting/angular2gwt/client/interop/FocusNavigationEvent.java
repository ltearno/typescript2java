package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name FocusNavigationEvent
  * Typescript fqn FocusNavigationEvent
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface FocusNavigationEvent extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="navigationReason")
    String getNavigationReason();

    @JsProperty(name="navigationReason")
    void setNavigationReason(String value);

    @JsProperty(name="originHeight")
    Number getOriginHeight();

    @JsProperty(name="originHeight")
    void setOriginHeight(Number value);

    @JsProperty(name="originLeft")
    Number getOriginLeft();

    @JsProperty(name="originLeft")
    void setOriginLeft(Number value);

    @JsProperty(name="originTop")
    Number getOriginTop();

    @JsProperty(name="originTop")
    void setOriginTop(Number value);

    @JsProperty(name="originWidth")
    Number getOriginWidth();

    @JsProperty(name="originWidth")
    void setOriginWidth(Number value);

    void requestFocus();
}
