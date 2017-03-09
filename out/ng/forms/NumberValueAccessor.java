package fr.lteconsulting.angular2gwt.client.interop.ng.forms;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsFunction1;
import fr.lteconsulting.angular2gwt.client.JsFunction;
import ng.core.Renderer;
import ng.core.ElementRef;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\forms\src\directives\number_value_accessor.d.ts
  * Package ng.forms
  * Name NumberValueAccessor
  * The accessor for writing a number value and listening to changes that is used by the
  * {@link NgModel}, {@link FormControlDirective}, and {@link FormControlName} directives.
  * 
  *   ### Example
  *   ```
  *   <input type="number" [(ngModel)]="age">
  *   ```
  **/
@JsType( isNative=true, namespace="ng.forms" )
public class NumberValueAccessor extends ControlValueAccessor {
    public Object _renderer;
    public Object _elementRef;
    public JsFunction1<Object,Void> onChange;
    public JsFunction<Void> onTouched;
    @JsConstructor
    public NumberValueAccessor(Renderer _renderer,ElementRef _elementRef) {}
    public native  void writeValue(int value);
    public native  void registerOnChange(JsFunction1<Integer,Void> fn);
    public native  void registerOnTouched(JsFunction<Void> fn);
    public native  void setDisabledState(boolean isDisabled);
}
