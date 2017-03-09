package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\linker\view_utils.d.ts
  * Package ng.core
  * Name InlineArray2
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class InlineArray2<T> extends InlineArray<T> {
    public int length;
    public Object _v0;
    public Object _v1;
    @JsConstructor
    public InlineArray2(int length,T /* optional */ _v0,T /* optional */ _v1) {}
    public native  T get(int index);
    public native  void set(int index,T value);
}
