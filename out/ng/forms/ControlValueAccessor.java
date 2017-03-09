package fr.lteconsulting.angular2gwt.client.interop.ng.forms;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;

/**
  * Generated from tests\@angular\forms\src\directives\control_value_accessor.d.ts
  * Package ng.forms
  * Name ControlValueAccessor
  * A bridge between a control and a native element.
  * 
  * A `ControlValueAccessor` abstracts the operations of writing a new value to a
  * DOM element representing an input control.
  * 
  * Please see {@link DefaultValueAccessor} for more information.
  **/
@JsType( isNative=true, name="Object", namespace=JsPackage.GLOBAL )
public class ControlValueAccessor  {
    public native  void writeValue(Object obj);
    public native  void registerOnChange(Object fn);
    public native  void registerOnTouched(Object fn);
    public native  /* optional */ void setDisabledState(boolean isDisabled);
}
