package fr.lteconsulting.angular2gwt.client.interop.ng.forms;

import jsinterop.annotations.JsType;
import ng.forms.ValidatorFn;
import jsinterop.annotations.JsProperty;
import ng.forms.AsyncValidatorFn;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import rxjs.Observable;
import ng.forms.AbstractControl;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\forms\src\model.d.ts
  * Package ng.forms
  * Name AbstractControl
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface AbstractControl  {
    @JsProperty(name="validator")
    ValidatorFn getValidator();
    @JsProperty(name="validator")
    void setValidator(ValidatorFn value);
    @JsProperty(name="asyncValidator")
    AsyncValidatorFn getAsyncValidator();
    @JsProperty(name="asyncValidator")
    void setAsyncValidator(AsyncValidatorFn value);
    @JsProperty(name="_valueChanges")
    Object get_valueChanges();
    @JsProperty(name="_valueChanges")
    void set_valueChanges(Object value);
    @JsProperty(name="_statusChanges")
    Object get_statusChanges();
    @JsProperty(name="_statusChanges")
    void set_statusChanges(Object value);
    @JsProperty(name="_status")
    Object get_status();
    @JsProperty(name="_status")
    void set_status(Object value);
    @JsProperty(name="_errors")
    Object get_errors();
    @JsProperty(name="_errors")
    void set_errors(Object value);
    @JsProperty(name="_pristine")
    Object get_pristine();
    @JsProperty(name="_pristine")
    void set_pristine(Object value);
    @JsProperty(name="_touched")
    Object get_touched();
    @JsProperty(name="_touched")
    void set_touched(Object value);
    @JsProperty(name="_parent")
    Object get_parent();
    @JsProperty(name="_parent")
    void set_parent(Object value);
    @JsProperty(name="_asyncValidationSubscription")
    Object get_asyncValidationSubscription();
    @JsProperty(name="_asyncValidationSubscription")
    void set_asyncValidationSubscription(Object value);
    @JsConstructor
    public AbstractControl(ValidatorFn validator,AsyncValidatorFn asyncValidator) {}
    @JsProperty(name="value")
    Object getValue();
    @JsProperty(name="value")
    void setValue(Object value);
    @JsProperty(name="parent")
    Object /* UnionType */ getParent();
    @JsProperty(name="parent")
    void setParent(Object /* UnionType */ value);
    @JsProperty(name="status")
    String getStatus();
    @JsProperty(name="status")
    void setStatus(String value);
    @JsProperty(name="valid")
    boolean getValid();
    @JsProperty(name="valid")
    void setValid(boolean value);
    @JsProperty(name="invalid")
    boolean getInvalid();
    @JsProperty(name="invalid")
    void setInvalid(boolean value);
    @JsProperty(name="pending")
    boolean getPending();
    @JsProperty(name="pending")
    void setPending(boolean value);
    @JsProperty(name="disabled")
    boolean getDisabled();
    @JsProperty(name="disabled")
    void setDisabled(boolean value);
    @JsProperty(name="enabled")
    boolean getEnabled();
    @JsProperty(name="enabled")
    void setEnabled(boolean value);
    @JsProperty(name="errors")
    JsTypedObject<String,Object> getErrors();
    @JsProperty(name="errors")
    void setErrors(JsTypedObject<String,Object> value);
    @JsProperty(name="pristine")
    boolean getPristine();
    @JsProperty(name="pristine")
    void setPristine(boolean value);
    @JsProperty(name="dirty")
    boolean getDirty();
    @JsProperty(name="dirty")
    void setDirty(boolean value);
    @JsProperty(name="touched")
    boolean getTouched();
    @JsProperty(name="touched")
    void setTouched(boolean value);
    @JsProperty(name="untouched")
    boolean getUntouched();
    @JsProperty(name="untouched")
    void setUntouched(boolean value);
    @JsProperty(name="valueChanges")
    Observable<Object> getValueChanges();
    @JsProperty(name="valueChanges")
    void setValueChanges(Observable<Object> value);
    @JsProperty(name="statusChanges")
    Observable<Object> getStatusChanges();
    @JsProperty(name="statusChanges")
    void setStatusChanges(Observable<Object> value);
     void setValidators(Object /* UnionType */ newValidator);
     void setAsyncValidators(Object /* UnionType */ newValidator);
     void clearValidators();
     void clearAsyncValidators();
     void markAsTouched(/* TypeLiteral */ Object /* optional */ undefined);
     void markAsUntouched(/* TypeLiteral */ Object /* optional */ undefined);
     void markAsDirty(/* TypeLiteral */ Object /* optional */ undefined);
     void markAsPristine(/* TypeLiteral */ Object /* optional */ undefined);
     void markAsPending(/* TypeLiteral */ Object /* optional */ undefined);
     void disable(/* TypeLiteral */ Object /* optional */ undefined);
     void enable(/* TypeLiteral */ Object /* optional */ undefined);
     void _updateAncestors();
     void setParent(Object /* UnionType */ parent);
     void setValue(Object value,Object /* optional */ options);
     void patchValue(Object value,Object /* optional */ options);
     void reset(Object /* optional */ value,Object /* optional */ options);
     void updateValueAndValidity(/* TypeLiteral */ Object /* optional */ undefined);
     void _setInitialStatus();
     void _runValidator();
     void _runAsyncValidator();
     void _cancelExistingSubscription();
     void setErrors(JsTypedObject<String,Object> errors,/* TypeLiteral */ Object /* optional */ undefined);
     AbstractControl get(Object /* UnionType */ path);
     Object getError(String errorCode,JsArray<String> /* optional */ path);
     boolean hasError(String errorCode,JsArray<String> /* optional */ path);
    @JsProperty(name="root")
    AbstractControl getRoot();
    @JsProperty(name="root")
    void setRoot(AbstractControl value);
     void _calculateStatus();
}
