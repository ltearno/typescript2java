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
@JsType( isNative=true, namespace="ng.core", name="InlineArrayDynamic" )
public class InlineArrayDynamicImpl<T> extends InlineArray<T> {
    @JsProperty(name="length")
    int getLength();
    @JsProperty(name="length")
    void setLength(int value);
    @JsProperty(name="_values")
    Object get_values();
    @JsProperty(name="_values")
    void set_values(Object value);
    @JsConstructor
    public InlineArrayDynamicImpl(int length,JsArray<Object> /* optional */ undefined) {}
    public native  Object get(int index);
    public native  void set(int index,T value);
}
