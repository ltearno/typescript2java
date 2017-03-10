package fr.lteconsulting.angular2gwt.client.interop.ng.forms;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.forms.FormControlName;
import ng.forms.FormGroup;
import ng.forms.EventEmitter;
import jsinterop.annotations.JsConstructor;
import ng.core.SimpleChanges;
import ng.forms.Form;
import ng.forms.FormControl;
import ng.forms.FormGroupName;
import ng.forms.FormArrayName;
import ng.forms.FormArray;

/**
  * Generated from tests\@angular\forms\src\directives\reactive_directives\form_group_directive.d.ts
  * Package ng.forms
  * Name FormGroupDirective
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface FormGroupDirective extends Form {
    @JsProperty(name="_validators")
    Object get_validators();
    @JsProperty(name="_validators")
    void set_validators(Object value);
    @JsProperty(name="_asyncValidators")
    Object get_asyncValidators();
    @JsProperty(name="_asyncValidators")
    void set_asyncValidators(Object value);
    @JsProperty(name="_submitted")
    Object get_submitted();
    @JsProperty(name="_submitted")
    void set_submitted(Object value);
    @JsProperty(name="_oldForm")
    Object get_oldForm();
    @JsProperty(name="_oldForm")
    void set_oldForm(Object value);
    @JsProperty(name="directives")
    JsArray<FormControlName> getDirectives();
    @JsProperty(name="directives")
    void setDirectives(JsArray<FormControlName> value);
    @JsProperty(name="form")
    FormGroup getForm();
    @JsProperty(name="form")
    void setForm(FormGroup value);
    @JsProperty(name="ngSubmit")
    EventEmitter</* TypeLiteral */ Object> getNgSubmit();
    @JsProperty(name="ngSubmit")
    void setNgSubmit(EventEmitter</* TypeLiteral */ Object> value);
    @JsConstructor
    public FormGroupDirective(JsArray<Object> _validators,JsArray<Object> _asyncValidators) {}
     void ngOnChanges(SimpleChanges changes);
    @JsProperty(name="submitted")
    boolean getSubmitted();
    @JsProperty(name="submitted")
    void setSubmitted(boolean value);
    @JsProperty(name="formDirective")
    Form getFormDirective();
    @JsProperty(name="formDirective")
    void setFormDirective(Form value);
    @JsProperty(name="control")
    FormGroup getControl();
    @JsProperty(name="control")
    void setControl(FormGroup value);
    @JsProperty(name="path")
    JsArray<String> getPath();
    @JsProperty(name="path")
    void setPath(JsArray<String> value);
     FormControl addControl(FormControlName dir);
     FormControl getControl(FormControlName dir);
     void removeControl(FormControlName dir);
     void addFormGroup(FormGroupName dir);
     void removeFormGroup(FormGroupName dir);
     FormGroup getFormGroup(FormGroupName dir);
     void addFormArray(FormArrayName dir);
     void removeFormArray(FormArrayName dir);
     FormArray getFormArray(FormArrayName dir);
     void updateModel(FormControlName dir,Object value);
     boolean onSubmit(Event $event);
     void onReset();
     void resetForm(Object /* optional */ value);
     void _updateRegistrations();
     void _updateValidators();
     void _checkFormPresent();
}
