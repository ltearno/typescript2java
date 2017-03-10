package fr.lteconsulting.angular2gwt.client.interop.ng.forms;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.SimpleChanges;
import ng.forms.AbstractControl;
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
@JsType( isNative=true, namespace="ng.forms", name="MaxLengthValidator" )
public class MaxLengthValidatorImpl extends Validator {
    @JsProperty(name="_validator")
    Object get_validator();
    @JsProperty(name="_validator")
    void set_validator(Object value);
    @JsProperty(name="_onChange")
    Object get_onChange();
    @JsProperty(name="_onChange")
    void set_onChange(Object value);
    @JsProperty(name="maxlength")
    String getMaxlength();
    @JsProperty(name="maxlength")
    void setMaxlength(String value);
    public native  void ngOnChanges(SimpleChanges changes);
    public native  JsTypedObject<String,Object> validate(AbstractControl c);
    public native  void registerOnValidatorChange(JsFunction<Void> fn);
    public native  void _createValidator();
}
