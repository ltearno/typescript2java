package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name ANGLE_instanced_arrays
  * Typescript fqn ANGLE_instanced_arrays
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface ANGLE_instanced_arrays {
    @JsProperty(name="VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE")
    Number getVERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE();

    @JsProperty(name="VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE")
    void setVERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE(Number value);

    void drawArraysInstancedANGLE(Number mode, Number first, Number count, Number primcount);

    void drawElementsInstancedANGLE(Number mode, Number count, Number type, Number offset, Number primcount);

    void vertexAttribDivisorANGLE(Number index, Number divisor);
}
