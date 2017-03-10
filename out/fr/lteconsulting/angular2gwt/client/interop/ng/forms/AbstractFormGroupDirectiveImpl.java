package fr.lteconsulting.angular2gwt.client.interop.ng.forms;

import jsinterop.annotations.JsType;
import ng.forms.FormGroup;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.forms.Form;
import ng.forms.ValidatorFn;
import ng.forms.AsyncValidatorFn;

/**
  * Generated from tests\@angular\forms\src\directives\abstract_form_group_directive.d.ts
  * Package ng.forms
  * Name AbstractFormGroupDirective
  * This is a base class for code shared between {@link NgModelGroup} and {@link FormGroupName}.
  **/
@JsType( isNative=true, namespace="ng.forms", name="AbstractFormGroupDirective" )
public class AbstractFormGroupDirectiveImpl extends OnInit {
    public native  void ngOnInit();
    public native  void ngOnDestroy();
    @JsProperty(name="control")
    FormGroup getControl();
    @JsProperty(name="control")
    void setControl(FormGroup value);
    @JsProperty(name="path")
    JsArray<String> getPath();
    @JsProperty(name="path")
    void setPath(JsArray<String> value);
    @JsProperty(name="formDirective")
    Form getFormDirective();
    @JsProperty(name="formDirective")
    void setFormDirective(Form value);
    @JsProperty(name="validator")
    ValidatorFn getValidator();
    @JsProperty(name="validator")
    void setValidator(ValidatorFn value);
    @JsProperty(name="asyncValidator")
    AsyncValidatorFn getAsyncValidator();
    @JsProperty(name="asyncValidator")
    void setAsyncValidator(AsyncValidatorFn value);
}
