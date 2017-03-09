package fr.lteconsulting.angular2gwt.client.interop.ng.forms;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsFunction1;
import fr.lteconsulting.angular2gwt.client.JsFunction;
import ng.core.Renderer;
import ng.core.ElementRef;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\forms\src\directives\range_value_accessor.d.ts
  * Package ng.forms
  * Name RangeValueAccessor
  * The accessor for writing a range value and listening to changes that is used by the
  * {@link NgModel}, {@link FormControlDirective}, and {@link FormControlName} directives.
  * 
  *   ### Example
  *   ```
  *   <input type="range" [(ngModel)]="age" >
  *   ```
  **/
@JsType( isNative=true, namespace="ng.forms" )
public class RangeValueAccessor extends ControlValueAccessor {
    public Object _renderer;
    public Object _elementRef;
    public JsFunction1<Object,Void> onChange;
    public JsFunction<Void> onTouched;
    @JsConstructor
    public RangeValueAccessor(Renderer _renderer,ElementRef _elementRef) {}
    public native  void writeValue(Object value);
    public native  void registerOnChange(JsFunction1<Integer,Void> fn);
    public native  void registerOnTouched(JsFunction<Void> fn);
    public native  void setDisabledState(boolean isDisabled);
}
