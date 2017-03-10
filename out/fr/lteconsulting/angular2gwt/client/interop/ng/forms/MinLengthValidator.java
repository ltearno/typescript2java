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
  * Name MinLengthValidator
  * A directive which installs the {@link MinLengthValidator} for any `formControlName`,
  * `formControl`, or control with `ngModel` that also has a `minlength` attribute.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface MinLengthValidator extends Validator {
    @JsProperty(name="_validator")
    Object get_validator();
    @JsProperty(name="_validator")
    void set_validator(Object value);
    @JsProperty(name="_onChange")
    Object get_onChange();
    @JsProperty(name="_onChange")
    void set_onChange(Object value);
    @JsProperty(name="minlength")
    String getMinlength();
    @JsProperty(name="minlength")
    void setMinlength(String value);
     void ngOnChanges(SimpleChanges changes);
     JsTypedObject<String,Object> validate(AbstractControl c);
     void registerOnValidatorChange(JsFunction<Void> fn);
     void _createValidator();
}
