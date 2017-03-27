package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name ArrayBufferView
  * Typescript fqn ArrayBufferView
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface ArrayBufferView {
    /**
     * The ArrayBuffer instance referenced by the array.
     */
    @JsProperty(name="buffer")
    ArrayBuffer getBuffer();

    /**
     * The ArrayBuffer instance referenced by the array.
     */
    @JsProperty(name="buffer")
    void setBuffer(ArrayBuffer value);

    /**
     * The length in bytes of the array.
     */
    @JsProperty(name="byteLength")
    Number getByteLength();

    /**
     * The length in bytes of the array.
     */
    @JsProperty(name="byteLength")
    void setByteLength(Number value);

    /**
     * The offset in bytes of the array.
     */
    @JsProperty(name="byteOffset")
    Number getByteOffset();

    /**
     * The offset in bytes of the array.
     */
    @JsProperty(name="byteOffset")
    void setByteOffset(Number value);
}
