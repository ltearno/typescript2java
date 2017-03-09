package fr.lteconsulting.angular2gwt.client.interop.ng.forms;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsFunction1;
import fr.lteconsulting.angular2gwt.client.JsFunction;
import ng.core.Renderer;
import ng.core.ElementRef;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\forms\src\directives\default_value_accessor.d.ts
  * Package ng.forms
  * Name DefaultValueAccessor
  * The default accessor for writing a value and listening to changes that is used by the
  * {@link NgModel}, {@link FormControlDirective}, and {@link FormControlName} directives.
  * 
  *   ### Example
  *   ```
  *   <input type="text" name="searchQuery" ngModel>
  *   ```
  * 
  *   
  **/
@JsType( isNative=true, namespace="ng.forms" )
public class DefaultValueAccessor extends ControlValueAccessor {
    public Object _renderer;
    public Object _elementRef;
    public JsFunction1<Object,Void> onChange;
    public JsFunction<Void> onTouched;
    @JsConstructor
    public DefaultValueAccessor(Renderer _renderer,ElementRef _elementRef) {}
    public native  void writeValue(Object value);
    public native  void registerOnChange(JsFunction1<Object,Void> fn);
    public native  void registerOnTouched(JsFunction<Void> fn);
    public native  void setDisabledState(boolean isDisabled);
}
