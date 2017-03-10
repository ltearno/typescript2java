package fr.lteconsulting.angular2gwt.client.interop.ng.forms;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.forms.FormGroup;
import ng.forms.EventEmitter;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;
import ng.forms.Form;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import ng.forms.AbstractControl;
import ng.forms.NgModel;
import ng.forms.FormControl;
import ng.forms.NgModelGroup;
import ng.forms.NgControl;

/**
  * Generated from tests\@angular\forms\src\directives\ng_form.d.ts
  * Package ng.forms
  * Name NgForm
  * 
  **/
@JsType( isNative=true, namespace="ng.forms", name="NgForm" )
public class NgFormImpl extends Form {
    @JsProperty(name="_submitted")
    Object get_submitted();
    @JsProperty(name="_submitted")
    void set_submitted(Object value);
    @JsProperty(name="form")
    FormGroup getForm();
    @JsProperty(name="form")
    void setForm(FormGroup value);
    @JsProperty(name="ngSubmit")
    EventEmitter</* TypeLiteral */ Object> getNgSubmit();
    @JsProperty(name="ngSubmit")
    void setNgSubmit(EventEmitter</* TypeLiteral */ Object> value);
    @JsConstructor
    public NgFormImpl(JsArray<Object> validators,JsArray<Object> asyncValidators) {}
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
    @JsProperty(name="controls")
    JsTypedObject<String,AbstractControl> getControls();
    @JsProperty(name="controls")
    void setControls(JsTypedObject<String,AbstractControl> value);
    public native  void addControl(NgModel dir);
    public native  FormControl getControl(NgModel dir);
    public native  void removeControl(NgModel dir);
    public native  void addFormGroup(NgModelGroup dir);
    public native  void removeFormGroup(NgModelGroup dir);
    public native  FormGroup getFormGroup(NgModelGroup dir);
    public native  void updateModel(NgControl dir,Object value);
    public native  void setValue(JsTypedObject<String,Object> value);
    public native  boolean onSubmit(Event $event);
    public native  void onReset();
    public native  void resetForm(Object /* optional */ value);
}
