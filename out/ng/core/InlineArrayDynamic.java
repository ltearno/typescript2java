package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\linker\view_utils.d.ts
  * Package ng.core
  * Name InlineArrayDynamic
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class InlineArrayDynamic<T> extends InlineArray<T> {
    public int length;
    public Object _values;
    @JsConstructor
    public InlineArrayDynamic(int length,JsArray<Object> /* optional */ undefined) {}
    public native  Object get(int index);
    public native  void set(int index,T value);
}
