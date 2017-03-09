package fr.lteconsulting.angular2gwt.client.interop.ng.forms;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import fr.lteconsulting.angular2gwt.client.JsFunction;

/**
  * Generated from tests\@angular\forms\src\directives\validators.d.ts
  * Package ng.forms
  * Name Validator
  * An interface that can be implemented by classes that can act as validators.
  * 
  * ## Usage
  * 
  * ```typescript
  **/
@JsType( isNative=true, name="Object", namespace=JsPackage.GLOBAL )
public class Validator  {
    public native  JsTypedObject<String,Object> validate(AbstractControl c);
    public native  /* optional */ void registerOnValidatorChange(JsFunction<Void> fn);
}
