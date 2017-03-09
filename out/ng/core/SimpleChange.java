package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\change_detection\change_detection_util.d.ts
  * Package ng.core
  * Name SimpleChange
  * Represents a basic change from a previous to a new value.
  **/
@JsType( isNative=true, namespace="ng.core" )
public class SimpleChange  {
    public Object previousValue;
    public Object currentValue;
    @JsConstructor
    public SimpleChange(Object previousValue,Object currentValue) {}
    public native  boolean isFirstChange();
}
