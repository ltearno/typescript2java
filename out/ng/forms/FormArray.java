package fr.lteconsulting.angular2gwt.client.interop.ng.forms;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\forms\src\model.d.ts
  * Package ng.forms
  * Name FormArray
  * 
  **/
@JsType( isNative=true, namespace="ng.forms" )
public class FormArray extends AbstractControl {
    public JsArray<AbstractControl> controls;
    @JsConstructor
    public FormArray(JsArray<AbstractControl> controls,ValidatorFn /* optional */ validator,AsyncValidatorFn /* optional */ asyncValidator) {}
    public native  AbstractControl at(int index);
    public native  void push(AbstractControl control);
    public native  void insert(int index,AbstractControl control);
    public native  void removeAt(int index);
    public native  void setControl(int index,AbstractControl control);
    public int length;
    public native  void setValue(JsArray<Object> value,/* TypeLiteral */ Object /* optional */ undefined);
    public native  void patchValue(JsArray<Object> value,/* TypeLiteral */ Object /* optional */ undefined);
    public native  void reset(Object /* optional */ value,/* TypeLiteral */ Object /* optional */ undefined);
    public native  JsArray<Object> getRawValue();
    public native  void _registerControl();
}
