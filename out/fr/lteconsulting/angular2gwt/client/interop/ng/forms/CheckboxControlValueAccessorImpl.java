package fr.lteconsulting.angular2gwt.client.interop.ng.forms;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
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
@JsType( isNative=true, namespace="ng.forms", name="CheckboxControlValueAccessor" )
public class CheckboxControlValueAccessorImpl extends ControlValueAccessor {
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
    public CheckboxControlValueAccessorImpl(Renderer _renderer,ElementRef _elementRef) {}
    public native  void writeValue(Object value);
    public native  void registerOnChange(JsFunction1<Object,/* TypeLiteral */ Object> fn);
    public native  void registerOnTouched(JsFunction</* TypeLiteral */ Object> fn);
    public native  void setDisabledState(boolean isDisabled);
}
