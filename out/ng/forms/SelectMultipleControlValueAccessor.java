package fr.lteconsulting.angular2gwt.client.interop.ng.forms;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsFunction1;
import fr.lteconsulting.angular2gwt.client.JsFunction;
import ng.core.Renderer;
import ng.core.ElementRef;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\forms\src\directives\select_multiple_control_value_accessor.d.ts
  * Package ng.forms
  * Name SelectMultipleControlValueAccessor
  * The accessor for writing a value and listening to changes on a select element.
  **/
@JsType( isNative=true, namespace="ng.forms" )
public class SelectMultipleControlValueAccessor extends ControlValueAccessor {
    public Object _renderer;
    public Object _elementRef;
    public Object value;
    public JsFunction1<Object,Void> onChange;
    public JsFunction<Void> onTouched;
    @JsConstructor
    public SelectMultipleControlValueAccessor(Renderer _renderer,ElementRef _elementRef) {}
    public native  void writeValue(Object value);
    public native  void registerOnChange(JsFunction1<Object,Object> fn);
    public native  void registerOnTouched(JsFunction<Object> fn);
    public native  void setDisabledState(boolean isDisabled);
}
