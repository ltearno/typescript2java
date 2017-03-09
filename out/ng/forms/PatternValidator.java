package fr.lteconsulting.angular2gwt.client.interop.ng.forms;

import jsinterop.annotations.JsType;
import ng.core.SimpleChanges;
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
@JsType( isNative=true, namespace="ng.forms" )
public class PatternValidator extends Validator {
    public Object _validator;
    public Object _onChange;
    public String pattern;
    public native  void ngOnChanges(SimpleChanges changes);
    public native  JsTypedObject<String,Object> validate(AbstractControl c);
    public native  void registerOnValidatorChange(JsFunction<Void> fn);
    public native  void _createValidator();
}
