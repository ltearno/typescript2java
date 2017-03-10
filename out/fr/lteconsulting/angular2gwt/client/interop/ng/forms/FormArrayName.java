package fr.lteconsulting.angular2gwt.client.interop.ng.forms;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.forms.ControlContainer;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;
import ng.forms.FormArray;
import ng.forms.FormGroupDirective;
import ng.forms.ValidatorFn;
import ng.forms.AsyncValidatorFn;

/**
  * Generated from tests\@angular\forms\src\directives\reactive_directives\form_group_name.d.ts
  * Package ng.forms
  * Name FormArrayName
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface FormArrayName extends OnInit {
    @JsProperty(name="name")
    String getName();
    @JsProperty(name="name")
    void setName(String value);
    @JsConstructor
    public FormArrayName(ControlContainer parent,JsArray<Object> validators,JsArray<Object> asyncValidators) {}
     void ngOnInit();
     void ngOnDestroy();
    @JsProperty(name="control")
    FormArray getControl();
    @JsProperty(name="control")
    void setControl(FormArray value);
    @JsProperty(name="formDirective")
    FormGroupDirective getFormDirective();
    @JsProperty(name="formDirective")
    void setFormDirective(FormGroupDirective value);
    @JsProperty(name="path")
    JsArray<String> getPath();
    @JsProperty(name="path")
    void setPath(JsArray<String> value);
    @JsProperty(name="validator")
    ValidatorFn getValidator();
    @JsProperty(name="validator")
    void setValidator(ValidatorFn value);
    @JsProperty(name="asyncValidator")
    AsyncValidatorFn getAsyncValidator();
    @JsProperty(name="asyncValidator")
    void setAsyncValidator(AsyncValidatorFn value);
     void _checkParentType();
}
