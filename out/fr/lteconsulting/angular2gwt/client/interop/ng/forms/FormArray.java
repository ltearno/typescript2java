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
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface FormArray extends AbstractControl {
    @JsProperty(name="controls")
    JsArray<AbstractControl> getControls();
    @JsProperty(name="controls")
    void setControls(JsArray<AbstractControl> value);
    @JsConstructor
    public FormArray(JsArray<AbstractControl> controls,ValidatorFn /* optional */ validator,AsyncValidatorFn /* optional */ asyncValidator) {}
     AbstractControl at(int index);
     void push(AbstractControl control);
     void insert(int index,AbstractControl control);
     void removeAt(int index);
     void setControl(int index,AbstractControl control);
    @JsProperty(name="length")
    int getLength();
    @JsProperty(name="length")
    void setLength(int value);
     void setValue(JsArray<Object> value,/* TypeLiteral */ Object /* optional */ undefined);
     void patchValue(JsArray<Object> value,/* TypeLiteral */ Object /* optional */ undefined);
     void reset(Object /* optional */ value,/* TypeLiteral */ Object /* optional */ undefined);
     JsArray<Object> getRawValue();
     void _registerControl();
}
