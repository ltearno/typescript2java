package fr.lteconsulting.angular2gwt.client.interop.ng.forms;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;
import ng.core.SimpleChanges;

/**
  * Generated from tests\@angular\forms\src\directives\ng_model.d.ts
  * Package ng.forms
  * Name NgModel
  * 
  **/
@JsType( isNative=true, namespace="ng.forms" )
public class NgModel extends OnChanges {
    public Object viewModel;
    public String name;
    public boolean isDisabled;
    public Object model;
    public /* TypeLiteral */ Object options;
    public EventEmitter</* TypeLiteral */ Object> update;
    @JsConstructor
    public NgModel(ControlContainer parent,Array<Object /* UnionType */> validators,Array<Object /* UnionType */> asyncValidators,JsArray<ControlValueAccessor> valueAccessors) {}
    public native  void ngOnChanges(SimpleChanges changes);
    public native  void ngOnDestroy();
    public FormControl control;
    public JsArray<String> path;
    public Object formDirective;
    public ValidatorFn validator;
    public AsyncValidatorFn asyncValidator;
    public native  void viewToModelUpdate(Object newValue);
    public native  void _setUpControl();
    public native  void _isStandalone();
    public native  void _setUpStandalone();
    public native  void _checkForErrors();
    public native  void _checkParentType();
    public native  void _checkName();
    public native  void _updateValue();
    public native  void _updateDisabled();
}
