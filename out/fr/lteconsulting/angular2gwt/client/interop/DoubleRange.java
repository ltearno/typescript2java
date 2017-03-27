package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name DoubleRange
  * Typescript fqn DoubleRange
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface DoubleRange {
    /* optional property max*/    @JsProperty(name="max")
    Number getMax();

    @JsProperty(name="max")
    void setMax(Number value);

    /* optional property min*/    @JsProperty(name="min")
    Number getMin();

    @JsProperty(name="min")
    void setMin(Number value);
}
