package fr.lteconsulting.angular2gwt.client.interop.ng.forms;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.forms.AbstractControl;
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
@JsType( isNative=true, namespace="ng.forms", name="RequiredValidator" )
public class RequiredValidatorImpl extends Validator {
    @JsProperty(name="_required")
    Object get_required();
    @JsProperty(name="_required")
    void set_required(Object value);
    @JsProperty(name="_onChange")
    Object get_onChange();
    @JsProperty(name="_onChange")
    void set_onChange(Object value);
    @JsProperty(name="required")
    boolean getRequired();
    @JsProperty(name="required")
    void setRequired(boolean value);
    public native  JsTypedObject<String,Object> validate(AbstractControl c);
    public native  void registerOnValidatorChange(JsFunction<Void> fn);
}
