package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\linker\view_utils.d.ts
  * Package ng.core
  * Name InlineArrayDynamic
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface InlineArrayDynamic<T> extends InlineArray<T> {
    @JsProperty(name="length")
    int getLength();
    @JsProperty(name="length")
    void setLength(int value);
    @JsProperty(name="_values")
    Object get_values();
    @JsProperty(name="_values")
    void set_values(Object value);
    @JsConstructor
    public InlineArrayDynamic(int length,JsArray<Object> /* optional */ undefined) {}
     Object get(int index);
     void set(int index,T value);
}
