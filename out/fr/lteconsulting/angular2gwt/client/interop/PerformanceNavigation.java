package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name PerformanceNavigation
  * Typescript fqn PerformanceNavigation
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface PerformanceNavigation {
    @JsProperty(name="redirectCount")
    Number getRedirectCount();

    @JsProperty(name="redirectCount")
    void setRedirectCount(Number value);

    @JsProperty(name="type")
    Number getType();

    @JsProperty(name="type")
    void setType(Number value);

    @JsProperty(name="TYPE_BACK_FORWARD")
    Number getTYPE_BACK_FORWARD();

    @JsProperty(name="TYPE_BACK_FORWARD")
    void setTYPE_BACK_FORWARD(Number value);

    @JsProperty(name="TYPE_NAVIGATE")
    Number getTYPE_NAVIGATE();

    @JsProperty(name="TYPE_NAVIGATE")
    void setTYPE_NAVIGATE(Number value);

    @JsProperty(name="TYPE_RELOAD")
    Number getTYPE_RELOAD();

    @JsProperty(name="TYPE_RELOAD")
    void setTYPE_RELOAD(Number value);

    @JsProperty(name="TYPE_RESERVED")
    Number getTYPE_RESERVED();

    @JsProperty(name="TYPE_RESERVED")
    void setTYPE_RESERVED(Number value);

    Object toJSON();
}
