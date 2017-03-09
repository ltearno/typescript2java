package fr.lteconsulting.angular2gwt.client.interop.ng.forms;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;
import ng.core.SimpleChanges;

/**
  * Generated from tests\@angular\forms\src\directives\reactive_directives\form_control_directive.d.ts
  * Package ng.forms
  * Name FormControlDirective
  * 
  **/
@JsType( isNative=true, namespace="ng.forms" )
public class FormControlDirective extends OnChanges {
    public Object viewModel;
    public FormControl form;
    public Object model;
    public EventEmitter</* TypeLiteral */ Object> update;
    public boolean isDisabled;
    @JsConstructor
    public FormControlDirective(Array<Object /* UnionType */> validators,Array<Object /* UnionType */> asyncValidators,JsArray<ControlValueAccessor> valueAccessors) {}
    public native  void ngOnChanges(SimpleChanges changes);
    public JsArray<String> path;
    public ValidatorFn validator;
    public AsyncValidatorFn asyncValidator;
    public FormControl control;
    public native  void viewToModelUpdate(Object newValue);
    public native  void _isControlChanged();
}
