package fr.lteconsulting.angular2gwt.client.interop.ng.forms;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;

/**
  * Generated from tests\@angular\forms\src\directives\ng_control.d.ts
  * Package ng.forms
  * Name NgControl
  * A base class that all control directive extend.
  * It binds a {@link FormControl} object to a DOM element.
  * 
  * Used internally by Angular forms.
  **/
@JsType( isNative=true, namespace="ng.forms" )
public interface NgControl extends AbstractControlDirective {
    @JsProperty(name="name")
    String name();
    @JsProperty(name="name")
    void name(String value);
    @JsProperty(name="valueAccessor")
    ControlValueAccessor valueAccessor();
    @JsProperty(name="valueAccessor")
    void valueAccessor(ControlValueAccessor value);
    @JsProperty(name="validator")
    ValidatorFn validator();
    @JsProperty(name="validator")
    void validator(ValidatorFn value);
    @JsProperty(name="asyncValidator")
    AsyncValidatorFn asyncValidator();
    @JsProperty(name="asyncValidator")
    void asyncValidator(AsyncValidatorFn value);
     void viewToModelUpdate(Object newValue);
}
