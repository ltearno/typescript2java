package fr.lteconsulting.angular2gwt.client.interop.ng.forms;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import fr.lteconsulting.angular2gwt.client.JsFunction;

/**
  * Generated from tests\@angular\forms\src\directives\validators.d.ts
  * Package ng.forms
  * Name RequiredValidator
  * A Directive that adds the `required` validator to any controls marked with the
  * `required` attribute, via the {@link NG_VALIDATORS} binding.
  * 
  * ### Example
  * 
  * ```
  * <input name="fullName" ngModel required>
  * ```
  **/
@JsType( isNative=true, namespace="ng.forms" )
public class RequiredValidator extends Validator {
    public Object _required;
    public Object _onChange;
    public boolean required;
    public native  JsTypedObject<String,Object> validate(AbstractControl c);
    public native  void registerOnValidatorChange(JsFunction<Void> fn);
}
