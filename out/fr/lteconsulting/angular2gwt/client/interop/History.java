package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name History
  * Typescript fqn History
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface History {
    @JsProperty(name="length")
    Number getLength();

    @JsProperty(name="length")
    void setLength(Number value);

    @JsProperty(name="state")
    Object getState();

    @JsProperty(name="state")
    void setState(Object value);

    @JsProperty(name="scrollRestoration")
    Object /* Union type */ getScrollRestoration();

    @JsProperty(name="scrollRestoration")
    void setScrollRestoration(Object /* Union type */ value);

    void back();

    void forward();

    void go(Number /* optional */ delta);

    void pushState(Object data, String title, Object /* UnionType */ /* optional */ url);

    void replaceState(Object data, String title, Object /* UnionType */ /* optional */ url);
}
