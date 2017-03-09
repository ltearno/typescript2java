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
@JsType( isNative=true, namespace="ng.forms" )
public class FormControl extends AbstractControl {
    @JsConstructor
    public FormControl(Object /* optional */ formState,Object /* UnionType */ /* optional */ validator,Object /* UnionType */ /* optional */ asyncValidator) {}
    public native  void setValue(Object value,/* TypeLiteral */ Object /* optional */ undefined);
    public native  void patchValue(Object value,/* TypeLiteral */ Object /* optional */ options);
    public native  void reset(Object /* optional */ formState,/* TypeLiteral */ Object /* optional */ undefined);
    public native  void registerOnChange(Function fn);
    public native  void registerOnDisabledChange(JsFunction1<Boolean,Void> fn);
    public native  void _applyFormState();
}
