package fr.lteconsulting.angular2gwt.client.interop.ng.forms;

import jsinterop.annotations.JsType;
import ng.core.SimpleChanges;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import fr.lteconsulting.angular2gwt.client.JsFunction;

/**
  * Generated from tests\@angular\forms\src\directives\validators.d.ts
  * Package ng.forms
  * Name MaxLengthValidator
  * A directive which installs the {@link MaxLengthValidator} for any `formControlName,
  * `formControl`,
  * or control with `ngModel` that also has a `maxlength` attribute.
  **/
@JsType( isNative=true, namespace="ng.forms" )
public class MaxLengthValidator extends Validator {
    public Object _validator;
    public Object _onChange;
    public String maxlength;
    public native  void ngOnChanges(SimpleChanges changes);
    public native  JsTypedObject<String,Object> validate(AbstractControl c);
    public native  void registerOnValidatorChange(JsFunction<Void> fn);
    public native  void _createValidator();
}
