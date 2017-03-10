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
  * Name PatternValidator
  * A Directive that adds the `pattern` validator to any controls marked with the
  * `pattern` attribute, via the {@link NG_VALIDATORS} binding. Uses attribute value
  * as the regex to validate Control value against.  Follows pattern attribute
  * semantics; i.e. regex must match entire Control value.
  * 
  * ### Example
  * 
  * ```
  * <input [name]="fullName" pattern="[a-zA-Z ]*" ngModel>
  * ```
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface PatternValidator extends Validator {
    @JsProperty(name="_validator")
    Object get_validator();
    @JsProperty(name="_validator")
    void set_validator(Object value);
    @JsProperty(name="_onChange")
    Object get_onChange();
    @JsProperty(name="_onChange")
    void set_onChange(Object value);
    @JsProperty(name="pattern")
    String getPattern();
    @JsProperty(name="pattern")
    void setPattern(String value);
     void ngOnChanges(SimpleChanges changes);
     JsTypedObject<String,Object> validate(AbstractControl c);
     void registerOnValidatorChange(JsFunction<Void> fn);
     void _createValidator();
}
