package fr.lteconsulting.angular2gwt.client.interop.ng.forms;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.forms.EventEmitter;
import ng.forms.ControlContainer;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.forms.ControlValueAccessor;
import jsinterop.annotations.JsConstructor;
import ng.core.SimpleChanges;
import ng.forms.FormControl;
import ng.forms.ValidatorFn;
import ng.forms.AsyncValidatorFn;

/**
  * Generated from tests\@angular\forms\src\directives\ng_model.d.ts
  * Package ng.forms
  * Name NgModel
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface NgModel extends OnChanges {
    @JsProperty(name="viewModel")
    Object getViewModel();
    @JsProperty(name="viewModel")
    void setViewModel(Object value);
    @JsProperty(name="name")
    String getName();
    @JsProperty(name="name")
    void setName(String value);
    @JsProperty(name="isDisabled")
    boolean getIsDisabled();
    @JsProperty(name="isDisabled")
    void setIsDisabled(boolean value);
    @JsProperty(name="model")
    Object getModel();
    @JsProperty(name="model")
    void setModel(Object value);
    @JsProperty(name="options")
    /* TypeLiteral */ Object getOptions();
    @JsProperty(name="options")
    void setOptions(/* TypeLiteral */ Object value);
    @JsProperty(name="update")
    EventEmitter</* TypeLiteral */ Object> getUpdate();
    @JsProperty(name="update")
    void setUpdate(EventEmitter</* TypeLiteral */ Object> value);
    @JsConstructor
    public NgModel(ControlContainer parent,Array<Object /* UnionType */> validators,Array<Object /* UnionType */> asyncValidators,JsArray<ControlValueAccessor> valueAccessors) {}
     void ngOnChanges(SimpleChanges changes);
     void ngOnDestroy();
    @JsProperty(name="control")
    FormControl getControl();
    @JsProperty(name="control")
    void setControl(FormControl value);
    @JsProperty(name="path")
    JsArray<String> getPath();
    @JsProperty(name="path")
    void setPath(JsArray<String> value);
    @JsProperty(name="formDirective")
    Object getFormDirective();
    @JsProperty(name="formDirective")
    void setFormDirective(Object value);
    @JsProperty(name="validator")
    ValidatorFn getValidator();
    @JsProperty(name="validator")
    void setValidator(ValidatorFn value);
    @JsProperty(name="asyncValidator")
    AsyncValidatorFn getAsyncValidator();
    @JsProperty(name="asyncValidator")
    void setAsyncValidator(AsyncValidatorFn value);
     void viewToModelUpdate(Object newValue);
     void _setUpControl();
     void _isStandalone();
     void _setUpStandalone();
     void _checkForErrors();
     void _checkParentType();
     void _checkName();
     void _updateValue();
     void _updateDisabled();
}
