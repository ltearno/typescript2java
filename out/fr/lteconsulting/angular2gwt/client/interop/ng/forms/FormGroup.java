package fr.lteconsulting.angular2gwt.client.interop.ng.forms;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import ng.forms.AbstractControl;
import jsinterop.annotations.JsProperty;
import ng.forms.ValidatorFn;
import ng.forms.AsyncValidatorFn;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\forms\src\model.d.ts
  * Package ng.forms
  * Name FormGroup
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface FormGroup extends AbstractControl {
    @JsProperty(name="controls")
    JsTypedObject<String,AbstractControl> getControls();
    @JsProperty(name="controls")
    void setControls(JsTypedObject<String,AbstractControl> value);
    @JsConstructor
    public FormGroup(JsTypedObject<String,AbstractControl> controls,ValidatorFn /* optional */ validator,AsyncValidatorFn /* optional */ asyncValidator) {}
     AbstractControl registerControl(String name,AbstractControl control);
     void addControl(String name,AbstractControl control);
     void removeControl(String name);
     void setControl(String name,AbstractControl control);
     boolean contains(String controlName);
     void setValue(JsTypedObject<String,Object> value,/* TypeLiteral */ Object /* optional */ undefined);
     void patchValue(JsTypedObject<String,Object> value,/* TypeLiteral */ Object /* optional */ undefined);
     void reset(Object /* optional */ value,/* TypeLiteral */ Object /* optional */ undefined);
     Object getRawValue();
}
