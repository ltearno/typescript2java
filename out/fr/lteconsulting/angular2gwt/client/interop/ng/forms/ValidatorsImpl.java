package fr.lteconsulting.angular2gwt.client.interop.ng.forms;

import jsinterop.annotations.JsType;
import ng.forms.AbstractControl;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import ng.forms.ValidatorFn;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.forms.AsyncValidatorFn;

/**
  * Generated from tests\@angular\forms\src\validators.d.ts
  * Package ng.forms
  * Name Validators
  * Provides a set of validators used by form controls.
  * 
  * A validator is a function that processes a {@link FormControl} or collection of
  * controls and returns a map of errors. A null map means that validation has passed.
  * 
  * ### Example
  * 
  * ```typescript
  * var loginControl = new FormControl("", Validators.required)
  * ```
  **/
@JsType( isNative=true, namespace="ng.forms", name="Validators" )
public class ValidatorsImpl  {
    public static native  JsTypedObject<String,Boolean> required(AbstractControl control);
    public static native  JsTypedObject<String,Boolean> requiredTrue(AbstractControl control);
    public static native  ValidatorFn minLength(int minLength);
    public static native  ValidatorFn maxLength(int maxLength);
    public static native  ValidatorFn pattern(Object /* UnionType */ pattern);
    public static native  JsTypedObject<String,Boolean> nullValidator(AbstractControl c);
    public static native  ValidatorFn compose(JsArray<ValidatorFn> validators);
    public static native  AsyncValidatorFn composeAsync(JsArray<AsyncValidatorFn> validators);
}
