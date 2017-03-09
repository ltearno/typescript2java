package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\linker\view_utils.d.ts
  * Package ng.core
  * Name InlineArray8
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class InlineArray8<T> extends InlineArray<T> {
    public int length;
    public Object _v0;
    public Object _v1;
    public Object _v2;
    public Object _v3;
    public Object _v4;
    public Object _v5;
    public Object _v6;
    public Object _v7;
    @JsConstructor
    public InlineArray8(int length,T /* optional */ _v0,T /* optional */ _v1,T /* optional */ _v2,T /* optional */ _v3,T /* optional */ _v4,T /* optional */ _v5,T /* optional */ _v6,T /* optional */ _v7) {}
    public native  T get(int index);
    public native  void set(int index,T value);
}
