package fr.lteconsulting.angular2gwt.client.interop.ng.forms;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsFunction1;
import fr.lteconsulting.angular2gwt.client.JsFunction;
import ng.core.Renderer;
import ng.core.ElementRef;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\forms\src\directives\select_control_value_accessor.d.ts
  * Package ng.forms
  * Name SelectControlValueAccessor
  * 
  **/
@JsType( isNative=true, namespace="ng.forms" )
public class SelectControlValueAccessor extends ControlValueAccessor {
    public Object _renderer;
    public Object _elementRef;
    public Object value;
    public JsFunction1<Object,Void> onChange;
    public JsFunction<Void> onTouched;
    @JsConstructor
    public SelectControlValueAccessor(Renderer _renderer,ElementRef _elementRef) {}
    public native  void writeValue(Object value);
    public native  void registerOnChange(JsFunction1<Object,Object> fn);
    public native  void registerOnTouched(JsFunction<Object> fn);
    public native  void setDisabledState(boolean isDisabled);
}
