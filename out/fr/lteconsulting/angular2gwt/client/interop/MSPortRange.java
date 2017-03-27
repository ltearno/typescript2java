package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MSPortRange
  * Typescript fqn MSPortRange
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MSPortRange {
    /* optional property min*/    @JsProperty(name="min")
    Number getMin();

    @JsProperty(name="min")
    void setMin(Number value);

    /* optional property max*/    @JsProperty(name="max")
    Number getMax();

    @JsProperty(name="max")
    void setMax(Number value);
}
