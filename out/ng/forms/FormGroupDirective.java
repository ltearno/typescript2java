package fr.lteconsulting.angular2gwt.client.interop.ng.forms;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;
import ng.core.SimpleChanges;

/**
  * Generated from tests\@angular\forms\src\directives\reactive_directives\form_group_directive.d.ts
  * Package ng.forms
  * Name FormGroupDirective
  * 
  **/
@JsType( isNative=true, namespace="ng.forms" )
public class FormGroupDirective extends Form {
    public Object _validators;
    public Object _asyncValidators;
    public Object _submitted;
    public Object _oldForm;
    public JsArray<FormControlName> directives;
    public FormGroup form;
    public EventEmitter</* TypeLiteral */ Object> ngSubmit;
    @JsConstructor
    public FormGroupDirective(JsArray<Object> _validators,JsArray<Object> _asyncValidators) {}
    public native  void ngOnChanges(SimpleChanges changes);
    public boolean submitted;
    public Form formDirective;
    public FormGroup control;
    public JsArray<String> path;
    public native  FormControl addControl(FormControlName dir);
    public native  FormControl getControl(FormControlName dir);
    public native  void removeControl(FormControlName dir);
    public native  void addFormGroup(FormGroupName dir);
    public native  void removeFormGroup(FormGroupName dir);
    public native  FormGroup getFormGroup(FormGroupName dir);
    public native  void addFormArray(FormArrayName dir);
    public native  void removeFormArray(FormArrayName dir);
    public native  FormArray getFormArray(FormArrayName dir);
    public native  void updateModel(FormControlName dir,Object value);
    public native  boolean onSubmit(Event $event);
    public native  void onReset();
    public native  void resetForm(Object /* optional */ value);
    public native  void _updateRegistrations();
    public native  void _updateValidators();
    public native  void _checkFormPresent();
}
