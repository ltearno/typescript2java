package fr.lteconsulting.angular2gwt.client.interop.ng.forms;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.forms.AbstractControl;
import jsinterop.annotations.JsProperty;
import ng.forms.ValidatorFn;
import ng.forms.AsyncValidatorFn;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\forms\src\model.d.ts
  * Package ng.forms
  * Name FormArray
  * 
  **/
@JsType( isNative=true, namespace="ng.forms", name="FormArray" )
public class FormArrayImpl extends AbstractControl {
    @JsProperty(name="controls")
    JsArray<AbstractControl> getControls();
    @JsProperty(name="controls")
    void setControls(JsArray<AbstractControl> value);
    @JsConstructor
    public FormArrayImpl(JsArray<AbstractControl> controls,ValidatorFn /* optional */ validator,AsyncValidatorFn /* optional */ asyncValidator) {}
    public native  AbstractControl at(int index);
    public native  void push(AbstractControl control);
    public native  void insert(int index,AbstractControl control);
    public native  void removeAt(int index);
    public native  void setControl(int index,AbstractControl control);
    @JsProperty(name="length")
    int getLength();
    @JsProperty(name="length")
    void setLength(int value);
    public native  void setValue(JsArray<Object> value,/* TypeLiteral */ Object /* optional */ undefined);
    public native  void patchValue(JsArray<Object> value,/* TypeLiteral */ Object /* optional */ undefined);
    public native  void reset(Object /* optional */ value,/* TypeLiteral */ Object /* optional */ undefined);
    public native  JsArray<Object> getRawValue();
    public native  void _registerControl();
}
