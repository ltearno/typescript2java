package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;

/**
  * Generated from tests\@angular\core\src\linker\view_utils.d.ts
  * Package ng.core
  * Name InlineArray
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface InlineArray<T>  {
    @JsProperty(name="length")
    int length();
    @JsProperty(name="length")
    void length(int value);
     T get(int index);
     void set(int index,T value);
}
