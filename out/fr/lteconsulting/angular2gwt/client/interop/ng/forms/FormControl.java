package fr.lteconsulting.angular2gwt.client.interop.ng.forms;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsFunction1;

/**
  * Generated from tests\@angular\forms\src\model.d.ts
  * Package ng.forms
  * Name FormControl
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface FormControl extends AbstractControl {
    @JsConstructor
    public FormControl(Object /* optional */ formState,Object /* UnionType */ /* optional */ validator,Object /* UnionType */ /* optional */ asyncValidator) {}
     void setValue(Object value,/* TypeLiteral */ Object /* optional */ undefined);
     void patchValue(Object value,/* TypeLiteral */ Object /* optional */ options);
     void reset(Object /* optional */ formState,/* TypeLiteral */ Object /* optional */ undefined);
     void registerOnChange(Function fn);
     void registerOnDisabledChange(JsFunction1<Boolean,Void> fn);
     void _applyFormState();
}
