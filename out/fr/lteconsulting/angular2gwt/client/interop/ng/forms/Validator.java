package fr.lteconsulting.angular2gwt.client.interop.ng.forms;

import jsinterop.annotations.JsType;
import ng.forms.AbstractControl;
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
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface Validator  {
     JsTypedObject<String,Object> validate(AbstractControl c);
     /* optional */ void registerOnValidatorChange(JsFunction<Void> fn);
}
