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
@JsType( isNative=true, namespace="ng.forms", name="FormGroupDirective" )
public class FormGroupDirectiveImpl extends Form {
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
    public FormGroupDirectiveImpl(JsArray<Object> _validators,JsArray<Object> _asyncValidators) {}
    public native  void ngOnChanges(SimpleChanges changes);
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
    public native  FormControl addControl(FormControlName dir);
    public native  FormControl getControl(FormControlName dir);
    public native  void removeControl(FormControlName dir);
    public native  void addFormGroup(FormGroupName dir);
    public native  void removeFormGroup(FormGroupName dir);
    public native  FormGroup getFormGroup(FormGroupName dir);
    public native  void addFormArray(FormArrayName dir);
    public native  void removeFormArray(FormArrayName dir);
    public native  FormArray getFormArray(FormArrayName dir);
    public native  void updateModel(FormControlName dir,Object value);
    public native  boolean onSubmit(Event $event);
    public native  void onReset();
    public native  void resetForm(Object /* optional */ value);
    public native  void _updateRegistrations();
    public native  void _updateValidators();
    public native  void _checkFormPresent();
}
