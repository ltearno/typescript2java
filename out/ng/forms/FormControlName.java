package fr.lteconsulting.angular2gwt.client.interop.ng.forms;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;
import ng.core.SimpleChanges;

/**
  * Generated from tests\@angular\forms\src\directives\reactive_directives\form_control_name.d.ts
  * Package ng.forms
  * Name FormControlName
  * 
  **/
@JsType( isNative=true, namespace="ng.forms" )
public class FormControlName extends OnChanges {
    public Object _added;
    public String name;
    public Object model;
    public EventEmitter</* TypeLiteral */ Object> update;
    public boolean isDisabled;
    @JsConstructor
    public FormControlName(ControlContainer parent,Array<Object /* UnionType */> validators,Array<Object /* UnionType */> asyncValidators,JsArray<ControlValueAccessor> valueAccessors) {}
    public native  void ngOnChanges(SimpleChanges changes);
    public native  void ngOnDestroy();
    public native  void viewToModelUpdate(Object newValue);
    public JsArray<String> path;
    public Object formDirective;
    public ValidatorFn validator;
    public AsyncValidatorFn asyncValidator;
    public FormControl control;
    public native  void _checkParentType();
    public native  void _setUpControl();
}
