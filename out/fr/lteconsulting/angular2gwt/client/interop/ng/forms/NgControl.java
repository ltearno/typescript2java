package fr.lteconsulting.angular2gwt.client.interop.ng.forms;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.forms.ControlValueAccessor;
import ng.forms.ValidatorFn;
import ng.forms.AsyncValidatorFn;

/**
  * Generated from tests\@angular\forms\src\directives\ng_control.d.ts
  * Package ng.forms
  * Name NgControl
  * A base class that all control directive extend.
  * It binds a {@link FormControl} object to a DOM element.
  * 
  * Used internally by Angular forms.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface NgControl extends AbstractControlDirective {
    @JsProperty(name="name")
    String getName();
    @JsProperty(name="name")
    void setName(String value);
    @JsProperty(name="valueAccessor")
    ControlValueAccessor getValueAccessor();
    @JsProperty(name="valueAccessor")
    void setValueAccessor(ControlValueAccessor value);
    @JsProperty(name="validator")
    ValidatorFn getValidator();
    @JsProperty(name="validator")
    void setValidator(ValidatorFn value);
    @JsProperty(name="asyncValidator")
    AsyncValidatorFn getAsyncValidator();
    @JsProperty(name="asyncValidator")
    void setAsyncValidator(AsyncValidatorFn value);
     void viewToModelUpdate(Object newValue);
}
