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
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface SimpleChange  {
    @JsProperty(name="previousValue")
    Object getPreviousValue();
    @JsProperty(name="previousValue")
    void setPreviousValue(Object value);
    @JsProperty(name="currentValue")
    Object getCurrentValue();
    @JsProperty(name="currentValue")
    void setCurrentValue(Object value);
    @JsConstructor
    public SimpleChange(Object previousValue,Object currentValue) {}
     boolean isFirstChange();
}
