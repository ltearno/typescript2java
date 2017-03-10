package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\change_detection\differs\default_keyvalue_differ.d.ts
  * Package ng.core
  * Name KeyValueChangeRecord
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface KeyValueChangeRecord  {
    @JsProperty(name="key")
    Object getKey();
    @JsProperty(name="key")
    void setKey(Object value);
    @JsProperty(name="previousValue")
    Object getPreviousValue();
    @JsProperty(name="previousValue")
    void setPreviousValue(Object value);
    @JsProperty(name="currentValue")
    Object getCurrentValue();
    @JsProperty(name="currentValue")
    void setCurrentValue(Object value);
    @JsConstructor
    public KeyValueChangeRecord(Object key) {}
     String toString();
}
