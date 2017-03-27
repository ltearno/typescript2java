package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name WebGLShaderPrecisionFormat
  * Typescript fqn WebGLShaderPrecisionFormat
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface WebGLShaderPrecisionFormat {
    @JsProperty(name="precision")
    Number getPrecision();

    @JsProperty(name="precision")
    void setPrecision(Number value);

    @JsProperty(name="rangeMax")
    Number getRangeMax();

    @JsProperty(name="rangeMax")
    void setRangeMax(Number value);

    @JsProperty(name="rangeMin")
    Number getRangeMin();

    @JsProperty(name="rangeMin")
    void setRangeMin(Number value);
}
