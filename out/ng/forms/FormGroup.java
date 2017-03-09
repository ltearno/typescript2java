package fr.lteconsulting.angular2gwt.client.interop.ng.forms;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\forms\src\model.d.ts
  * Package ng.forms
  * Name FormGroup
  * 
  **/
@JsType( isNative=true, namespace="ng.forms" )
public class FormGroup extends AbstractControl {
    public JsTypedObject<String,AbstractControl> controls;
    @JsConstructor
    public FormGroup(JsTypedObject<String,AbstractControl> controls,ValidatorFn /* optional */ validator,AsyncValidatorFn /* optional */ asyncValidator) {}
    public native  AbstractControl registerControl(String name,AbstractControl control);
    public native  void addControl(String name,AbstractControl control);
    public native  void removeControl(String name);
    public native  void setControl(String name,AbstractControl control);
    public native  boolean contains(String controlName);
    public native  void setValue(JsTypedObject<String,Object> value,/* TypeLiteral */ Object /* optional */ undefined);
    public native  void patchValue(JsTypedObject<String,Object> value,/* TypeLiteral */ Object /* optional */ undefined);
    public native  void reset(Object /* optional */ value,/* TypeLiteral */ Object /* optional */ undefined);
    public native  Object getRawValue();
}
