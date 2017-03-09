package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\change_detection\differs\default_keyvalue_differ.d.ts
  * Package ng.core
  * Name KeyValueChangeRecord
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class KeyValueChangeRecord  {
    public Object key;
    public Object previousValue;
    public Object currentValue;
    @JsConstructor
    public KeyValueChangeRecord(Object key) {}
    public native  String toString();
}
