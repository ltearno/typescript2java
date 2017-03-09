package fr.lteconsulting.angular2gwt.client.interop.ng.forms;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsFunction;
import ng.core.Renderer;
import ng.core.ElementRef;
import ng.core.Injector;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsFunction1;

/**
  * Generated from tests\@angular\forms\src\directives\radio_control_value_accessor.d.ts
  * Package ng.forms
  * Name RadioControlValueAccessor
  * 
  **/
@JsType( isNative=true, namespace="ng.forms" )
public class RadioControlValueAccessor extends ControlValueAccessor {
    public Object _renderer;
    public Object _elementRef;
    public Object _registry;
    public Object _injector;
    public JsFunction<Void> onChange;
    public JsFunction<Void> onTouched;
    public String name;
    public String formControlName;
    public Object value;
    @JsConstructor
    public RadioControlValueAccessor(Renderer _renderer,ElementRef _elementRef,RadioControlRegistry _registry,Injector _injector) {}
    public native  void ngOnInit();
    public native  void ngOnDestroy();
    public native  void writeValue(Object value);
    public native  void registerOnChange(JsFunction1<Object,/* TypeLiteral */ Object> fn);
    public native  void fireUncheck(Object value);
    public native  void registerOnTouched(JsFunction</* TypeLiteral */ Object> fn);
    public native  void setDisabledState(boolean isDisabled);
    public native  void _checkName();
    public native  void _throwNameError();
}
