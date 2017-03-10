package fr.lteconsulting.angular2gwt.client.interop.ng.forms;

import jsinterop.annotations.JsType;

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
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ControlValueAccessor  {
     void writeValue(Object obj);
     void registerOnChange(Object fn);
     void registerOnTouched(Object fn);
     /* optional */ void setDisabledState(boolean isDisabled);
}
