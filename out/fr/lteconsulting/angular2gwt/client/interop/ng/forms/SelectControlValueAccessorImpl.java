package fr.lteconsulting.angular2gwt.client.interop.ng.forms;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
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
@JsType( isNative=true, namespace="ng.forms", name="SelectControlValueAccessor" )
public class SelectControlValueAccessorImpl extends ControlValueAccessor {
    @JsProperty(name="_renderer")
    Object get_renderer();
    @JsProperty(name="_renderer")
    void set_renderer(Object value);
    @JsProperty(name="_elementRef")
    Object get_elementRef();
    @JsProperty(name="_elementRef")
    void set_elementRef(Object value);
    @JsProperty(name="value")
    Object getValue();
    @JsProperty(name="value")
    void setValue(Object value);
    @JsProperty(name="onChange")
    JsFunction1<Object,Void> getOnChange();
    @JsProperty(name="onChange")
    void setOnChange(JsFunction1<Object,Void> value);
    @JsProperty(name="onTouched")
    JsFunction<Void> getOnTouched();
    @JsProperty(name="onTouched")
    void setOnTouched(JsFunction<Void> value);
    @JsConstructor
    public SelectControlValueAccessorImpl(Renderer _renderer,ElementRef _elementRef) {}
    public native  void writeValue(Object value);
    public native  void registerOnChange(JsFunction1<Object,Object> fn);
    public native  void registerOnTouched(JsFunction<Object> fn);
    public native  void setDisabledState(boolean isDisabled);
}
