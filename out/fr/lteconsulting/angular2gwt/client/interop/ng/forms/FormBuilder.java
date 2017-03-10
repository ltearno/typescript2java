package fr.lteconsulting.angular2gwt.client.interop.ng.forms;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import ng.forms.FormGroup;
import ng.forms.FormControl;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.forms.ValidatorFn;
import ng.forms.AsyncValidatorFn;
import ng.forms.FormArray;

/**
  * Generated from tests\@angular\forms\src\form_builder.d.ts
  * Package ng.forms
  * Name FormBuilder
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface FormBuilder  {
     FormGroup group(JsTypedObject<String,Object> controlsConfig,JsTypedObject<String,Object> /* optional */ extra);
     FormControl control(Object formState,Object /* UnionType */ /* optional */ validator,Object /* UnionType */ /* optional */ asyncValidator);
     FormArray array(JsArray<Object> controlsConfig,ValidatorFn /* optional */ validator,AsyncValidatorFn /* optional */ asyncValidator);
}
