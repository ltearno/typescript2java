package fr.lteconsulting.angular2gwt.client.interop.ng.forms;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
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
@JsType( isNative=true, namespace="ng.forms", name="RangeValueAccessor" )
public class RangeValueAccessorImpl extends ControlValueAccessor {
    @JsProperty(name="_renderer")
    Object get_renderer();
    @JsProperty(name="_renderer")
    void set_renderer(Object value);
    @JsProperty(name="_elementRef")
    Object get_elementRef();
    @JsProperty(name="_elementRef")
    void set_elementRef(Object value);
    @JsProperty(name="onChange")
    JsFunction1<Object,Void> getOnChange();
    @JsProperty(name="onChange")
    void setOnChange(JsFunction1<Object,Void> value);
    @JsProperty(name="onTouched")
    JsFunction<Void> getOnTouched();
    @JsProperty(name="onTouched")
    void setOnTouched(JsFunction<Void> value);
    @JsConstructor
    public RangeValueAccessorImpl(Renderer _renderer,ElementRef _elementRef) {}
    public native  void writeValue(Object value);
    public native  void registerOnChange(JsFunction1<Integer,Void> fn);
    public native  void registerOnTouched(JsFunction<Void> fn);
    public native  void setDisabledState(boolean isDisabled);
}
