package fr.lteconsulting.angular2gwt.client.interop.ng.forms;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsFunction;
import ng.core.Renderer;
import ng.core.ElementRef;
import ng.forms.RadioControlRegistry;
import ng.core.Injector;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsFunction1;

/**
  * Generated from tests\@angular\forms\src\directives\radio_control_value_accessor.d.ts
  * Package ng.forms
  * Name RadioControlValueAccessor
  * 
  **/
@JsType( isNative=true, namespace="ng.forms", name="RadioControlValueAccessor" )
public class RadioControlValueAccessorImpl extends ControlValueAccessor {
    @JsProperty(name="_renderer")
    Object get_renderer();
    @JsProperty(name="_renderer")
    void set_renderer(Object value);
    @JsProperty(name="_elementRef")
    Object get_elementRef();
    @JsProperty(name="_elementRef")
    void set_elementRef(Object value);
    @JsProperty(name="_registry")
    Object get_registry();
    @JsProperty(name="_registry")
    void set_registry(Object value);
    @JsProperty(name="_injector")
    Object get_injector();
    @JsProperty(name="_injector")
    void set_injector(Object value);
    @JsProperty(name="onChange")
    JsFunction<Void> getOnChange();
    @JsProperty(name="onChange")
    void setOnChange(JsFunction<Void> value);
    @JsProperty(name="onTouched")
    JsFunction<Void> getOnTouched();
    @JsProperty(name="onTouched")
    void setOnTouched(JsFunction<Void> value);
    @JsProperty(name="name")
    String getName();
    @JsProperty(name="name")
    void setName(String value);
    @JsProperty(name="formControlName")
    String getFormControlName();
    @JsProperty(name="formControlName")
    void setFormControlName(String value);
    @JsProperty(name="value")
    Object getValue();
    @JsProperty(name="value")
    void setValue(Object value);
    @JsConstructor
    public RadioControlValueAccessorImpl(Renderer _renderer,ElementRef _elementRef,RadioControlRegistry _registry,Injector _injector) {}
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
