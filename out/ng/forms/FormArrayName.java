package fr.lteconsulting.angular2gwt.client.interop.ng.forms;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\forms\src\directives\reactive_directives\form_group_name.d.ts
  * Package ng.forms
  * Name FormArrayName
  * 
  **/
@JsType( isNative=true, namespace="ng.forms" )
public class FormArrayName extends OnInit {
    public String name;
    @JsConstructor
    public FormArrayName(ControlContainer parent,JsArray<Object> validators,JsArray<Object> asyncValidators) {}
    public native  void ngOnInit();
    public native  void ngOnDestroy();
    public FormArray control;
    public FormGroupDirective formDirective;
    public JsArray<String> path;
    public ValidatorFn validator;
    public AsyncValidatorFn asyncValidator;
    public native  void _checkParentType();
}
