package fr.lteconsulting.angular2gwt.client.interop.ng.forms;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;

/**
  * Generated from tests\@angular\forms\src\directives\validators.d.ts
  * Package ng.forms
  * Name CheckboxRequiredValidator
  * A Directive that adds the `required` validator to checkbox controls marked with the
  * `required` attribute, via the {@link NG_VALIDATORS} binding.
  * 
  * ### Example
  * 
  * ```
  * <input type="checkbox" name="active" ngModel required>
  * ```
  **/
@JsType( isNative=true, namespace="ng.forms" )
public class CheckboxRequiredValidator extends RequiredValidator {
    public native  JsTypedObject<String,Object> validate(AbstractControl c);
}
