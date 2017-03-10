package fr.lteconsulting.angular2gwt.client.interop.ng.forms;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.forms.FormControl;
import ng.forms.EventEmitter;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.forms.ControlValueAccessor;
import jsinterop.annotations.JsConstructor;
import ng.core.SimpleChanges;
import ng.forms.ValidatorFn;
import ng.forms.AsyncValidatorFn;

/**
  * Generated from tests\@angular\forms\src\directives\reactive_directives\form_control_directive.d.ts
  * Package ng.forms
  * Name FormControlDirective
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface FormControlDirective extends OnChanges {
    @JsProperty(name="viewModel")
    Object getViewModel();
    @JsProperty(name="viewModel")
    void setViewModel(Object value);
    @JsProperty(name="form")
    FormControl getForm();
    @JsProperty(name="form")
    void setForm(FormControl value);
    @JsProperty(name="model")
    Object getModel();
    @JsProperty(name="model")
    void setModel(Object value);
    @JsProperty(name="update")
    EventEmitter</* TypeLiteral */ Object> getUpdate();
    @JsProperty(name="update")
    void setUpdate(EventEmitter</* TypeLiteral */ Object> value);
    @JsProperty(name="isDisabled")
    boolean getIsDisabled();
    @JsProperty(name="isDisabled")
    void setIsDisabled(boolean value);
    @JsConstructor
    public FormControlDirective(Array<Object /* UnionType */> validators,Array<Object /* UnionType */> asyncValidators,JsArray<ControlValueAccessor> valueAccessors) {}
     void ngOnChanges(SimpleChanges changes);
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
    @JsProperty(name="control")
    FormControl getControl();
    @JsProperty(name="control")
    void setControl(FormControl value);
     void viewToModelUpdate(Object newValue);
     void _isControlChanged();
}
