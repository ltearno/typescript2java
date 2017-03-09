package fr.lteconsulting.angular2gwt.client.interop.ng.forms;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsFunction1;
import fr.lteconsulting.angular2gwt.client.JsFunction;
import ng.core.Renderer;
import ng.core.ElementRef;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\forms\src\directives\checkbox_value_accessor.d.ts
  * Package ng.forms
  * Name CheckboxControlValueAccessor
  * The accessor for writing a value and listening to changes on a checkbox input element.
  * 
  *   ### Example
  *   ```
  *   <input type="checkbox" name="rememberLogin" ngModel>
  *   ```
  * 
  *   
  **/
@JsType( isNative=true, namespace="ng.forms" )
public class CheckboxControlValueAccessor extends ControlValueAccessor {
    public Object _renderer;
    public Object _elementRef;
    public JsFunction1<Object,Void> onChange;
    public JsFunction<Void> onTouched;
    @JsConstructor
    public CheckboxControlValueAccessor(Renderer _renderer,ElementRef _elementRef) {}
    public native  void writeValue(Object value);
    public native  void registerOnChange(JsFunction1<Object,/* TypeLiteral */ Object> fn);
    public native  void registerOnTouched(JsFunction</* TypeLiteral */ Object> fn);
    public native  void setDisabledState(boolean isDisabled);
}