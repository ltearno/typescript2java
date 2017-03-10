package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\change_detection\change_detection_util.d.ts
  * Package ng.core
  * Name SimpleChange
  * Represents a basic change from a previous to a new value.
  **/
@JsType( isNative=true, namespace="ng.core", name="SimpleChange" )
public class SimpleChangeImpl  {
    @JsProperty(name="previousValue")
    Object getPreviousValue();
    @JsProperty(name="previousValue")
    void setPreviousValue(Object value);
    @JsProperty(name="currentValue")
    Object getCurrentValue();
    @JsProperty(name="currentValue")
    void setCurrentValue(Object value);
    @JsConstructor
    public SimpleChangeImpl(Object previousValue,Object currentValue) {}
    public native  boolean isFirstChange();
}
