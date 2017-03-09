package fr.lteconsulting.angular2gwt.client.interop.ng.forms;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;

/**
  * Generated from tests\@angular\forms\src\directives\ng_form.d.ts
  * Package ng.forms
  * Name NgForm
  * 
  **/
@JsType( isNative=true, namespace="ng.forms" )
public class NgForm extends Form {
    public Object _submitted;
    public FormGroup form;
    public EventEmitter</* TypeLiteral */ Object> ngSubmit;
    @JsConstructor
    public NgForm(JsArray<Object> validators,JsArray<Object> asyncValidators) {}
    public boolean submitted;
    public Form formDirective;
    public FormGroup control;
    public JsArray<String> path;
    public JsTypedObject<String,AbstractControl> controls;
    public native  void addControl(NgModel dir);
    public native  FormControl getControl(NgModel dir);
    public native  void removeControl(NgModel dir);
    public native  void addFormGroup(NgModelGroup dir);
    public native  void removeFormGroup(NgModelGroup dir);
    public native  FormGroup getFormGroup(NgModelGroup dir);
    public native  void updateModel(NgControl dir,Object value);
    public native  void setValue(JsTypedObject<String,Object> value);
    public native  boolean onSubmit(Event $event);
    public native  void onReset();
    public native  void resetForm(Object /* optional */ value);
}
