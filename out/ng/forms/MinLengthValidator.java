package fr.lteconsulting.angular2gwt.client.interop.ng.forms;

import jsinterop.annotations.JsType;
import ng.core.SimpleChanges;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import fr.lteconsulting.angular2gwt.client.JsFunction;

/**
  * Generated from tests\@angular\forms\src\directives\validators.d.ts
  * Package ng.forms
  * Name MinLengthValidator
  * A directive which installs the {@link MinLengthValidator} for any `formControlName`,
  * `formControl`, or control with `ngModel` that also has a `minlength` attribute.
  **/
@JsType( isNative=true, namespace="ng.forms" )
public class MinLengthValidator extends Validator {
    public Object _validator;
    public Object _onChange;
    public String minlength;
    public native  void ngOnChanges(SimpleChanges changes);
    public native  JsTypedObject<String,Object> validate(AbstractControl c);
    public native  void registerOnValidatorChange(JsFunction<Void> fn);
    public native  void _createValidator();
}
